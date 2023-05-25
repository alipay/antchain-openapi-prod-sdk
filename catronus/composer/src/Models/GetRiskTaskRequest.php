<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class GetRiskTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 风险工单ID
    /**
     * @var string
     */
    public $riskTaskId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'riskTaskId' => 'risk_task_id',
    ];

    public function validate()
    {
        Model::validateRequired('riskTaskId', $this->riskTaskId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->riskTaskId) {
            $res['risk_task_id'] = $this->riskTaskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRiskTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['risk_task_id'])) {
            $model->riskTaskId = $map['risk_task_id'];
        }

        return $model;
    }
}
