<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ListClusterImagesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $clusterId;

    // 目标命名空间
    /**
     * @var string
     */
    public $namespace;

    // 工作负载类型
    /**
     * @var string[]
     */
    public $workloadTypes;

    // 标签列表
    /**
     * @var Label[]
     */
    public $labels;
    protected $_name = [
        'authToken'     => 'auth_token',
        'clusterId'     => 'cluster_id',
        'namespace'     => 'namespace',
        'workloadTypes' => 'workload_types',
        'labels'        => 'labels',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->workloadTypes) {
            $res['workload_types'] = $this->workloadTypes;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListClusterImagesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['workload_types'])) {
            if (!empty($map['workload_types'])) {
                $model->workloadTypes = $map['workload_types'];
            }
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? Label::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
