<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Framework extends Model
{
    // 策略id
    /**
     * @example myid
     *
     * @var string
     */
    public $id;

    // 框架名称
    /**
     * @example myname
     *
     * @var string
     */
    public $name;

    // 是否启用
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enable;

    // 描述
    /**
     * @example mydescribe
     *
     * @var string
     */
    public $describe;
    protected $_name = [
        'id'       => 'id',
        'name'     => 'name',
        'enable'   => 'enable',
        'describe' => 'describe',
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
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->describe) {
            $res['describe'] = $this->describe;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Framework
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
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['describe'])) {
            $model->describe = $map['describe'];
        }

        return $model;
    }
}
