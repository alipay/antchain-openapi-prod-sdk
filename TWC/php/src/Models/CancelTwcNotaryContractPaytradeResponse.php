<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CancelTwcNotaryContractPaytradeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'canceledOutTradeNo' => 'canceled_out_trade_no',
        'code' => 'code',
        'errMessage' => 'err_message',
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
        if (null !== $this->canceledOutTradeNo) {
            $res['canceled_out_trade_no'] = $this->canceledOutTradeNo;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->errMessage) {
            $res['err_message'] = $this->errMessage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CancelTwcNotaryContractPaytradeResponse
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
        if(isset($map['canceled_out_trade_no'])){
            if(!empty($map['canceled_out_trade_no'])){
                $model->canceledOutTradeNo = $map['canceled_out_trade_no'];
            }
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['err_message'])){
            $model->errMessage = $map['err_message'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 取消的代扣条目
    /**
     * @var string[]
     */
    public $canceledOutTradeNo;

    // 错误码
    /**
     * @var int
     */
    public $code;

    // 错误信息描述
    /**
     * @var string
     */
    public $errMessage;

}
