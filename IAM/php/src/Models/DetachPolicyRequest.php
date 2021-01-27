<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class DetachPolicyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'actorId' => 'actor_id',
        'actorType' => 'actor_type',
        'policyId' => 'policy_id',
    ];
    public function validate() {
        Model::validateRequired('actorId', $this->actorId, true);
        Model::validateRequired('actorType', $this->actorType, true);
        Model::validateRequired('policyId', $this->policyId, true);
    }
    public function toMap() {
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
        return $res;
    }
    /**
     * @param array $map
     * @return DetachPolicyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['actor_id'])){
            $model->actorId = $map['actor_id'];
        }
        if(isset($map['actor_type'])){
            $model->actorType = $map['actor_type'];
        }
        if(isset($map['policy_id'])){
            $model->policyId = $map['policy_id'];
        }
        return $model;
    }
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

}
