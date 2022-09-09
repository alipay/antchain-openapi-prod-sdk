<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ChainPurpose extends Model
{
    // 用途id
    /**
     * @example 4356
     *
     * @var string
     */
    public $id;

    // 用途key
    /**
     * @example 3uhhf
     *
     * @var string
     */
    public $key;

    // 用途内容
    /**
     * @example 用途内容
     *
     * @var string
     */
    public $name;

    // 用途申报时间
    /**
     * @example 22-01-01
     *
     * @var string
     */
    public $time;

    // 用途申报状态
    /**
     * @example 用途申报状态
     *
     * @var string
     */
    public $status;

    // 简短描述开关
    /**
     * @example true, false
     *
     * @var bool
     */
    public $item;

    // 详细描述开关
    /**
     * @example true, false
     *
     * @var bool
     */
    public $extend;

    // 用途申报简短描述
    /**
     * @example ""
     *
     * @var string
     */
    public $purposeItem;
    protected $_name = [
        'id'          => 'id',
        'key'         => 'key',
        'name'        => 'name',
        'time'        => 'time',
        'status'      => 'status',
        'item'        => 'item',
        'extend'      => 'extend',
        'purposeItem' => 'purpose_item',
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
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->item) {
            $res['item'] = $this->item;
        }
        if (null !== $this->extend) {
            $res['extend'] = $this->extend;
        }
        if (null !== $this->purposeItem) {
            $res['purpose_item'] = $this->purposeItem;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainPurpose
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
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['item'])) {
            $model->item = $map['item'];
        }
        if (isset($map['extend'])) {
            $model->extend = $map['extend'];
        }
        if (isset($map['purpose_item'])) {
            $model->purposeItem = $map['purpose_item'];
        }

        return $model;
    }
}
