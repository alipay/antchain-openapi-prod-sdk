<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class AssumeStsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'actorName' => 'actor_name',
        'actorTenant' => 'actor_tenant',
        'durationSeconds' => 'duration_seconds',
        'sessionName' => 'session_name',
    ];
    public function validate() {
        Model::validateRequired('actorName', $this->actorName, true);
        Model::validateRequired('actorTenant', $this->actorTenant, true);
        Model::validateRequired('sessionName', $this->sessionName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->actorName) {
            $res['actor_name'] = $this->actorName;
        }
        if (null !== $this->actorTenant) {
            $res['actor_tenant'] = $this->actorTenant;
        }
        if (null !== $this->durationSeconds) {
            $res['duration_seconds'] = $this->durationSeconds;
        }
        if (null !== $this->sessionName) {
            $res['session_name'] = $this->sessionName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AssumeStsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['actor_name'])){
            $model->actorName = $map['actor_name'];
        }
        if(isset($map['actor_tenant'])){
            $model->actorTenant = $map['actor_tenant'];
        }
        if(isset($map['duration_seconds'])){
            $model->durationSeconds = $map['duration_seconds'];
        }
        if(isset($map['session_name'])){
            $model->sessionName = $map['session_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 虚拟身份唯一名称
    /**
     * @var string
     */
    public $actorName;

    // 虚拟身份所属租户
    /**
     * @var string
     */
    public $actorTenant;

    // 过期时间，单位为秒，范围900-3600，默认为3600
    /**
     * @var int
     */
    public $durationSeconds;

    // 会话名称
    /**
     * @var string
     */
    public $sessionName;

}
