<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SwitchVO extends Model
{
    // 唯一标识
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $id;

    // 键值
    /**
     * @example key
     *
     * @var string
     */
    public $key;

    // 名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 开关
    /**
     * @example ON/OFF
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'id'    => 'id',
        'key'   => 'key',
        'name'  => 'name',
        'value' => 'value',
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
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SwitchVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
