<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ReplicaCount extends Model
{
    // 副本数量是部署单元维度还是集群维度。目前只支持Cell
    /**
     * @example Cell | Cluster
     *
     * @var string
     */
    public $type;

    // 部署单元名称或集群名称。
    /**
     * @example CellA
     *
     * @var string
     */
    public $name;

    // 对应副本数量。
    /**
     * @example 10
     *
     * @var int
     */
    public $count;

    // （针对huanyu场景），original_count该单元当前的副本个数（count对应期望的副本个数）
    /**
     * @example 5
     *
     * @var int
     */
    public $originalCount;
    protected $_name = [
        'type'          => 'type',
        'name'          => 'name',
        'count'         => 'count',
        'originalCount' => 'original_count',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->originalCount) {
            $res['original_count'] = $this->originalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReplicaCount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['original_count'])) {
            $model->originalCount = $map['original_count'];
        }

        return $model;
    }
}
