<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmEventRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作区
    /**
     * @var string
     */
    public $workspaceName;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 页面尺寸
    /**
     * @var int
     */
    public $pageSize;

    // 告警等级
    /**
     * @var int
     */
    public $alarmLevel;

    // 触发状态
    /**
     * @var int
     */
    public $status;

    // 告警对象类型
    /**
     * @var string
     */
    public $alarmTargetType;

    // 模糊查询字段
    /**
     * @var string
     */
    public $keyword;

    // 开始时间
    /**
     * @var int
     */
    public $startTime;

    // 结束时间
    /**
     * @var int
     */
    public $endTime;

    // 告警规则 ID
    /**
     * @var int
     */
    public $alarmRuleId;

    // 根据应用栈过滤
    /**
     * @var AlarmStackInfo
     */
    public $alarmStackInfo;

    // 查询告警事件产生时间所在区间的开始时间
    /**
     * @var int
     */
    public $fireStartTime;

    // 查询告警事件产生时间所在区间的结束时间
    /**
     * @var int
     */
    public $fireEndTime;

    // 查询告警事件恢复时间所在区间的开始时间
    /**
     * @var int
     */
    public $recoveredStartTime;

    // 查询告警事件恢复时间所在区间的结束时间
    /**
     * @var int
     */
    public $recoveredEndTime;
    protected $_name = [
        'authToken'          => 'auth_token',
        'workspaceName'      => 'workspace_name',
        'currentPage'        => 'current_page',
        'pageSize'           => 'page_size',
        'alarmLevel'         => 'alarm_level',
        'status'             => 'status',
        'alarmTargetType'    => 'alarm_target_type',
        'keyword'            => 'keyword',
        'startTime'          => 'start_time',
        'endTime'            => 'end_time',
        'alarmRuleId'        => 'alarm_rule_id',
        'alarmStackInfo'     => 'alarm_stack_info',
        'fireStartTime'      => 'fire_start_time',
        'fireEndTime'        => 'fire_end_time',
        'recoveredStartTime' => 'recovered_start_time',
        'recoveredEndTime'   => 'recovered_end_time',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->alarmTargetType) {
            $res['alarm_target_type'] = $this->alarmTargetType;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->alarmStackInfo) {
            $res['alarm_stack_info'] = null !== $this->alarmStackInfo ? $this->alarmStackInfo->toMap() : null;
        }
        if (null !== $this->fireStartTime) {
            $res['fire_start_time'] = $this->fireStartTime;
        }
        if (null !== $this->fireEndTime) {
            $res['fire_end_time'] = $this->fireEndTime;
        }
        if (null !== $this->recoveredStartTime) {
            $res['recovered_start_time'] = $this->recoveredStartTime;
        }
        if (null !== $this->recoveredEndTime) {
            $res['recovered_end_time'] = $this->recoveredEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmEventRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['alarm_target_type'])) {
            $model->alarmTargetType = $map['alarm_target_type'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['alarm_stack_info'])) {
            $model->alarmStackInfo = AlarmStackInfo::fromMap($map['alarm_stack_info']);
        }
        if (isset($map['fire_start_time'])) {
            $model->fireStartTime = $map['fire_start_time'];
        }
        if (isset($map['fire_end_time'])) {
            $model->fireEndTime = $map['fire_end_time'];
        }
        if (isset($map['recovered_start_time'])) {
            $model->recoveredStartTime = $map['recovered_start_time'];
        }
        if (isset($map['recovered_end_time'])) {
            $model->recoveredEndTime = $map['recovered_end_time'];
        }

        return $model;
    }
}
