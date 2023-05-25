<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateRiskSolutionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 风险解决方案ID
    /**
     * @var string
     */
    public $riskSolutionId;

    // 解决方案类型
    /**
     * @var string
     */
    public $fixType;

    // 风险描述
    /**
     * @var string
     */
    public $riskDescription;

    // 风险解决方案
    /**
     * @var string
     */
    public $solutionPlan;

    // 应急解决方案
    /**
     * @var string
     */
    public $emergencyPlan;
    protected $_name = [
        'authToken'       => 'auth_token',
        'riskSolutionId'  => 'risk_solution_id',
        'fixType'         => 'fix_type',
        'riskDescription' => 'risk_description',
        'solutionPlan'    => 'solution_plan',
        'emergencyPlan'   => 'emergency_plan',
    ];

    public function validate()
    {
        Model::validateRequired('riskSolutionId', $this->riskSolutionId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->riskSolutionId) {
            $res['risk_solution_id'] = $this->riskSolutionId;
        }
        if (null !== $this->fixType) {
            $res['fix_type'] = $this->fixType;
        }
        if (null !== $this->riskDescription) {
            $res['risk_description'] = $this->riskDescription;
        }
        if (null !== $this->solutionPlan) {
            $res['solution_plan'] = $this->solutionPlan;
        }
        if (null !== $this->emergencyPlan) {
            $res['emergency_plan'] = $this->emergencyPlan;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateRiskSolutionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['risk_solution_id'])) {
            $model->riskSolutionId = $map['risk_solution_id'];
        }
        if (isset($map['fix_type'])) {
            $model->fixType = $map['fix_type'];
        }
        if (isset($map['risk_description'])) {
            $model->riskDescription = $map['risk_description'];
        }
        if (isset($map['solution_plan'])) {
            $model->solutionPlan = $map['solution_plan'];
        }
        if (isset($map['emergency_plan'])) {
            $model->emergencyPlan = $map['emergency_plan'];
        }

        return $model;
    }
}
