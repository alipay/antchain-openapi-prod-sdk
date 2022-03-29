<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XCondition extends Model
{
    // 表达式
    /**
     * @example
     *
     * @var string
     */
    public $expr;

    // operator
    /**
     * @example =
     *
     * @var string
     */
    public $operator;

    // value
    /**
     * @example
     *
     * @var string
     */
    public $value;

    /**
     * @example
     *
     * @var string[]
     */
    public $values;

    /**
     * @example true, false
     *
     * @var bool
     */
    public $all;
    protected $_name = [
        'expr'     => 'expr',
        'operator' => 'operator',
        'value'    => 'value',
        'values'   => 'values',
        'all'      => 'all',
    ];

    public function validate()
    {
        Model::validateRequired('expr', $this->expr, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->expr) {
            $res['expr'] = $this->expr;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->values) {
            $res['values'] = $this->values;
        }
        if (null !== $this->all) {
            $res['all'] = $this->all;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XCondition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['expr'])) {
            $model->expr = $map['expr'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = $map['values'];
            }
        }
        if (isset($map['all'])) {
            $model->all = $map['all'];
        }

        return $model;
    }
}
