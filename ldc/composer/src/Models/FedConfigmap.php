<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedConfigmap extends Model
{
    // fed configmap annotations
    /**
     * @example
     *
     * @var Annotation[]
     */
    public $annotations;

    // Fed资源集群Cell状态
    /**
     * @example
     *
     * @var ClusteCellStatus[]
     */
    public $cellStatus;

    // fed clusters
    /**
     * @example
     *
     * @var string[]
     */
    public $clusters;

    // 创建时间
    /**
     * @example 2019-10-30T10:18:10Z
     *
     * @var string
     */
    public $createTimeStamp;

    // fed configmap data
    /**
     * @example
     *
     * @var ConfigMapData[]
     */
    public $data;

    // fed configmap labels
    /**
     * @example
     *
     * @var Label[]
     */
    public $labels;

    // fed configmap name
    /**
     * @example cm
     *
     * @var string
     */
    public $name;

    // fed configmap namespace
    /**
     * @example antstack
     *
     * @var string
     */
    public $namespace;

    // fed configmap override
    /**
     * @example
     *
     * @var FedConfigmapOverride[]
     */
    public $overrides;

    // 原因
    /**
     * @example GetKeysInCellFailed
     *
     * @var string
     */
    public $reason;

    // propagation状态
    /**
     * @example propagation
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'annotations'     => 'annotations',
        'cellStatus'      => 'cell_status',
        'clusters'        => 'clusters',
        'createTimeStamp' => 'create_time_stamp',
        'data'            => 'data',
        'labels'          => 'labels',
        'name'            => 'name',
        'namespace'       => 'namespace',
        'overrides'       => 'overrides',
        'reason'          => 'reason',
        'status'          => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('annotations', $this->annotations, true);
        Model::validateRequired('clusters', $this->clusters, true);
        Model::validateRequired('createTimeStamp', $this->createTimeStamp, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('labels', $this->labels, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('overrides', $this->overrides, true);
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
        if (null !== $this->cellStatus) {
            $res['cell_status'] = [];
            if (null !== $this->cellStatus && \is_array($this->cellStatus)) {
                $n = 0;
                foreach ($this->cellStatus as $item) {
                    $res['cell_status'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->clusters) {
            $res['clusters'] = $this->clusters;
        }
        if (null !== $this->createTimeStamp) {
            $res['create_time_stamp'] = $this->createTimeStamp;
        }
        if (null !== $this->data) {
            $res['data'] = [];
            if (null !== $this->data && \is_array($this->data)) {
                $n = 0;
                foreach ($this->data as $item) {
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
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
        if (null !== $this->overrides) {
            $res['overrides'] = [];
            if (null !== $this->overrides && \is_array($this->overrides)) {
                $n = 0;
                foreach ($this->overrides as $item) {
                    $res['overrides'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FedConfigmap
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
        if (isset($map['cell_status'])) {
            if (!empty($map['cell_status'])) {
                $model->cellStatus = [];
                $n                 = 0;
                foreach ($map['cell_status'] as $item) {
                    $model->cellStatus[$n++] = null !== $item ? ClusteCellStatus::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['clusters'])) {
            if (!empty($map['clusters'])) {
                $model->clusters = $map['clusters'];
            }
        }
        if (isset($map['create_time_stamp'])) {
            $model->createTimeStamp = $map['create_time_stamp'];
        }
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = [];
                $n           = 0;
                foreach ($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? ConfigMapData::fromMap($item) : $item;
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
        if (isset($map['overrides'])) {
            if (!empty($map['overrides'])) {
                $model->overrides = [];
                $n                = 0;
                foreach ($map['overrides'] as $item) {
                    $model->overrides[$n++] = null !== $item ? FedConfigmapOverride::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
