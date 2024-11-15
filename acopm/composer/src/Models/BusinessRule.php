<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class BusinessRule extends Model
{
    // 规则类型（BUSINESS/INSTANCE/TENANT_WHITELIST）
    /**
     * @example BUSINESS
     *
     * @var string
     */
    public $ruleType;

    // 规则项列表
    /**
     * @example
     *
     * @var BusinessRuleItem[]
     */
    public $ruleItems;
    protected $_name = [
        'ruleType'  => 'rule_type',
        'ruleItems' => 'rule_items',
    ];

    public function validate()
    {
        Model::validateRequired('ruleType', $this->ruleType, true);
        Model::validateRequired('ruleItems', $this->ruleItems, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->ruleItems) {
            $res['rule_items'] = [];
            if (null !== $this->ruleItems && \is_array($this->ruleItems)) {
                $n = 0;
                foreach ($this->ruleItems as $item) {
                    $res['rule_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BusinessRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['rule_items'])) {
            if (!empty($map['rule_items'])) {
                $model->ruleItems = [];
                $n                = 0;
                foreach ($map['rule_items'] as $item) {
                    $model->ruleItems[$n++] = null !== $item ? BusinessRuleItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
