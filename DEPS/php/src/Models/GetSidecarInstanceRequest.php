<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetSidecarInstanceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'instanceName' => 'instance_name',
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
        'sidecarReleaseVersionId' => 'sidecar_release_version_id',
    ];
    public function validate() {
        Model::validateRequired('instanceName', $this->instanceName, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('scopeIdentity', $this->scopeIdentity, true);
        Model::validateRequired('sidecarReleaseVersionId', $this->sidecarReleaseVersionId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        if (null !== $this->sidecarReleaseVersionId) {
            $res['sidecar_release_version_id'] = $this->sidecarReleaseVersionId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetSidecarInstanceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['instance_name'])){
            $model->instanceName = $map['instance_name'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['scope_identity'])){
            $model->scopeIdentity = $map['scope_identity'];
        }
        if(isset($map['sidecar_release_version_id'])){
            $model->sidecarReleaseVersionId = $map['sidecar_release_version_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 版本实例名称
    /**
     * @var string
     */
    public $instanceName;

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

    // sidecar版本id
    /**
     * @var string
     */
    public $sidecarReleaseVersionId;

}
