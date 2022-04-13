<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarTemplate extends Model
{
    // sidecar模版id
    /**
     * @example 000000001
     *
     * @var string
     */
    public $id;

    // region_id
    /**
     * @example 001
     *
     * @var string
     */
    public $regionId;

    //
    // 模板生效范围
    /**
     * @example workspace_group
     *
     * @var string
     */
    public $scope;

    // sidecar名称
    /**
     * @example mosn
     *
     * @var string
     */
    public $sidecarName;

    // sidecar模版版本
    /**
     * @example v1
     *
     * @var string
     */
    public $sidecarVersion;

    // sidercar模版
    /**
     * @example todo
     *
     * @var string
     */
    public $template;

    // 这个字段是lhc专用，表示此模板的来源，META为sidecar元数据来源，XFLUSH为系统模板
    // 本结构体同时还暂时兼容了调用sidecar元数据openapi的使用，后期会只用于LHC用途，届时会去掉sidecar元数据接口的字段。
    /**
     * @example META
     *
     * @var string
     */
    public $type;

    // workspace_group_id
    /**
     * @example 0001
     *
     * @var string
     */
    public $workspaceGroupId;

    // workspace_id
    /**
     * @example 001
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'id'               => 'id',
        'regionId'         => 'region_id',
        'scope'            => 'scope',
        'sidecarName'      => 'sidecar_name',
        'sidecarVersion'   => 'sidecar_version',
        'template'         => 'template',
        'type'             => 'type',
        'workspaceGroupId' => 'workspace_group_id',
        'workspaceId'      => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('sidecarVersion', $this->sidecarVersion, true);
        Model::validateRequired('template', $this->template, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
        if (null !== $this->template) {
            $res['template'] = $this->template;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarTemplate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
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
        if (isset($map['template'])) {
            $model->template = $map['template'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['workspace_group_id'])) {
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
