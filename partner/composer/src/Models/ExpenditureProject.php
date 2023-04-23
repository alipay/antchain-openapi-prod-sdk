<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class ExpenditureProject extends Model
{
    // 项目阶段：
    // REQUIREMENT_CONFIRM("REQUIREMENT_CONFIRM", "需求确认", "SOLUTION"),
    // SOLUTION("SOLUTION", "方案沟通", "TALKS"),
    // TALKS("TALKS", "商务谈判", "SIGNED"),
    // SIGNED("SIGNED", "签约完成", "SIGNED"),
    // ABORT("ABORT", "项目终止", "ABORT"),
    //
    /**
     * @example REQUIREMENT_CONFIRM
     *
     * @var string
     */
    public $stage;

    // 项目状态：
    // DOING("DOING","进行中"),
    // ABORTED("ABORTED","已终止"),
    // FINISHED("FINISHED","已完成"),
    /**
     * @example DOING
     *
     * @var string
     */
    public $status;

    // 支出合同信息
    /**
     * @example
     *
     * @var ExpenditureContract
     */
    public $contract;

    // 支出配置单信息
    /**
     * @example
     *
     * @var ExpenditureQuotation
     */
    public $quotation;

    // 合作计划id
    /**
     * @example 20
     *
     * @var int
     */
    public $collaborationPlanId;
    protected $_name = [
        'stage'               => 'stage',
        'status'              => 'status',
        'contract'            => 'contract',
        'quotation'           => 'quotation',
        'collaborationPlanId' => 'collaboration_plan_id',
    ];

    public function validate()
    {
        Model::validateRequired('stage', $this->stage, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stage) {
            $res['stage'] = $this->stage;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->contract) {
            $res['contract'] = null !== $this->contract ? $this->contract->toMap() : null;
        }
        if (null !== $this->quotation) {
            $res['quotation'] = null !== $this->quotation ? $this->quotation->toMap() : null;
        }
        if (null !== $this->collaborationPlanId) {
            $res['collaboration_plan_id'] = $this->collaborationPlanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpenditureProject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['stage'])) {
            $model->stage = $map['stage'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['contract'])) {
            $model->contract = ExpenditureContract::fromMap($map['contract']);
        }
        if (isset($map['quotation'])) {
            $model->quotation = ExpenditureQuotation::fromMap($map['quotation']);
        }
        if (isset($map['collaboration_plan_id'])) {
            $model->collaborationPlanId = $map['collaboration_plan_id'];
        }

        return $model;
    }
}
