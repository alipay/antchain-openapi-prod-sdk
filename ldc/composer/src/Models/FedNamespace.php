<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedNamespace extends Model
{
    // fed namespace annotations
    /**
     * @example
     *
     * @var Annotation[]
     */
    public $annotations;

    // fed namespace clusters
    /**
     * @example
     *
     * @var string[]
     */
    public $clusters;

    // fed namespace cluster state map
    /**
     * @example
     *
     * @var ClusterState[]
     */
    public $clusterStateMap;

    // fed namespace labels
    /**
     * @example labels
     *
     * @var Label[]
     */
    public $labels;

    // fed namespace name
    /**
     * @example antstack
     *
     * @var string
     */
    public $name;

    // Fed CRD namespace
    /**
     * @example default
     *
     * @var string
     */
    public $namespace;

    // 创建时间
    /**
     * @example 2019-10-30T10:18:11Z
     *
     * @var string
     */
    public $createTimeStamp;

    // fed 资源的状态
    /**
     * @example True,False,Deleting
     *
     * @var string
     */
    public $status;

    // 导致 fed 资源处于该状态的原因
    /**
     * @example ClusterNotReady
     *
     * @var string
     */
    public $reason;
    protected $_name = [
        'annotations'     => 'annotations',
        'clusters'        => 'clusters',
        'clusterStateMap' => 'cluster_state_map',
        'labels'          => 'labels',
        'name'            => 'name',
        'namespace'       => 'namespace',
        'createTimeStamp' => 'create_time_stamp',
        'status'          => 'status',
        'reason'          => 'reason',
    ];

    public function validate()
    {
        Model::validateRequired('annotations', $this->annotations, true);
        Model::validateRequired('clusters', $this->clusters, true);
        Model::validateRequired('clusterStateMap', $this->clusterStateMap, true);
        Model::validateRequired('labels', $this->labels, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('createTimeStamp', $this->createTimeStamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->annotations) {
            $res['annotations'] = [];
            if (null !== $this->annotations && \is_array($this->annotations)) {
                $n = 0;
                foreach ($this->annotations as $item) {
                    $res['annotations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->clusters) {
            $res['clusters'] = $this->clusters;
        }
        if (null !== $this->clusterStateMap) {
            $res['cluster_state_map'] = [];
            if (null !== $this->clusterStateMap && \is_array($this->clusterStateMap)) {
                $n = 0;
                foreach ($this->clusterStateMap as $item) {
                    $res['cluster_state_map'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->createTimeStamp) {
            $res['create_time_stamp'] = $this->createTimeStamp;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FedNamespace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['annotations'])) {
            if (!empty($map['annotations'])) {
                $model->annotations = [];
                $n                  = 0;
                foreach ($map['annotations'] as $item) {
                    $model->annotations[$n++] = null !== $item ? Annotation::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['clusters'])) {
            if (!empty($map['clusters'])) {
                $model->clusters = $map['clusters'];
            }
        }
        if (isset($map['cluster_state_map'])) {
            if (!empty($map['cluster_state_map'])) {
                $model->clusterStateMap = [];
                $n                      = 0;
                foreach ($map['cluster_state_map'] as $item) {
                    $model->clusterStateMap[$n++] = null !== $item ? ClusterState::fromMap($item) : $item;
                }
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['create_time_stamp'])) {
            $model->createTimeStamp = $map['create_time_stamp'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }

        return $model;
    }
}
