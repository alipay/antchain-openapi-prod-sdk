<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetStsActorRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'actorId' => 'actor_id',
        'actorName' => 'actor_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->actorId) {
            $res['actor_id'] = $this->actorId;
        }
        if (null !== $this->actorName) {
            $res['actor_name'] = $this->actorName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetStsActorRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['actor_id'])){
            $model->actorId = $map['actor_id'];
        }
        if(isset($map['actor_name'])){
            $model->actorName = $map['actor_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 虚拟身份ID，与虚拟身份名称两个参数二选一传入
    /**
     * @var string
     */
    public $actorId;

    // 虚拟身份名称，与虚拟身份名称两个参数二选一传入
    /**
     * @var string
     */
    public $actorName;

}
