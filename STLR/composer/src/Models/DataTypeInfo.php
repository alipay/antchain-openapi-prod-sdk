<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DataTypeInfo extends Model
{
    // 数据类型编码
    /**
     * @example dataTypeNo
     *
     * @var string
     */
    public $dataTypeNo;

    // 数据类型名称
    /**
     * @example data_type_name
     *
     * @var string
     */
    public $dataTypeName;

    // 数据类型配置
    /**
     * @example data_type_config
     *
     * @var string
     */
    public $dataTypeConfig;

    // 数据JSON格式检查
    /**
     * @example data_json_schema
     *
     * @var string
     */
    public $dataJsonSchema;
    protected $_name = [
        'dataTypeNo'     => 'data_type_no',
        'dataTypeName'   => 'data_type_name',
        'dataTypeConfig' => 'data_type_config',
        'dataJsonSchema' => 'data_json_schema',
    ];

    public function validate()
    {
        Model::validateRequired('dataTypeNo', $this->dataTypeNo, true);
        Model::validateRequired('dataTypeName', $this->dataTypeName, true);
        Model::validateRequired('dataTypeConfig', $this->dataTypeConfig, true);
        Model::validateRequired('dataJsonSchema', $this->dataJsonSchema, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataTypeNo) {
            $res['data_type_no'] = $this->dataTypeNo;
        }
        if (null !== $this->dataTypeName) {
            $res['data_type_name'] = $this->dataTypeName;
        }
        if (null !== $this->dataTypeConfig) {
            $res['data_type_config'] = $this->dataTypeConfig;
        }
        if (null !== $this->dataJsonSchema) {
            $res['data_json_schema'] = $this->dataJsonSchema;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataTypeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_type_no'])) {
            $model->dataTypeNo = $map['data_type_no'];
        }
        if (isset($map['data_type_name'])) {
            $model->dataTypeName = $map['data_type_name'];
        }
        if (isset($map['data_type_config'])) {
            $model->dataTypeConfig = $map['data_type_config'];
        }
        if (isset($map['data_json_schema'])) {
            $model->dataJsonSchema = $map['data_json_schema'];
        }

        return $model;
    }
}
