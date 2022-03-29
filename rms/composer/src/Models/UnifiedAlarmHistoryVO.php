<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAlarmHistoryVO extends Model
{
    // 主键
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 事件id
    /**
     * @example ""
     *
     * @var string
     */
    public $eventId;

    // 告警规则id
    /**
     * @example 1
     *
     * @var int
     */
    public $alarmRuleId;

    // 告警规则唯一标识
    /**
     * @example 123_0
     *
     * @var string
     */
    public $uniqueIdentity;

    // 告警规则名字
    /**
     * @example ""
     *
     * @var string
     */
    public $alarmRuleName;

    // 告警等级
    /**
     * @example 1
     *
     * @var int
     */
    public $alarmLevel;

    // 告警时间
    /**
     * @example 2021-5-27 10:08:52
     *
     * @var int
     */
    public $alarmTime;

    // 告警内容
    /**
     * @example ""
     *
     * @var string
     */
    public $alarmContent;

    // 告警对象
    /**
     * @example ""
     *
     * @var string
     */
    public $alarmTarget;

    // 触发状态
    /**
     * @example 0
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

    // 工作区id
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

    // type
    /**
     * @example ""
     *
     * @var string
     */
    public $alarmTargetType;

    // 告警详情
    /**
     * @example [{"tags":[]}]
     *
     * @var string
     */
    public $alarmDetail;

    // 数据源名称
    /**
     * @example PQL
     *
     * @var string
     */
    public $dataSourceName;

    // 数据源跳转url
    /**
     * @example /business/product/multiMinute/preview/2000021
     *
     * @var string
     */
    public $alarmUrl;

    // 告警类型
    /**
     * @example [自定义配置,应用监控]
     *
     * @var string
     */
    public $alarmType;

    // 目标对象是否已经删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $alarmTargetDeleted;
    protected $_name = [
        'id'                 => 'id',
        'eventId'            => 'event_id',
        'alarmRuleId'        => 'alarm_rule_id',
        'uniqueIdentity'     => 'unique_identity',
        'alarmRuleName'      => 'alarm_rule_name',
        'alarmLevel'         => 'alarm_level',
        'alarmTime'          => 'alarm_time',
        'alarmContent'       => 'alarm_content',
        'alarmTarget'        => 'alarm_target',
        'status'             => 'status',
        'tenantId'           => 'tenant_id',
        'workspaceId'        => 'workspace_id',
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'alarmTargetType'    => 'alarm_target_type',
        'alarmDetail'        => 'alarm_detail',
        'dataSourceName'     => 'data_source_name',
        'alarmUrl'           => 'alarm_url',
        'alarmType'          => 'alarm_type',
        'alarmTargetDeleted' => 'alarm_target_deleted',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('eventId', $this->eventId, true);
        Model::validateRequired('alarmRuleId', $this->alarmRuleId, true);
        Model::validateRequired('uniqueIdentity', $this->uniqueIdentity, true);
        Model::validateRequired('alarmRuleName', $this->alarmRuleName, true);
        Model::validateRequired('alarmLevel', $this->alarmLevel, true);
        Model::validateRequired('alarmTime', $this->alarmTime, true);
        Model::validateRequired('alarmContent', $this->alarmContent, true);
        Model::validateRequired('alarmTarget', $this->alarmTarget, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('alarmDetail', $this->alarmDetail, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->uniqueIdentity) {
            $res['unique_identity'] = $this->uniqueIdentity;
        }
        if (null !== $this->alarmRuleName) {
            $res['alarm_rule_name'] = $this->alarmRuleName;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->alarmTime) {
            $res['alarm_time'] = $this->alarmTime;
        }
        if (null !== $this->alarmContent) {
            $res['alarm_content'] = $this->alarmContent;
        }
        if (null !== $this->alarmTarget) {
            $res['alarm_target'] = $this->alarmTarget;
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
        if (null !== $this->alarmTargetType) {
            $res['alarm_target_type'] = $this->alarmTargetType;
        }
        if (null !== $this->alarmDetail) {
            $res['alarm_detail'] = $this->alarmDetail;
        }
        if (null !== $this->dataSourceName) {
            $res['data_source_name'] = $this->dataSourceName;
        }
        if (null !== $this->alarmUrl) {
            $res['alarm_url'] = $this->alarmUrl;
        }
        if (null !== $this->alarmType) {
            $res['alarm_type'] = $this->alarmType;
        }
        if (null !== $this->alarmTargetDeleted) {
            $res['alarm_target_deleted'] = $this->alarmTargetDeleted;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAlarmHistoryVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['unique_identity'])) {
            $model->uniqueIdentity = $map['unique_identity'];
        }
        if (isset($map['alarm_rule_name'])) {
            $model->alarmRuleName = $map['alarm_rule_name'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['alarm_time'])) {
            $model->alarmTime = $map['alarm_time'];
        }
        if (isset($map['alarm_content'])) {
            $model->alarmContent = $map['alarm_content'];
        }
        if (isset($map['alarm_target'])) {
            $model->alarmTarget = $map['alarm_target'];
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
        if (isset($map['alarm_target_type'])) {
            $model->alarmTargetType = $map['alarm_target_type'];
        }
        if (isset($map['alarm_detail'])) {
            $model->alarmDetail = $map['alarm_detail'];
        }
        if (isset($map['data_source_name'])) {
            $model->dataSourceName = $map['data_source_name'];
        }
        if (isset($map['alarm_url'])) {
            $model->alarmUrl = $map['alarm_url'];
        }
        if (isset($map['alarm_type'])) {
            $model->alarmType = $map['alarm_type'];
        }
        if (isset($map['alarm_target_deleted'])) {
            $model->alarmTargetDeleted = $map['alarm_target_deleted'];
        }

        return $model;
    }
}
