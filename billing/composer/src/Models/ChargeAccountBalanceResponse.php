<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BILLING\Models;

use AlibabaCloud\Tea\Model;

class ChargeAccountBalanceResponse extends Model
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

    // 支付宝网关
    /**
     * @var string
     */
    public $alipayGateway;

    // 字符编码格式   _input_charset
    /**
     * @var string
     */
    public $inputCharset;

    // 服务器异步通知页面路径
    /**
     * @var string
     */
    public $notifyUrl;

    // 商户网站唯一订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 收款方PID
    /**
     * @var string
     */
    public $partner;

    // 支付类型
    /**
     * @var string
     */
    public $paymentType;

    // 收银台发起页面跳转同步通知页面路径
    /**
     * @var string
     */
    public $returnUrl;

    // 收款方ID
    /**
     * @var string
     */
    public $sellerId;

    // 调用的接口名
    /**
     * @var string
     */
    public $service;

    // 签名
    /**
     * @var string
     */
    public $sign;

    // 签名类型
    /**
     * @var string
     */
    public $signType;

    // 商品名称
    /**
     * @var string
     */
    public $subject;

    // 交易金额
    /**
     * @var string
     */
    public $totalFee;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'alipayGateway' => 'alipay_gateway',
        'inputCharset'  => 'input_charset',
        'notifyUrl'     => 'notify_url',
        'outTradeNo'    => 'out_trade_no',
        'partner'       => 'partner',
        'paymentType'   => 'payment_type',
        'returnUrl'     => 'return_url',
        'sellerId'      => 'seller_id',
        'service'       => 'service',
        'sign'          => 'sign',
        'signType'      => 'sign_type',
        'subject'       => 'subject',
        'totalFee'      => 'total_fee',
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
        if (null !== $this->alipayGateway) {
            $res['alipay_gateway'] = $this->alipayGateway;
        }
        if (null !== $this->inputCharset) {
            $res['input_charset'] = $this->inputCharset;
        }
        if (null !== $this->notifyUrl) {
            $res['notify_url'] = $this->notifyUrl;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->partner) {
            $res['partner'] = $this->partner;
        }
        if (null !== $this->paymentType) {
            $res['payment_type'] = $this->paymentType;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }
        if (null !== $this->sellerId) {
            $res['seller_id'] = $this->sellerId;
        }
        if (null !== $this->service) {
            $res['service'] = $this->service;
        }
        if (null !== $this->sign) {
            $res['sign'] = $this->sign;
        }
        if (null !== $this->signType) {
            $res['sign_type'] = $this->signType;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->totalFee) {
            $res['total_fee'] = $this->totalFee;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChargeAccountBalanceResponse
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
        if (isset($map['alipay_gateway'])) {
            $model->alipayGateway = $map['alipay_gateway'];
        }
        if (isset($map['input_charset'])) {
            $model->inputCharset = $map['input_charset'];
        }
        if (isset($map['notify_url'])) {
            $model->notifyUrl = $map['notify_url'];
        }
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['partner'])) {
            $model->partner = $map['partner'];
        }
        if (isset($map['payment_type'])) {
            $model->paymentType = $map['payment_type'];
        }
        if (isset($map['return_url'])) {
            $model->returnUrl = $map['return_url'];
        }
        if (isset($map['seller_id'])) {
            $model->sellerId = $map['seller_id'];
        }
        if (isset($map['service'])) {
            $model->service = $map['service'];
        }
        if (isset($map['sign'])) {
            $model->sign = $map['sign'];
        }
        if (isset($map['sign_type'])) {
            $model->signType = $map['sign_type'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['total_fee'])) {
            $model->totalFee = $map['total_fee'];
        }

        return $model;
    }
}
