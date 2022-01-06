<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class FaultInjectRuleItemModel extends Model
{
    // 规则类型 ABORT/DELAY
    /**
     * @example ABORT
     *
     * @var string
     */
    public $ruleType;

    // 执行策略 拦截/监控
    /**
     * @example REJECT
     *
     * @var ActionModel
     */
    public $action;

    // 故障注入配置
    /**
     * @example {"faultPercent": 20.0, "code": 200}
     *
     * @var FaultInjectConfigModel
     */
    public $configs;

    // 流量匹配条件
    /**
     * @example {"type":"header_info", "field": "uid", "operation": "equal", "value": [{"123"}]}
     *
     * @var BaseConditionModel[]
     */
    public $trafficConditions;
    protected $_name = [
        'ruleType'          => 'rule_type',
        'action'            => 'action',
        'configs'           => 'configs',
        'trafficConditions' => 'traffic_conditions',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->action) {
            $res['action'] = null !== $this->action ? $this->action->toMap() : null;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaultInjectRuleItemModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['action'])) {
            $model->action = ActionModel::fromMap($map['action']);
        }
        if (isset($map['configs'])) {
            $model->configs = FaultInjectConfigModel::fromMap($map['configs']);
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

        return $model;
    }
}
