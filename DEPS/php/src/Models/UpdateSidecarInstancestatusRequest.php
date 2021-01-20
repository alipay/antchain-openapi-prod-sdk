<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateSidecarInstancestatusRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'instanceName' => 'instance_name',
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
        'sidecarReleaseVersionId' => 'sidecar_release_version_id',
        'status' => 'status',
        'statusReason' => 'status_reason',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->statusReason) {
            $res['status_reason'] = $this->statusReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateSidecarInstancestatusRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
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
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['status_reason'])){
            $model->statusReason = $map['status_reason'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

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

    // 版本实例状态
    /**
     * @var int
     */
    public $status;

    // 发布、下线、废弃原因
    /**
     * @var string
     */
    public $statusReason;

}
