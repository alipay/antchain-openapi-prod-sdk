<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAlarmNotifyHistoryVO extends Model
{
    // 主键
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 告警历史id
    /**
     * @example
     *
     * @var int
     */
    public $alarmHistoryId;

    // 告警事件id
    /**
     * @example ""
     *
     * @var string
     */
    public $alarmEventId;

    // 告警规则id
    /**
     * @example
     *
     * @var int
     */
    public $alarmRuleId;

    // 告警等级
    /**
     * @example
     *
     * @var int
     */
    public $alarmLevel;

    // 告警静默期
    /**
     * @example
     *
     * @var int
     */
    public $alarmSilenceTime;

    // 告警时间
    /**
     * @example
     *
     * @var int
     */
    public $alarmTime;

    // 通知渠道
    /**
     * @example 通知渠道
     *
     * @var string
     */
    public $channel;

    // 订阅人的类型
    /**
     * @example “webhook”或者"loginer"或者"xxx组"
     *
     * @var string
     */
    public $subscriberType;

    // 订阅人
    /**
     * @example ""
     *
     * @var string
     */
    public $subscriber;

    // 聚合条数
    /**
     * @example
     *
     * @var int
     */
    public $aggCount;

    // 通知状态
    /**
     * @example 0 ：失败 1：成功
     *
     * @var int
     */
    public $status;

    // 租户id
    /**
     * @example 1
     *
     * @var int
     */
    public $tenantId;

    // 工作空间id
    /**
     * @example 3
     *
     * @var int
     */
    public $workspaceId;

    // 创建时间
    /**
     * @example 2021-12-1 15:22:01
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2021-12-1 15:22:01
     *
     * @var string
     */
    public $gmtModified;

    // 消息内容
    /**
     * @example ""
     *
     * @var string
     */
    public $notifyContent;

    // 告警规则名
    /**
     * @example ""
     *
     * @var string
     */
    public $alarmRuleName;

    // 订阅人
    /**
     * @example ""
     *
     * @var string
     */
    public $subscriberName;

    // 订阅者来源
    /**
     * @example LOCAL, IAM
     *
     * @var string
     */
    public $subscriberSource;

    // 告警消息的状态
    /**
     * @example 1
     *
     * @var int
     */
    public $alarmStatus;

    // 告警类型
    /**
     * @example [自定义配置,应用监控]
     *
     * @var string
     */
    public $alarmType;

    // 告警数据源跳转url
    /**
     * @example /business/product/multiMinute/preview/2000021
     *
     * @var string
     */
    public $alarmUrl;

    // 数据源名称
    /**
     * @example 1
     *
     * @var string
     */
    public $dataSourceName;

    // 目标对象是否删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $alarmTargetDeleted;

    // 描述消息发送错误原因
    /**
     * @example 钉钉机器人不存在
     *
     * @var string
     */
    public $errorMessage;

    // 告警消息的日志跟踪字段
    /**
     * @example 322_1633675560000_446501871
     *
     * @var string
     */
    public $traceId;
    protected $_name = [
        'id'                 => 'id',
        'alarmHistoryId'     => 'alarm_history_id',
        'alarmEventId'       => 'alarm_event_id',
        'alarmRuleId'        => 'alarm_rule_id',
        'alarmLevel'         => 'alarm_level',
        'alarmSilenceTime'   => 'alarm_silence_time',
        'alarmTime'          => 'alarm_time',
        'channel'            => 'channel',
        'subscriberType'     => 'subscriber_type',
        'subscriber'         => 'subscriber',
        'aggCount'           => 'agg_count',
        'status'             => 'status',
        'tenantId'           => 'tenant_id',
        'workspaceId'        => 'workspace_id',
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'notifyContent'      => 'notify_content',
        'alarmRuleName'      => 'alarm_rule_name',
        'subscriberName'     => 'subscriber_name',
        'subscriberSource'   => 'subscriber_source',
        'alarmStatus'        => 'alarm_status',
        'alarmType'          => 'alarm_type',
        'alarmUrl'           => 'alarm_url',
        'dataSourceName'     => 'data_source_name',
        'alarmTargetDeleted' => 'alarm_target_deleted',
        'errorMessage'       => 'error_message',
        'traceId'            => 'trace_id',
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
        if (null !== $this->alarmHistoryId) {
            $res['alarm_history_id'] = $this->alarmHistoryId;
        }
        if (null !== $this->alarmEventId) {
            $res['alarm_event_id'] = $this->alarmEventId;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->alarmSilenceTime) {
            $res['alarm_silence_time'] = $this->alarmSilenceTime;
        }
        if (null !== $this->alarmTime) {
            $res['alarm_time'] = $this->alarmTime;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->subscriberType) {
            $res['subscriber_type'] = $this->subscriberType;
        }
        if (null !== $this->subscriber) {
            $res['subscriber'] = $this->subscriber;
        }
        if (null !== $this->aggCount) {
            $res['agg_count'] = $this->aggCount;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->notifyContent) {
            $res['notify_content'] = $this->notifyContent;
        }
        if (null !== $this->alarmRuleName) {
            $res['alarm_rule_name'] = $this->alarmRuleName;
        }
        if (null !== $this->subscriberName) {
            $res['subscriber_name'] = $this->subscriberName;
        }
        if (null !== $this->subscriberSource) {
            $res['subscriber_source'] = $this->subscriberSource;
        }
        if (null !== $this->alarmStatus) {
            $res['alarm_status'] = $this->alarmStatus;
        }
        if (null !== $this->alarmType) {
            $res['alarm_type'] = $this->alarmType;
        }
        if (null !== $this->alarmUrl) {
            $res['alarm_url'] = $this->alarmUrl;
        }
        if (null !== $this->dataSourceName) {
            $res['data_source_name'] = $this->dataSourceName;
        }
        if (null !== $this->alarmTargetDeleted) {
            $res['alarm_target_deleted'] = $this->alarmTargetDeleted;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAlarmNotifyHistoryVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['alarm_history_id'])) {
            $model->alarmHistoryId = $map['alarm_history_id'];
        }
        if (isset($map['alarm_event_id'])) {
            $model->alarmEventId = $map['alarm_event_id'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['alarm_silence_time'])) {
            $model->alarmSilenceTime = $map['alarm_silence_time'];
        }
        if (isset($map['alarm_time'])) {
            $model->alarmTime = $map['alarm_time'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['subscriber_type'])) {
            $model->subscriberType = $map['subscriber_type'];
        }
        if (isset($map['subscriber'])) {
            $model->subscriber = $map['subscriber'];
        }
        if (isset($map['agg_count'])) {
            $model->aggCount = $map['agg_count'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['notify_content'])) {
            $model->notifyContent = $map['notify_content'];
        }
        if (isset($map['alarm_rule_name'])) {
            $model->alarmRuleName = $map['alarm_rule_name'];
        }
        if (isset($map['subscriber_name'])) {
            $model->subscriberName = $map['subscriber_name'];
        }
        if (isset($map['subscriber_source'])) {
            $model->subscriberSource = $map['subscriber_source'];
        }
        if (isset($map['alarm_status'])) {
            $model->alarmStatus = $map['alarm_status'];
        }
        if (isset($map['alarm_type'])) {
            $model->alarmType = $map['alarm_type'];
        }
        if (isset($map['alarm_url'])) {
            $model->alarmUrl = $map['alarm_url'];
        }
        if (isset($map['data_source_name'])) {
            $model->dataSourceName = $map['data_source_name'];
        }
        if (isset($map['alarm_target_deleted'])) {
            $model->alarmTargetDeleted = $map['alarm_target_deleted'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }

        return $model;
    }
}
