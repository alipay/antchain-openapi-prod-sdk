<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\MultiCurrencyMoney;

class InstanceMonthlyBillVO extends Model {
    protected $_name = [
        'tenantId' => 'tenant_id',
        'productCategory' => 'product_category',
        'productName' => 'product_name',
        'chargeType' => 'charge_type',
        'instanceId' => 'instance_id',
        'billMonth' => 'bill_month',
        'billAmount' => 'bill_amount',
        'couponAmount' => 'coupon_amount',
        'highPrecisionCouponAmount' => 'high_precision_coupon_amount',
        'discountAmount' => 'discount_amount',
        'highPrecisionDiscountAmount' => 'high_precision_discount_amount',
        'adjustAmount' => 'adjust_amount',
        'receivedAmount' => 'received_amount',
        'accountReceivableDate' => 'account_receivable_date',
        'instanceMonthlyBillId' => 'instance_monthly_bill_id',
        'payChannel' => 'pay_channel',
        'contractId' => 'contract_id',
        'extendInfo' => 'extend_info',
        'unsettledAmount' => 'unsettled_amount',
        'totalDiscountAmount' => 'total_discount_amount',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCategory', $this->productCategory, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('chargeType', $this->chargeType, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('billMonth', $this->billMonth, true);
        Model::validateRequired('couponAmount', $this->couponAmount, true);
        Model::validateRequired('highPrecisionCouponAmount', $this->highPrecisionCouponAmount, true);
        Model::validateRequired('discountAmount', $this->discountAmount, true);
        Model::validateRequired('highPrecisionDiscountAmount', $this->highPrecisionDiscountAmount, true);
        Model::validateRequired('adjustAmount', $this->adjustAmount, true);
        Model::validateRequired('receivedAmount', $this->receivedAmount, true);
        Model::validateRequired('accountReceivableDate', $this->accountReceivableDate, true);
        Model::validateRequired('instanceMonthlyBillId', $this->instanceMonthlyBillId, true);
        Model::validateRequired('payChannel', $this->payChannel, true);
        Model::validateRequired('contractId', $this->contractId, true);
        Model::validateRequired('extendInfo', $this->extendInfo, true);
        Model::validateRequired('unsettledAmount', $this->unsettledAmount, true);
        Model::validateRequired('totalDiscountAmount', $this->totalDiscountAmount, true);
        Model::validatePattern('accountReceivableDate', $this->accountReceivableDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productCategory) {
            $res['product_category'] = $this->productCategory;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->billMonth) {
            $res['bill_month'] = $this->billMonth;
        }
        if (null !== $this->billAmount) {
            $res['bill_amount'] = null !== $this->billAmount ? $this->billAmount->toMap() : null;
        }
        if (null !== $this->couponAmount) {
            $res['coupon_amount'] = null !== $this->couponAmount ? $this->couponAmount->toMap() : null;
        }
        if (null !== $this->highPrecisionCouponAmount) {
            $res['high_precision_coupon_amount'] = $this->highPrecisionCouponAmount;
        }
        if (null !== $this->discountAmount) {
            $res['discount_amount'] = null !== $this->discountAmount ? $this->discountAmount->toMap() : null;
        }
        if (null !== $this->highPrecisionDiscountAmount) {
            $res['high_precision_discount_amount'] = $this->highPrecisionDiscountAmount;
        }
        if (null !== $this->adjustAmount) {
            $res['adjust_amount'] = null !== $this->adjustAmount ? $this->adjustAmount->toMap() : null;
        }
        if (null !== $this->receivedAmount) {
            $res['received_amount'] = null !== $this->receivedAmount ? $this->receivedAmount->toMap() : null;
        }
        if (null !== $this->accountReceivableDate) {
            $res['account_receivable_date'] = $this->accountReceivableDate;
        }
        if (null !== $this->instanceMonthlyBillId) {
            $res['instance_monthly_bill_id'] = $this->instanceMonthlyBillId;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }
        if (null !== $this->unsettledAmount) {
            $res['unsettled_amount'] = null !== $this->unsettledAmount ? $this->unsettledAmount->toMap() : null;
        }
        if (null !== $this->totalDiscountAmount) {
            $res['total_discount_amount'] = null !== $this->totalDiscountAmount ? $this->totalDiscountAmount->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InstanceMonthlyBillVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['product_category'])){
            $model->productCategory = $map['product_category'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['charge_type'])){
            $model->chargeType = $map['charge_type'];
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        if(isset($map['bill_month'])){
            $model->billMonth = $map['bill_month'];
        }
        if(isset($map['bill_amount'])){
            $model->billAmount = MultiCurrencyMoney::fromMap($map['bill_amount']);
        }
        if(isset($map['coupon_amount'])){
            $model->couponAmount = MultiCurrencyMoney::fromMap($map['coupon_amount']);
        }
        if(isset($map['high_precision_coupon_amount'])){
            $model->highPrecisionCouponAmount = $map['high_precision_coupon_amount'];
        }
        if(isset($map['discount_amount'])){
            $model->discountAmount = MultiCurrencyMoney::fromMap($map['discount_amount']);
        }
        if(isset($map['high_precision_discount_amount'])){
            $model->highPrecisionDiscountAmount = $map['high_precision_discount_amount'];
        }
        if(isset($map['adjust_amount'])){
            $model->adjustAmount = MultiCurrencyMoney::fromMap($map['adjust_amount']);
        }
        if(isset($map['received_amount'])){
            $model->receivedAmount = MultiCurrencyMoney::fromMap($map['received_amount']);
        }
        if(isset($map['account_receivable_date'])){
            $model->accountReceivableDate = $map['account_receivable_date'];
        }
        if(isset($map['instance_monthly_bill_id'])){
            $model->instanceMonthlyBillId = $map['instance_monthly_bill_id'];
        }
        if(isset($map['pay_channel'])){
            $model->payChannel = $map['pay_channel'];
        }
        if(isset($map['contract_id'])){
            $model->contractId = $map['contract_id'];
        }
        if(isset($map['extend_info'])){
            $model->extendInfo = $map['extend_info'];
        }
        if(isset($map['unsettled_amount'])){
            $model->unsettledAmount = MultiCurrencyMoney::fromMap($map['unsettled_amount']);
        }
        if(isset($map['total_discount_amount'])){
            $model->totalDiscountAmount = MultiCurrencyMoney::fromMap($map['total_discount_amount']);
        }
        return $model;
    }
    // 金融云租户id
    /**
     * @example 2088101118131245
     * @var string
     */
    public $tenantId;

    // 产品类别@ProductServiceEnum
    /**
     * @example MONITOR
     * @var string
     */
    public $productCategory;

    // 产品名称
    /**
     * @example test
     * @var string
     */
    public $productName;

    // 付费类型
    /**
     * @example AFTER_PAY
     * @var string
     */
    public $chargeType;

    // 实例id
    /**
     * @example ASXASDAZAZ
     * @var string
     */
    public $instanceId;

    // 账单月份
    /**
     * @example yyyyMM(202201)
     * @var string
     */
    public $billMonth;

    // 应收金额(不包含优惠券和折扣)
    /**
     * @example 
     * @var MultiCurrencyMoney
     */
    public $billAmount;

    // 优惠券抵扣金额
    /**
     * @example 100.10
     * @var MultiCurrencyMoney
     */
    public $couponAmount;

    // 高精度优惠券金额
    /**
     * @example 1.01
     * @var string
     */
    public $highPrecisionCouponAmount;

    // 折扣金额
    /**
     * @example 11.01
     * @var MultiCurrencyMoney
     */
    public $discountAmount;

    // 高精度折扣金额
    /**
     * @example 1.01
     * @var string
     */
    public $highPrecisionDiscountAmount;

    // 调账金额
    /**
     * @example 1.01
     * @var MultiCurrencyMoney
     */
    public $adjustAmount;

    // 已收金额
    /**
     * @example 1.01
     * @var MultiCurrencyMoney
     */
    public $receivedAmount;

    // 账单应收日期
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $accountReceivableDate;

    // 月账单号
    /**
     * @example 123123
     * @var string
     */
    public $instanceMonthlyBillId;

    // 支付渠道
    /**
     * @example test
     * @var string
     */
    public $payChannel;

    // 合同ID
    /**
     * @example 123123
     * @var string
     */
    public $contractId;

    // map的json串
    /**
     * @example {"test":"tets"}
     * @var string
     */
    public $extendInfo;

    // 未结清金额
    /**
     * @example 
     * @var MultiCurrencyMoney
     */
    public $unsettledAmount;

    // 优惠金额
    /**
     * @example 
     * @var MultiCurrencyMoney
     */
    public $totalDiscountAmount;

}
