<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarTemplateMeta extends Model
{
    // 名称
    /**
     * @example mosn
     *
     * @var string
     */
    public $sidecarName;

    // sidecar版本
    /**
     * @example sidecar版本
     *
     * @var string
     */
    public $sidecarVersion;

    // 具体的模板信息
    /**
     * @example sidecar模板
     *
     * @var string
     */
    public $template;

    // 工作空间
    /**
     * @example xxx
     *
     * @var string
     */
    public $workspaceId;

    // 工作空间组id
    /**
     * @example ssss
     *
     * @var string
     */
    public $workspaceGroupId;

    // 镜像地址
    /**
     * @example reg.docker.alibaba-inc.com/antmesh/mosn:1.23.0-45402f78-nightly_cloud
     *
     * @var string
     */
    public $image;

    // 保留扩展
    /**
     * @example json string 扩展
     *
     * @var string
     */
    public $extension;

    // 基线所应用的scope范围
    /**
     * @example "gray,prod"
     *
     * @var string
     */
    public $scope;
    protected $_name = [
        'sidecarName'      => 'sidecar_name',
        'sidecarVersion'   => 'sidecar_version',
        'template'         => 'template',
        'workspaceId'      => 'workspace_id',
        'workspaceGroupId' => 'workspace_group_id',
        'image'            => 'image',
        'extension'        => 'extension',
        'scope'            => 'scope',
    ];

    public function validate()
    {
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('sidecarVersion', $this->sidecarVersion, true);
        Model::validateRequired('template', $this->template, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('workspaceGroupId', $this->workspaceGroupId, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('extension', $this->extension, true);
        Model::validateRequired('scope', $this->scope, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->template) {
            $res['template'] = $this->template;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarTemplateMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sidecar_name'])) {
            $model->sidecarName = $map['sidecar_name'];
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['template'])) {
            $model->template = $map['template'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['workspace_group_id'])) {
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }

        return $model;
    }
}
