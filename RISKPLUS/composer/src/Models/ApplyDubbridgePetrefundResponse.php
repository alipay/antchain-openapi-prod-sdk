<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgePetrefundResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'refundNo' => 'refund_no',
        'refundStatus' => 'refund_status',
        'remark' => 'remark',
        'bizOrderNo' => 'biz_order_no',
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
        if (null !== $this->refundNo) {
            $res['refund_no'] = $this->refundNo;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyDubbridgePetrefundResponse
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
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
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

    // 退款申请结果，Y-提交成功，N-提交失败
    /**
     * @var string
     */
    public $refundStatus;

    /**
     * @var string
     */
    public $remark;

    // 业务订单号
    /**
     * @var string
     */
    public $bizOrderNo;

}
