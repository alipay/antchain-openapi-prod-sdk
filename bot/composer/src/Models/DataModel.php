<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DataModel extends Model
{
    // 数据模型Id
    /**
     * @example 112233
     *
     * @var string
     */
    public $dataModelId;

    // 数据模型名称
    /**
     * @example 检测设备模型
     *
     * @var string
     */
    public $dataModelName;

    // 数据模型
    /**
     * @example {          "PIC-URL": {                 "type": "string",                 "require":false              } }
     *
     * @var string
     */
    public $dataModel;

    // 数据模型类别
    /**
     * @example ORDER
     *
     * @var string
     */
    public $bizType;

    // 用户自定义版本
    /**
     * @example V1.0
     *
     * @var string
     */
    public $customerVersion;
    protected $_name = [
        'dataModelId'     => 'data_model_id',
        'dataModelName'   => 'data_model_name',
        'dataModel'       => 'data_model',
        'bizType'         => 'biz_type',
        'customerVersion' => 'customer_version',
    ];

    public function validate()
    {
        Model::validateRequired('dataModelId', $this->dataModelId, true);
        Model::validateRequired('dataModel', $this->dataModel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }
        if (null !== $this->dataModelName) {
            $res['data_model_name'] = $this->dataModelName;
        }
        if (null !== $this->dataModel) {
            $res['data_model'] = $this->dataModel;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->customerVersion) {
            $res['customer_version'] = $this->customerVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }
        if (isset($map['data_model_name'])) {
            $model->dataModelName = $map['data_model_name'];
        }
        if (isset($map['data_model'])) {
            $model->dataModel = $map['data_model'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['customer_version'])) {
            $model->customerVersion = $map['customer_version'];
        }

        return $model;
    }
}
