<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS_DE\Models;

use AlibabaCloud\Tea\Model;

class UploadInsurglobifyprodMonthlypremiumbillRequest extends Model
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

    // 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    /**
     * @var string
     */
    public $tradeNo;

    // 保司编码
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种编码
    /**
     * @var string
     */
    public $externalProductCode;

    // 保险方案名
    /**
     * @var string
     */
    public $chSchemeName;

    // 关联的大保单号
    /**
     * @var string
     */
    public $bigPolNo;

    // 账单年度
    /**
     * @var string
     */
    public $billingYear;

    // 账单月份
    /**
     * @var string
     */
    public $billingMonth;

    // 包裹总数
    /**
     * @var string
     */
    public $packageCount;

    // 净保费，小数位只支持2位
    /**
     * @var string
     */
    public $premium;

    // 税费，小数位只支持2位
    /**
     * @var string
     */
    public $taxaAmount;

    // 总保费（含税费），小数位只支持2位
    /**
     * @var string
     */
    public $totalPremium;

    // 币种，使用ISO 4217代码；
    // CNY：人民币
    // USD：美元
    // EUR：欧元
    // GBP：英镑
    // JPY：日元
    // CHF：瑞士法郎
    // SGD：新加坡元
    /**
     * @var string
     */
    public $currency;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'tradeNo'             => 'trade_no',
        'externalChannelCode' => 'external_channel_code',
        'externalProductCode' => 'external_product_code',
        'chSchemeName'        => 'ch_scheme_name',
        'bigPolNo'            => 'big_pol_no',
        'billingYear'         => 'billing_year',
        'billingMonth'        => 'billing_month',
        'packageCount'        => 'package_count',
        'premium'             => 'premium',
        'taxaAmount'          => 'taxa_amount',
        'totalPremium'        => 'total_premium',
        'currency'            => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('chSchemeName', $this->chSchemeName, true);
        Model::validateRequired('bigPolNo', $this->bigPolNo, true);
        Model::validateRequired('billingYear', $this->billingYear, true);
        Model::validateRequired('billingMonth', $this->billingMonth, true);
        Model::validateRequired('packageCount', $this->packageCount, true);
        Model::validateRequired('premium', $this->premium, true);
        Model::validateRequired('taxaAmount', $this->taxaAmount, true);
        Model::validateRequired('totalPremium', $this->totalPremium, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 10);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 10);
        Model::validateMaxLength('chSchemeName', $this->chSchemeName, 20);
        Model::validateMaxLength('bigPolNo', $this->bigPolNo, 200);
        Model::validateMaxLength('billingYear', $this->billingYear, 4);
        Model::validateMaxLength('billingMonth', $this->billingMonth, 2);
        Model::validateMaxLength('packageCount', $this->packageCount, 256);
        Model::validateMaxLength('premium', $this->premium, 20);
        Model::validateMaxLength('taxaAmount', $this->taxaAmount, 20);
        Model::validateMaxLength('totalPremium', $this->totalPremium, 20);
        Model::validateMaxLength('currency', $this->currency, 3);
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->externalChannelCode) {
            $res['external_channel_code'] = $this->externalChannelCode;
        }
        if (null !== $this->externalProductCode) {
            $res['external_product_code'] = $this->externalProductCode;
        }
        if (null !== $this->chSchemeName) {
            $res['ch_scheme_name'] = $this->chSchemeName;
        }
        if (null !== $this->bigPolNo) {
            $res['big_pol_no'] = $this->bigPolNo;
        }
        if (null !== $this->billingYear) {
            $res['billing_year'] = $this->billingYear;
        }
        if (null !== $this->billingMonth) {
            $res['billing_month'] = $this->billingMonth;
        }
        if (null !== $this->packageCount) {
            $res['package_count'] = $this->packageCount;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }
        if (null !== $this->taxaAmount) {
            $res['taxa_amount'] = $this->taxaAmount;
        }
        if (null !== $this->totalPremium) {
            $res['total_premium'] = $this->totalPremium;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadInsurglobifyprodMonthlypremiumbillRequest
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['external_channel_code'])) {
            $model->externalChannelCode = $map['external_channel_code'];
        }
        if (isset($map['external_product_code'])) {
            $model->externalProductCode = $map['external_product_code'];
        }
        if (isset($map['ch_scheme_name'])) {
            $model->chSchemeName = $map['ch_scheme_name'];
        }
        if (isset($map['big_pol_no'])) {
            $model->bigPolNo = $map['big_pol_no'];
        }
        if (isset($map['billing_year'])) {
            $model->billingYear = $map['billing_year'];
        }
        if (isset($map['billing_month'])) {
            $model->billingMonth = $map['billing_month'];
        }
        if (isset($map['package_count'])) {
            $model->packageCount = $map['package_count'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }
        if (isset($map['taxa_amount'])) {
            $model->taxaAmount = $map['taxa_amount'];
        }
        if (isset($map['total_premium'])) {
            $model->totalPremium = $map['total_premium'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }

        return $model;
    }
}
