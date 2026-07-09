<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PayDigitalkeyWithholdRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 商户订单号，需要保证不重复
    /**
     * @var string
     */
    public $outTradeNo;

    // 订单标题
    /**
     * @var string
     */
    public $subject;

    // 签约时支付宝返回的用户ID
    /**
     * @var string
     */
    public $alipayUserId;

    // 销售产品码，商户代扣场景为GENERAL_WITHHOLDING；预授权支付场景为PRE_AUTH_ONLINE
    /**
     * @var string
     */
    public $productCode;

    // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
    /**
     * @var int
     */
    public $totalAmount;

    // 商户代扣扣款许可
    /**
     * @var string
     */
    public $deductPermission;

    // 代扣协议号, 对应于签约时外部商户传入的协议号
    /**
     * @var string
     */
    public $externalAgreementNo;

    // 该笔订单允许的最晚付款时间，逾期将关闭交易，超时关闭交易无法继续付款。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天 该参数数值不接受小数点， 如：1.5 h，可转换为 90m。
    /**
     * @var string
     */
    public $timeoutExpress;

    // 异步支付类型
    /**
     * @var string
     */
    public $asyncType;

    // 可打折金额。 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围：[1,10000000000]
    // 传值为实际金额的100倍，例如传值为8000，实际金额为80.00
    // 如果订单金额全部参与优惠计算，则【可打折金额】无需传入。
    /**
     * @var int
     */
    public $discountableAmount;

    // 二级商户信息
    /**
     * @var SubMerchantParams
     */
    public $subMerchant;

    // 订单附加信息。 如果请求时传递了该参数，将在异步通知、对账单中原样返回，同时会在商户和用户的pc账单详情中作为交易描述展示
    /**
     * @var string
     */
    public $body;

    // 资金授权冻结时的商户授权资金订单号
    // 支付宝预授权场景下必填。
    /**
     * @var string
     */
    public $outAuthNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'outTradeNo'          => 'out_trade_no',
        'subject'             => 'subject',
        'alipayUserId'        => 'alipay_user_id',
        'productCode'         => 'product_code',
        'totalAmount'         => 'total_amount',
        'deductPermission'    => 'deduct_permission',
        'externalAgreementNo' => 'external_agreement_no',
        'timeoutExpress'      => 'timeout_express',
        'asyncType'           => 'async_type',
        'discountableAmount'  => 'discountable_amount',
        'subMerchant'         => 'sub_merchant',
        'body'                => 'body',
        'outAuthNo'           => 'out_auth_no',
    ];

    public function validate()
    {
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('asyncType', $this->asyncType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->deductPermission) {
            $res['deduct_permission'] = $this->deductPermission;
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }
        if (null !== $this->timeoutExpress) {
            $res['timeout_express'] = $this->timeoutExpress;
        }
        if (null !== $this->asyncType) {
            $res['async_type'] = $this->asyncType;
        }
        if (null !== $this->discountableAmount) {
            $res['discountable_amount'] = $this->discountableAmount;
        }
        if (null !== $this->subMerchant) {
            $res['sub_merchant'] = null !== $this->subMerchant ? $this->subMerchant->toMap() : null;
        }
        if (null !== $this->body) {
            $res['body'] = $this->body;
        }
        if (null !== $this->outAuthNo) {
            $res['out_auth_no'] = $this->outAuthNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayDigitalkeyWithholdRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['deduct_permission'])) {
            $model->deductPermission = $map['deduct_permission'];
        }
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }
        if (isset($map['timeout_express'])) {
            $model->timeoutExpress = $map['timeout_express'];
        }
        if (isset($map['async_type'])) {
            $model->asyncType = $map['async_type'];
        }
        if (isset($map['discountable_amount'])) {
            $model->discountableAmount = $map['discountable_amount'];
        }
        if (isset($map['sub_merchant'])) {
            $model->subMerchant = SubMerchantParams::fromMap($map['sub_merchant']);
        }
        if (isset($map['body'])) {
            $model->body = $map['body'];
        }
        if (isset($map['out_auth_no'])) {
            $model->outAuthNo = $map['out_auth_no'];
        }

        return $model;
    }
}
