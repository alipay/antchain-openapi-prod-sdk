<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class Action extends Model
{
    // 权限点ID
    /**
     * @example A0000000001
     *
     * @var string
     */
    public $id;

    // 权限点名称
    /**
     * @example antcloud.xxx.xxx.labelinfo.query
     *
     * @var string
     */
    public $name;

    // 类型
    /**
     * @example INNER
     *
     * @var string
     */
    public $type;

    // 状态
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $status;

    // 描述
    /**
     * @example
     *
     * @var string
     */
    public $description;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'type'        => 'type',
        'status'      => 'status',
        'description' => 'description',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
