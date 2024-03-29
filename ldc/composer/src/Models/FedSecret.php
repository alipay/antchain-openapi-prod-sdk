<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedSecret extends Model
{
    // 保密字典的注解
    //
    /**
     * @example
     *
     * @var Annotation[]
     */
    public $annotations;

    // 分发状态
    /**
     * @example
     *
     * @var ClusteCellStatus[]
     */
    public $cellStatus;

    // 分发的 cell 列表
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

    // 保密字典数据
    /**
     * @example
     *
     * @var SecretData[]
     */
    public $data;

    // 保密字典的标签
    /**
     * @example
     *
     * @var Label[]
     */
    public $labels;

    // 名称
    /**
     * @example sc
     *
     * @var string
     */
    public $name;

    // 命名空间
    //
    /**
     * @example antcloud-cafe-default
     *
     * @var string
     */
    public $namespace;

    // 保密字典数据在不同 cell 下的自定义覆盖配置
    /**
     * @example
     *
     * @var FedSecretOverride[]
     */
    public $overrides;

    // 导致该分发状态的原因
    /**
     * @example ClusterNotReady
     *
     * @var string
     */
    public $reason;

    // 分发状态，成功 True，失败 False，删除中 Deleting
    /**
     * @example True
     *
     * @var string
     */
    public $status;

    // 保密字典类型
    /**
     * @example Opaque
     *
     * @var string
     */
    public $type;
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
        'type'            => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('cellStatus', $this->cellStatus, true);
        Model::validateRequired('clusters', $this->clusters, true);
        Model::validateRequired('createTimeStamp', $this->createTimeStamp, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('overrides', $this->overrides, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FedSecret
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
                    $model->data[$n++] = null !== $item ? SecretData::fromMap($item) : $item;
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
                    $model->overrides[$n++] = null !== $item ? FedSecretOverride::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
