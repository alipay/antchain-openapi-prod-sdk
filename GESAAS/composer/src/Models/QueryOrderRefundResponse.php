<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\GESAAS\Models\RefundDetailItemList;

class QueryOrderRefundResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'tradeNo' => 'trade_no',
        'refundRequestNo' => 'refund_request_no',
        'refundStatus' => 'refund_status',
        'refundAmount' => 'refund_amount',
        'refundFailedReason' => 'refund_failed_reason',
        'refundTime' => 'refund_time',
        'refundDetailItemList' => 'refund_detail_item_list',
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->refundRequestNo) {
            $res['refund_request_no'] = $this->refundRequestNo;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->refundFailedReason) {
            $res['refund_failed_reason'] = $this->refundFailedReason;
        }
        if (null !== $this->refundTime) {
            $res['refund_time'] = $this->refundTime;
        }
        if (null !== $this->refundDetailItemList) {
            $res['refund_detail_item_list'] = [];
            if(null !== $this->refundDetailItemList && is_array($this->refundDetailItemList)){
                $n = 0;
                foreach($this->refundDetailItemList as $item){
                    $res['refund_detail_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOrderRefundResponse
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
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['refund_request_no'])){
            $model->refundRequestNo = $map['refund_request_no'];
        }
        if(isset($map['refund_status'])){
            $model->refundStatus = $map['refund_status'];
        }
        if(isset($map['refund_amount'])){
            $model->refundAmount = $map['refund_amount'];
        }
        if(isset($map['refund_failed_reason'])){
            $model->refundFailedReason = $map['refund_failed_reason'];
        }
        if(isset($map['refund_time'])){
            $model->refundTime = $map['refund_time'];
        }
        if(isset($map['refund_detail_item_list'])){
            if(!empty($map['refund_detail_item_list'])){
                $model->refundDetailItemList = [];
                $n = 0;
                foreach($map['refund_detail_item_list'] as $item) {
                    $model->refundDetailItemList[$n++] = null !== $item ? RefundDetailItemList::fromMap($item) : $item;
                }
            }
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

    // 支付交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 外部系统传入的退款请求流水号
    /**
     * @var string
     */
    public $refundRequestNo;

    // 退款请求状态
    // ● ACCEPT: 受理成功
    // ● PENDING: 需人工介入
    // ● SUCCESS: 成功
    // ● FAILED : 失败
    /**
     * @var string
     */
    public $refundStatus;

    // 退款退分账申请金额
    /**
     * @var int
     */
    public $refundAmount;

    // 退款退分账失败原因，条件返回：refundStatus=FAILED 返回
    /**
     * @var string
     */
    public $refundFailedReason;

    // 退款退分账时间，格式为yyyy-MM-dd HH:mm:ss
    // 条件返回：refundStatus=SUCCESS 返回
    /**
     * @var string
     */
    public $refundTime;

    // 条件返回：refundStatus=SUCCESS 返回
    // 退分账明细
    /**
     * @var RefundDetailItemList[]
     */
    public $refundDetailItemList;

}
