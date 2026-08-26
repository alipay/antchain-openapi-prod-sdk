<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class GetAntcloudTradeOrderResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'orderId' => 'order_id',
        'orderStatus' => 'order_status',
        'fulfillStatus' => 'fulfill_status',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->fulfillStatus) {
            $res['fulfill_status'] = $this->fulfillStatus;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetAntcloudTradeOrderResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['order_status'])){
            $model->orderStatus = $map['order_status'];
        }
        if(isset($map['fulfill_status'])){
            $model->fulfillStatus = $map['fulfill_status'];
        }
        return $model;
    }
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

    // 订单状态，示例：
    // ORDER_SUCCESS（成功）
    // ORDER_FAIL（失败）
    // ORDER_CANCEL（取消）
    /**
     * @var string
     */
    public $orderStatus;

    // 履约状态；INIT(待履约), DOING(履约中), DONE("履约完成"), FAILED(履约失败)
    /**
     * @var string
     */
    public $fulfillStatus;

}
