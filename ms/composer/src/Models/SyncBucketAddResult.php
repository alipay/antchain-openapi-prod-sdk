<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class SyncBucketAddResult extends Model
{
    // 集群同步任务id
    /**
     * @example 1000
     *
     * @var string
     */
    public $clusterTaskId;

    // 集群同步任务状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $clusterTaskStatus;

    // 源集群id
    /**
     * @example 1
     *
     * @var string
     */
    public $sourceClusterId;

    // 目标集群id
    /**
     * @example 2
     *
     * @var string
     */
    public $targetClusterId;
    protected $_name = [
        'clusterTaskId'     => 'cluster_task_id',
        'clusterTaskStatus' => 'cluster_task_status',
        'sourceClusterId'   => 'source_cluster_id',
        'targetClusterId'   => 'target_cluster_id',
    ];

    public function validate()
    {
        Model::validateRequired('clusterTaskId', $this->clusterTaskId, true);
        Model::validateRequired('clusterTaskStatus', $this->clusterTaskStatus, true);
        Model::validateRequired('sourceClusterId', $this->sourceClusterId, true);
        Model::validateRequired('targetClusterId', $this->targetClusterId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clusterTaskId) {
            $res['cluster_task_id'] = $this->clusterTaskId;
        }
        if (null !== $this->clusterTaskStatus) {
            $res['cluster_task_status'] = $this->clusterTaskStatus;
        }
        if (null !== $this->sourceClusterId) {
            $res['source_cluster_id'] = $this->sourceClusterId;
        }
        if (null !== $this->targetClusterId) {
            $res['target_cluster_id'] = $this->targetClusterId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncBucketAddResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster_task_id'])) {
            $model->clusterTaskId = $map['cluster_task_id'];
        }
        if (isset($map['cluster_task_status'])) {
            $model->clusterTaskStatus = $map['cluster_task_status'];
        }
        if (isset($map['source_cluster_id'])) {
            $model->sourceClusterId = $map['source_cluster_id'];
        }
        if (isset($map['target_cluster_id'])) {
            $model->targetClusterId = $map['target_cluster_id'];
        }

        return $model;
    }
}
