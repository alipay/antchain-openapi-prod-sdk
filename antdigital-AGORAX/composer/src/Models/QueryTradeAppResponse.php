<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

use AntChain\AGORAX\Models\RefundInfo;

class QueryTradeAppResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'outTradeNo' => 'out_trade_no',
        'tradeNo' => 'trade_no',
        'tradeStatus' => 'trade_status',
        'totalAmount' => 'total_amount',
        'receiptAmount' => 'receipt_amount',
        'refundList' => 'refund_list',
        'totalRefundAmount' => 'total_refund_amount',
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->tradeStatus) {
            $res['trade_status'] = $this->tradeStatus;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->receiptAmount) {
            $res['receipt_amount'] = $this->receiptAmount;
        }
        if (null !== $this->refundList) {
            $res['refund_list'] = [];
            if(null !== $this->refundList && is_array($this->refundList)){
                $n = 0;
                foreach($this->refundList as $item){
                    $res['refund_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalRefundAmount) {
            $res['total_refund_amount'] = $this->totalRefundAmount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTradeAppResponse
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
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['trade_status'])){
            $model->tradeStatus = $map['trade_status'];
        }
        if(isset($map['total_amount'])){
            $model->totalAmount = $map['total_amount'];
        }
        if(isset($map['receipt_amount'])){
            $model->receiptAmount = $map['receipt_amount'];
        }
        if(isset($map['refund_list'])){
            if(!empty($map['refund_list'])){
                $model->refundList = [];
                $n = 0;
                foreach($map['refund_list'] as $item) {
                    $model->refundList[$n++] = null !== $item ? RefundInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['total_refund_amount'])){
            $model->totalRefundAmount = $map['total_refund_amount'];
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

    // 接入方外部业务订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 支付宝交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 支付状态
    /**
     * @var string
     */
    public $tradeStatus;

    // 订单金额，单位：元
    /**
     * @var string
     */
    public $totalAmount;

    // 实付金额，单位：元
    /**
     * @var string
     */
    public $receiptAmount;

    // 退款记录
    /**
     * @var RefundInfo[]
     */
    public $refundList;

    // 累计退款金额
    /**
     * @var string
     */
    public $totalRefundAmount;

}
