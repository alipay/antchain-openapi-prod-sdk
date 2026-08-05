<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class PushOrderRefundResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'refundRequestNo' => 'refund_request_no',
        'refundStatus' => 'refund_status',
        'refundRecordNo' => 'refund_record_no',
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
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->refundRecordNo) {
            $res['refund_record_no'] = $this->refundRecordNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushOrderRefundResponse
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
        if(isset($map['refund_status'])){
            $model->refundStatus = $map['refund_status'];
        }
        if(isset($map['refund_record_no'])){
            $model->refundRecordNo = $map['refund_record_no'];
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

    // 退款退分账请求状态， ACCEPT : 受理成功
    /**
     * @var string
     */
    public $refundStatus;

    // 本次退款退分账唯一标识
    /**
     * @var string
     */
    public $refundRecordNo;

}
