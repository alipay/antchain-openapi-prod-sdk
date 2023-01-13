<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class DataExportTableField extends Model
{
    // 列名称
    /**
     * @example instance_id
     *
     * @var string
     */
    public $columnName;

    // 事件中字段提取的 jq 表达式
    /**
     * @example .instance_id
     *
     * @var string
     */
    public $field;

    // 列类型
    /**
     * @example varchar
     *
     * @var string
     */
    public $columnType;

    // 列大小
    /**
     * @example 255
     *
     * @var int
     */
    public $columnSize;

    // 列描述
    /**
     * @example 12eba21a66ed4d2795b833ce7ebd750c
     *
     * @var string
     */
    public $columnDescription;
    protected $_name = [
        'columnName'        => 'column_name',
        'field'             => 'field',
        'columnType'        => 'column_type',
        'columnSize'        => 'column_size',
        'columnDescription' => 'column_description',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->columnName) {
            $res['column_name'] = $this->columnName;
        }
        if (null !== $this->field) {
            $res['field'] = $this->field;
        }
        if (null !== $this->columnType) {
            $res['column_type'] = $this->columnType;
        }
        if (null !== $this->columnSize) {
            $res['column_size'] = $this->columnSize;
        }
        if (null !== $this->columnDescription) {
            $res['column_description'] = $this->columnDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataExportTableField
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['column_name'])) {
            $model->columnName = $map['column_name'];
        }
        if (isset($map['field'])) {
            $model->field = $map['field'];
        }
        if (isset($map['column_type'])) {
            $model->columnType = $map['column_type'];
        }
        if (isset($map['column_size'])) {
            $model->columnSize = $map['column_size'];
        }
        if (isset($map['column_description'])) {
            $model->columnDescription = $map['column_description'];
        }

        return $model;
    }
}
