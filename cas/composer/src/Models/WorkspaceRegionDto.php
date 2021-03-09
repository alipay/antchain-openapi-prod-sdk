<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceRegionDto extends Model
{
    // id
    /**
     * @example 001
     *
     * @var string
     */
    public $id;

    // networkType
    /**
     * @example vpc
     *
     * @var string
     */
    public $networkType;

    // region id
    /**
     * @example 001
     *
     * @var string
     */
    public $regionId;

    // regionName
    /**
     * @example shanghai
     *
     * @var string
     */
    public $regionName;

    // 安全域id
    /**
     * @example 001
     *
     * @var string
     */
    public $securedZoneId;

    // workspace_id
    /**
     * @example 001
     *
     * @var string
     */
    public $workspaceId;

    // workspaceLogicRegionStatus
    /**
     * @example CREATED
     *
     * @var string
     */
    public $workspaceLogicRegionStatus;

    // workspaceLogicRegionType
    /**
     * @example LIVE
     *
     * @var string
     */
    public $workspaceLogicRegionType;

    // workspaceZoneDtos
    /**
     * @example
     *
     * @var WorkspaceZoneDto[]
     */
    public $workspaceZoneDtos;
    protected $_name = [
        'id'                         => 'id',
        'networkType'                => 'network_type',
        'regionId'                   => 'region_id',
        'regionName'                 => 'region_name',
        'securedZoneId'              => 'secured_zone_id',
        'workspaceId'                => 'workspace_id',
        'workspaceLogicRegionStatus' => 'workspace_logic_region_status',
        'workspaceLogicRegionType'   => 'workspace_logic_region_type',
        'workspaceZoneDtos'          => 'workspace_zone_dtos',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->securedZoneId) {
            $res['secured_zone_id'] = $this->securedZoneId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceLogicRegionStatus) {
            $res['workspace_logic_region_status'] = $this->workspaceLogicRegionStatus;
        }
        if (null !== $this->workspaceLogicRegionType) {
            $res['workspace_logic_region_type'] = $this->workspaceLogicRegionType;
        }
        if (null !== $this->workspaceZoneDtos) {
            $res['workspace_zone_dtos'] = [];
            if (null !== $this->workspaceZoneDtos && \is_array($this->workspaceZoneDtos)) {
                $n = 0;
                foreach ($this->workspaceZoneDtos as $item) {
                    $res['workspace_zone_dtos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceRegionDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['region_name'])) {
            $model->regionName = $map['region_name'];
        }
        if (isset($map['secured_zone_id'])) {
            $model->securedZoneId = $map['secured_zone_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['workspace_logic_region_status'])) {
            $model->workspaceLogicRegionStatus = $map['workspace_logic_region_status'];
        }
        if (isset($map['workspace_logic_region_type'])) {
            $model->workspaceLogicRegionType = $map['workspace_logic_region_type'];
        }
        if (isset($map['workspace_zone_dtos'])) {
            if (!empty($map['workspace_zone_dtos'])) {
                $model->workspaceZoneDtos = [];
                $n                        = 0;
                foreach ($map['workspace_zone_dtos'] as $item) {
                    $model->workspaceZoneDtos[$n++] = null !== $item ? WorkspaceZoneDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
