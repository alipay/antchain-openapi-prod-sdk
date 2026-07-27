<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryOnetimeRefundResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'refundRequestNo' => 'refund_request_no',
        'tradeNo' => 'trade_no',
        'status' => 'status',
        'refundOrderNo' => 'refund_order_no',
        'refundErrorMsg' => 'refund_error_msg',
        'totalRefundAmount' => 'total_refund_amount',
        'sendBackAmount' => 'send_back_amount',
        'gmtRefundPay' => 'gmt_refund_pay',
        'refundDivideTransOutInfoList' => 'refund_divide_trans_out_info_list',
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
        if (null !== $this->refundRequestNo) {
            $res['refund_request_no'] = $this->refundRequestNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->refundOrderNo) {
            $res['refund_order_no'] = $this->refundOrderNo;
        }
        if (null !== $this->refundErrorMsg) {
            $res['refund_error_msg'] = $this->refundErrorMsg;
        }
        if (null !== $this->totalRefundAmount) {
            $res['total_refund_amount'] = $this->totalRefundAmount;
        }
        if (null !== $this->sendBackAmount) {
            $res['send_back_amount'] = $this->sendBackAmount;
        }
        if (null !== $this->gmtRefundPay) {
            $res['gmt_refund_pay'] = $this->gmtRefundPay;
        }
        if (null !== $this->refundDivideTransOutInfoList) {
            $res['refund_divide_trans_out_info_list'] = $this->refundDivideTransOutInfoList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOnetimeRefundResponse
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
        if(isset($map['refund_request_no'])){
            $model->refundRequestNo = $map['refund_request_no'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['refund_order_no'])){
            $model->refundOrderNo = $map['refund_order_no'];
        }
        if(isset($map['refund_error_msg'])){
            $model->refundErrorMsg = $map['refund_error_msg'];
        }
        if(isset($map['total_refund_amount'])){
            $model->totalRefundAmount = $map['total_refund_amount'];
        }
        if(isset($map['send_back_amount'])){
            $model->sendBackAmount = $map['send_back_amount'];
        }
        if(isset($map['gmt_refund_pay'])){
            $model->gmtRefundPay = $map['gmt_refund_pay'];
        }
        if(isset($map['refund_divide_trans_out_info_list'])){
            $model->refundDivideTransOutInfoList = $map['refund_divide_trans_out_info_list'];
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

    // 外部系统传入的退款请求号
    /**
     * @var string
     */
    public $refundRequestNo;

    // 支付宝交易单号
    /**
     * @var string
     */
    public $tradeNo;

    // 退款请求状态
    // ACCEPT: 受理成功
    // PENDING: 需人工介入
    // SUCCESS: 成功
    // FAILED : 失败
    /**
     * @var string
     */
    public $status;

    // 请求支付宝的退款单据号
    /**
     * @var string
     */
    public $refundOrderNo;

    // 退款失败原因
    /**
     * @var string
     */
    public $refundErrorMsg;

    // 本笔交易总退款金额，单位为分
    /**
     * @var int
     */
    public $totalRefundAmount;

    // 本次退款申请的实际退款金额，单位为分
    /**
     * @var int
     */
    public $sendBackAmount;

    // 实际退款时间,13位时间戳（毫秒）
    /**
     * @var int
     */
    public $gmtRefundPay;

    // 退分账信息
    /**
     * @var string
     */
    public $refundDivideTransOutInfoList;

}
