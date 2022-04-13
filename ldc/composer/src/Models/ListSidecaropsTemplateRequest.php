<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListSidecaropsTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // sidecar类型
    /**
     * @var string
     */
    public $sidecarName;

    // sidecar版本
    /**
     * @var string
     */
    public $sidecarVersion;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroupId;

    // 工作空间组名
    /**
     * @var string
     */
    public $workspaceGroupLabel;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceId;

    // 镜像地址
    /**
     * @var string
     */
    public $image;

    // 可以根据租户名称筛选应用于该租户的基线模板
    /**
     * @var string
     */
    public $tenantName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'sidecarName'         => 'sidecar_name',
        'sidecarVersion'      => 'sidecar_version',
        'workspaceGroupId'    => 'workspace_group_id',
        'workspaceGroupLabel' => 'workspace_group_label',
        'workspaceId'         => 'workspace_id',
        'image'               => 'image',
        'tenantName'          => 'tenant_name',
    ];

    public function validate()
    {
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('workspaceGroupLabel', $this->workspaceGroupLabel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->workspaceGroupLabel) {
            $res['workspace_group_label'] = $this->workspaceGroupLabel;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSidecaropsTemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['sidecar_name'])) {
            $model->sidecarName = $map['sidecar_name'];
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['workspace_group_id'])) {
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if (isset($map['workspace_group_label'])) {
            $model->workspaceGroupLabel = $map['workspace_group_label'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }

        return $model;
    }
}
