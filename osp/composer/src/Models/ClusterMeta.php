<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class ClusterMeta extends Model
{
    // 集群唯一标识
    /**
     * @example ch-shanghai
     *
     * @var string
     */
    public $clusterId;

    // 集群名字
    /**
     * @example 集群名字
     *
     * @var string
     */
    public $clusterName;

    // 区域
    /**
     * @example region
     *
     * @var string
     */
    public $region;
    protected $_name = [
        'clusterId'   => 'cluster_id',
        'clusterName' => 'cluster_name',
        'region'      => 'region',
    ];

    public function validate()
    {
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
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterMeta
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
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }

        return $model;
    }
}
