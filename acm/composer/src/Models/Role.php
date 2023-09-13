<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class Role extends Model
{
    // 角色ID
    /**
     * @example
     *
     * @var string
     */
    public $id;

    // 角色名称
    //
    /**
     * @example
     *
     * @var string
     */
    public $name;

    // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
    /**
     * @example
     *
     * @var string
     */
    public $type;

    // 角色描述
    //
    /**
     * @example
     *
     * @var string
     */
    public $description;

    // 状态
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $status;

    // 所有者
    /**
     * @example AntCloud
     *
     * @var string
     */
    public $owner;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'type'        => 'type',
        'description' => 'description',
        'status'      => 'status',
        'owner'       => 'owner',
    ];

    public function validate()
    {
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Role
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
