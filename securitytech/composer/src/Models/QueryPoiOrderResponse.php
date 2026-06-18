<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryPoiOrderResponse extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderId;

    // 用户openId
    /**
     * @var string
     */
    public $openId;

    // 订单状态
    /**
     * @var string
     */
    public $orderStatus;

    // 订单金额
    /**
     * @var string
     */
    public $orderAmount;

    // 门店ID
    /**
     * @var string
     */
    public $storeId;

    // 最近状态变更时间（yyyy-MM-dd HH:mm:ss）
    /**
     * @var string
     */
    public $effectTime;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'orderId'     => 'order_id',
        'openId'      => 'open_id',
        'orderStatus' => 'order_status',
        'orderAmount' => 'order_amount',
        'storeId'     => 'store_id',
        'effectTime'  => 'effect_time',
    ];

    public function validate()
    {
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->orderAmount) {
            $res['order_amount'] = $this->orderAmount;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->effectTime) {
            $res['effect_time'] = $this->effectTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPoiOrderResponse
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['order_amount'])) {
            $model->orderAmount = $map['order_amount'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['effect_time'])) {
            $model->effectTime = $map['effect_time'];
        }

        return $model;
    }
}
