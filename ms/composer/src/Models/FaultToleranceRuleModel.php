<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class FaultToleranceRuleModel extends Model
{
    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // app名称
    /**
     * @example app1
     *
     * @var string
     */
    public $appName;

    // 规则名称
    /**
     * @example rule1
     *
     * @var string
     */
    public $name;

    // 操作人
    /**
     * @example test
     *
     * @var string
     */
    public $operator;

    // 修改时间
    /**
     * @example 15003403
     *
     * @var string
     */
    public $gmtModified;

    // 排序字段
    /**
     * @example [{"key":"data_id","dir":"DESC"}]
     *
     * @var BaseOrderDO[]
     */
    public $orders;

    // 是否启用(0-未启用1启用-2部分启用)
    /**
     * @example 1
     *
     * @var int
     */
    public $enabled;

    // 故障隔离的具体规则项
    // {"appName":"testApp","name":"test23","ruleItemList":[{"conditions":[{"type":"system","field":"targetApp","operation":"IN","value":["A"]}],"configs":{"timeWindow":10,"leastWindowCount":100,"maxIpCount":3,"exceptionRateMultiple":3,"leastExceptionRate":10,"exceptionTypes":["500"]},"actions":[{"type":"DOWNGRADE"}]}]}
    /**
     * @example 见描述
     *
     * @var FaultToleranceRuleItemModel[]
     */
    public $ruleItemList;

    // 取值client,server二选1，默认是client
    /**
     * @example client
     *
     * @var string
     */
    public $direction;
    protected $_name = [
        'id'           => 'id',
        'instanceId'   => 'instance_id',
        'appName'      => 'app_name',
        'name'         => 'name',
        'operator'     => 'operator',
        'gmtModified'  => 'gmt_modified',
        'orders'       => 'orders',
        'enabled'      => 'enabled',
        'ruleItemList' => 'rule_item_list',
        'direction'    => 'direction',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->orders) {
            $res['orders'] = [];
            if (null !== $this->orders && \is_array($this->orders)) {
                $n = 0;
                foreach ($this->orders as $item) {
                    $res['orders'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->ruleItemList) {
            $res['rule_item_list'] = [];
            if (null !== $this->ruleItemList && \is_array($this->ruleItemList)) {
                $n = 0;
                foreach ($this->ruleItemList as $item) {
                    $res['rule_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->direction) {
            $res['direction'] = $this->direction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaultToleranceRuleModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['orders'])) {
            if (!empty($map['orders'])) {
                $model->orders = [];
                $n             = 0;
                foreach ($map['orders'] as $item) {
                    $model->orders[$n++] = null !== $item ? BaseOrderDO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['rule_item_list'])) {
            if (!empty($map['rule_item_list'])) {
                $model->ruleItemList = [];
                $n                   = 0;
                foreach ($map['rule_item_list'] as $item) {
                    $model->ruleItemList[$n++] = null !== $item ? FaultToleranceRuleItemModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['direction'])) {
            $model->direction = $map['direction'];
        }

        return $model;
    }
}
