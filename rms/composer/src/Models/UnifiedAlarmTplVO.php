<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAlarmTplVO extends Model
{
    // 主键
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 模板名称
    /**
     * @example ""
     *
     * @var string
     */
    public $name;

    // 用于区分规则模板和消息模板
    /**
     * @example "rule" "notify"
     *
     * @var string
     */
    public $category;

    // 规则配置
    /**
     * @example 详见UnifiedAlarmRuleDO模型中的RuleConfig字段
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
     * @example
     *
     * @var int
     */
    public $step;

    // 触发周期
    /**
     * @example
     *
     * @var int
     */
    public $pendingHit;

    // 恢复周期
    /**
     * @example
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
     * @example “weix”
     *
     * @var string
     */
    public $emergency;

    // 应急处理链接
    /**
     * @example “www.xxx.com”
     *
     * @var string
     */
    public $emergencyUrl;

    // 无数据告警 这是个开关
    /**
     * @example
     *
     * @var int
     */
    public $alarmEmpty;

    // 告警触发时通知 开关
    /**
     * @example
     *
     * @var int
     */
    public $notifyFiring;

    // 告警恢复时通知 开关
    /**
     * @example
     *
     * @var int
     */
    public $notifyRecovered;

    // 告警无数据时通知 开关
    /**
     * @example
     *
     * @var int
     */
    public $notifyEmpty;

    // 通知渠道
    /**
     * @example “”
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
     * @example ""
     *
     * @var string
     */
    public $notifyTimeFilter;

    // 生效范围
    /**
     * @example "tenant"
     *
     * @var string
     */
    public $scope;

    // 如scope为租户 则值为tenant_id
    /**
     * @example
     *
     * @var int
     */
    public $scopeIdentity;

    // 订阅关系的对象
    /**
     * @example 前端将订阅关系对象转string
     *
     * @var string
     */
    public $alarmSub;

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
     * @example 2021-5-27 10:08:52
     *
     * @var string
     */
    public $gmtModified;

    // 状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;
    protected $_name = [
        'id'               => 'id',
        'name'             => 'name',
        'category'         => 'category',
        'ruleConfig'       => 'rule_config',
        'level'            => 'level',
        'step'             => 'step',
        'pendingHit'       => 'pending_hit',
        'recoveredHit'     => 'recovered_hit',
        'silenceTime'      => 'silence_time',
        'timeZone'         => 'time_zone',
        'emergency'        => 'emergency',
        'emergencyUrl'     => 'emergency_url',
        'alarmEmpty'       => 'alarm_empty',
        'notifyFiring'     => 'notify_firing',
        'notifyRecovered'  => 'notify_recovered',
        'notifyEmpty'      => 'notify_empty',
        'channels'         => 'channels',
        'notifyTplId'      => 'notify_tpl_id',
        'notifyTimeFilter' => 'notify_time_filter',
        'scope'            => 'scope',
        'scopeIdentity'    => 'scope_identity',
        'alarmSub'         => 'alarm_sub',
        'tenantId'         => 'tenant_id',
        'workspaceId'      => 'workspace_id',
        'creator'          => 'creator',
        'modifier'         => 'modifier',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'status'           => 'status',
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
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        if (null !== $this->alarmSub) {
            $res['alarm_sub'] = $this->alarmSub;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAlarmTplVO
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
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['scope_identity'])) {
            $model->scopeIdentity = $map['scope_identity'];
        }
        if (isset($map['alarm_sub'])) {
            $model->alarmSub = $map['alarm_sub'];
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
