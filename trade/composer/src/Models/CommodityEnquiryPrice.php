<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CommodityEnquiryPrice extends Model
{
    // 商品主数据编码
    /**
     * @example KXSFFM00264687
     *
     * @var string
     */
    public $commodityCode;

    // 商品名称
    /**
     * @example 测试商品
     *
     * @var string
     */
    public $commodityName;

    // 预付-支付金额
    /**
     * @example 100.00
     *
     * @var string
     */
    public $payAmount;

    // 预付费-原始金额
    /**
     * @example 200.00
     *
     * @var string
     */
    public $originalAmount;

    // 预付费-折扣金额
    /**
     * @example 100.00
     *
     * @var string
     */
    public $discountAmount;

    // 预付费-优惠券抵扣金额
    /**
     * @example 0.00
     *
     * @var string
     */
    public $couponAmount;

    // 原订购剩余价值，用于变配场景
    /**
     * @example 50.00
     *
     * @var string
     */
    public $subscriptionUnusedAmount;

    // 命中的活动编码
    /**
     * @example a05d8efc-b1c8-42a0-9666-98f419d4e2eb
     *
     * @var string
     */
    public $activityCode;

    // 命中的活动名称
    /**
     * @example 测试折扣活动
     *
     * @var string
     */
    public $activityName;

    // 命中的定价计划ID
    /**
     * @example 1000
     *
     * @var int
     */
    public $pricePlanId;

    // 命中的定价约束ID
    /**
     * @example 2000
     *
     * @var int
     */
    public $priceConstraintId;

    // 币种，元：CNY
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;

    // 基于剩余价值变配场景下，预测的支付金额正常的最小订购周期
    /**
     * @example
     *
     * @var OrderDuration
     */
    public $minDurationOfValidPayAmount;

    // 预付费-折扣率
    /**
     * @example 0.75
     *
     * @var string
     */
    public $discountRate;

    // 原始BD权限价金额，白名单商品会返回此价格
    /**
     * @example 160.00
     *
     * @var string
     */
    public $originalBdAmount;

    // 原始成本价金额，白名单商品会返回此价格
    /**
     * @example 100.00
     *
     * @var string
     */
    public $originalCostAmount;
    protected $_name = [
        'commodityCode'               => 'commodity_code',
        'commodityName'               => 'commodity_name',
        'payAmount'                   => 'pay_amount',
        'originalAmount'              => 'original_amount',
        'discountAmount'              => 'discount_amount',
        'couponAmount'                => 'coupon_amount',
        'subscriptionUnusedAmount'    => 'subscription_unused_amount',
        'activityCode'                => 'activity_code',
        'activityName'                => 'activity_name',
        'pricePlanId'                 => 'price_plan_id',
        'priceConstraintId'           => 'price_constraint_id',
        'currency'                    => 'currency',
        'minDurationOfValidPayAmount' => 'min_duration_of_valid_pay_amount',
        'discountRate'                => 'discount_rate',
        'originalBdAmount'            => 'original_bd_amount',
        'originalCostAmount'          => 'original_cost_amount',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
        Model::validateRequired('payAmount', $this->payAmount, true);
        Model::validateRequired('originalAmount', $this->originalAmount, true);
        Model::validateRequired('discountAmount', $this->discountAmount, true);
        Model::validateRequired('couponAmount', $this->couponAmount, true);
        Model::validateRequired('subscriptionUnusedAmount', $this->subscriptionUnusedAmount, true);
        Model::validateRequired('activityCode', $this->activityCode, true);
        Model::validateRequired('activityName', $this->activityName, true);
        Model::validateRequired('pricePlanId', $this->pricePlanId, true);
        Model::validateRequired('priceConstraintId', $this->priceConstraintId, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('discountRate', $this->discountRate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->commodityName) {
            $res['commodity_name'] = $this->commodityName;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->originalAmount) {
            $res['original_amount'] = $this->originalAmount;
        }
        if (null !== $this->discountAmount) {
            $res['discount_amount'] = $this->discountAmount;
        }
        if (null !== $this->couponAmount) {
            $res['coupon_amount'] = $this->couponAmount;
        }
        if (null !== $this->subscriptionUnusedAmount) {
            $res['subscription_unused_amount'] = $this->subscriptionUnusedAmount;
        }
        if (null !== $this->activityCode) {
            $res['activity_code'] = $this->activityCode;
        }
        if (null !== $this->activityName) {
            $res['activity_name'] = $this->activityName;
        }
        if (null !== $this->pricePlanId) {
            $res['price_plan_id'] = $this->pricePlanId;
        }
        if (null !== $this->priceConstraintId) {
            $res['price_constraint_id'] = $this->priceConstraintId;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->minDurationOfValidPayAmount) {
            $res['min_duration_of_valid_pay_amount'] = null !== $this->minDurationOfValidPayAmount ? $this->minDurationOfValidPayAmount->toMap() : null;
        }
        if (null !== $this->discountRate) {
            $res['discount_rate'] = $this->discountRate;
        }
        if (null !== $this->originalBdAmount) {
            $res['original_bd_amount'] = $this->originalBdAmount;
        }
        if (null !== $this->originalCostAmount) {
            $res['original_cost_amount'] = $this->originalCostAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommodityEnquiryPrice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['commodity_name'])) {
            $model->commodityName = $map['commodity_name'];
        }
        if (isset($map['pay_amount'])) {
            $model->payAmount = $map['pay_amount'];
        }
        if (isset($map['original_amount'])) {
            $model->originalAmount = $map['original_amount'];
        }
        if (isset($map['discount_amount'])) {
            $model->discountAmount = $map['discount_amount'];
        }
        if (isset($map['coupon_amount'])) {
            $model->couponAmount = $map['coupon_amount'];
        }
        if (isset($map['subscription_unused_amount'])) {
            $model->subscriptionUnusedAmount = $map['subscription_unused_amount'];
        }
        if (isset($map['activity_code'])) {
            $model->activityCode = $map['activity_code'];
        }
        if (isset($map['activity_name'])) {
            $model->activityName = $map['activity_name'];
        }
        if (isset($map['price_plan_id'])) {
            $model->pricePlanId = $map['price_plan_id'];
        }
        if (isset($map['price_constraint_id'])) {
            $model->priceConstraintId = $map['price_constraint_id'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['min_duration_of_valid_pay_amount'])) {
            $model->minDurationOfValidPayAmount = OrderDuration::fromMap($map['min_duration_of_valid_pay_amount']);
        }
        if (isset($map['discount_rate'])) {
            $model->discountRate = $map['discount_rate'];
        }
        if (isset($map['original_bd_amount'])) {
            $model->originalBdAmount = $map['original_bd_amount'];
        }
        if (isset($map['original_cost_amount'])) {
            $model->originalCostAmount = $map['original_cost_amount'];
        }

        return $model;
    }
}
