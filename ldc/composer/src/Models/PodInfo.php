<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodInfo extends Model
{
    // 部署单元名称
    /**
     * @example rz001
     *
     * @var string
     */
    public $cellDisplayName;

    // 集群名称
    /**
     * @example prod
     *
     * @var string
     */
    public $cluster;

    // pod containers info
    /**
     * @example [{}]
     *
     * @var ContainerInfo[]
     */
    public $containers;

    // create time
    /**
     * @example 2019-12-02 17:33:32
     *
     * @var string
     */
    public $createdTime;

    // pod 名称
    /**
     * @example 2363455-vxad
     *
     * @var string
     */
    public $name;

    // 命名空间名称
    /**
     * @example dev
     *
     * @var string
     */
    public $namespace;

    // pod状态
    /**
     * @example
     *
     * @var PodStatus
     */
    public $status;

    // pod uid
    /**
     * @example 3D67a3dd9a-0d05-11ea-a525-02420ba6ad3d
     *
     * @var string
     */
    public $uid;

    // Pod volume信息。
    /**
     * @example [{}]
     *
     * @var Volume[]
     */
    public $volumes;
    protected $_name = [
        'cellDisplayName' => 'cell_display_name',
        'cluster'         => 'cluster',
        'containers'      => 'containers',
        'createdTime'     => 'created_time',
        'name'            => 'name',
        'namespace'       => 'namespace',
        'status'          => 'status',
        'uid'             => 'uid',
        'volumes'         => 'volumes',
    ];

    public function validate()
    {
        Model::validateRequired('cellDisplayName', $this->cellDisplayName, true);
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('containers', $this->containers, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('uid', $this->uid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellDisplayName) {
            $res['cell_display_name'] = $this->cellDisplayName;
        }
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->containers) {
            $res['containers'] = [];
            if (null !== $this->containers && \is_array($this->containers)) {
                $n = 0;
                foreach ($this->containers as $item) {
                    $res['containers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->status) {
            $res['status'] = null !== $this->status ? $this->status->toMap() : null;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->volumes) {
            $res['volumes'] = [];
            if (null !== $this->volumes && \is_array($this->volumes)) {
                $n = 0;
                foreach ($this->volumes as $item) {
                    $res['volumes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_display_name'])) {
            $model->cellDisplayName = $map['cell_display_name'];
        }
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['containers'])) {
            if (!empty($map['containers'])) {
                $model->containers = [];
                $n                 = 0;
                foreach ($map['containers'] as $item) {
                    $model->containers[$n++] = null !== $item ? ContainerInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['status'])) {
            $model->status = PodStatus::fromMap($map['status']);
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['volumes'])) {
            if (!empty($map['volumes'])) {
                $model->volumes = [];
                $n              = 0;
                foreach ($map['volumes'] as $item) {
                    $model->volumes[$n++] = null !== $item ? Volume::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
