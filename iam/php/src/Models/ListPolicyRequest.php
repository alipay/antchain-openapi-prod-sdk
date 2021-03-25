<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class ListPolicyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'actorId' => 'actor_id',
        'actorType' => 'actor_type',
        'tenant' => 'tenant',
    ];
    public function validate() {
        Model::validateRequired('actorId', $this->actorId, true);
        Model::validateRequired('actorType', $this->actorType, true);
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
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListPolicyRequest
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
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 授权对象id
    /**
     * @var string
     */
    public $actorId;

    // 授权对象类型
    /**
     * @var string
     */
    public $actorType;

    // 授权策略所属租户
    /**
     * @var string
     */
    public $tenant;

}
