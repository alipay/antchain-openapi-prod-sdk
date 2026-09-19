<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreateDubbridgePetmallorderResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bizOrderNo' => 'biz_order_no',
        'createResult' => 'create_result',
        'failReason' => 'fail_reason',
        'ownTradeNo' => 'own_trade_no',
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
        if (null !== $this->createResult) {
            $res['create_result'] = $this->createResult;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        if (null !== $this->ownTradeNo) {
            $res['own_trade_no'] = $this->ownTradeNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDubbridgePetmallorderResponse
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
        if(isset($map['create_result'])){
            $model->createResult = $map['create_result'];
        }
        if(isset($map['fail_reason'])){
            $model->failReason = $map['fail_reason'];
        }
        if(isset($map['own_trade_no'])){
            $model->ownTradeNo = $map['own_trade_no'];
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

    // 商城业务订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 积分订单创建结果，Y-成功；N-失败
    /**
     * @var string
     */
    public $createResult;

    // 失败原因
    /**
     * @var string
     */
    public $failReason;

    // 商城订单的交易单号
    /**
     * @var string
     */
    public $ownTradeNo;

}
