<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class RepoProject extends Model
{
    // project id
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $id;

    // 项目名称
    /**
     * @example library
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'id'   => 'id',
        'name' => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepoProject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
