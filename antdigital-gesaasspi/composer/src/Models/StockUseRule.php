<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class StockUseRule extends Model
{
    // 【发放总上限】 最大发券数
    /**
     * @example 100
     *
     * @var int
     */
    public $maxCoupons;

    // 【总预算】 总消耗金额，单位：分。
    /**
     * @example 5000
     *
     * @var int
     */
    public $maxAmount;

    // 【单天发放上限金额】 单天最高消耗金额，单位：分。
    /**
     * @example 400
     *
     * @var int
     */
    public $maxAmountByDay;

    // 【固定面额批次特定信息】 固定面额发券或消费金批次特定信息。
    /**
     * @example {           "coupon_amount" : 100,           "transaction_minimum" : 100         }
     *
     * @var FixedNormalCoupon
     */
    public $fixedNormalCoupon;

    // 【单个用户可领个数】 单个用户可领个数
    /**
     * @example 3
     *
     * @var int
     */
    public $maxCouponsPerUser;

    // 【券或消费金类型】 券或消费金类型
    // 枚举值：
    // NORMAL：满减券
    // CUT_TO：减至券
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $couponType;

    // 【订单优惠标记】 订单优惠标记 (该字段暂未开放返回)
    // 特殊规则：单个优惠标记的字符长度为【1，128】,条目个数限制为【1，50】。
    /**
     * @example [           "123456"         ]
     *
     * @var string[]
     */
    public $goodsTag;

    // 【指定支付模式】默认不限制(该字段暂未开放返回)，枚举值：
    // 可选取值
    // MICROAPP:  小程序支付
    // APPPAY:  APP支付
    // PPAY:  免密支付
    // CARD:  刷卡支付
    // FACE:  人脸支付
    // OTHER:  其他支付，公众号、扫码等
    /**
     * @example [           "MICROAPP"         ]
     *
     * @var string[]
     */
    public $tradeType;

    // 【是否可叠加其他优惠】 枚举值：
    // true：是
    // false：否
    /**
     * @example true
     *
     * @var bool
     */
    public $combineUse;

    // 【固定折扣特定信息】
    /**
     * @example {           "discount_amount_max" : 100,           "discount_percent" : 88,      "transaction_minimum" : 100         }
     *
     * @var FixedDiscountCoupon
     */
    public $fixedDiscountCoupon;
    protected $_name = [
        'maxCoupons'          => 'max_coupons',
        'maxAmount'           => 'max_amount',
        'maxAmountByDay'      => 'max_amount_by_day',
        'fixedNormalCoupon'   => 'fixed_normal_coupon',
        'maxCouponsPerUser'   => 'max_coupons_per_user',
        'couponType'          => 'coupon_type',
        'goodsTag'            => 'goods_tag',
        'tradeType'           => 'trade_type',
        'combineUse'          => 'combine_use',
        'fixedDiscountCoupon' => 'fixed_discount_coupon',
    ];

    public function validate()
    {
        Model::validateRequired('maxCoupons', $this->maxCoupons, true);
        Model::validateRequired('maxAmount', $this->maxAmount, true);
        Model::validateRequired('maxAmountByDay', $this->maxAmountByDay, true);
        Model::validateRequired('fixedNormalCoupon', $this->fixedNormalCoupon, true);
        Model::validateRequired('maxCouponsPerUser', $this->maxCouponsPerUser, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->maxCoupons) {
            $res['max_coupons'] = $this->maxCoupons;
        }
        if (null !== $this->maxAmount) {
            $res['max_amount'] = $this->maxAmount;
        }
        if (null !== $this->maxAmountByDay) {
            $res['max_amount_by_day'] = $this->maxAmountByDay;
        }
        if (null !== $this->fixedNormalCoupon) {
            $res['fixed_normal_coupon'] = null !== $this->fixedNormalCoupon ? $this->fixedNormalCoupon->toMap() : null;
        }
        if (null !== $this->maxCouponsPerUser) {
            $res['max_coupons_per_user'] = $this->maxCouponsPerUser;
        }
        if (null !== $this->couponType) {
            $res['coupon_type'] = $this->couponType;
        }
        if (null !== $this->goodsTag) {
            $res['goods_tag'] = $this->goodsTag;
        }
        if (null !== $this->tradeType) {
            $res['trade_type'] = $this->tradeType;
        }
        if (null !== $this->combineUse) {
            $res['combine_use'] = $this->combineUse;
        }
        if (null !== $this->fixedDiscountCoupon) {
            $res['fixed_discount_coupon'] = null !== $this->fixedDiscountCoupon ? $this->fixedDiscountCoupon->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StockUseRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['max_coupons'])) {
            $model->maxCoupons = $map['max_coupons'];
        }
        if (isset($map['max_amount'])) {
            $model->maxAmount = $map['max_amount'];
        }
        if (isset($map['max_amount_by_day'])) {
            $model->maxAmountByDay = $map['max_amount_by_day'];
        }
        if (isset($map['fixed_normal_coupon'])) {
            $model->fixedNormalCoupon = FixedNormalCoupon::fromMap($map['fixed_normal_coupon']);
        }
        if (isset($map['max_coupons_per_user'])) {
            $model->maxCouponsPerUser = $map['max_coupons_per_user'];
        }
        if (isset($map['coupon_type'])) {
            $model->couponType = $map['coupon_type'];
        }
        if (isset($map['goods_tag'])) {
            if (!empty($map['goods_tag'])) {
                $model->goodsTag = $map['goods_tag'];
            }
        }
        if (isset($map['trade_type'])) {
            if (!empty($map['trade_type'])) {
                $model->tradeType = $map['trade_type'];
            }
        }
        if (isset($map['combine_use'])) {
            $model->combineUse = $map['combine_use'];
        }
        if (isset($map['fixed_discount_coupon'])) {
            $model->fixedDiscountCoupon = FixedDiscountCoupon::fromMap($map['fixed_discount_coupon']);
        }

        return $model;
    }
}
