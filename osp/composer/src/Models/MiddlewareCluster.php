<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class MiddlewareCluster extends Model
{
    // 集群id
    /**
     * @example cad-adfa
     *
     * @var string
     */
    public $clusterId;

    // 集群名字
    /**
     * @example 上海金区
     *
     * @var string
     */
    public $clusterName;

    // 支持的region 列表
    /**
     * @example ["aa", "dd", "dd"]
     *
     * @var string[]
     */
    public $enableRegions;

    // 支持的dataCenter 列表
    /**
     * @example []
     *
     * @var string[]
     */
    public $enableDataCenters;

    // 支持的zone 列表
    /**
     * @example ["RZ01A", "RZ02A"]
     *
     * @var string[]
     */
    public $enableZones;

    // acvip 地址
    /**
     * @example 11.11.11.11
     *
     * @var string
     */
    public $acvipEndpoint;
    protected $_name = [
        'clusterId'         => 'cluster_id',
        'clusterName'       => 'cluster_name',
        'enableRegions'     => 'enable_regions',
        'enableDataCenters' => 'enable_data_centers',
        'enableZones'       => 'enable_zones',
        'acvipEndpoint'     => 'acvip_endpoint',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('enableRegions', $this->enableRegions, true);
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
        if (null !== $this->enableRegions) {
            $res['enable_regions'] = $this->enableRegions;
        }
        if (null !== $this->enableDataCenters) {
            $res['enable_data_centers'] = $this->enableDataCenters;
        }
        if (null !== $this->enableZones) {
            $res['enable_zones'] = $this->enableZones;
        }
        if (null !== $this->acvipEndpoint) {
            $res['acvip_endpoint'] = $this->acvipEndpoint;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MiddlewareCluster
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
        if (isset($map['enable_regions'])) {
            if (!empty($map['enable_regions'])) {
                $model->enableRegions = $map['enable_regions'];
            }
        }
        if (isset($map['enable_data_centers'])) {
            if (!empty($map['enable_data_centers'])) {
                $model->enableDataCenters = $map['enable_data_centers'];
            }
        }
        if (isset($map['enable_zones'])) {
            if (!empty($map['enable_zones'])) {
                $model->enableZones = $map['enable_zones'];
            }
        }
        if (isset($map['acvip_endpoint'])) {
            $model->acvipEndpoint = $map['acvip_endpoint'];
        }

        return $model;
    }
}
