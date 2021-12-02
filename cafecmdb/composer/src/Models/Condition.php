<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class Condition extends Model
{
    // 用于查询条件的字段
    /**
     * @example field
     *
     * @var string
     */
    public $field;

    // 查询操作符
    /**
     * @example ==,>,in
     *
     * @var string
     */
    public $operator;

    // 由于OP限制，此字段无法直接使用数组。请务必使用能够解析的JSON数组
    /**
     * @example [xx,yy]
     *
     * @var string
     */
    public $values;
    protected $_name = [
        'field'    => 'field',
        'operator' => 'operator',
        'values'   => 'values',
    ];

    public function validate()
    {
        Model::validateRequired('field', $this->field, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('values', $this->values, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->field) {
            $res['field'] = $this->field;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->values) {
            $res['values'] = $this->values;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Condition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['field'])) {
            $model->field = $map['field'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['values'])) {
            $model->values = $map['values'];
        }

        return $model;
    }
}
