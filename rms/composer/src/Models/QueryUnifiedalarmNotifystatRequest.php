<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmNotifystatRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

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

    // 发送状态
    /**
     * @var int
     */
    public $status;

    // 通知渠道
    /**
     * @var string
     */
    public $channel;

    // 模糊查询通知内容
    /**
     * @var string
     */
    public $keyword;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // 告警规则 ID
    /**
     * @var int
     */
    public $alarmRuleId;

    // 事件ID
    /**
     * @var string
     */
    public $eventId;

    // 根据应用过滤
    /**
     * @var AlarmStackInfo
     */
    public $alarmStackInfo;
    protected $_name = [
        'authToken'      => 'auth_token',
        'startTime'      => 'start_time',
        'endTime'        => 'end_time',
        'status'         => 'status',
        'channel'        => 'channel',
        'keyword'        => 'keyword',
        'workspaceName'  => 'workspace_name',
        'alarmRuleId'    => 'alarm_rule_id',
        'eventId'        => 'event_id',
        'alarmStackInfo' => 'alarm_stack_info',
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
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->alarmStackInfo) {
            $res['alarm_stack_info'] = null !== $this->alarmStackInfo ? $this->alarmStackInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmNotifystatRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['alarm_stack_info'])) {
            $model->alarmStackInfo = AlarmStackInfo::fromMap($map['alarm_stack_info']);
        }

        return $model;
    }
}
