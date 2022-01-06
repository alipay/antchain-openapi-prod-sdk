<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class BaseConditionModel extends Model
{
    // 匹配字段
    /**
     * @example source.app.name
     *
     * @var string
     */
    public $field;

    // 操作符
    /**
     * @example equal
     *
     * @var string
     */
    public $operation;

    // SYSTEM、CUSTOM系统字段还是自定义字段
    /**
     * @example SYSTEM
     *
     * @var string
     */
    public $type;

    // 匹配值
    /**
     * @example consumer-app
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
     * @return BaseConditionModel
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
