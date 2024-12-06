<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryPolicyFileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 蚂蚁侧保单唯一ID
    /**
     * @var string
     */
    public $insurancePolicyNoInner;
    protected $_name = [
        'authToken'              => 'auth_token',
        'insurancePolicyNoInner' => 'insurance_policy_no_inner',
    ];

    public function validate()
    {
        Model::validateRequired('insurancePolicyNoInner', $this->insurancePolicyNoInner, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->insurancePolicyNoInner) {
            $res['insurance_policy_no_inner'] = $this->insurancePolicyNoInner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPolicyFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['insurance_policy_no_inner'])) {
            $model->insurancePolicyNoInner = $map['insurance_policy_no_inner'];
        }

        return $model;
    }
}
