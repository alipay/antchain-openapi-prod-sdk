<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class CircuitBreakerRuleItemModel extends Model
{
    // 熔断规则类型(取值avgRt，errorRatio)
    /**
     * @example avgRt
     *
     * @var string
     */
    public $ruleType;

    // 熔断配置，和ruleType的值有关,
    // "ruleType": "avgRt",
    // "configs": {
    // "averageRtThreshold": 50,
    // "errorPercentThreshold": 50,
    // "requestVolumeThreshold": 10,
    // "sleepWindow": 1000,
    // "totalMetricWindow": 10
    // },
    /**
     * @example 见描述
     *
     * @var CircuitBreakerConfigModel
     */
    public $configs;

    // "trafficConditions": [
    // {
    // "type": "system",
    // "field": "trafficType",
    // "operation": "EQUAL",
    // "value": [
    // "online"
    // ]
    // }
    // ]
    /**
     * @example 见详情
     *
     * @var BaseConditionModel[]
     */
    public $trafficConditions;

    // 熔断规则中Action,
    // "action": {
    // "type": "REJECT"
    // },
    /**
     * @example 见详情
     *
     * @var BaseActionModel
     */
    public $action;
    protected $_name = [
        'ruleType'          => 'rule_type',
        'configs'           => 'configs',
        'trafficConditions' => 'traffic_conditions',
        'action'            => 'action',
    ];

    public function validate()
    {
        Model::validateRequired('ruleType', $this->ruleType, true);
        Model::validateRequired('configs', $this->configs, true);
        Model::validateRequired('action', $this->action, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->configs) {
            $res['configs'] = null !== $this->configs ? $this->configs->toMap() : null;
        }
        if (null !== $this->trafficConditions) {
            $res['traffic_conditions'] = [];
            if (null !== $this->trafficConditions && \is_array($this->trafficConditions)) {
                $n = 0;
                foreach ($this->trafficConditions as $item) {
                    $res['traffic_conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->action) {
            $res['action'] = null !== $this->action ? $this->action->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CircuitBreakerRuleItemModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['configs'])) {
            $model->configs = CircuitBreakerConfigModel::fromMap($map['configs']);
        }
        if (isset($map['traffic_conditions'])) {
            if (!empty($map['traffic_conditions'])) {
                $model->trafficConditions = [];
                $n                        = 0;
                foreach ($map['traffic_conditions'] as $item) {
                    $model->trafficConditions[$n++] = null !== $item ? BaseConditionModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['action'])) {
            $model->action = BaseActionModel::fromMap($map['action']);
        }

        return $model;
    }
}
