<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmHistoryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // 开始时间
    /**
     * @var int
     */
    public $start;

    // 结束时间
    /**
     * @var int
     */
    public $end;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 应用 / 主机
    /**
     * @var string
     */
    public $alarmTargetType;

    // 告警对象
    /**
     * @var string
     */
    public $alarmTarget;

    // 告警级别
    /**
     * @var int
     */
    public $alarmLevel;

    // 触发状态
    /**
     * @var int
     */
    public $status;

    // 根据应用过滤告警历史
    /**
     * @var AlarmStackInfo
     */
    public $alarmStackInfo;
    protected $_name = [
        'authToken'       => 'auth_token',
        'workspaceName'   => 'workspace_name',
        'start'           => 'start',
        'end'             => 'end',
        'currentPage'     => 'current_page',
        'pageSize'        => 'page_size',
        'alarmTargetType' => 'alarm_target_type',
        'alarmTarget'     => 'alarm_target',
        'alarmLevel'      => 'alarm_level',
        'status'          => 'status',
        'alarmStackInfo'  => 'alarm_stack_info',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
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
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->alarmTargetType) {
            $res['alarm_target_type'] = $this->alarmTargetType;
        }
        if (null !== $this->alarmTarget) {
            $res['alarm_target'] = $this->alarmTarget;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->alarmStackInfo) {
            $res['alarm_stack_info'] = null !== $this->alarmStackInfo ? $this->alarmStackInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmHistoryRequest
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
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['alarm_target_type'])) {
            $model->alarmTargetType = $map['alarm_target_type'];
        }
        if (isset($map['alarm_target'])) {
            $model->alarmTarget = $map['alarm_target'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['alarm_stack_info'])) {
            $model->alarmStackInfo = AlarmStackInfo::fromMap($map['alarm_stack_info']);
        }

        return $model;
    }
}
