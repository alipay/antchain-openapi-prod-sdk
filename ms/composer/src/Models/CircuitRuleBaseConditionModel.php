<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class CircuitRuleBaseConditionModel extends Model
{
    // 生效域
    /**
     * @example method
     *
     * @var string
     */
    public $field;

    // 生效条件
    /**
     * @example equal
     *
     * @var string
     */
    public $operation;

    // 类型
    /**
     * @example system
     *
     * @var string
     */
    public $type;

    // 值
    /**
     * @example ["echo"]
     *
     * @var string[]
     */
    public $value;
    protected $_name = [
        'field'     => 'field',
        'operation' => 'operation',
        'type'      => 'type',
        'value'     => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('field', $this->field, true);
        Model::validateRequired('operation', $this->operation, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->field) {
            $res['field'] = $this->field;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CircuitRuleBaseConditionModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['field'])) {
            $model->field = $map['field'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            if (!empty($map['value'])) {
                $model->value = $map['value'];
            }
        }

        return $model;
    }
}
