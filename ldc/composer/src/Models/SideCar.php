<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SideCar extends Model
{
    // region id
    /**
     * @example 001
     *
     * @var string
     */
    public $regionId;

    // sidecar description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // sidecar生效范围：workspace、workspace_group、region
    /**
     * @example workspace_group_id
     *
     * @var string
     */
    public $scope;

    // sidecar_name
    /**
     * @example mosn
     *
     * @var string
     */
    public $sidecarName;

    // workspace_group_id
    /**
     * @example 000000000001
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
        'regionId'         => 'region_id',
        'description'      => 'description',
        'scope'            => 'scope',
        'sidecarName'      => 'sidecar_name',
        'workspaceGroupId' => 'workspace_group_id',
        'workspaceId'      => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('sidecarName', $this->sidecarName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
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
     * @return SideCar
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['sidecar_name'])) {
            $model->sidecarName = $map['sidecar_name'];
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
