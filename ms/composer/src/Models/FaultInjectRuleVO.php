<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class FaultInjectRuleVO extends Model
{
    // 主键
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 租户实例id
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 服务ID
    /**
     * @example com.alipay.test.FooFacade
     *
     * @var string
     */
    public $dataId;

    // 应用名
    /**
     * @example foo
     *
     * @var string
     */
    public $appName;

    // 服务类型（SOFA DUBBO SPRINGCLOUD）
    /**
     * @example SOFA
     *
     * @var string
     */
    public $serviceType;

    // 规则名称
    /**
     * @example 故障注入规则
     *
     * @var string
     */
    public $ruleName;

    // 是否启用规则
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;

    // 操作人
    /**
     * @example xuy
     *
     * @var string
     */
    public $operator;

    // 创建时间
    /**
     * @example 2020-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 规则配置
    /**
     * @example {}
     *
     * @var FaultInjectRuleConfigModel
     */
    public $ruleConfig;
    protected $_name = [
        'id'          => 'id',
        'instanceId'  => 'instance_id',
        'dataId'      => 'data_id',
        'appName'     => 'app_name',
        'serviceType' => 'service_type',
        'ruleName'    => 'rule_name',
        'enabled'     => 'enabled',
        'operator'    => 'operator',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'ruleConfig'  => 'rule_config',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->ruleConfig) {
            $res['rule_config'] = null !== $this->ruleConfig ? $this->ruleConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaultInjectRuleVO
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
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['rule_config'])) {
            $model->ruleConfig = FaultInjectRuleConfigModel::fromMap($map['rule_config']);
        }

        return $model;
    }
}
