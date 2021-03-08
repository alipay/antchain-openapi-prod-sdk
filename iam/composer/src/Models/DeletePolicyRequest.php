<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class DeletePolicyRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 授权策略Id
    /**
     * @var string
     */
    public $policyId;
    protected $_name = [
        'authToken' => 'auth_token',
        'policyId'  => 'policy_id',
    ];

    public function validate()
    {
        Model::validateRequired('policyId', $this->policyId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->policyId) {
            $res['policy_id'] = $this->policyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeletePolicyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['policy_id'])) {
            $model->policyId = $map['policy_id'];
        }

        return $model;
    }
}
