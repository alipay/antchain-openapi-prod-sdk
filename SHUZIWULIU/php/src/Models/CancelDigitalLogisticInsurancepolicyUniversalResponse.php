<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CancelDigitalLogisticInsurancepolicyUniversalResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'applyTradeNo' => 'apply_trade_no',
        'polNo' => 'pol_no',
        'sendBackPremium' => 'send_back_premium',
        'successSurrenderTime' => 'success_surrender_time',
        'surrenderEffectiveTime' => 'surrender_effective_time',
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
        if (null !== $this->applyTradeNo) {
            $res['apply_trade_no'] = $this->applyTradeNo;
        }
        if (null !== $this->polNo) {
            $res['pol_no'] = $this->polNo;
        }
        if (null !== $this->sendBackPremium) {
            $res['send_back_premium'] = $this->sendBackPremium;
        }
        if (null !== $this->successSurrenderTime) {
            $res['success_surrender_time'] = $this->successSurrenderTime;
        }
        if (null !== $this->surrenderEffectiveTime) {
            $res['surrender_effective_time'] = $this->surrenderEffectiveTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CancelDigitalLogisticInsurancepolicyUniversalResponse
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
        if(isset($map['apply_trade_no'])){
            $model->applyTradeNo = $map['apply_trade_no'];
        }
        if(isset($map['pol_no'])){
            $model->polNo = $map['pol_no'];
        }
        if(isset($map['send_back_premium'])){
            $model->sendBackPremium = $map['send_back_premium'];
        }
        if(isset($map['success_surrender_time'])){
            $model->successSurrenderTime = $map['success_surrender_time'];
        }
        if(isset($map['surrender_effective_time'])){
            $model->surrenderEffectiveTime = $map['surrender_effective_time'];
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

    // 投保订单号
    /**
     * @var string
     */
    public $applyTradeNo;

    // 保单号
    /**
     * @var string
     */
    public $polNo;

    // 退还保费
    /**
     * @var string
     */
    public $sendBackPremium;

    // 成功退保时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
    /**
     * @var string
     */
    public $successSurrenderTime;

    // 退保生效时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
    /**
     * @var string
     */
    public $surrenderEffectiveTime;

}
