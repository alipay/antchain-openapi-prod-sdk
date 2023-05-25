<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class CreateRiskSolutionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 关联风险ID
    /**
     * @var string
     */
    public $riskId;

    // 解决方案来源
    /**
     * @var string
     */
    public $source;

    // 修复类型
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
        'name'            => 'name',
        'riskId'          => 'risk_id',
        'source'          => 'source',
        'fixType'         => 'fix_type',
        'riskDescription' => 'risk_description',
        'solutionPlan'    => 'solution_plan',
        'emergencyPlan'   => 'emergency_plan',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('riskId', $this->riskId, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('fixType', $this->fixType, true);
        Model::validateRequired('riskDescription', $this->riskDescription, true);
        Model::validateRequired('solutionPlan', $this->solutionPlan, true);
        Model::validateRequired('emergencyPlan', $this->emergencyPlan, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->riskId) {
            $res['risk_id'] = $this->riskId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
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
     * @return CreateRiskSolutionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['risk_id'])) {
            $model->riskId = $map['risk_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
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
