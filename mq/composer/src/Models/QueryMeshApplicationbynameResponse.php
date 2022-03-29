<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueryMeshApplicationbynameResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 创建日期
    /**
     * @var string
     */
    public $gmtCreated;

    // 应用id
    /**
     * @var int
     */
    public $id;

    // 应用名
    /**
     * @var string
     */
    public $name;

    // 服务端get队列
    /**
     * @var string
     */
    public $pubGetQueue;

    // 服务端put队列
    /**
     * @var string
     */
    public $pubPutQueue;

    // 服务端rpc开关
    /**
     * @var int
     */
    public $pubRpcStatus;

    // 返回状态
    /**
     * @var int
     */
    public $state;

    // 客户端get队列
    /**
     * @var string
     */
    public $subGetQueue;

    // 客户端put队列
    /**
     * @var string
     */
    public $subPutQueue;

    // 客户端rpc比例
    /**
     * @var int
     */
    public $subRpcScale;

    // 服务类型
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'gmtCreated'   => 'gmt_created',
        'id'           => 'id',
        'name'         => 'name',
        'pubGetQueue'  => 'pub_get_queue',
        'pubPutQueue'  => 'pub_put_queue',
        'pubRpcStatus' => 'pub_rpc_status',
        'state'        => 'state',
        'subGetQueue'  => 'sub_get_queue',
        'subPutQueue'  => 'sub_put_queue',
        'subRpcScale'  => 'sub_rpc_scale',
        'type'         => 'type',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreated', $this->gmtCreated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
        if (null !== $this->state) {
            $res['state'] = $this->state;
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
     * @return QueryMeshApplicationbynameResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
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
        if (isset($map['state'])) {
            $model->state = $map['state'];
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
