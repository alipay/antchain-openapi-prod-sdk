<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class ItemMatchingRule extends Model
{
    // 计量项匹配规则
    /**
     * @example method == _saas.antchain.metering.item.query_
     *
     * @var string
     */
    public $meteringMatchingRule;

    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $meteringValue;
    protected $_name = [
        'meteringMatchingRule' => 'metering_matching_rule',
        'meteringValue'        => 'metering_value',
    ];

    public function validate()
    {
        Model::validateRequired('meteringValue', $this->meteringValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->meteringMatchingRule) {
            $res['metering_matching_rule'] = $this->meteringMatchingRule;
        }
        if (null !== $this->meteringValue) {
            $res['metering_value'] = $this->meteringValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ItemMatchingRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metering_matching_rule'])) {
            $model->meteringMatchingRule = $map['metering_matching_rule'];
        }
        if (isset($map['metering_value'])) {
            $model->meteringValue = $map['metering_value'];
        }

        return $model;
    }
}
