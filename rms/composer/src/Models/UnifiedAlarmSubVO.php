<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAlarmSubVO extends Model
{
    // 主键
    /**
     * @example 123
     *
     * @var int
     */
    public $id;

    // 告警规则id
    /**
     * @example 123
     *
     * @var int
     */
    public $alarmRuleId;

    // 告警模板id
    /**
     * @example 123
     *
     * @var int
     */
    public $alarmTplId;

    // 订阅者的类型
    /**
     * @example subscriber_type:"webhook"或者subscriber_type:"通知组"
     *
     * @var string
     */
    public $subscriberType;

    // 订阅者
    /**
     * @example subscriber:"赤远"或者subscriber:"xxx告警组"或者subscriber:"xxx(webhook)"
     *
     * @var string
     */
    public $subscriber;

    // 订阅者名称
    /**
     * @example chiyuan
     *
     * @var string
     */
    public $subscriberName;

    // 租户id
    /**
     * @example 123
     *
     * @var int
     */
    public $tenantId;

    // 工作空间id
    /**
     * @example 123
     *
     * @var int
     */
    public $workspaceId;

    // 创建人,可以理解为当前登录用户
    /**
     * @example autcloudadmin
     *
     * @var string
     */
    public $creator;

    // 修改人,同creator
    /**
     * @example autcloudadmin
     *
     * @var string
     */
    public $modifier;

    // 创建日期
    /**
     * @example 2021-5-27 10:08:52
     *
     * @var string
     */
    public $gmtCreate;

    // 修改日期
    /**
     * @example 2021-5-27 10:08:52
     *
     * @var string
     */
    public $gmtModified;

    // 静默时间
    /**
     * @example
     *
     * @var int
     */
    public $silenceTime;

    // 通知渠道
    /**
     * @example ""
     *
     * @var string
     */
    public $channel;

    // 订阅者来源
    /**
     * @example LOCAL, IAM
     *
     * @var string
     */
    public $subscriberSource;
    protected $_name = [
        'id'               => 'id',
        'alarmRuleId'      => 'alarm_rule_id',
        'alarmTplId'       => 'alarm_tpl_id',
        'subscriberType'   => 'subscriber_type',
        'subscriber'       => 'subscriber',
        'subscriberName'   => 'subscriber_name',
        'tenantId'         => 'tenant_id',
        'workspaceId'      => 'workspace_id',
        'creator'          => 'creator',
        'modifier'         => 'modifier',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'silenceTime'      => 'silence_time',
        'channel'          => 'channel',
        'subscriberSource' => 'subscriber_source',
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
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->alarmTplId) {
            $res['alarm_tpl_id'] = $this->alarmTplId;
        }
        if (null !== $this->subscriberType) {
            $res['subscriber_type'] = $this->subscriberType;
        }
        if (null !== $this->subscriber) {
            $res['subscriber'] = $this->subscriber;
        }
        if (null !== $this->subscriberName) {
            $res['subscriber_name'] = $this->subscriberName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->silenceTime) {
            $res['silence_time'] = $this->silenceTime;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->subscriberSource) {
            $res['subscriber_source'] = $this->subscriberSource;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAlarmSubVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['alarm_tpl_id'])) {
            $model->alarmTplId = $map['alarm_tpl_id'];
        }
        if (isset($map['subscriber_type'])) {
            $model->subscriberType = $map['subscriber_type'];
        }
        if (isset($map['subscriber'])) {
            $model->subscriber = $map['subscriber'];
        }
        if (isset($map['subscriber_name'])) {
            $model->subscriberName = $map['subscriber_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['silence_time'])) {
            $model->silenceTime = $map['silence_time'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['subscriber_source'])) {
            $model->subscriberSource = $map['subscriber_source'];
        }

        return $model;
    }
}
