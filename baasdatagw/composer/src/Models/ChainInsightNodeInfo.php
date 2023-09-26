<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightNodeInfo extends Model
{
    // 链ID
    /**
     * @example c3179e0d54a340a38d338664fe71d54c
     *
     * @var string
     */
    public $bizId;

    // 节点名称
    /**
     * @example node_name
     *
     * @var string
     */
    public $name;

    // 节点IP
    /**
     * @example 41.117.164.61 18130
     *
     * @var string
     */
    public $ip;

    // 节点当前区块高度
    /**
     * @example 100
     *
     * @var int
     */
    public $height;

    // 节点状态，ok, fail
    /**
     * @example ok
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'bizId'  => 'biz_id',
        'name'   => 'name',
        'ip'     => 'ip',
        'height' => 'height',
        'status' => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightNodeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
