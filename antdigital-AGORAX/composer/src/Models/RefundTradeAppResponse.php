<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class RefundTradeAppResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'outTradeNo' => 'out_trade_no',
        'outRequestNo' => 'out_request_no',
        'refundAmount' => 'refund_amount',
        'totalRefundAmount' => 'total_refund_amount',
        'refundStatus' => 'refund_status',
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
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->totalRefundAmount) {
            $res['total_refund_amount'] = $this->totalRefundAmount;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RefundTradeAppResponse
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
        if(isset($map['out_trade_no'])){
            $model->outTradeNo = $map['out_trade_no'];
        }
        if(isset($map['out_request_no'])){
            $model->outRequestNo = $map['out_request_no'];
        }
        if(isset($map['refund_amount'])){
            $model->refundAmount = $map['refund_amount'];
        }
        if(isset($map['total_refund_amount'])){
            $model->totalRefundAmount = $map['total_refund_amount'];
        }
        if(isset($map['refund_status'])){
            $model->refundStatus = $map['refund_status'];
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

    // 原支付业务订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 本次退款业务号
    /**
     * @var string
     */
    public $outRequestNo;

    // 本次退款金额，单位：元
    /**
     * @var string
     */
    public $refundAmount;

    // 当前累计成功退款金额，单位：元
    /**
     * @var string
     */
    public $totalRefundAmount;

    // 退款状态
    /**
     * @var string
     */
    public $refundStatus;

}
