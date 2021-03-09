<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ComputerTypeFamily extends Model
{
    // computer type family id
    /**
     * @example ecs.g6
     *
     * @var string
     */
    public $id;

    // 实例规格族所属代数。
    /**
     * @example ecs-5
     *
     * @var string
     */
    public $generation;
    protected $_name = [
        'id'         => 'id',
        'generation' => 'generation',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('generation', $this->generation, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->generation) {
            $res['generation'] = $this->generation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComputerTypeFamily
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['generation'])) {
            $model->generation = $map['generation'];
        }

        return $model;
    }
}
