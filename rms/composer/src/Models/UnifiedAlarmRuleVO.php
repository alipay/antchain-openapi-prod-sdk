<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAlarmRuleVO extends Model
{
    // 主键
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 告警规则名称
    /**
     * @example “xx告警”
     *
     * @var string
     */
    public $name;

    // 分类 用于区分pql规则和自定义规则
    /**
     * @example “自定义”或者"pql"
     *
     * @var string
     */
    public $category;

    // 规则配置
    /**
     * @example 规则配置
     *
     * @var string
     */
    public $ruleConfig;

    // 告警等级
    /**
     * @example 0:p0 1:p1 以此类推
     *
     * @var int
     */
    public $level;

    // 检测频率
    /**
     * @example 123
     *
     * @var int
     */
    public $step;

    // 触发周期
    /**
     * @example 123
     *
     * @var int
     */
    public $pendingHit;

    // 恢复周期
    /**
     * @example 123
     *
     * @var int
     */
    public $recoveredHit;

    // 静默时间
    /**
     * @example
     *
     * @var int
     */
    public $silenceTime;

    // 时区
    /**
     * @example “localhost”
     *
     * @var string
     */
    public $timeZone;

    // 应急处理人
    /**
     * @example “未信”
     *
     * @var string
     */
    public $emergency;

    // 应急处理链接
    /**
     * @example "www.xx.com"
     *
     * @var string
     */
    public $emergencyUrl;

    // 指标无数据触发告警 是个开关 1:打开 0:关闭
    /**
     * @example
     *
     * @var int
     */
    public $alarmEmpty;

    // 告警触发时通知 1:勾选 0:不勾选
    /**
     * @example 1:勾选 0:不勾选
     *
     * @var int
     */
    public $notifyFiring;

    // 告警恢复时通知 1:勾选 0:不勾选
    /**
     * @example 1:勾选 0:不勾选
     *
     * @var int
     */
    public $notifyRecovered;

    // 告警无数据时通知 1:勾选 0:不勾选
    /**
     * @example 1:勾选 0:不勾选
     *
     * @var int
     */
    public $notifyEmpty;

    // 通知渠道
    /**
     * @example "["ddWebhook","sms","phone","email"]"
     *
     * @var string
     */
    public $channels;

    // 通知模板id
    /**
     * @example
     *
     * @var int
     */
    public $notifyTplId;

    // 通知时间
    /**
     * @example 1622016126752
     *
     * @var string
     */
    public $notifyTimeFilter;

    // 暂停开始时间
    /**
     * @example 1622016126752
     *
     * @var int
     */
    public $suspendedStartTime;

    // 暂停结束时间
    /**
     * @example 1622016126759
     *
     * @var int
     */
    public $suspendedEndTime;

    // 暂停的原因
    /**
     * @example "暂停的原因"
     *
     * @var string
     */
    public $suspendedReason;

    // 唯一 ID，保证迁移前后不变
    /**
     * @example uuid
     *
     * @var string
     */
    public $uniqueIdentity;

    // 标识告警规则迁移之前的 ID
    /**
     * @example 123
     *
     * @var string
     */
    public $sourceId;

    // 启停状态 开关
    /**
     * @example 0:闭合 1:打开
     *
     * @var int
     */
    public $status;

    // 软删除
    /**
     * @example 0:不删除 1:删除
     *
     * @var int
     */
    public $deleted;

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

    // 创建人
    /**
     * @example autcloudadmin
     *
     * @var string
     */
    public $creator;

    // 修改人
    /**
     * @example autcloudadmin
     *
     * @var string
     */
    public $modifier;

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

    // 告警状态
    /**
     * @example 0
     *
     * @var int
     */
    public $alarmStatus;

    // 告警条件简介
    /**
     * @example
     *
     * @var string[]
     */
    public $conditionsDes;

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
     * @example PQL
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
    protected $_name = [
        'id'                 => 'id',
        'name'               => 'name',
        'category'           => 'category',
        'ruleConfig'         => 'rule_config',
        'level'              => 'level',
        'step'               => 'step',
        'pendingHit'         => 'pending_hit',
        'recoveredHit'       => 'recovered_hit',
        'silenceTime'        => 'silence_time',
        'timeZone'           => 'time_zone',
        'emergency'          => 'emergency',
        'emergencyUrl'       => 'emergency_url',
        'alarmEmpty'         => 'alarm_empty',
        'notifyFiring'       => 'notify_firing',
        'notifyRecovered'    => 'notify_recovered',
        'notifyEmpty'        => 'notify_empty',
        'channels'           => 'channels',
        'notifyTplId'        => 'notify_tpl_id',
        'notifyTimeFilter'   => 'notify_time_filter',
        'suspendedStartTime' => 'suspended_start_time',
        'suspendedEndTime'   => 'suspended_end_time',
        'suspendedReason'    => 'suspended_reason',
        'uniqueIdentity'     => 'unique_identity',
        'sourceId'           => 'source_id',
        'status'             => 'status',
        'deleted'            => 'deleted',
        'tenantId'           => 'tenant_id',
        'workspaceId'        => 'workspace_id',
        'creator'            => 'creator',
        'modifier'           => 'modifier',
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'alarmStatus'        => 'alarm_status',
        'conditionsDes'      => 'conditions_des',
        'alarmType'          => 'alarm_type',
        'alarmUrl'           => 'alarm_url',
        'dataSourceName'     => 'data_source_name',
        'alarmTargetDeleted' => 'alarm_target_deleted',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->ruleConfig) {
            $res['rule_config'] = $this->ruleConfig;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->step) {
            $res['step'] = $this->step;
        }
        if (null !== $this->pendingHit) {
            $res['pending_hit'] = $this->pendingHit;
        }
        if (null !== $this->recoveredHit) {
            $res['recovered_hit'] = $this->recoveredHit;
        }
        if (null !== $this->silenceTime) {
            $res['silence_time'] = $this->silenceTime;
        }
        if (null !== $this->timeZone) {
            $res['time_zone'] = $this->timeZone;
        }
        if (null !== $this->emergency) {
            $res['emergency'] = $this->emergency;
        }
        if (null !== $this->emergencyUrl) {
            $res['emergency_url'] = $this->emergencyUrl;
        }
        if (null !== $this->alarmEmpty) {
            $res['alarm_empty'] = $this->alarmEmpty;
        }
        if (null !== $this->notifyFiring) {
            $res['notify_firing'] = $this->notifyFiring;
        }
        if (null !== $this->notifyRecovered) {
            $res['notify_recovered'] = $this->notifyRecovered;
        }
        if (null !== $this->notifyEmpty) {
            $res['notify_empty'] = $this->notifyEmpty;
        }
        if (null !== $this->channels) {
            $res['channels'] = $this->channels;
        }
        if (null !== $this->notifyTplId) {
            $res['notify_tpl_id'] = $this->notifyTplId;
        }
        if (null !== $this->notifyTimeFilter) {
            $res['notify_time_filter'] = $this->notifyTimeFilter;
        }
        if (null !== $this->suspendedStartTime) {
            $res['suspended_start_time'] = $this->suspendedStartTime;
        }
        if (null !== $this->suspendedEndTime) {
            $res['suspended_end_time'] = $this->suspendedEndTime;
        }
        if (null !== $this->suspendedReason) {
            $res['suspended_reason'] = $this->suspendedReason;
        }
        if (null !== $this->uniqueIdentity) {
            $res['unique_identity'] = $this->uniqueIdentity;
        }
        if (null !== $this->sourceId) {
            $res['source_id'] = $this->sourceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->deleted) {
            $res['deleted'] = $this->deleted;
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
        if (null !== $this->alarmStatus) {
            $res['alarm_status'] = $this->alarmStatus;
        }
        if (null !== $this->conditionsDes) {
            $res['conditions_des'] = $this->conditionsDes;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAlarmRuleVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['rule_config'])) {
            $model->ruleConfig = $map['rule_config'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['step'])) {
            $model->step = $map['step'];
        }
        if (isset($map['pending_hit'])) {
            $model->pendingHit = $map['pending_hit'];
        }
        if (isset($map['recovered_hit'])) {
            $model->recoveredHit = $map['recovered_hit'];
        }
        if (isset($map['silence_time'])) {
            $model->silenceTime = $map['silence_time'];
        }
        if (isset($map['time_zone'])) {
            $model->timeZone = $map['time_zone'];
        }
        if (isset($map['emergency'])) {
            $model->emergency = $map['emergency'];
        }
        if (isset($map['emergency_url'])) {
            $model->emergencyUrl = $map['emergency_url'];
        }
        if (isset($map['alarm_empty'])) {
            $model->alarmEmpty = $map['alarm_empty'];
        }
        if (isset($map['notify_firing'])) {
            $model->notifyFiring = $map['notify_firing'];
        }
        if (isset($map['notify_recovered'])) {
            $model->notifyRecovered = $map['notify_recovered'];
        }
        if (isset($map['notify_empty'])) {
            $model->notifyEmpty = $map['notify_empty'];
        }
        if (isset($map['channels'])) {
            $model->channels = $map['channels'];
        }
        if (isset($map['notify_tpl_id'])) {
            $model->notifyTplId = $map['notify_tpl_id'];
        }
        if (isset($map['notify_time_filter'])) {
            $model->notifyTimeFilter = $map['notify_time_filter'];
        }
        if (isset($map['suspended_start_time'])) {
            $model->suspendedStartTime = $map['suspended_start_time'];
        }
        if (isset($map['suspended_end_time'])) {
            $model->suspendedEndTime = $map['suspended_end_time'];
        }
        if (isset($map['suspended_reason'])) {
            $model->suspendedReason = $map['suspended_reason'];
        }
        if (isset($map['unique_identity'])) {
            $model->uniqueIdentity = $map['unique_identity'];
        }
        if (isset($map['source_id'])) {
            $model->sourceId = $map['source_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['deleted'])) {
            $model->deleted = $map['deleted'];
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
        if (isset($map['alarm_status'])) {
            $model->alarmStatus = $map['alarm_status'];
        }
        if (isset($map['conditions_des'])) {
            if (!empty($map['conditions_des'])) {
                $model->conditionsDes = $map['conditions_des'];
            }
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

        return $model;
    }
}
