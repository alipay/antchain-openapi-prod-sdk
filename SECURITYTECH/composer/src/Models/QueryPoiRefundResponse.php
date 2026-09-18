<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryPoiRefundResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'refundNo' => 'refund_no',
        'refundStatus' => 'refund_status',
        'petRefundAmount' => 'pet_refund_amount',
        'mallRefundAmount' => 'mall_refund_amount',
        'remark' => 'remark',
    ];
    public function validate() {
        Model::validateRequired('refundNo', $this->refundNo, true);
        Model::validateRequired('refundStatus', $this->refundStatus, true);
    }
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
        if (null !== $this->refundNo) {
            $res['refund_no'] = $this->refundNo;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->petRefundAmount) {
            $res['pet_refund_amount'] = $this->petRefundAmount;
        }
        if (null !== $this->mallRefundAmount) {
            $res['mall_refund_amount'] = $this->mallRefundAmount;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryPoiRefundResponse
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
        if(isset($map['refund_no'])){
            $model->refundNo = $map['refund_no'];
        }
        if(isset($map['refund_status'])){
            $model->refundStatus = $map['refund_status'];
        }
        if(isset($map['pet_refund_amount'])){
            $model->petRefundAmount = $map['pet_refund_amount'];
        }
        if(isset($map['mall_refund_amount'])){
            $model->mallRefundAmount = $map['mall_refund_amount'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
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

    // 退款单号
    /**
     * @var string
     */
    public $refundNo;

    // 退款状态：INIT/PROCESSING/SUCCESS/FAILED
    /**
     * @var string
     */
    public $refundStatus;

    // 活体部分退款金额
    /**
     * @var string
     */
    public $petRefundAmount;

    // 商城部分退款金额
    /**
     * @var string
     */
    public $mallRefundAmount;

    // 说明（与退款申请响应同口径）
    /**
     * @var string
     */
    public $remark;

}
