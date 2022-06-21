<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CountDubbridgeRepayTrialResponse extends Model
{
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

    // 还款本金
    /**
     * @var int
     */
    public $realPrincipal;

    // 还款利息
    /**
     * @var int
     */
    public $realInterest;

    // 还款费用
    /**
     * @var int
     */
    public $realOverAmt;

    // 服务费
    /**
     * @var int
     */
    public $serviceCharge;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'realPrincipal' => 'real_principal',
        'realInterest'  => 'real_interest',
        'realOverAmt'   => 'real_over_amt',
        'serviceCharge' => 'service_charge',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->realPrincipal) {
            $res['real_principal'] = $this->realPrincipal;
        }
        if (null !== $this->realInterest) {
            $res['real_interest'] = $this->realInterest;
        }
        if (null !== $this->realOverAmt) {
            $res['real_over_amt'] = $this->realOverAmt;
        }
        if (null !== $this->serviceCharge) {
            $res['service_charge'] = $this->serviceCharge;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountDubbridgeRepayTrialResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['real_principal'])) {
            $model->realPrincipal = $map['real_principal'];
        }
        if (isset($map['real_interest'])) {
            $model->realInterest = $map['real_interest'];
        }
        if (isset($map['real_over_amt'])) {
            $model->realOverAmt = $map['real_over_amt'];
        }
        if (isset($map['service_charge'])) {
            $model->serviceCharge = $map['service_charge'];
        }

        return $model;
    }
}
