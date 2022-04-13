<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FixedReplicaElasticConfig extends Model
{
    // 各部署单元/集群的副本数配置。
    /**
     * @example []
     *
     * @var ReplicaCount[]
     */
    public $replicas;
    protected $_name = [
        'replicas' => 'replicas',
    ];

    public function validate()
    {
        Model::validateRequired('replicas', $this->replicas, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->replicas) {
            $res['replicas'] = [];
            if (null !== $this->replicas && \is_array($this->replicas)) {
                $n = 0;
                foreach ($this->replicas as $item) {
                    $res['replicas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FixedReplicaElasticConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['replicas'])) {
            if (!empty($map['replicas'])) {
                $model->replicas = [];
                $n               = 0;
                foreach ($map['replicas'] as $item) {
                    $model->replicas[$n++] = null !== $item ? ReplicaCount::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
