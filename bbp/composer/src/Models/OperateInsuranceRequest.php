<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class OperateInsuranceRequest extends Model
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

    // 保司编码
    /**
     * @var string
     */
    public $mechanismCode;

    // 保单加密信息
    /**
     * @var string
     */
    public $policyEncryptionContext;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;

    // 保险产品SKU
    /**
     * @var string
     */
    public $thirdPartSku;

    // 保险公司名称
    /**
     * @var string
     */
    public $mechanismName;

    // 保单种类，险种
    /**
     * @var string
     */
    public $insuranceType;

    // 来源uid，此处指天猫id
    /**
     * @var string
     */
    public $sourceUid;

    // 订单来源
    /**
     * @var string
     */
    public $source;

    // 投保人
    /**
     * @var string
     */
    public $userName;

    // 投保人类型  自然人/公司
    /**
     * @var string
     */
    public $userType;

    // 投保人电话号码
    /**
     * @var string
     */
    public $userPhoneNumber;

    // 投保人证件号
    /**
     * @var string
     */
    public $userCertNo;

    // 拓展信息
    /**
     * @var string
     */
    public $extend;

    // 保单生效时间（毫秒值）
    /**
     * @var int
     */
    public $policyEffectTime;

    // 保单失效时间（毫秒值）
    /**
     * @var int
     */
    public $policyInvalidTime;

    // 订单总金额 整型，以分为单位，50000分 = 500.00元
    /**
     * @var int
     */
    public $policyTotalAmount;

    // 订单总期数（一次性付款用1）
    /**
     * @var int
     */
    public $policyTotalStage;

    // 保费支付日期（毫秒值）
    /**
     * @var int
     */
    public $policyPayDate;

    // 已支付保费期数（1代表1期）
    /**
     * @var int
     */
    public $policyPaidStage;

    // 每一期保费金额，整型，以分为单位，50000分 = 500.00元
    /**
     * @var int
     */
    public $policyStageAverAmount;

    // 订单时间（毫秒值）
    /**
     * @var int
     */
    public $orderTime;

    // 操作类型
    // 下单 支付 理赔 退单
    /**
     * @var string
     */
    public $operation;

    // 授权列表
    /**
     * @var AuthorizeRecordsPairs[]
     */
    public $authorizeRecords;

    // 活动码/赠险码
    /**
     * @var string
     */
    public $activityCode;

    // 授权类型 1-已授权 2-未授权
    /**
     * @var int
     */
    public $authorizationType;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'mechanismCode'           => 'mechanism_code',
        'policyEncryptionContext' => 'policy_encryption_context',
        'policyNo'                => 'policy_no',
        'thirdPartSku'            => 'third_part_sku',
        'mechanismName'           => 'mechanism_name',
        'insuranceType'           => 'insurance_type',
        'sourceUid'               => 'source_uid',
        'source'                  => 'source',
        'userName'                => 'user_name',
        'userType'                => 'user_type',
        'userPhoneNumber'         => 'user_phone_number',
        'userCertNo'              => 'user_cert_no',
        'extend'                  => 'extend',
        'policyEffectTime'        => 'policy_effect_time',
        'policyInvalidTime'       => 'policy_invalid_time',
        'policyTotalAmount'       => 'policy_total_amount',
        'policyTotalStage'        => 'policy_total_stage',
        'policyPayDate'           => 'policy_pay_date',
        'policyPaidStage'         => 'policy_paid_stage',
        'policyStageAverAmount'   => 'policy_stage_aver_amount',
        'orderTime'               => 'order_time',
        'operation'               => 'operation',
        'authorizeRecords'        => 'authorize_records',
        'activityCode'            => 'activity_code',
        'authorizationType'       => 'authorization_type',
    ];

    public function validate()
    {
        Model::validateRequired('insuranceType', $this->insuranceType, true);
        Model::validateRequired('sourceUid', $this->sourceUid, true);
        Model::validateRequired('authorizationType', $this->authorizationType, true);
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
        if (null !== $this->mechanismCode) {
            $res['mechanism_code'] = $this->mechanismCode;
        }
        if (null !== $this->policyEncryptionContext) {
            $res['policy_encryption_context'] = $this->policyEncryptionContext;
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
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->userPhoneNumber) {
            $res['user_phone_number'] = $this->userPhoneNumber;
        }
        if (null !== $this->userCertNo) {
            $res['user_cert_no'] = $this->userCertNo;
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
        if (null !== $this->policyTotalStage) {
            $res['policy_total_stage'] = $this->policyTotalStage;
        }
        if (null !== $this->policyPayDate) {
            $res['policy_pay_date'] = $this->policyPayDate;
        }
        if (null !== $this->policyPaidStage) {
            $res['policy_paid_stage'] = $this->policyPaidStage;
        }
        if (null !== $this->policyStageAverAmount) {
            $res['policy_stage_aver_amount'] = $this->policyStageAverAmount;
        }
        if (null !== $this->orderTime) {
            $res['order_time'] = $this->orderTime;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->authorizeRecords) {
            $res['authorize_records'] = [];
            if (null !== $this->authorizeRecords && \is_array($this->authorizeRecords)) {
                $n = 0;
                foreach ($this->authorizeRecords as $item) {
                    $res['authorize_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
     * @return OperateInsuranceRequest
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
        if (isset($map['mechanism_code'])) {
            $model->mechanismCode = $map['mechanism_code'];
        }
        if (isset($map['policy_encryption_context'])) {
            $model->policyEncryptionContext = $map['policy_encryption_context'];
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
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['user_phone_number'])) {
            $model->userPhoneNumber = $map['user_phone_number'];
        }
        if (isset($map['user_cert_no'])) {
            $model->userCertNo = $map['user_cert_no'];
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
        if (isset($map['policy_total_stage'])) {
            $model->policyTotalStage = $map['policy_total_stage'];
        }
        if (isset($map['policy_pay_date'])) {
            $model->policyPayDate = $map['policy_pay_date'];
        }
        if (isset($map['policy_paid_stage'])) {
            $model->policyPaidStage = $map['policy_paid_stage'];
        }
        if (isset($map['policy_stage_aver_amount'])) {
            $model->policyStageAverAmount = $map['policy_stage_aver_amount'];
        }
        if (isset($map['order_time'])) {
            $model->orderTime = $map['order_time'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['authorize_records'])) {
            if (!empty($map['authorize_records'])) {
                $model->authorizeRecords = [];
                $n                       = 0;
                foreach ($map['authorize_records'] as $item) {
                    $model->authorizeRecords[$n++] = null !== $item ? AuthorizeRecordsPairs::fromMap($item) : $item;
                }
            }
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
