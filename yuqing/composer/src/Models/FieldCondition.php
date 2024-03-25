<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class FieldCondition extends Model
{
    // 字段名称
    /**
     * @example 名称
     *
     * @var string
     */
    public $fieldName;

    // 复杂查询下，嵌套子条件字段jsonPath
    /**
     * @example $.
     *
     * @var string
     */
    public $nestFieldPath;

    // 复杂查询下，嵌套子条件字段值
    /**
     * @example
     *
     * @var int[]
     */
    public $nestFieldValue;

    // 操作符
    /**
     * @example IN
     *
     * @var string
     */
    public $operateType;

    // 关键字
    /**
     * @example 字段值
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'fieldName'      => 'field_name',
        'nestFieldPath'  => 'nest_field_path',
        'nestFieldValue' => 'nest_field_value',
        'operateType'    => 'operate_type',
        'value'          => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('fieldName', $this->fieldName, true);
        Model::validateRequired('operateType', $this->operateType, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fieldName) {
            $res['field_name'] = $this->fieldName;
        }
        if (null !== $this->nestFieldPath) {
            $res['nest_field_path'] = $this->nestFieldPath;
        }
        if (null !== $this->nestFieldValue) {
            $res['nest_field_value'] = $this->nestFieldValue;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FieldCondition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['field_name'])) {
            $model->fieldName = $map['field_name'];
        }
        if (isset($map['nest_field_path'])) {
            $model->nestFieldPath = $map['nest_field_path'];
        }
        if (isset($map['nest_field_value'])) {
            if (!empty($map['nest_field_value'])) {
                $model->nestFieldValue = $map['nest_field_value'];
            }
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
