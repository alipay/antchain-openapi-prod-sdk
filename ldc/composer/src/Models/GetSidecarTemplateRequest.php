<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetSidecarTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // sidecar生效范围：workspace、workspace_group、region
    /**
     * @var string
     */
    public $scope;

    // sidecar 名称
    /**
     * @var string
     */
    public $sidecarName;

    // sidecar 版本
    /**
     * @var string
     */
    public $sidecarVersion;

    // 环境
    /**
     * @var string
     */
    public $workspace;

    // wsg id
    /**
     * @var string
     */
    public $workspaceGroupId;
    protected $_name = [
        'authToken'        => 'auth_token',
        'regionId'         => 'region_id',
        'scope'            => 'scope',
        'sidecarName'      => 'sidecar_name',
        'sidecarVersion'   => 'sidecar_version',
        'workspace'        => 'workspace',
        'workspaceGroupId' => 'workspace_group_id',
    ];

    public function validate()
    {
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('sidecarVersion', $this->sidecarVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetSidecarTemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['sidecar_name'])) {
            $model->sidecarName = $map['sidecar_name'];
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['workspace_group_id'])) {
            $model->workspaceGroupId = $map['workspace_group_id'];
        }

        return $model;
    }
}
