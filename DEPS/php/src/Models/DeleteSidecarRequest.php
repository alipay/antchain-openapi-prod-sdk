<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteSidecarRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'sidecarName' => 'sidecar_name',
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteSidecarRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['sidecar_name'])){
            $model->sidecarName = $map['sidecar_name'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['scope_identity'])){
            $model->scopeIdentity = $map['scope_identity'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // sidecar名称
    /**
     * @var string
     */
    public $sidecarName;

    // sidecar生效范围：workspace、workspace_group、region
    // 
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

}
