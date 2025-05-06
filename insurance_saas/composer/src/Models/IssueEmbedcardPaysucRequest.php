<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class IssueEmbedcardPaysucRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 险种编码
    /**
     * @var string
     */
    public $insuranceTypeCode;

    // 保司编码
    /**
     * @var string
     */
    public $insuranceCompanyNo;

    // 嵌入式产品编码
    /**
     * @var string
     */
    public $embedProductCode;

    // 交易流水号
    /**
     * @var string
     */
    public $tradeNo;

    // 方案名称
    /**
     * @var string
     */
    public $schemeName;

    // 保费，保留2位小数
    /**
     * @var string
     */
    public $premium;

    // 保费支付渠道，01-支付宝、02-微信支付、03-银行卡支付、04-平台账户余额支付
    /**
     * @var string
     */
    public $premiumPaymentChannel;

    // 保费支付流水号
    /**
     * @var string
     */
    public $premiumPaymentNo;

    // 保费支付金额，保留2位小数
    /**
     * @var string
     */
    public $premiumPaymentAmount;

    // 保费支付时间
    /**
     * @var string
     */
    public $premiumPaymentTime;

    // 询价编码
    /**
     * @var string
     */
    public $inquiryNo;
    protected $_name = [
        'authToken'             => 'auth_token',
        'insuranceTypeCode'     => 'insurance_type_code',
        'insuranceCompanyNo'    => 'insurance_company_no',
        'embedProductCode'      => 'embed_product_code',
        'tradeNo'               => 'trade_no',
        'schemeName'            => 'scheme_name',
        'premium'               => 'premium',
        'premiumPaymentChannel' => 'premium_payment_channel',
        'premiumPaymentNo'      => 'premium_payment_no',
        'premiumPaymentAmount'  => 'premium_payment_amount',
        'premiumPaymentTime'    => 'premium_payment_time',
        'inquiryNo'             => 'inquiry_no',
    ];

    public function validate()
    {
        Model::validateRequired('insuranceTypeCode', $this->insuranceTypeCode, true);
        Model::validateRequired('insuranceCompanyNo', $this->insuranceCompanyNo, true);
        Model::validateRequired('embedProductCode', $this->embedProductCode, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('schemeName', $this->schemeName, true);
        Model::validateRequired('premium', $this->premium, true);
        Model::validateRequired('premiumPaymentChannel', $this->premiumPaymentChannel, true);
        Model::validateRequired('premiumPaymentNo', $this->premiumPaymentNo, true);
        Model::validateRequired('premiumPaymentAmount', $this->premiumPaymentAmount, true);
        Model::validateRequired('premiumPaymentTime', $this->premiumPaymentTime, true);
        Model::validateRequired('inquiryNo', $this->inquiryNo, true);
        Model::validateMaxLength('insuranceTypeCode', $this->insuranceTypeCode, 32);
        Model::validateMaxLength('insuranceCompanyNo', $this->insuranceCompanyNo, 32);
        Model::validateMaxLength('embedProductCode', $this->embedProductCode, 32);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 128);
        Model::validateMaxLength('schemeName', $this->schemeName, 32);
        Model::validateMaxLength('premiumPaymentChannel', $this->premiumPaymentChannel, 32);
        Model::validateMaxLength('premiumPaymentNo', $this->premiumPaymentNo, 128);
        Model::validateMaxLength('inquiryNo', $this->inquiryNo, 32);
        Model::validatePattern('premiumPaymentTime', $this->premiumPaymentTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->insuranceTypeCode) {
            $res['insurance_type_code'] = $this->insuranceTypeCode;
        }
        if (null !== $this->insuranceCompanyNo) {
            $res['insurance_company_no'] = $this->insuranceCompanyNo;
        }
        if (null !== $this->embedProductCode) {
            $res['embed_product_code'] = $this->embedProductCode;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->schemeName) {
            $res['scheme_name'] = $this->schemeName;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }
        if (null !== $this->premiumPaymentChannel) {
            $res['premium_payment_channel'] = $this->premiumPaymentChannel;
        }
        if (null !== $this->premiumPaymentNo) {
            $res['premium_payment_no'] = $this->premiumPaymentNo;
        }
        if (null !== $this->premiumPaymentAmount) {
            $res['premium_payment_amount'] = $this->premiumPaymentAmount;
        }
        if (null !== $this->premiumPaymentTime) {
            $res['premium_payment_time'] = $this->premiumPaymentTime;
        }
        if (null !== $this->inquiryNo) {
            $res['inquiry_no'] = $this->inquiryNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IssueEmbedcardPaysucRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['insurance_type_code'])) {
            $model->insuranceTypeCode = $map['insurance_type_code'];
        }
        if (isset($map['insurance_company_no'])) {
            $model->insuranceCompanyNo = $map['insurance_company_no'];
        }
        if (isset($map['embed_product_code'])) {
            $model->embedProductCode = $map['embed_product_code'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['scheme_name'])) {
            $model->schemeName = $map['scheme_name'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }
        if (isset($map['premium_payment_channel'])) {
            $model->premiumPaymentChannel = $map['premium_payment_channel'];
        }
        if (isset($map['premium_payment_no'])) {
            $model->premiumPaymentNo = $map['premium_payment_no'];
        }
        if (isset($map['premium_payment_amount'])) {
            $model->premiumPaymentAmount = $map['premium_payment_amount'];
        }
        if (isset($map['premium_payment_time'])) {
            $model->premiumPaymentTime = $map['premium_payment_time'];
        }
        if (isset($map['inquiry_no'])) {
            $model->inquiryNo = $map['inquiry_no'];
        }

        return $model;
    }
}
