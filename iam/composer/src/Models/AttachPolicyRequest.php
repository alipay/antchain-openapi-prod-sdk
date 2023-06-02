<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class AttachPolicyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 授权对象Id
    /**
     * @var string
     */
    public $actorId;

    // 授权对象类型
    /**
     * @var string
     */
    public $actorType;

    // 授权策略Id
    /**
     * @var string
     */
    public $policyId;

    // 授权操作员的登录名，当配置actor_id与actor_type时可不填
    /**
     * @var string
     */
    public $loginName;

    // 授权策略的唯一名称，当配置policy_id时可不填
    /**
     * @var string
     */
    public $policyName;
    protected $_name = [
        'authToken'  => 'auth_token',
        'actorId'    => 'actor_id',
        'actorType'  => 'actor_type',
        'policyId'   => 'policy_id',
        'loginName'  => 'login_name',
        'policyName' => 'policy_name',
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
        if (null !== $this->actorId) {
            $res['actor_id'] = $this->actorId;
        }
        if (null !== $this->actorType) {
            $res['actor_type'] = $this->actorType;
        }
        if (null !== $this->policyId) {
            $res['policy_id'] = $this->policyId;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->policyName) {
            $res['policy_name'] = $this->policyName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AttachPolicyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['actor_id'])) {
            $model->actorId = $map['actor_id'];
        }
        if (isset($map['actor_type'])) {
            $model->actorType = $map['actor_type'];
        }
        if (isset($map['policy_id'])) {
            $model->policyId = $map['policy_id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['policy_name'])) {
            $model->policyName = $map['policy_name'];
        }

        return $model;
    }
}
