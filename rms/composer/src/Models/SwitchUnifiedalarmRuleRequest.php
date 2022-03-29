<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class SwitchUnifiedalarmRuleRequest extends Model
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

    // 告警开始时间
    /**
     * @var int
     */
    public $suspendStartTime;

    // 告警结束时间
    /**
     * @var int
     */
    public $suspendedEndTime;

    // 告警暂停原因
    /**
     * @var string
     */
    public $suspendedReason;

    // 启停状态
    /**
     * @var int
     */
    public $status;

    // 工作空间名
    /**
     * @var string
     */
    public $workspaceName;

    // 批量暂停与恢复
    /**
     * @var int[]
     */
    public $ids;
    protected $_name = [
        'authToken'        => 'auth_token',
        'id'               => 'id',
        'suspendStartTime' => 'suspend_start_time',
        'suspendedEndTime' => 'suspended_end_time',
        'suspendedReason'  => 'suspended_reason',
        'status'           => 'status',
        'workspaceName'    => 'workspace_name',
        'ids'              => 'ids',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->suspendStartTime) {
            $res['suspend_start_time'] = $this->suspendStartTime;
        }
        if (null !== $this->suspendedEndTime) {
            $res['suspended_end_time'] = $this->suspendedEndTime;
        }
        if (null !== $this->suspendedReason) {
            $res['suspended_reason'] = $this->suspendedReason;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SwitchUnifiedalarmRuleRequest
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
        if (isset($map['suspend_start_time'])) {
            $model->suspendStartTime = $map['suspend_start_time'];
        }
        if (isset($map['suspended_end_time'])) {
            $model->suspendedEndTime = $map['suspended_end_time'];
        }
        if (isset($map['suspended_reason'])) {
            $model->suspendedReason = $map['suspended_reason'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }

        return $model;
    }
}
