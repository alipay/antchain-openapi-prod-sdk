<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetSpannerClusterDetail extends Model
{
    // 联邦 spanner cluster 详细信息
    /**
     * @example
     *
     * @var QuerySpannerClusterDetail
     */
    public $clusterDetail;

    // 若干组本地集群信息
    /**
     * @example
     *
     * @var LocalSpannerClusterDetail[]
     */
    public $localClusters;
    protected $_name = [
        'clusterDetail' => 'cluster_detail',
        'localClusters' => 'local_clusters',
    ];

    public function validate()
    {
        Model::validateRequired('clusterDetail', $this->clusterDetail, true);
        Model::validateRequired('localClusters', $this->localClusters, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clusterDetail) {
            $res['cluster_detail'] = null !== $this->clusterDetail ? $this->clusterDetail->toMap() : null;
        }
        if (null !== $this->localClusters) {
            $res['local_clusters'] = [];
            if (null !== $this->localClusters && \is_array($this->localClusters)) {
                $n = 0;
                foreach ($this->localClusters as $item) {
                    $res['local_clusters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetSpannerClusterDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster_detail'])) {
            $model->clusterDetail = QuerySpannerClusterDetail::fromMap($map['cluster_detail']);
        }
        if (isset($map['local_clusters'])) {
            if (!empty($map['local_clusters'])) {
                $model->localClusters = [];
                $n                    = 0;
                foreach ($map['local_clusters'] as $item) {
                    $model->localClusters[$n++] = null !== $item ? LocalSpannerClusterDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
