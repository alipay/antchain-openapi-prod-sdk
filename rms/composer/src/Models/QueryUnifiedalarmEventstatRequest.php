<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmEventstatRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

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

    // 时间戳
    /**
     * @var int
     */
    public $startTime;

    // 时间戳
    /**
     * @var int
     */
    public $endTime;

    // 工作空间名
    /**
     * @var string
     */
    public $workspaceName;

    // 模糊查询告警内容
    /**
     * @var string
     */
    public $keyword;

    // 告警规则 ID
    /**
     * @var int
     */
    public $alarmRuleId;

    // alarm_target_type
    /**
     * @var string
     */
    public $alarmTargetType;

    // 根据应用过滤
    /**
     * @var AlarmStackInfo
     */
    public $alarmStackInfo;
    protected $_name = [
        'authToken'       => 'auth_token',
        'alarmLevel'      => 'alarm_level',
        'status'          => 'status',
        'startTime'       => 'start_time',
        'endTime'         => 'end_time',
        'workspaceName'   => 'workspace_name',
        'keyword'         => 'keyword',
        'alarmRuleId'     => 'alarm_rule_id',
        'alarmTargetType' => 'alarm_target_type',
        'alarmStackInfo'  => 'alarm_stack_info',
    ];

    public function validate()
    {
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->alarmTargetType) {
            $res['alarm_target_type'] = $this->alarmTargetType;
        }
        if (null !== $this->alarmStackInfo) {
            $res['alarm_stack_info'] = null !== $this->alarmStackInfo ? $this->alarmStackInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmEventstatRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['alarm_target_type'])) {
            $model->alarmTargetType = $map['alarm_target_type'];
        }
        if (isset($map['alarm_stack_info'])) {
            $model->alarmStackInfo = AlarmStackInfo::fromMap($map['alarm_stack_info']);
        }

        return $model;
    }
}
