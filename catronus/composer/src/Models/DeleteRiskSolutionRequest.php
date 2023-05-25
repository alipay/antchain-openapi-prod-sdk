<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class DeleteRiskSolutionRequest extends Model
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
    protected $_name = [
        'authToken'      => 'auth_token',
        'riskSolutionId' => 'risk_solution_id',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteRiskSolutionRequest
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

        return $model;
    }
}
