<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class FaultToleranceRuleItemModel extends Model
{
    // 是否启用(0-未启用1-启用2-部分启用)
    /**
     * @example 1
     *
     * @var string
     */
    public $enabled;

    // 暂时不用
    /**
     * @example
     *
     * @var string[]
     */
    public $scopes;

    // 流量管控规则
    /**
     * @example [{"type": "system", "field": "method","operation": "equal","value": ["echo"]}
     *
     * @var BaseConditionModel[]
     */
    public $conditions;

    // 具体隔离规则配置
    /**
     * @example {"timeWindow":10,"leastWindowCount":100,"maxIpCount":3,"exceptionRateMultiple":3,"leastExceptionRate":10,"exceptionTypes":["500"]}
     *
     * @var FaultToleranceConfigs
     */
    public $configs;

    // 行为项(type取值DOWNGRADE隔离/NONE监控)
    /**
     * @example [{"type":"DOWNGRADE"}]
     *
     * @var BaseActionModel[]
     */
    public $actions;
    protected $_name = [
        'enabled'    => 'enabled',
        'scopes'     => 'scopes',
        'conditions' => 'conditions',
        'configs'    => 'configs',
        'actions'    => 'actions',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->scopes) {
            $res['scopes'] = $this->scopes;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->configs) {
            $res['configs'] = null !== $this->configs ? $this->configs->toMap() : null;
        }
        if (null !== $this->actions) {
            $res['actions'] = [];
            if (null !== $this->actions && \is_array($this->actions)) {
                $n = 0;
                foreach ($this->actions as $item) {
                    $res['actions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaultToleranceRuleItemModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['scopes'])) {
            if (!empty($map['scopes'])) {
                $model->scopes = $map['scopes'];
            }
        }
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? BaseConditionModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['configs'])) {
            $model->configs = FaultToleranceConfigs::fromMap($map['configs']);
        }
        if (isset($map['actions'])) {
            if (!empty($map['actions'])) {
                $model->actions = [];
                $n              = 0;
                foreach ($map['actions'] as $item) {
                    $model->actions[$n++] = null !== $item ? BaseActionModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
