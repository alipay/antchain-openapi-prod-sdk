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
    protected $_name = [
        'commodityCode'     => 'commodity_code',
        'commodityName'     => 'commodity_name',
        'payAmount'         => 'pay_amount',
        'originalAmount'    => 'original_amount',
        'discountAmount'    => 'discount_amount',
        'activityCode'      => 'activity_code',
        'activityName'      => 'activity_name',
        'pricePlanId'       => 'price_plan_id',
        'priceConstraintId' => 'price_constraint_id',
        'currency'          => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
        Model::validateRequired('payAmount', $this->payAmount, true);
        Model::validateRequired('originalAmount', $this->originalAmount, true);
        Model::validateRequired('discountAmount', $this->discountAmount, true);
        Model::validateRequired('activityCode', $this->activityCode, true);
        Model::validateRequired('activityName', $this->activityName, true);
        Model::validateRequired('pricePlanId', $this->pricePlanId, true);
        Model::validateRequired('priceConstraintId', $this->priceConstraintId, true);
        Model::validateRequired('currency', $this->currency, true);
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

        return $model;
    }
}
