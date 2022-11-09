<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_7257696016e54ac8a1e0ed2d532c3c09\Models;

use AlibabaCloud\Tea\Model;

class OperateAntchainBbpInsuranceRequest extends Model
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
    public $thirdpartSku;

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
    public $userPhonenumber;

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

    // 订单总金额 BigDecimal
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

    // 每一期保费金额BigDecimal
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

    // 赔付单号(对于赔付操作来说是必填项)
    /**
     * @var string
     */
    public $claimOrderNo;

    // 理赔申请时间 理赔操作必填
    /**
     * @var int
     */
    public $claimApplyTime;

    // 理赔赔付时间 理赔操作必填
    /**
     * @var int
     */
    public $claimPayTime;

    // 理赔申请金额BigDecimal，单位元，保留小数点两位  理赔操作必填
    /**
     * @var int
     */
    public $claimApplyAmount;

    // 理赔金额BigDecimal，理赔操作必填
    /**
     * @var int
     */
    public $claimAmount;

    // 授权列表
    /**
     * @var AuthorizeRecordsPairs[]
     */
    public $authorizeRecords;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'mechanismCode'           => 'mechanism_code',
        'policyEncryptionContext' => 'policy_encryption_context',
        'policyNo'                => 'policy_no',
        'thirdpartSku'            => 'thirdpart_sku',
        'mechanismName'           => 'mechanism_name',
        'insuranceType'           => 'insurance_type',
        'sourceUid'               => 'source_uid',
        'source'                  => 'source',
        'userName'                => 'user_name',
        'userType'                => 'user_type',
        'userPhonenumber'         => 'user_phonenumber',
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
        'claimOrderNo'            => 'claim_order_no',
        'claimApplyTime'          => 'claim_apply_time',
        'claimPayTime'            => 'claim_pay_time',
        'claimApplyAmount'        => 'claim_apply_amount',
        'claimAmount'             => 'claim_amount',
        'authorizeRecords'        => 'authorize_records',
    ];

    public function validate()
    {
        Model::validateRequired('mechanismCode', $this->mechanismCode, true);
        Model::validateRequired('policyEncryptionContext', $this->policyEncryptionContext, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('thirdpartSku', $this->thirdpartSku, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('policyEffectTime', $this->policyEffectTime, true);
        Model::validateRequired('policyInvalidTime', $this->policyInvalidTime, true);
        Model::validateRequired('policyTotalAmount', $this->policyTotalAmount, true);
        Model::validateRequired('policyTotalStage', $this->policyTotalStage, true);
        Model::validateRequired('policyPayDate', $this->policyPayDate, true);
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
        if (null !== $this->thirdpartSku) {
            $res['thirdpart_sku'] = $this->thirdpartSku;
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
        if (null !== $this->userPhonenumber) {
            $res['user_phonenumber'] = $this->userPhonenumber;
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
        if (null !== $this->claimOrderNo) {
            $res['claim_order_no'] = $this->claimOrderNo;
        }
        if (null !== $this->claimApplyTime) {
            $res['claim_apply_time'] = $this->claimApplyTime;
        }
        if (null !== $this->claimPayTime) {
            $res['claim_pay_time'] = $this->claimPayTime;
        }
        if (null !== $this->claimApplyAmount) {
            $res['claim_apply_amount'] = $this->claimApplyAmount;
        }
        if (null !== $this->claimAmount) {
            $res['claim_amount'] = $this->claimAmount;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateAntchainBbpInsuranceRequest
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
        if (isset($map['thirdpart_sku'])) {
            $model->thirdpartSku = $map['thirdpart_sku'];
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
        if (isset($map['user_phonenumber'])) {
            $model->userPhonenumber = $map['user_phonenumber'];
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
        if (isset($map['claim_order_no'])) {
            $model->claimOrderNo = $map['claim_order_no'];
        }
        if (isset($map['claim_apply_time'])) {
            $model->claimApplyTime = $map['claim_apply_time'];
        }
        if (isset($map['claim_pay_time'])) {
            $model->claimPayTime = $map['claim_pay_time'];
        }
        if (isset($map['claim_apply_amount'])) {
            $model->claimApplyAmount = $map['claim_apply_amount'];
        }
        if (isset($map['claim_amount'])) {
            $model->claimAmount = $map['claim_amount'];
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

        return $model;
    }
}
