<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerServiceObjectMeta extends Model
{
    // UID
    /**
     * @example 3D67a3dd9a-0d05-11ea-a525-02420ba6ad3d
     *
     * @var string
     */
    public $uid;

    // 命名空间
    /**
     * @example dev
     *
     * @var string
     */
    public $namespace;

    // 名称
    /**
     * @example abc-123
     *
     * @var string
     */
    public $name;

    // 部署单元名称
    /**
     * @example RZ001
     *
     * @var string
     */
    public $cellDisplayName;

    // 集群名称
    /**
     * @example dev
     *
     * @var string
     */
    public $cluster;

    // 创建时间
    /**
     * @example 2019-12-02 17:33:32
     *
     * @var string
     */
    public $createdTime;
    protected $_name = [
        'uid'             => 'uid',
        'namespace'       => 'namespace',
        'name'            => 'name',
        'cellDisplayName' => 'cell_display_name',
        'cluster'         => 'cluster',
        'createdTime'     => 'created_time',
    ];

    public function validate()
    {
        Model::validateRequired('uid', $this->uid, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('cellDisplayName', $this->cellDisplayName, true);
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cellDisplayName) {
            $res['cell_display_name'] = $this->cellDisplayName;
        }
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerServiceObjectMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cell_display_name'])) {
            $model->cellDisplayName = $map['cell_display_name'];
        }
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }

        return $model;
    }
}
