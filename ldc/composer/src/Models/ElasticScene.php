<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ElasticScene extends Model
{
    // 场景名
    /**
     * @example 场景A
     *
     * @var string
     */
    public $name;

    // 弹性场景状态，有效值（VALID，INVALID）
    /**
     * @example VALID
     *
     * @var string
     */
    public $status;

    // 弹性场景ID
    /**
     * @example 123
     *
     * @var int
     */
    public $id;
    protected $_name = [
        'name'   => 'name',
        'status' => 'status',
        'id'     => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ElasticScene
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
