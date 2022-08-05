<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class InsuranceRecordModel extends Model
{
    // 保司编码
    /**
     * @example test
     *
     * @var string
     */
    public $mechanismCode;

    // 保单号
    /**
     * @example test
     *
     * @var string
     */
    public $policyNo;

    // 保险产品SKU
    /**
     * @example test
     *
     * @var string
     */
    public $thirdPartSku;

    // 保司机构名称
    /**
     * @example test
     *
     * @var string
     */
    public $mechanismName;

    // 保险类型
    /**
     * @example test
     *
     * @var string
     */
    public $insuranceType;

    // 用户ID，天猫uid
    /**
     * @example test
     *
     * @var string
     */
    public $sourceUid;

    // 渠道来源 TIANMAO（天猫）
    /**
     * @example test
     *
     * @var string
     */
    public $source;

    // 用户类型 PERSON
    /**
     * @example test
     *
     * @var string
     */
    public $userType;

    // 扩展信息 （保单附件路径）
    /**
     * @example test
     *
     * @var string
     */
    public $extend;

    // 保单生效时间
    /**
     * @example test
     *
     * @var string
     */
    public $policyEffectTime;

    // 保单失效时间
    /**
     * @example test
     *
     * @var string
     */
    public $policyInvalidTime;

    // 订单总金额 单位为分
    /**
     * @example test
     *
     * @var int
     */
    public $policyTotalAmount;

    // 保费支付日期
    /**
     * @example test
     *
     * @var string
     */
    public $policyPayDate;

    // 保单支付总期数
    /**
     * @example test
     *
     * @var int
     */
    public $policyTotalStage;

    // 每期支付金额
    /**
     * @example test
     *
     * @var int
     */
    public $policyStageAverAmount;

    // 保单已支付期数
    /**
     * @example test
     *
     * @var int
     */
    public $policyPaidStage;

    // 订单时间
    /**
     * @example test
     *
     * @var string
     */
    public $orderTime;

    // 活动码 赠险/商业险
    /**
     * @example test
     *
     * @var string
     */
    public $activityCode;

    // 授权类型 0 非授权 1 授权
    /**
     * @example test
     *
     * @var int
     */
    public $authorizationType;
    protected $_name = [
        'mechanismCode'         => 'mechanism_code',
        'policyNo'              => 'policy_no',
        'thirdPartSku'          => 'third_part_sku',
        'mechanismName'         => 'mechanism_name',
        'insuranceType'         => 'insurance_type',
        'sourceUid'             => 'source_uid',
        'source'                => 'source',
        'userType'              => 'user_type',
        'extend'                => 'extend',
        'policyEffectTime'      => 'policy_effect_time',
        'policyInvalidTime'     => 'policy_invalid_time',
        'policyTotalAmount'     => 'policy_total_amount',
        'policyPayDate'         => 'policy_pay_date',
        'policyTotalStage'      => 'policy_total_stage',
        'policyStageAverAmount' => 'policy_stage_aver_amount',
        'policyPaidStage'       => 'policy_paid_stage',
        'orderTime'             => 'order_time',
        'activityCode'          => 'activity_code',
        'authorizationType'     => 'authorization_type',
    ];

    public function validate()
    {
        Model::validateRequired('mechanismCode', $this->mechanismCode, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('insuranceType', $this->insuranceType, true);
        Model::validateRequired('sourceUid', $this->sourceUid, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('policyEffectTime', $this->policyEffectTime, true);
        Model::validateRequired('policyInvalidTime', $this->policyInvalidTime, true);
        Model::validateRequired('policyTotalAmount', $this->policyTotalAmount, true);
        Model::validateRequired('policyPayDate', $this->policyPayDate, true);
        Model::validateRequired('policyTotalStage', $this->policyTotalStage, true);
        Model::validateRequired('orderTime', $this->orderTime, true);
        Model::validateRequired('authorizationType', $this->authorizationType, true);
        Model::validatePattern('policyEffectTime', $this->policyEffectTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('policyInvalidTime', $this->policyInvalidTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('policyPayDate', $this->policyPayDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('orderTime', $this->orderTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mechanismCode) {
            $res['mechanism_code'] = $this->mechanismCode;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->thirdPartSku) {
            $res['third_part_sku'] = $this->thirdPartSku;
        }
        if (null !== $this->mechanismName) {
            $res['mechanism_name'] = $this->mechanismName;
        }
        if (null !== $this->insuranceType) {
            $res['insurance_type'] = $this->insuranceType;
        }
        if (null !== $this->sourceUid) {
            $res['source_uid'] = $this->sourceUid;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->extend) {
            $res['extend'] = $this->extend;
        }
        if (null !== $this->policyEffectTime) {
            $res['policy_effect_time'] = $this->policyEffectTime;
        }
        if (null !== $this->policyInvalidTime) {
            $res['policy_invalid_time'] = $this->policyInvalidTime;
        }
        if (null !== $this->policyTotalAmount) {
            $res['policy_total_amount'] = $this->policyTotalAmount;
        }
        if (null !== $this->policyPayDate) {
            $res['policy_pay_date'] = $this->policyPayDate;
        }
        if (null !== $this->policyTotalStage) {
            $res['policy_total_stage'] = $this->policyTotalStage;
        }
        if (null !== $this->policyStageAverAmount) {
            $res['policy_stage_aver_amount'] = $this->policyStageAverAmount;
        }
        if (null !== $this->policyPaidStage) {
            $res['policy_paid_stage'] = $this->policyPaidStage;
        }
        if (null !== $this->orderTime) {
            $res['order_time'] = $this->orderTime;
        }
        if (null !== $this->activityCode) {
            $res['activity_code'] = $this->activityCode;
        }
        if (null !== $this->authorizationType) {
            $res['authorization_type'] = $this->authorizationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsuranceRecordModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mechanism_code'])) {
            $model->mechanismCode = $map['mechanism_code'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['third_part_sku'])) {
            $model->thirdPartSku = $map['third_part_sku'];
        }
        if (isset($map['mechanism_name'])) {
            $model->mechanismName = $map['mechanism_name'];
        }
        if (isset($map['insurance_type'])) {
            $model->insuranceType = $map['insurance_type'];
        }
        if (isset($map['source_uid'])) {
            $model->sourceUid = $map['source_uid'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['extend'])) {
            $model->extend = $map['extend'];
        }
        if (isset($map['policy_effect_time'])) {
            $model->policyEffectTime = $map['policy_effect_time'];
        }
        if (isset($map['policy_invalid_time'])) {
            $model->policyInvalidTime = $map['policy_invalid_time'];
        }
        if (isset($map['policy_total_amount'])) {
            $model->policyTotalAmount = $map['policy_total_amount'];
        }
        if (isset($map['policy_pay_date'])) {
            $model->policyPayDate = $map['policy_pay_date'];
        }
        if (isset($map['policy_total_stage'])) {
            $model->policyTotalStage = $map['policy_total_stage'];
        }
        if (isset($map['policy_stage_aver_amount'])) {
            $model->policyStageAverAmount = $map['policy_stage_aver_amount'];
        }
        if (isset($map['policy_paid_stage'])) {
            $model->policyPaidStage = $map['policy_paid_stage'];
        }
        if (isset($map['order_time'])) {
            $model->orderTime = $map['order_time'];
        }
        if (isset($map['activity_code'])) {
            $model->activityCode = $map['activity_code'];
        }
        if (isset($map['authorization_type'])) {
            $model->authorizationType = $map['authorization_type'];
        }

        return $model;
    }
}
