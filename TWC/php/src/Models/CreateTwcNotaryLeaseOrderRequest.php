<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateTwcNotaryLeaseOrderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'accountId' => 'account_id',
        'alipayOrderAmount' => 'alipay_order_amount',
        'alipayOrderNo' => 'alipay_order_no',
        'alipayOrderTotalAmount' => 'alipay_order_total_amount',
        'depositWaiveAmount' => 'deposit_waive_amount',
        'insuranceBillAmount' => 'insurance_bill_amount',
        'insuranceBillNo' => 'insurance_bill_no',
        'insuranceBillTime' => 'insurance_bill_time',
        'insuranceCoverage' => 'insurance_coverage',
        'insuranceOrderNo' => 'insurance_order_no',
        'insuranceOrderUrl' => 'insurance_order_url',
        'insuranceProductCoverage' => 'insurance_product_coverage',
        'insured' => 'insured',
        'itemName' => 'item_name',
        'itemPrice' => 'item_price',
        'itemType' => 'item_type',
        'merchantAlipayAccount' => 'merchant_alipay_account',
        'merchantAlipayId' => 'merchant_alipay_id',
        'merchantName' => 'merchant_name',
        'merchantOrderNo' => 'merchant_order_no',
        'paymentChannel' => 'payment_channel',
        'tenancyTermEnd' => 'tenancy_term_end',
        'tenancyTermStart' => 'tenancy_term_start',
    ];
    public function validate() {
        Model::validateMinimum('alipayOrderAmount', $this->alipayOrderAmount, '0');
        Model::validateMinimum('alipayOrderTotalAmount', $this->alipayOrderTotalAmount, '0');
        Model::validateMinimum('depositWaiveAmount', $this->depositWaiveAmount, '0');
        Model::validateMinimum('insuranceCoverage', $this->insuranceCoverage, '0');
        Model::validateMinimum('itemPrice', $this->itemPrice, '0');
        Model::validateMinimum('tenancyTermEnd', $this->tenancyTermEnd, '0');
        Model::validateMinimum('tenancyTermStart', $this->tenancyTermStart, '0');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->alipayOrderAmount) {
            $res['alipay_order_amount'] = $this->alipayOrderAmount;
        }
        if (null !== $this->alipayOrderNo) {
            $res['alipay_order_no'] = $this->alipayOrderNo;
        }
        if (null !== $this->alipayOrderTotalAmount) {
            $res['alipay_order_total_amount'] = $this->alipayOrderTotalAmount;
        }
        if (null !== $this->depositWaiveAmount) {
            $res['deposit_waive_amount'] = $this->depositWaiveAmount;
        }
        if (null !== $this->insuranceBillAmount) {
            $res['insurance_bill_amount'] = $this->insuranceBillAmount;
        }
        if (null !== $this->insuranceBillNo) {
            $res['insurance_bill_no'] = $this->insuranceBillNo;
        }
        if (null !== $this->insuranceBillTime) {
            $res['insurance_bill_time'] = $this->insuranceBillTime;
        }
        if (null !== $this->insuranceCoverage) {
            $res['insurance_coverage'] = $this->insuranceCoverage;
        }
        if (null !== $this->insuranceOrderNo) {
            $res['insurance_order_no'] = $this->insuranceOrderNo;
        }
        if (null !== $this->insuranceOrderUrl) {
            $res['insurance_order_url'] = $this->insuranceOrderUrl;
        }
        if (null !== $this->insuranceProductCoverage) {
            $res['insurance_product_coverage'] = $this->insuranceProductCoverage;
        }
        if (null !== $this->insured) {
            $res['insured'] = $this->insured;
        }
        if (null !== $this->itemName) {
            $res['item_name'] = $this->itemName;
        }
        if (null !== $this->itemPrice) {
            $res['item_price'] = $this->itemPrice;
        }
        if (null !== $this->itemType) {
            $res['item_type'] = $this->itemType;
        }
        if (null !== $this->merchantAlipayAccount) {
            $res['merchant_alipay_account'] = $this->merchantAlipayAccount;
        }
        if (null !== $this->merchantAlipayId) {
            $res['merchant_alipay_id'] = $this->merchantAlipayId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantOrderNo) {
            $res['merchant_order_no'] = $this->merchantOrderNo;
        }
        if (null !== $this->paymentChannel) {
            $res['payment_channel'] = $this->paymentChannel;
        }
        if (null !== $this->tenancyTermEnd) {
            $res['tenancy_term_end'] = $this->tenancyTermEnd;
        }
        if (null !== $this->tenancyTermStart) {
            $res['tenancy_term_start'] = $this->tenancyTermStart;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryLeaseOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
        }
        if(isset($map['alipay_order_amount'])){
            $model->alipayOrderAmount = $map['alipay_order_amount'];
        }
        if(isset($map['alipay_order_no'])){
            $model->alipayOrderNo = $map['alipay_order_no'];
        }
        if(isset($map['alipay_order_total_amount'])){
            $model->alipayOrderTotalAmount = $map['alipay_order_total_amount'];
        }
        if(isset($map['deposit_waive_amount'])){
            $model->depositWaiveAmount = $map['deposit_waive_amount'];
        }
        if(isset($map['insurance_bill_amount'])){
            $model->insuranceBillAmount = $map['insurance_bill_amount'];
        }
        if(isset($map['insurance_bill_no'])){
            $model->insuranceBillNo = $map['insurance_bill_no'];
        }
        if(isset($map['insurance_bill_time'])){
            $model->insuranceBillTime = $map['insurance_bill_time'];
        }
        if(isset($map['insurance_coverage'])){
            $model->insuranceCoverage = $map['insurance_coverage'];
        }
        if(isset($map['insurance_order_no'])){
            $model->insuranceOrderNo = $map['insurance_order_no'];
        }
        if(isset($map['insurance_order_url'])){
            $model->insuranceOrderUrl = $map['insurance_order_url'];
        }
        if(isset($map['insurance_product_coverage'])){
            $model->insuranceProductCoverage = $map['insurance_product_coverage'];
        }
        if(isset($map['insured'])){
            $model->insured = $map['insured'];
        }
        if(isset($map['item_name'])){
            $model->itemName = $map['item_name'];
        }
        if(isset($map['item_price'])){
            $model->itemPrice = $map['item_price'];
        }
        if(isset($map['item_type'])){
            $model->itemType = $map['item_type'];
        }
        if(isset($map['merchant_alipay_account'])){
            $model->merchantAlipayAccount = $map['merchant_alipay_account'];
        }
        if(isset($map['merchant_alipay_id'])){
            $model->merchantAlipayId = $map['merchant_alipay_id'];
        }
        if(isset($map['merchant_name'])){
            $model->merchantName = $map['merchant_name'];
        }
        if(isset($map['merchant_order_no'])){
            $model->merchantOrderNo = $map['merchant_order_no'];
        }
        if(isset($map['payment_channel'])){
            $model->paymentChannel = $map['payment_channel'];
        }
        if(isset($map['tenancy_term_end'])){
            $model->tenancyTermEnd = $map['tenancy_term_end'];
        }
        if(isset($map['tenancy_term_start'])){
            $model->tenancyTermStart = $map['tenancy_term_start'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 账号标识，可弃用
    /**
     * @var string
     */
    public $accountId;

    // 支付宝交易金额
    /**
     * @var int
     */
    public $alipayOrderAmount;

    // 支付宝订单号
    /**
     * @var string
     */
    public $alipayOrderNo;

    // 支付宝交易总金额
    /**
     * @var int
     */
    public $alipayOrderTotalAmount;

    // 免押金额
    /**
     * @var int
     */
    public $depositWaiveAmount;

    // 保险缴费金额，单位分
    /**
     * @var int
     */
    public $insuranceBillAmount;

    // 保险缴费单号，insured为True时必填，仅支持数字和字母，长度20
    /**
     * @var string
     */
    public $insuranceBillNo;

    // 保险缴费北京时间，格式为"YYYYMMDDHHMISS"，时区为UTC+8
    /**
     * @var string
     */
    public $insuranceBillTime;

    // 订单总保额，单位分，insured为True时必填
    /**
     * @var int
     */
    public $insuranceCoverage;

    // 保单号，insured为True时必填，仅支持数字和字母
    /**
     * @var string
     */
    public $insuranceOrderNo;

    // 保单查询地址，insured为True时必填
    /**
     * @var string
     */
    public $insuranceOrderUrl;

    // 订单产品保额，单位分，insured为True时必填
    /**
     * @var int
     */
    public $insuranceProductCoverage;

    // 是否投保，默认为True
    /**
     * @var bool
     */
    public $insured;

    // 商品名称
    /**
     * @var string
     */
    public $itemName;

    // 商品市场价格
    /**
     * @var int
     */
    public $itemPrice;

    // 商品类目
    /**
     * @var string
     */
    public $itemType;

    // 商户支付宝账号
    /**
     * @var string
     */
    public $merchantAlipayAccount;

    // 商户支付宝ID
    /**
     * @var string
     */
    public $merchantAlipayId;

    // 商户名称
    /**
     * @var string
     */
    public $merchantName;

    // 商户单号
    /**
     * @var string
     */
    public $merchantOrderNo;

    // 支付渠道，包括支付宝（Alipay）、第三方收单机构（ThirdParty）、信用卡（CreditCard）、银行转账（BankTransfer）、微信（WeChatPay）、其他（Other）
    /**
     * @var string
     */
    public $paymentChannel;

    // 租约结束日期
    /**
     * @var int
     */
    public $tenancyTermEnd;

    // 租约起始日期
    /**
     * @var int
     */
    public $tenancyTermStart;

}
