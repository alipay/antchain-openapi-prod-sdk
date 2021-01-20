<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateSidecarRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'description' => 'description',
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
        'sidecarName' => 'sidecar_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateSidecarRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['scope_identity'])){
            $model->scopeIdentity = $map['scope_identity'];
        }
        if(isset($map['sidecar_name'])){
            $model->sidecarName = $map['sidecar_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // sidecar类型描述
    /**
     * @var string
     */
    public $description;

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

    // sidecar名称
    /**
     * @var string
     */
    public $sidecarName;

}
