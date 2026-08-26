<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\MultiCurrencyMoney;

class ChargeBillVO extends Model {
    protected $_name = [
        'id' => 'id',
        'tenantId' => 'tenant_id',
        'arNo' => 'ar_no',
        'prodCode' => 'prod_code',
        'prodEventCode' => 'prod_event_code',
        'instanceId' => 'instance_id',
        'status' => 'status',
        'amount' => 'amount',
        'discountFee' => 'discount_fee',
        'highPrecisionAmount' => 'high_precision_amount',
        'highPrecisionDiscountFee' => 'high_precision_discount_fee',
        'couponSettleAmount' => 'coupon_settle_amount',
        'highPrecisionCouponSettleAmount' => 'high_precision_coupon_settle_amount',
        'couponId' => 'coupon_id',
        'requireAmount' => 'require_amount',
        'highPrecisionRequireAmount' => 'high_precision_require_amount',
        'gmtFeeStartTime' => 'gmt_fee_start_time',
        'gmtFeeEndTime' => 'gmt_fee_end_time',
        'extendInfo' => 'extend_info',
        'isFlowPackDeducted' => 'is_flow_pack_deducted',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('gmtFeeStartTime', $this->gmtFeeStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtFeeEndTime', $this->gmtFeeEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->arNo) {
            $res['ar_no'] = $this->arNo;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->prodEventCode) {
            $res['prod_event_code'] = $this->prodEventCode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->amount) {
            $res['amount'] = null !== $this->amount ? $this->amount->toMap() : null;
        }
        if (null !== $this->discountFee) {
            $res['discount_fee'] = null !== $this->discountFee ? $this->discountFee->toMap() : null;
        }
        if (null !== $this->highPrecisionAmount) {
            $res['high_precision_amount'] = $this->highPrecisionAmount;
        }
        if (null !== $this->highPrecisionDiscountFee) {
            $res['high_precision_discount_fee'] = $this->highPrecisionDiscountFee;
        }
        if (null !== $this->couponSettleAmount) {
            $res['coupon_settle_amount'] = null !== $this->couponSettleAmount ? $this->couponSettleAmount->toMap() : null;
        }
        if (null !== $this->highPrecisionCouponSettleAmount) {
            $res['high_precision_coupon_settle_amount'] = $this->highPrecisionCouponSettleAmount;
        }
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }
        if (null !== $this->requireAmount) {
            $res['require_amount'] = null !== $this->requireAmount ? $this->requireAmount->toMap() : null;
        }
        if (null !== $this->highPrecisionRequireAmount) {
            $res['high_precision_require_amount'] = $this->highPrecisionRequireAmount;
        }
        if (null !== $this->gmtFeeStartTime) {
            $res['gmt_fee_start_time'] = $this->gmtFeeStartTime;
        }
        if (null !== $this->gmtFeeEndTime) {
            $res['gmt_fee_end_time'] = $this->gmtFeeEndTime;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }
        if (null !== $this->isFlowPackDeducted) {
            $res['is_flow_pack_deducted'] = $this->isFlowPackDeducted;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChargeBillVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['ar_no'])){
            $model->arNo = $map['ar_no'];
        }
        if(isset($map['prod_code'])){
            $model->prodCode = $map['prod_code'];
        }
        if(isset($map['prod_event_code'])){
            $model->prodEventCode = $map['prod_event_code'];
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['amount'])){
            $model->amount = MultiCurrencyMoney::fromMap($map['amount']);
        }
        if(isset($map['discount_fee'])){
            $model->discountFee = MultiCurrencyMoney::fromMap($map['discount_fee']);
        }
        if(isset($map['high_precision_amount'])){
            $model->highPrecisionAmount = $map['high_precision_amount'];
        }
        if(isset($map['high_precision_discount_fee'])){
            $model->highPrecisionDiscountFee = $map['high_precision_discount_fee'];
        }
        if(isset($map['coupon_settle_amount'])){
            $model->couponSettleAmount = MultiCurrencyMoney::fromMap($map['coupon_settle_amount']);
        }
        if(isset($map['high_precision_coupon_settle_amount'])){
            $model->highPrecisionCouponSettleAmount = $map['high_precision_coupon_settle_amount'];
        }
        if(isset($map['coupon_id'])){
            $model->couponId = $map['coupon_id'];
        }
        if(isset($map['require_amount'])){
            $model->requireAmount = MultiCurrencyMoney::fromMap($map['require_amount']);
        }
        if(isset($map['high_precision_require_amount'])){
            $model->highPrecisionRequireAmount = $map['high_precision_require_amount'];
        }
        if(isset($map['gmt_fee_start_time'])){
            $model->gmtFeeStartTime = $map['gmt_fee_start_time'];
        }
        if(isset($map['gmt_fee_end_time'])){
            $model->gmtFeeEndTime = $map['gmt_fee_end_time'];
        }
        if(isset($map['extend_info'])){
            $model->extendInfo = $map['extend_info'];
        }
        if(isset($map['is_flow_pack_deducted'])){
            $model->isFlowPackDeducted = $map['is_flow_pack_deducted'];
        }
        return $model;
    }
    // 主键Id
    /**
     * @example 1
     * @var string
     */
    public $id;

    // 租户Id
    /**
     * @example 2333
     * @var string
     */
    public $tenantId;

    // 合约号
    /**
     * @example dasd
     * @var string
     */
    public $arNo;

    // 资源名称@ProductEnum
    /**
     * @example 资源名称
     * @var string
     */
    public $prodCode;

    // 云产品收费事件码
    /**
     * @example adqd
     * @var string
     */
    public $prodEventCode;

    // 实例id
    /**
     * @example eqw
     * @var string
     */
    public $instanceId;

    // 账单计费状态@ChargeBillStatusEnum
    /**
     * @example INIT
     * @var string
     */
    public $status;

    // 账单金额
    /**
     * @example 11
     * @var MultiCurrencyMoney
     */
    public $amount;

    // 优惠金额
    /**
     * @example 11
     * @var MultiCurrencyMoney
     */
    public $discountFee;

    // 高精度金额
    /**
     * @example 11
     * @var string
     */
    public $highPrecisionAmount;

    // 高精度活动金额
    /**
     * @example 11
     * @var string
     */
    public $highPrecisionDiscountFee;

    // 优惠券抵扣金额
    /**
     * @example 11
     * @var MultiCurrencyMoney
     */
    public $couponSettleAmount;

    // 高精度优惠券抵扣金额
    /**
     * @example 11
     * @var string
     */
    public $highPrecisionCouponSettleAmount;

    // 优惠券id
    /**
     * @example 11
     * @var string
     */
    public $couponId;

    // 应付金额
    /**
     * @example 11
     * @var MultiCurrencyMoney
     */
    public $requireAmount;

    // 高精度应付金额
    /**
     * @example 11
     * @var string
     */
    public $highPrecisionRequireAmount;

    // 账单对应的使用时间区间的开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $gmtFeeStartTime;

    // 账单对应的使用时间区间的结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $gmtFeeEndTime;

    // This property corresponds to db column <tt>extend_info</tt>.
    /**
     * @example JSON
     * @var string
     */
    public $extendInfo;

    // 是否有流量包抵扣
    /**
     * @example true, false
     * @var bool
     */
    public $isFlowPackDeducted;

}
