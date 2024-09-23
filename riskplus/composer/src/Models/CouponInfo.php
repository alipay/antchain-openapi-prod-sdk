<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CouponInfo extends Model
{
    // 优惠券Id
    /**
     * @example 123
     *
     * @var string
     */
    public $couponId;

    // 优惠券名称
    /**
     * @example 折扣券
     *
     * @var string
     */
    public $couponName;

    // 优惠券状态
    // unUsed-未使用
    // Used-已使用
    // Expired-过期
    /**
     * @example 0
     *
     * @var string
     */
    public $status;

    // 使用场景
    // 01-提款使用
    // 02-还款使用
    /**
     * @example 01
     *
     * @var string
     */
    public $useCondition;

    // 优惠码
    /**
     * @example 123
     *
     * @var string
     */
    public $couponCode;

    // 优惠券类型
    // 01-金额优惠
    // 02-天数优惠
    // 03-折扣优惠
    // 04-期数优惠
    // 05-固定利率
    /**
     * @example 03
     *
     * @var string
     */
    public $couponType;

    // 优惠券面额
    // coupon_type=01 时为优惠金额
    // coupon_type=02 时为减免天数
    // coupon_type=03 时为折扣值（如6 折）
    // coupon_type=04 时为减免期数
    // coupon_type=05 时为折扣值（如 8.88 为利率8.88%）
    /**
     * @example 01
     *
     * @var string
     */
    public $couponValue;

    // 当 coupon_type=01 时，才会有优惠金额
    /**
     * @example 1
     *
     * @var string
     */
    public $couponAmount;

    // 过期时间yyyy-MM-dd HH:mm:ss
    /**
     * @example yyyy-MM-dd HH:mm:ss
     *
     * @var string
     */
    public $expiredTime;

    // 生效时间yyyy-MM-dd HH:mm:ss
    /**
     * @example yyyy-MM-dd HH:mm:ss
     *
     * @var string
     */
    public $effectiveTime;

    // 使用规则
    /**
     * @example 使用规则
     *
     * @var string
     */
    public $useDetail;

    // 贷款最低金额
    /**
     * @example 10
     *
     * @var string
     */
    public $minAmount;

    // 贷款最高金额
    /**
     * @example 100
     *
     * @var string
     */
    public $maxAmount;

    // 最低贷款期数
    /**
     * @example 1
     *
     * @var string
     */
    public $minPeriod;

    // 最高贷款期数
    /**
     * @example 12
     *
     * @var string
     */
    public $maxPeriod;

    // 贷款最低期限天数
    /**
     * @example 30
     *
     * @var string
     */
    public $minDay;

    // 还款方式
    // 1-等额本息
    // 2-等额本金
    // 3-等本等费
    // 4-按期付息到期还本
    // 5-到期一次性还本付息
    // 6-等本等费-总费率
    // 7-等额本息(长期)
    /**
     * @example 1
     *
     * @var string
     */
    public $repaymentMethod;

    // 是否有贷款期数要求
    // 0：否
    // 1：是
    /**
     * @example 0
     *
     * @var string
     */
    public $isPeriodLimit;

    // 贷款期限要求还款条件
    // 01：可提前还款
    // 02：不可提前还款
    // isPeriodLimit=1 && repayCondition=01 代表：有可提前还款锁期
    // isPeriodLimit=1 && repayCondition=02 代表：有不可提前还款锁期
    /**
     * @example 01
     *
     * @var string
     */
    public $repayCondition;

    // 还款场景
    // 01-到期还款
    // 02-即期还款
    /**
     * @example 01
     *
     * @var string
     */
    public $repayWays;

    // 优惠模板Id
    /**
     * @example 123
     *
     * @var string
     */
    public $couponModelNo;

    // 至到期:X年X月X日
    // 0：不是至到期券
    // 1：是至到期券
    /**
     * @example X年X月X日
     *
     * @var string
     */
    public $toMaturity;
    protected $_name = [
        'couponId'        => 'coupon_id',
        'couponName'      => 'coupon_name',
        'status'          => 'status',
        'useCondition'    => 'use_condition',
        'couponCode'      => 'coupon_code',
        'couponType'      => 'coupon_type',
        'couponValue'     => 'coupon_value',
        'couponAmount'    => 'coupon_amount',
        'expiredTime'     => 'expired_time',
        'effectiveTime'   => 'effective_time',
        'useDetail'       => 'use_detail',
        'minAmount'       => 'min_amount',
        'maxAmount'       => 'max_amount',
        'minPeriod'       => 'min_period',
        'maxPeriod'       => 'max_period',
        'minDay'          => 'min_day',
        'repaymentMethod' => 'repayment_method',
        'isPeriodLimit'   => 'is_period_limit',
        'repayCondition'  => 'repay_condition',
        'repayWays'       => 'repay_ways',
        'couponModelNo'   => 'coupon_model_no',
        'toMaturity'      => 'to_maturity',
    ];

    public function validate()
    {
        Model::validateRequired('couponId', $this->couponId, true);
        Model::validateRequired('couponName', $this->couponName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('useCondition', $this->useCondition, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }
        if (null !== $this->couponName) {
            $res['coupon_name'] = $this->couponName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->useCondition) {
            $res['use_condition'] = $this->useCondition;
        }
        if (null !== $this->couponCode) {
            $res['coupon_code'] = $this->couponCode;
        }
        if (null !== $this->couponType) {
            $res['coupon_type'] = $this->couponType;
        }
        if (null !== $this->couponValue) {
            $res['coupon_value'] = $this->couponValue;
        }
        if (null !== $this->couponAmount) {
            $res['coupon_amount'] = $this->couponAmount;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->effectiveTime) {
            $res['effective_time'] = $this->effectiveTime;
        }
        if (null !== $this->useDetail) {
            $res['use_detail'] = $this->useDetail;
        }
        if (null !== $this->minAmount) {
            $res['min_amount'] = $this->minAmount;
        }
        if (null !== $this->maxAmount) {
            $res['max_amount'] = $this->maxAmount;
        }
        if (null !== $this->minPeriod) {
            $res['min_period'] = $this->minPeriod;
        }
        if (null !== $this->maxPeriod) {
            $res['max_period'] = $this->maxPeriod;
        }
        if (null !== $this->minDay) {
            $res['min_day'] = $this->minDay;
        }
        if (null !== $this->repaymentMethod) {
            $res['repayment_method'] = $this->repaymentMethod;
        }
        if (null !== $this->isPeriodLimit) {
            $res['is_period_limit'] = $this->isPeriodLimit;
        }
        if (null !== $this->repayCondition) {
            $res['repay_condition'] = $this->repayCondition;
        }
        if (null !== $this->repayWays) {
            $res['repay_ways'] = $this->repayWays;
        }
        if (null !== $this->couponModelNo) {
            $res['coupon_model_no'] = $this->couponModelNo;
        }
        if (null !== $this->toMaturity) {
            $res['to_maturity'] = $this->toMaturity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CouponInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['coupon_id'])) {
            $model->couponId = $map['coupon_id'];
        }
        if (isset($map['coupon_name'])) {
            $model->couponName = $map['coupon_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['use_condition'])) {
            $model->useCondition = $map['use_condition'];
        }
        if (isset($map['coupon_code'])) {
            $model->couponCode = $map['coupon_code'];
        }
        if (isset($map['coupon_type'])) {
            $model->couponType = $map['coupon_type'];
        }
        if (isset($map['coupon_value'])) {
            $model->couponValue = $map['coupon_value'];
        }
        if (isset($map['coupon_amount'])) {
            $model->couponAmount = $map['coupon_amount'];
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }
        if (isset($map['effective_time'])) {
            $model->effectiveTime = $map['effective_time'];
        }
        if (isset($map['use_detail'])) {
            $model->useDetail = $map['use_detail'];
        }
        if (isset($map['min_amount'])) {
            $model->minAmount = $map['min_amount'];
        }
        if (isset($map['max_amount'])) {
            $model->maxAmount = $map['max_amount'];
        }
        if (isset($map['min_period'])) {
            $model->minPeriod = $map['min_period'];
        }
        if (isset($map['max_period'])) {
            $model->maxPeriod = $map['max_period'];
        }
        if (isset($map['min_day'])) {
            $model->minDay = $map['min_day'];
        }
        if (isset($map['repayment_method'])) {
            $model->repaymentMethod = $map['repayment_method'];
        }
        if (isset($map['is_period_limit'])) {
            $model->isPeriodLimit = $map['is_period_limit'];
        }
        if (isset($map['repay_condition'])) {
            $model->repayCondition = $map['repay_condition'];
        }
        if (isset($map['repay_ways'])) {
            $model->repayWays = $map['repay_ways'];
        }
        if (isset($map['coupon_model_no'])) {
            $model->couponModelNo = $map['coupon_model_no'];
        }
        if (isset($map['to_maturity'])) {
            $model->toMaturity = $map['to_maturity'];
        }

        return $model;
    }
}
