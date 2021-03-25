<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class Action extends Model
{
    // 操作点描述
    /**
     * @example
     *
     * @var string
     */
    public $description;

    // 操作点ID
    /**
     * @example
     *
     * @var string
     */
    public $id;

    // 操作点名称
    /**
     * @example
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'description' => 'description',
        'id'          => 'id',
        'name'        => 'name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
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
     * @return Action
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
