<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class MiddlewareClusterInstance extends Model
{
    // cluster_id
    /**
     * @example cluster_id
     *
     * @var string
     */
    public $clusterId;

    // cluster_name
    /**
     * @example cluster_name
     *
     * @var string
     */
    public $clusterName;

    // region_ids
    /**
     * @example
     *
     * @var string[]
     */
    public $regionIds;

    // zone_ids
    /**
     * @example
     *
     * @var string[]
     */
    public $zoneIds;

    // acvip_endpoint
    /**
     * @example 1.1.1.1
     *
     * @var string
     */
    public $acvipEndpoint;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // workspace_group_name
    /**
     * @example workspace_group_name
     *
     * @var string
     */
    public $workspaceGroupName;
    protected $_name = [
        'clusterId'          => 'cluster_id',
        'clusterName'        => 'cluster_name',
        'regionIds'          => 'region_ids',
        'zoneIds'            => 'zone_ids',
        'acvipEndpoint'      => 'acvip_endpoint',
        'instanceId'         => 'instance_id',
        'workspaceGroupName' => 'workspace_group_name',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('regionIds', $this->regionIds, true);
        Model::validateRequired('acvipEndpoint', $this->acvipEndpoint, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->regionIds) {
            $res['region_ids'] = $this->regionIds;
        }
        if (null !== $this->zoneIds) {
            $res['zone_ids'] = $this->zoneIds;
        }
        if (null !== $this->acvipEndpoint) {
            $res['acvip_endpoint'] = $this->acvipEndpoint;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MiddlewareClusterInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['region_ids'])) {
            if (!empty($map['region_ids'])) {
                $model->regionIds = $map['region_ids'];
            }
        }
        if (isset($map['zone_ids'])) {
            if (!empty($map['zone_ids'])) {
                $model->zoneIds = $map['zone_ids'];
            }
        }
        if (isset($map['acvip_endpoint'])) {
            $model->acvipEndpoint = $map['acvip_endpoint'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }

        return $model;
    }
}
