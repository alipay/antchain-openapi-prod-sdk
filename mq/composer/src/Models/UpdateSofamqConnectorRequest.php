<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class UpdateSofamqConnectorRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // cron表达式描述任务触发，如果类型是cron的话
    /**
     * @var string
     */
    public $cron;

    // 数据过滤，支持SQL92过滤
    /**
     * @var string
     */
    public $filter;

    // 实例编号
    /**
     * @var string
     */
    public $instanceId;

    // 任务名称
    /**
     * @var string
     */
    public $name;

    // 限流值
    /**
     * @var int
     */
    public $rate;

    // 任务描述
    /**
     * @var string
     */
    public $remark;

    // 去向信息的配置，配置信息数组的 jsonString
    /**
     * @var string
     */
    public $sinkConfigs;

    // 去向类型
    /**
     * @var string
     */
    public $sinkType;

    //
    // 来源的配置项列表，配置数据数组 的JSONString
    /**
     * @var string
     */
    public $sourceConfigs;

    // 来源类型
    /**
     * @var string
     */
    public $sourceType;

    // 如果类型是once的话，给定一个unix时间戳
    /**
     * @var int
     */
    public $time;

    // 数据转化配置，转化配置数组的 JSONString
    /**
     * @var string
     */
    public $transformation;

    // 任务调度类型
    /**
     * @var string
     */
    public $type;

    // 所属应用
    /**
     * @var string
     */
    public $app;

    // stepflow_template_id
    /**
     * @var string
     */
    public $stepflowTemplateId;

    // 事件订阅的配置，json格式
    /**
     * @var string
     */
    public $eventSubConfigs;

    // 事件订阅是否生效
    /**
     * @var bool
     */
    public $eventSubEnabled;

    // SLO时间
    /**
     * @var int
     */
    public $acceptableExecutionInterval;

    // 是否自动回收实例
    /**
     * @var bool
     */
    public $autoRecycleInstance;
    protected $_name = [
        'authToken'                   => 'auth_token',
        'productInstanceId'           => 'product_instance_id',
        'cron'                        => 'cron',
        'filter'                      => 'filter',
        'instanceId'                  => 'instance_id',
        'name'                        => 'name',
        'rate'                        => 'rate',
        'remark'                      => 'remark',
        'sinkConfigs'                 => 'sink_configs',
        'sinkType'                    => 'sink_type',
        'sourceConfigs'               => 'source_configs',
        'sourceType'                  => 'source_type',
        'time'                        => 'time',
        'transformation'              => 'transformation',
        'type'                        => 'type',
        'app'                         => 'app',
        'stepflowTemplateId'          => 'stepflow_template_id',
        'eventSubConfigs'             => 'event_sub_configs',
        'eventSubEnabled'             => 'event_sub_enabled',
        'acceptableExecutionInterval' => 'acceptable_execution_interval',
        'autoRecycleInstance'         => 'auto_recycle_instance',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('sinkConfigs', $this->sinkConfigs, true);
        Model::validateRequired('sinkType', $this->sinkType, true);
        Model::validateRequired('sourceConfigs', $this->sourceConfigs, true);
        Model::validateRequired('sourceType', $this->sourceType, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('eventSubEnabled', $this->eventSubEnabled, true);
        Model::validateRequired('acceptableExecutionInterval', $this->acceptableExecutionInterval, true);
        Model::validateMinimum('rate', $this->rate, 0);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->cron) {
            $res['cron'] = $this->cron;
        }
        if (null !== $this->filter) {
            $res['filter'] = $this->filter;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->sinkConfigs) {
            $res['sink_configs'] = $this->sinkConfigs;
        }
        if (null !== $this->sinkType) {
            $res['sink_type'] = $this->sinkType;
        }
        if (null !== $this->sourceConfigs) {
            $res['source_configs'] = $this->sourceConfigs;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->transformation) {
            $res['transformation'] = $this->transformation;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->stepflowTemplateId) {
            $res['stepflow_template_id'] = $this->stepflowTemplateId;
        }
        if (null !== $this->eventSubConfigs) {
            $res['event_sub_configs'] = $this->eventSubConfigs;
        }
        if (null !== $this->eventSubEnabled) {
            $res['event_sub_enabled'] = $this->eventSubEnabled;
        }
        if (null !== $this->acceptableExecutionInterval) {
            $res['acceptable_execution_interval'] = $this->acceptableExecutionInterval;
        }
        if (null !== $this->autoRecycleInstance) {
            $res['auto_recycle_instance'] = $this->autoRecycleInstance;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSofamqConnectorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['cron'])) {
            $model->cron = $map['cron'];
        }
        if (isset($map['filter'])) {
            $model->filter = $map['filter'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['sink_configs'])) {
            $model->sinkConfigs = $map['sink_configs'];
        }
        if (isset($map['sink_type'])) {
            $model->sinkType = $map['sink_type'];
        }
        if (isset($map['source_configs'])) {
            $model->sourceConfigs = $map['source_configs'];
        }
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['transformation'])) {
            $model->transformation = $map['transformation'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['stepflow_template_id'])) {
            $model->stepflowTemplateId = $map['stepflow_template_id'];
        }
        if (isset($map['event_sub_configs'])) {
            $model->eventSubConfigs = $map['event_sub_configs'];
        }
        if (isset($map['event_sub_enabled'])) {
            $model->eventSubEnabled = $map['event_sub_enabled'];
        }
        if (isset($map['acceptable_execution_interval'])) {
            $model->acceptableExecutionInterval = $map['acceptable_execution_interval'];
        }
        if (isset($map['auto_recycle_instance'])) {
            $model->autoRecycleInstance = $map['auto_recycle_instance'];
        }

        return $model;
    }
}
