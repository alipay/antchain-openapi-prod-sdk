<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class BindInstance extends Model
{
    // 集群id
    /**
     * @example xxzasd
     *
     * @var string
     */
    public $clusterId;

    // 集群名字
    /**
     * @example 上海集群
     *
     * @var string
     */
    public $clusterName;

    // 支持的region
    /**
     * @example ["cn-shanghai", "cn-hangzhou"]
     *
     * @var string[]
     */
    public $regions;

    // 支持的dataCenter
    /**
     * @example ["dc1", "dc2"]
     *
     * @var string
     */
    public $dataCenters;

    // 支持的zone 列表
    /**
     * @example ["RZ01A", "RZ02A"]
     *
     * @var string
     */
    public $zones;

    // 绑定后的instanceId 信息
    /**
     * @example DAWEFSAD
     *
     * @var string
     */
    public $instanceId;

    // acvip 地址
    /**
     * @example 11.11.11.11
     *
     * @var string
     */
    public $acvipEndpoint;

    // 工作空间组
    /**
     * @example cafe2
     *
     * @var string
     */
    public $workspaceGroup;

    // 租户id
    /**
     * @example DAWEFSAD
     *
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'clusterId'      => 'cluster_id',
        'clusterName'    => 'cluster_name',
        'regions'        => 'regions',
        'dataCenters'    => 'data_centers',
        'zones'          => 'zones',
        'instanceId'     => 'instance_id',
        'acvipEndpoint'  => 'acvip_endpoint',
        'workspaceGroup' => 'workspace_group',
        'tenantId'       => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('regions', $this->regions, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('acvipEndpoint', $this->acvipEndpoint, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->regions) {
            $res['regions'] = $this->regions;
        }
        if (null !== $this->dataCenters) {
            $res['data_centers'] = $this->dataCenters;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->acvipEndpoint) {
            $res['acvip_endpoint'] = $this->acvipEndpoint;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindInstance
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
        if (isset($map['regions'])) {
            if (!empty($map['regions'])) {
                $model->regions = $map['regions'];
            }
        }
        if (isset($map['data_centers'])) {
            $model->dataCenters = $map['data_centers'];
        }
        if (isset($map['zones'])) {
            $model->zones = $map['zones'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['acvip_endpoint'])) {
            $model->acvipEndpoint = $map['acvip_endpoint'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
