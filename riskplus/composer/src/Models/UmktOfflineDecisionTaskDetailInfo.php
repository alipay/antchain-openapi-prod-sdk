<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UmktOfflineDecisionTaskDetailInfo extends Model
{
    // 任务id
    /**
     * @example 1
     *
     * @var int
     */
    public $taskId;

    // 圈客计划id
    /**
     * @example
     *
     * @var int
     */
    public $decisionPlanId;

    // 圈客结果状态
    /**
     * @example D
     *
     * @var string
     */
    public $decisionResultStatus;

    // 圈客结果状态描述
    /**
     * @example 已完成
     *
     * @var string
     */
    public $statusRemark;
    protected $_name = [
        'taskId'               => 'task_id',
        'decisionPlanId'       => 'decision_plan_id',
        'decisionResultStatus' => 'decision_result_status',
        'statusRemark'         => 'status_remark',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('decisionPlanId', $this->decisionPlanId, true);
        Model::validateRequired('decisionResultStatus', $this->decisionResultStatus, true);
        Model::validateRequired('statusRemark', $this->statusRemark, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->decisionPlanId) {
            $res['decision_plan_id'] = $this->decisionPlanId;
        }
        if (null !== $this->decisionResultStatus) {
            $res['decision_result_status'] = $this->decisionResultStatus;
        }
        if (null !== $this->statusRemark) {
            $res['status_remark'] = $this->statusRemark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UmktOfflineDecisionTaskDetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['decision_plan_id'])) {
            $model->decisionPlanId = $map['decision_plan_id'];
        }
        if (isset($map['decision_result_status'])) {
            $model->decisionResultStatus = $map['decision_result_status'];
        }
        if (isset($map['status_remark'])) {
            $model->statusRemark = $map['status_remark'];
        }

        return $model;
    }
}
