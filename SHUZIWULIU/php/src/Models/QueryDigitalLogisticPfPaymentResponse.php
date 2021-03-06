<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalLogisticPfPaymentResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'accountinStatus' => 'accountin_status',
        'tradeTime' => 'trade_time',
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
        if (null !== $this->accountinStatus) {
            $res['accountin_status'] = $this->accountinStatus;
        }
        if (null !== $this->tradeTime) {
            $res['trade_time'] = $this->tradeTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticPfPaymentResponse
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
        if(isset($map['accountin_status'])){
            $model->accountinStatus = $map['accountin_status'];
        }
        if(isset($map['trade_time'])){
            $model->tradeTime = $map['trade_time'];
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

    // 入账状态: 10-受理 20-在途 00-成功 99-失败
    /**
     * @var string
     */
    public $accountinStatus;

    // 交易时间
    /**
     * @var string
     */
    public $tradeTime;

}
