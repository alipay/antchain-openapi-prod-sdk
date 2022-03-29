<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmNotifyhistoryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

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

    // 通知人id
    /**
     * @var string
     */
    public $subscriber;

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

    // 工作区名
    /**
     * @var string
     */
    public $workspaceName;

    // 事件id
    /**
     * @var string
     */
    public $eventId;

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

    // 查询告警内容
    /**
     * @var string
     */
    public $keyword;

    // 告警规则 ID
    /**
     * @var int
     */
    public $alarmRuleId;

    // 告警状态
    /**
     * @var int
     */
    public $alarmStatus;

    // 根据应用过滤告警历史
    /**
     * @var AlarmStackInfo
     */
    public $alarmStackInfo;

    // 是否根据通知对象过滤
    /**
     * @var UnifiedAlarmSubDTO[]
     */
    public $alarmSubscribers;
    protected $_name = [
        'authToken'        => 'auth_token',
        'status'           => 'status',
        'channel'          => 'channel',
        'subscriber'       => 'subscriber',
        'currentPage'      => 'current_page',
        'pageSize'         => 'page_size',
        'workspaceName'    => 'workspace_name',
        'eventId'          => 'event_id',
        'startTime'        => 'start_time',
        'endTime'          => 'end_time',
        'keyword'          => 'keyword',
        'alarmRuleId'      => 'alarm_rule_id',
        'alarmStatus'      => 'alarm_status',
        'alarmStackInfo'   => 'alarm_stack_info',
        'alarmSubscribers' => 'alarm_subscribers',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->subscriber) {
            $res['subscriber'] = $this->subscriber;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->alarmStatus) {
            $res['alarm_status'] = $this->alarmStatus;
        }
        if (null !== $this->alarmStackInfo) {
            $res['alarm_stack_info'] = null !== $this->alarmStackInfo ? $this->alarmStackInfo->toMap() : null;
        }
        if (null !== $this->alarmSubscribers) {
            $res['alarm_subscribers'] = [];
            if (null !== $this->alarmSubscribers && \is_array($this->alarmSubscribers)) {
                $n = 0;
                foreach ($this->alarmSubscribers as $item) {
                    $res['alarm_subscribers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmNotifyhistoryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['subscriber'])) {
            $model->subscriber = $map['subscriber'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['alarm_status'])) {
            $model->alarmStatus = $map['alarm_status'];
        }
        if (isset($map['alarm_stack_info'])) {
            $model->alarmStackInfo = AlarmStackInfo::fromMap($map['alarm_stack_info']);
        }
        if (isset($map['alarm_subscribers'])) {
            if (!empty($map['alarm_subscribers'])) {
                $model->alarmSubscribers = [];
                $n                       = 0;
                foreach ($map['alarm_subscribers'] as $item) {
                    $model->alarmSubscribers[$n++] = null !== $item ? UnifiedAlarmSubDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
