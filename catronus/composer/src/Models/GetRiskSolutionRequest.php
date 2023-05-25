<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class GetRiskSolutionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 风险解决方案ID, risk_id和risk_solution_id至少有一个非空
    /**
     * @var string
     */
    public $riskSolutionId;

    // 风险ID，risk_id和risk_solution_id至少有一个非空
    /**
     * @var string
     */
    public $riskId;
    protected $_name = [
        'authToken'      => 'auth_token',
        'riskSolutionId' => 'risk_solution_id',
        'riskId'         => 'risk_id',
    ];

    public function validate()
    {
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
        if (null !== $this->riskId) {
            $res['risk_id'] = $this->riskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRiskSolutionRequest
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
        if (isset($map['risk_id'])) {
            $model->riskId = $map['risk_id'];
        }

        return $model;
    }
}
