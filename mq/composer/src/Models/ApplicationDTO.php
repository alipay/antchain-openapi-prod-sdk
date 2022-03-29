<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ApplicationDTO extends Model
{
    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreated;

    // 应用id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 应用名
    /**
     * @example app1
     *
     * @var string
     */
    public $name;

    // 服务端get队列
    /**
     * @example queue4
     *
     * @var string
     */
    public $pubGetQueue;

    // 服务端put队列
    /**
     * @example queue3
     *
     * @var string
     */
    public $pubPutQueue;

    // 服务端开关
    /**
     * @example 1
     *
     * @var int
     */
    public $pubRpcStatus;

    // 客户端get队列
    /**
     * @example queue2
     *
     * @var string
     */
    public $subGetQueue;

    // 客户端put队列
    /**
     * @example queue1
     *
     * @var string
     */
    public $subPutQueue;

    // rpc分流比例
    /**
     * @example 50
     *
     * @var int
     */
    public $subRpcScale;

    // 服务类型
    /**
     * @example [{ value:_sub_, text: _客户端_ },{ value:_pub_, text: _服务端_ },{ value:_sub,pub_, text: _客户端 服务端_ }]
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'gmtCreated'   => 'gmt_created',
        'id'           => 'id',
        'name'         => 'name',
        'pubGetQueue'  => 'pub_get_queue',
        'pubPutQueue'  => 'pub_put_queue',
        'pubRpcStatus' => 'pub_rpc_status',
        'subGetQueue'  => 'sub_get_queue',
        'subPutQueue'  => 'sub_put_queue',
        'subRpcScale'  => 'sub_rpc_scale',
        'type'         => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validatePattern('gmtCreated', $this->gmtCreated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pubGetQueue) {
            $res['pub_get_queue'] = $this->pubGetQueue;
        }
        if (null !== $this->pubPutQueue) {
            $res['pub_put_queue'] = $this->pubPutQueue;
        }
        if (null !== $this->pubRpcStatus) {
            $res['pub_rpc_status'] = $this->pubRpcStatus;
        }
        if (null !== $this->subGetQueue) {
            $res['sub_get_queue'] = $this->subGetQueue;
        }
        if (null !== $this->subPutQueue) {
            $res['sub_put_queue'] = $this->subPutQueue;
        }
        if (null !== $this->subRpcScale) {
            $res['sub_rpc_scale'] = $this->subRpcScale;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['pub_get_queue'])) {
            $model->pubGetQueue = $map['pub_get_queue'];
        }
        if (isset($map['pub_put_queue'])) {
            $model->pubPutQueue = $map['pub_put_queue'];
        }
        if (isset($map['pub_rpc_status'])) {
            $model->pubRpcStatus = $map['pub_rpc_status'];
        }
        if (isset($map['sub_get_queue'])) {
            $model->subGetQueue = $map['sub_get_queue'];
        }
        if (isset($map['sub_put_queue'])) {
            $model->subPutQueue = $map['sub_put_queue'];
        }
        if (isset($map['sub_rpc_scale'])) {
            $model->subRpcScale = $map['sub_rpc_scale'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
