<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TrafficMirrorRuleVO extends Model
{
    // id
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

    // 源应用
    /**
     * @example demo
     *
     * @var string
     */
    public $sourceApp;

    // 源服务ID
    /**
     * @example demo@DEFAULT
     *
     * @var string
     */
    public $sourceDataId;

    // 目标应用
    /**
     * @example demo1
     *
     * @var string
     */
    public $targetApp;

    // 目标服务ID
    /**
     * @example demo@rest
     *
     * @var string
     */
    public $targetDataId;

    // 规则名
    /**
     * @example rule_name
     *
     * @var string
     */
    public $ruleName;

    // 是否开启
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;

    // 操作人
    /**
     * @example kele
     *
     * @var string
     */
    public $operator;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
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
     * @var TrafficMirrorConfigModel
     */
    public $ruleConfig;
    protected $_name = [
        'id'           => 'id',
        'instanceId'   => 'instance_id',
        'sourceApp'    => 'source_app',
        'sourceDataId' => 'source_data_id',
        'targetApp'    => 'target_app',
        'targetDataId' => 'target_data_id',
        'ruleName'     => 'rule_name',
        'enabled'      => 'enabled',
        'operator'     => 'operator',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
        'ruleConfig'   => 'rule_config',
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
        if (null !== $this->sourceApp) {
            $res['source_app'] = $this->sourceApp;
        }
        if (null !== $this->sourceDataId) {
            $res['source_data_id'] = $this->sourceDataId;
        }
        if (null !== $this->targetApp) {
            $res['target_app'] = $this->targetApp;
        }
        if (null !== $this->targetDataId) {
            $res['target_data_id'] = $this->targetDataId;
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
     * @return TrafficMirrorRuleVO
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
        if (isset($map['source_app'])) {
            $model->sourceApp = $map['source_app'];
        }
        if (isset($map['source_data_id'])) {
            $model->sourceDataId = $map['source_data_id'];
        }
        if (isset($map['target_app'])) {
            $model->targetApp = $map['target_app'];
        }
        if (isset($map['target_data_id'])) {
            $model->targetDataId = $map['target_data_id'];
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
            $model->ruleConfig = TrafficMirrorConfigModel::fromMap($map['rule_config']);
        }

        return $model;
    }
}
