<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class BusinessRuleItem extends Model
{
    // 规则表达式
    /**
     * @example jexl表达式，参考：https://commons.apache.org/proper/commons-jexl/
     *
     * @var string
     */
    public $condition;

    // 规则值
    /**
     * @example /
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'condition' => 'condition',
        'value'     => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('condition', $this->condition, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->condition) {
            $res['condition'] = $this->condition;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BusinessRuleItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['condition'])) {
            $model->condition = $map['condition'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
