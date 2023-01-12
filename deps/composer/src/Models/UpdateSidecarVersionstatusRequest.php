<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateSidecarVersionstatusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

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

    // sidecar版本号
    /**
     * @var string
     */
    public $sidecarVersion;

    // 版本状态
    /**
     * @var int
     */
    public $status;

    // 发布、下线、废弃原因
    /**
     * @var string
     */
    public $statusReason;

    // sidecar版本类型
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'      => 'auth_token',
        'tenant'         => 'tenant',
        'scope'          => 'scope',
        'scopeIdentity'  => 'scope_identity',
        'sidecarName'    => 'sidecar_name',
        'sidecarVersion' => 'sidecar_version',
        'status'         => 'status',
        'statusReason'   => 'status_reason',
        'type'           => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('scopeIdentity', $this->scopeIdentity, true);
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('sidecarVersion', $this->sidecarVersion, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('statusReason', $this->statusReason, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
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
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->statusReason) {
            $res['status_reason'] = $this->statusReason;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSidecarVersionstatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['scope_identity'])) {
            $model->scopeIdentity = $map['scope_identity'];
        }
        if (isset($map['sidecar_name'])) {
            $model->sidecarName = $map['sidecar_name'];
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['status_reason'])) {
            $model->statusReason = $map['status_reason'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
