<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetSidecarRuleRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
        'sidecarVersionInstanceId' => 'sidecar_version_instance_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        if (null !== $this->sidecarVersionInstanceId) {
            $res['sidecar_version_instance_id'] = $this->sidecarVersionInstanceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetSidecarRuleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['scope_identity'])){
            $model->scopeIdentity = $map['scope_identity'];
        }
        if(isset($map['sidecar_version_instance_id'])){
            $model->sidecarVersionInstanceId = $map['sidecar_version_instance_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // sidecar生效范围：workspace、workspace_group、region
    /**
     * @var string
     */
    public $scope;

    // scope对应的唯一标识，例如workspace对应workspace id
    // 
    /**
     * @var string
     */
    public $scopeIdentity;

    // sidecar版本id
    /**
     * @var string
     */
    public $sidecarVersionInstanceId;

}
