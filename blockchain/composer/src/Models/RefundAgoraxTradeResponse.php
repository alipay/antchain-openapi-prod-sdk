<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RefundAgoraxTradeResponse extends Model
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

    // 商户订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 支付宝交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 用户的登录id
    /**
     * @var string
     */
    public $buyerLogonId;

    // 退款总金额
    /**
     * @var string
     */
    public $refundFee;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'outTradeNo'   => 'out_trade_no',
        'tradeNo'      => 'trade_no',
        'buyerLogonId' => 'buyer_logon_id',
        'refundFee'    => 'refund_fee',
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
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->buyerLogonId) {
            $res['buyer_logon_id'] = $this->buyerLogonId;
        }
        if (null !== $this->refundFee) {
            $res['refund_fee'] = $this->refundFee;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefundAgoraxTradeResponse
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
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['buyer_logon_id'])) {
            $model->buyerLogonId = $map['buyer_logon_id'];
        }
        if (isset($map['refund_fee'])) {
            $model->refundFee = $map['refund_fee'];
        }

        return $model;
    }
}
