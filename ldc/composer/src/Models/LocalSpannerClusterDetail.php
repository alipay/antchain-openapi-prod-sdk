<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LocalSpannerClusterDetail extends Model
{
    // 可用区
    /**
     * @example cn-shanghai
     *
     * @var string
     */
    public $az;

    // 本地集群名称
    /**
     * @example hello-1
     *
     * @var string
     */
    public $clusterName;

    // 可能存在的错误信息
    /**
     * @example "" or "create failed for missing name field"
     *
     * @var string
     */
    public $message;

    // 集群状态
    /**
     * @example online
     *
     * @var string
     */
    public $phase;

    // spanner cluster 集群id
    /**
     * @example "1234567"
     *
     * @var string
     */
    public $spannerClusterId;

    // 描述spanner cluster健康状态
    /**
     * @example 健康
     *
     * @var string
     */
    public $state;

    // 若干组容器信息
    /**
     * @example
     *
     * @var LocalSubClusterDetail[]
     */
    public $subClustersDetails;
    protected $_name = [
        'az'                 => 'az',
        'clusterName'        => 'cluster_name',
        'message'            => 'message',
        'phase'              => 'phase',
        'spannerClusterId'   => 'spanner_cluster_id',
        'state'              => 'state',
        'subClustersDetails' => 'sub_clusters_details',
    ];

    public function validate()
    {
        Model::validateRequired('az', $this->az, true);
        Model::validateRequired('clusterName', $this->clusterName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->az) {
            $res['az'] = $this->az;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->spannerClusterId) {
            $res['spanner_cluster_id'] = $this->spannerClusterId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->subClustersDetails) {
            $res['sub_clusters_details'] = [];
            if (null !== $this->subClustersDetails && \is_array($this->subClustersDetails)) {
                $n = 0;
                foreach ($this->subClustersDetails as $item) {
                    $res['sub_clusters_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LocalSpannerClusterDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['az'])) {
            $model->az = $map['az'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['spanner_cluster_id'])) {
            $model->spannerClusterId = $map['spanner_cluster_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['sub_clusters_details'])) {
            if (!empty($map['sub_clusters_details'])) {
                $model->subClustersDetails = [];
                $n                         = 0;
                foreach ($map['sub_clusters_details'] as $item) {
                    $model->subClustersDetails[$n++] = null !== $item ? LocalSubClusterDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
