<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAlarmEventVO extends Model
{
    // 告警事件id
    /**
     * @example ""
     *
     * @var string
     */
    public $alarmEventId;

    // 告警内容
    /**
     * @example "告警内容"
     *
     * @var string
     */
    public $alarmContent;

    // 告警等级
    /**
     * @example 1
     *
     * @var int
     */
    public $alarmLevel;

    // 触发状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 告警对象
    /**
     * @example "告警对象"
     *
     * @var string
     */
    public $alarmTarget;

    // 告警产生时间
    /**
     * @example 2021-12-1 15:22:01
     *
     * @var string
     */
    public $alarmStartTime;

    // 告警恢复时间
    /**
     * @example 2021-12-1 15:22:01
     *
     * @var string
     */
    public $alarmRecoverTime;

    // 分组的告警历史集合
    /**
     * @example 分组的告警历史集合
     *
     * @var UnifiedAlarmHistoryVO[]
     */
    public $alarmHistoryList;

    // 历史id
    /**
     * @example 213
     *
     * @var int
     */
    public $alarmHistoryId;

    // type
    /**
     * @example ""
     *
     * @var string
     */
    public $alarmTargetType;

    // 告警类型
    /**
     * @example [自定义配置,应用监控]
     *
     * @var string
     */
    public $alarmType;

    // 数据源跳转url
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

    // 目标对象是否已经删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $alarmTargetDeleted;

    // 静默剩余时间
    /**
     * @example 1
     *
     * @var int
     */
    public $silenceRemainTime;

    // 告警规则ID
    /**
     * @example 1
     *
     * @var int
     */
    public $alarmRuleId;
    protected $_name = [
        'alarmEventId'       => 'alarm_event_id',
        'alarmContent'       => 'alarm_content',
        'alarmLevel'         => 'alarm_level',
        'status'             => 'status',
        'alarmTarget'        => 'alarm_target',
        'alarmStartTime'     => 'alarm_start_time',
        'alarmRecoverTime'   => 'alarm_recover_time',
        'alarmHistoryList'   => 'alarm_history_list',
        'alarmHistoryId'     => 'alarm_history_id',
        'alarmTargetType'    => 'alarm_target_type',
        'alarmType'          => 'alarm_type',
        'alarmUrl'           => 'alarm_url',
        'dataSourceName'     => 'data_source_name',
        'alarmTargetDeleted' => 'alarm_target_deleted',
        'silenceRemainTime'  => 'silence_remain_time',
        'alarmRuleId'        => 'alarm_rule_id',
    ];

    public function validate()
    {
        Model::validatePattern('alarmStartTime', $this->alarmStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('alarmRecoverTime', $this->alarmRecoverTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alarmEventId) {
            $res['alarm_event_id'] = $this->alarmEventId;
        }
        if (null !== $this->alarmContent) {
            $res['alarm_content'] = $this->alarmContent;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->alarmTarget) {
            $res['alarm_target'] = $this->alarmTarget;
        }
        if (null !== $this->alarmStartTime) {
            $res['alarm_start_time'] = $this->alarmStartTime;
        }
        if (null !== $this->alarmRecoverTime) {
            $res['alarm_recover_time'] = $this->alarmRecoverTime;
        }
        if (null !== $this->alarmHistoryList) {
            $res['alarm_history_list'] = [];
            if (null !== $this->alarmHistoryList && \is_array($this->alarmHistoryList)) {
                $n = 0;
                foreach ($this->alarmHistoryList as $item) {
                    $res['alarm_history_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->alarmHistoryId) {
            $res['alarm_history_id'] = $this->alarmHistoryId;
        }
        if (null !== $this->alarmTargetType) {
            $res['alarm_target_type'] = $this->alarmTargetType;
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
        if (null !== $this->silenceRemainTime) {
            $res['silence_remain_time'] = $this->silenceRemainTime;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAlarmEventVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alarm_event_id'])) {
            $model->alarmEventId = $map['alarm_event_id'];
        }
        if (isset($map['alarm_content'])) {
            $model->alarmContent = $map['alarm_content'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['alarm_target'])) {
            $model->alarmTarget = $map['alarm_target'];
        }
        if (isset($map['alarm_start_time'])) {
            $model->alarmStartTime = $map['alarm_start_time'];
        }
        if (isset($map['alarm_recover_time'])) {
            $model->alarmRecoverTime = $map['alarm_recover_time'];
        }
        if (isset($map['alarm_history_list'])) {
            if (!empty($map['alarm_history_list'])) {
                $model->alarmHistoryList = [];
                $n                       = 0;
                foreach ($map['alarm_history_list'] as $item) {
                    $model->alarmHistoryList[$n++] = null !== $item ? UnifiedAlarmHistoryVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['alarm_history_id'])) {
            $model->alarmHistoryId = $map['alarm_history_id'];
        }
        if (isset($map['alarm_target_type'])) {
            $model->alarmTargetType = $map['alarm_target_type'];
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
        if (isset($map['silence_remain_time'])) {
            $model->silenceRemainTime = $map['silence_remain_time'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }

        return $model;
    }
}
