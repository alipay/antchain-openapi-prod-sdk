<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class OfflineDecisionPlanDetail extends Model
{
    // 圈客计划ID
    /**
     * @example 1032
     *
     * @var string
     */
    public $decisionPlanId;

    // 离线圈客执行任务状态
    /**
     * @example ECN
     *
     * @var string
     */
    public $decisionResultStatus;
    protected $_name = [
        'decisionPlanId'       => 'decision_plan_id',
        'decisionResultStatus' => 'decision_result_status',
    ];

    public function validate()
    {
        Model::validateRequired('decisionPlanId', $this->decisionPlanId, true);
        Model::validateRequired('decisionResultStatus', $this->decisionResultStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->decisionPlanId) {
            $res['decision_plan_id'] = $this->decisionPlanId;
        }
        if (null !== $this->decisionResultStatus) {
            $res['decision_result_status'] = $this->decisionResultStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OfflineDecisionPlanDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['decision_plan_id'])) {
            $model->decisionPlanId = $map['decision_plan_id'];
        }
        if (isset($map['decision_result_status'])) {
            $model->decisionResultStatus = $map['decision_result_status'];
        }

        return $model;
    }
}
