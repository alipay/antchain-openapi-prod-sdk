<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgePetmallorderTransferResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bizOrderNo' => 'biz_order_no',
        'settleResult' => 'settle_result',
        'failReason' => 'fail_reason',
        'transferNo' => 'transfer_no',
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
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->settleResult) {
            $res['settle_result'] = $this->settleResult;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        if (null !== $this->transferNo) {
            $res['transfer_no'] = $this->transferNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyDubbridgePetmallorderTransferResponse
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
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['settle_result'])){
            $model->settleResult = $map['settle_result'];
        }
        if(isset($map['fail_reason'])){
            $model->failReason = $map['fail_reason'];
        }
        if(isset($map['transfer_no'])){
            $model->transferNo = $map['transfer_no'];
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

    // 业务订单
    /**
     * @var string
     */
    public $bizOrderNo;

    // 受理结果：Y-受理成功、N-受理失败
    /**
     * @var string
     */
    public $settleResult;

    // 失败原因
    /**
     * @var string
     */
    public $failReason;

    // 分账单号，提交成功时返回
    /**
     * @var string
     */
    public $transferNo;

}
