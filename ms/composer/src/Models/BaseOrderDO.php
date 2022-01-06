<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class BaseOrderDO extends Model
{
    // 排序的字段名称
    /**
     * @example name
     *
     * @var string
     */
    public $key;

    // 排序的关键字
    /**
     * @example desc
     *
     * @var string
     */
    public $dir;
    protected $_name = [
        'key' => 'key',
        'dir' => 'dir',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->dir) {
            $res['dir'] = $this->dir;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaseOrderDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['dir'])) {
            $model->dir = $map['dir'];
        }

        return $model;
    }
}
