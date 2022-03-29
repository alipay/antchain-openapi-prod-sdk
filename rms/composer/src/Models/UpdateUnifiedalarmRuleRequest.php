<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateUnifiedalarmRuleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 主键
    /**
     * @var int
     */
    public $id;

    // 规则名称
    /**
     * @var string
     */
    public $name;

    // 规则分类
    /**
     * @var string
     */
    public $category;

    // 规则配置
    /**
     * @var string
     */
    public $ruleConfig;

    // 指标无数据时触发告警
    /**
     * @var int
     */
    public $alarmNodata;

    // 告警等级
    /**
     * @var int
     */
    public $level;

    // 应急处理人
    /**
     * @var string
     */
    public $emergency;

    // 应急处理链接
    /**
     * @var string
     */
    public $emergencyUrl;

    // 触发周期
    /**
     * @var int
     */
    public $pendingHit;

    // 恢复周期
    /**
     * @var int
     */
    public $recoveredHit;

    // 检测频率
    /**
     * @var int
     */
    public $step;

    // 通知渠道
    /**
     * @var string[]
     */
    public $channels;

    // 通知对象
    /**
     * @var UnifiedAlarmSubDTO[]
     */
    public $notifyTarget;

    // 静默时间
    /**
     * @var int
     */
    public $silenceTime;

    // 告警触发时通知
    /**
     * @var int
     */
    public $notifyFiring;

    // 告警恢复时通知
    /**
     * @var int
     */
    public $notifyRecovered;

    // 告警无数据时通知
    /**
     * @var int
     */
    public $notifyNodata;

    // 通知时间
    /**
     * @var TimeFilter
     */
    public $notifyTimeFilter;

    // 启停状态
    /**
     * @var string
     */
    public $status;

    // 暂停开始时间
    /**
     * @var int
     */
    public $suspendedStartTime;

    // 告警结束时间
    /**
     * @var int
     */
    public $suspendedEndTime;

    // 暂停原因
    /**
     * @var string
     */
    public $suspendedReason;

    // 工作空间名
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'id'                 => 'id',
        'name'               => 'name',
        'category'           => 'category',
        'ruleConfig'         => 'rule_config',
        'alarmNodata'        => 'alarm_nodata',
        'level'              => 'level',
        'emergency'          => 'emergency',
        'emergencyUrl'       => 'emergency_url',
        'pendingHit'         => 'pending_hit',
        'recoveredHit'       => 'recovered_hit',
        'step'               => 'step',
        'channels'           => 'channels',
        'notifyTarget'       => 'notify_target',
        'silenceTime'        => 'silence_time',
        'notifyFiring'       => 'notify_firing',
        'notifyRecovered'    => 'notify_recovered',
        'notifyNodata'       => 'notify_nodata',
        'notifyTimeFilter'   => 'notify_time_filter',
        'status'             => 'status',
        'suspendedStartTime' => 'suspended_start_time',
        'suspendedEndTime'   => 'suspended_end_time',
        'suspendedReason'    => 'suspended_reason',
        'workspaceName'      => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('ruleConfig', $this->ruleConfig, true);
        Model::validateRequired('alarmNodata', $this->alarmNodata, true);
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('pendingHit', $this->pendingHit, true);
        Model::validateRequired('recoveredHit', $this->recoveredHit, true);
        Model::validateRequired('step', $this->step, true);
        Model::validateRequired('channels', $this->channels, true);
        Model::validateRequired('silenceTime', $this->silenceTime, true);
        Model::validateRequired('notifyFiring', $this->notifyFiring, true);
        Model::validateRequired('notifyRecovered', $this->notifyRecovered, true);
        Model::validateRequired('notifyNodata', $this->notifyNodata, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
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
        if (null !== $this->alarmNodata) {
            $res['alarm_nodata'] = $this->alarmNodata;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->emergency) {
            $res['emergency'] = $this->emergency;
        }
        if (null !== $this->emergencyUrl) {
            $res['emergency_url'] = $this->emergencyUrl;
        }
        if (null !== $this->pendingHit) {
            $res['pending_hit'] = $this->pendingHit;
        }
        if (null !== $this->recoveredHit) {
            $res['recovered_hit'] = $this->recoveredHit;
        }
        if (null !== $this->step) {
            $res['step'] = $this->step;
        }
        if (null !== $this->channels) {
            $res['channels'] = $this->channels;
        }
        if (null !== $this->notifyTarget) {
            $res['notify_target'] = [];
            if (null !== $this->notifyTarget && \is_array($this->notifyTarget)) {
                $n = 0;
                foreach ($this->notifyTarget as $item) {
                    $res['notify_target'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->silenceTime) {
            $res['silence_time'] = $this->silenceTime;
        }
        if (null !== $this->notifyFiring) {
            $res['notify_firing'] = $this->notifyFiring;
        }
        if (null !== $this->notifyRecovered) {
            $res['notify_recovered'] = $this->notifyRecovered;
        }
        if (null !== $this->notifyNodata) {
            $res['notify_nodata'] = $this->notifyNodata;
        }
        if (null !== $this->notifyTimeFilter) {
            $res['notify_time_filter'] = null !== $this->notifyTimeFilter ? $this->notifyTimeFilter->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateUnifiedalarmRuleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
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
        if (isset($map['alarm_nodata'])) {
            $model->alarmNodata = $map['alarm_nodata'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['emergency'])) {
            $model->emergency = $map['emergency'];
        }
        if (isset($map['emergency_url'])) {
            $model->emergencyUrl = $map['emergency_url'];
        }
        if (isset($map['pending_hit'])) {
            $model->pendingHit = $map['pending_hit'];
        }
        if (isset($map['recovered_hit'])) {
            $model->recoveredHit = $map['recovered_hit'];
        }
        if (isset($map['step'])) {
            $model->step = $map['step'];
        }
        if (isset($map['channels'])) {
            if (!empty($map['channels'])) {
                $model->channels = $map['channels'];
            }
        }
        if (isset($map['notify_target'])) {
            if (!empty($map['notify_target'])) {
                $model->notifyTarget = [];
                $n                   = 0;
                foreach ($map['notify_target'] as $item) {
                    $model->notifyTarget[$n++] = null !== $item ? UnifiedAlarmSubDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['silence_time'])) {
            $model->silenceTime = $map['silence_time'];
        }
        if (isset($map['notify_firing'])) {
            $model->notifyFiring = $map['notify_firing'];
        }
        if (isset($map['notify_recovered'])) {
            $model->notifyRecovered = $map['notify_recovered'];
        }
        if (isset($map['notify_nodata'])) {
            $model->notifyNodata = $map['notify_nodata'];
        }
        if (isset($map['notify_time_filter'])) {
            $model->notifyTimeFilter = TimeFilter::fromMap($map['notify_time_filter']);
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
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
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
