<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CellReplicasMap extends Model
{
    // cell name
    /**
     * @example RZ00A
     *
     * @var string
     */
    public $name;

    // 副本数
    /**
     * @example 1
     *
     * @var int
     */
    public $replicas;
    protected $_name = [
        'name'     => 'name',
        'replicas' => 'replicas',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('replicas', $this->replicas, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->replicas) {
            $res['replicas'] = $this->replicas;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellReplicasMap
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['replicas'])) {
            $model->replicas = $map['replicas'];
        }

        return $model;
    }
}
