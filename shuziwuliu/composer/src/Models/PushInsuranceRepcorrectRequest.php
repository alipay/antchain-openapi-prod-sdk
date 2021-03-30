<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PushInsuranceRepcorrectRequest extends Model
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

    // 直保人租户ID
    /**
     * @var string
     */
    public $platformCode;

    // 直保人
    /**
     * @var string
     */
    public $directInsurerName;

    // 批单类型 1:批增 2: 批减
    /**
     * @var string
     */
    public $approvalType;

    // 批单号
    /**
     * @var string
     */
    public $approvalNo;

    // 保单号
    /**
     * @var string
     */
    public $polNo;

    // 共保标志，1:是 0:否
    //
    /**
     * @var string
     */
    public $jointInsuranceLogo;

    // 共保比例（%）
    /**
     * @var string
     */
    public $jointInsuranceRate;

    // 险种代码
    /**
     * @var string
     */
    public $productCode;

    // 险种名称
    //
    /**
     * @var string
     */
    public $productName;

    // 被保险人
    /**
     * @var string
     */
    public $bbrName;

    // 保险起期
    /**
     * @var string
     */
    public $insureStart;

    // 保险止期
    //
    /**
     * @var string
     */
    public $insureEnd;

    // 币种，CNY:人民币, USD:美元，JPY:日元，HKD:港元，EUR:欧元，GBP英镑
    /**
     * @var string
     */
    public $currency;

    // 保额
    /**
     * @var string
     */
    public $insuranceAmount;

    // 批改保费
    /**
     * @var string
     */
    public $correctPremium;

    // 固定保额分出比例（%）
    /**
     * @var string
     */
    public $fixedInsuranceAmountSplitRate;

    // 固定保费分出比例（%）
    /**
     * @var string
     */
    public $fixedPremiumSplitRate;

    // 临分保额分出比例（%）
    /**
     * @var string
     */
    public $facultativeInsuranceAmountSplitRate;

    // 临分保费分出比例（%）
    /**
     * @var string
     */
    public $facultativePremiumSplitRate;

    // 分出保费
    /**
     * @var string
     */
    public $splitPremium;

    // 再保人
    //
    /**
     * @var string
     */
    public $reinsurer;

    // 摊回手续费比例（%）
    /**
     * @var string
     */
    public $amortizeFeeRate;

    // 摊回手续费
    //
    /**
     * @var string
     */
    public $amortizeFee;

    // 再保合同名称
    /**
     * @var string
     */
    public $reinsuranceContractName;

    // 是否有超赔临分，1:是 0:否
    /**
     * @var string
     */
    public $overPayFacultative;

    // 批改原因
    //
    /**
     * @var string
     */
    public $correctReason;

    // 项目名称
    /**
     * @var string
     */
    public $projectName;

    // 接收方租户id
    //
    /**
     * @var string
     */
    public $receiverPlatformId;
    protected $_name = [
        'authToken'                           => 'auth_token',
        'productInstanceId'                   => 'product_instance_id',
        'platformCode'                        => 'platform_code',
        'directInsurerName'                   => 'direct_insurer_name',
        'approvalType'                        => 'approval_type',
        'approvalNo'                          => 'approval_no',
        'polNo'                               => 'pol_no',
        'jointInsuranceLogo'                  => 'joint_insurance_logo',
        'jointInsuranceRate'                  => 'joint_insurance_rate',
        'productCode'                         => 'product_code',
        'productName'                         => 'product_name',
        'bbrName'                             => 'bbr_name',
        'insureStart'                         => 'insure_start',
        'insureEnd'                           => 'insure_end',
        'currency'                            => 'currency',
        'insuranceAmount'                     => 'insurance_amount',
        'correctPremium'                      => 'correct_premium',
        'fixedInsuranceAmountSplitRate'       => 'fixed_insurance_amount_split_rate',
        'fixedPremiumSplitRate'               => 'fixed_premium_split_rate',
        'facultativeInsuranceAmountSplitRate' => 'facultative_insurance_amount_split_rate',
        'facultativePremiumSplitRate'         => 'facultative_premium_split_rate',
        'splitPremium'                        => 'split_premium',
        'reinsurer'                           => 'reinsurer',
        'amortizeFeeRate'                     => 'amortize_fee_rate',
        'amortizeFee'                         => 'amortize_fee',
        'reinsuranceContractName'             => 'reinsurance_contract_name',
        'overPayFacultative'                  => 'over_pay_facultative',
        'correctReason'                       => 'correct_reason',
        'projectName'                         => 'project_name',
        'receiverPlatformId'                  => 'receiver_platform_id',
    ];

    public function validate()
    {
        Model::validateRequired('platformCode', $this->platformCode, true);
        Model::validateRequired('directInsurerName', $this->directInsurerName, true);
        Model::validateRequired('approvalType', $this->approvalType, true);
        Model::validateRequired('approvalNo', $this->approvalNo, true);
        Model::validateRequired('polNo', $this->polNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('bbrName', $this->bbrName, true);
        Model::validateRequired('insureStart', $this->insureStart, true);
        Model::validateRequired('insureEnd', $this->insureEnd, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('correctPremium', $this->correctPremium, true);
        Model::validateRequired('fixedPremiumSplitRate', $this->fixedPremiumSplitRate, true);
        Model::validateRequired('facultativePremiumSplitRate', $this->facultativePremiumSplitRate, true);
        Model::validateRequired('splitPremium', $this->splitPremium, true);
        Model::validateRequired('reinsurer', $this->reinsurer, true);
        Model::validateRequired('amortizeFeeRate', $this->amortizeFeeRate, true);
        Model::validateRequired('amortizeFee', $this->amortizeFee, true);
        Model::validateRequired('receiverPlatformId', $this->receiverPlatformId, true);
        Model::validateMaxLength('platformCode', $this->platformCode, 50);
        Model::validateMaxLength('directInsurerName', $this->directInsurerName, 200);
        Model::validateMaxLength('approvalType', $this->approvalType, 20);
        Model::validateMaxLength('approvalNo', $this->approvalNo, 100);
        Model::validateMaxLength('polNo', $this->polNo, 100);
        Model::validateMaxLength('jointInsuranceLogo', $this->jointInsuranceLogo, 5);
        Model::validateMaxLength('jointInsuranceRate', $this->jointInsuranceRate, 5);
        Model::validateMaxLength('productCode', $this->productCode, 20);
        Model::validateMaxLength('productName', $this->productName, 100);
        Model::validateMaxLength('bbrName', $this->bbrName, 200);
        Model::validateMaxLength('currency', $this->currency, 10);
        Model::validateMaxLength('insuranceAmount', $this->insuranceAmount, 20);
        Model::validateMaxLength('correctPremium', $this->correctPremium, 20);
        Model::validateMaxLength('fixedInsuranceAmountSplitRate', $this->fixedInsuranceAmountSplitRate, 5);
        Model::validateMaxLength('fixedPremiumSplitRate', $this->fixedPremiumSplitRate, 5);
        Model::validateMaxLength('facultativeInsuranceAmountSplitRate', $this->facultativeInsuranceAmountSplitRate, 5);
        Model::validateMaxLength('facultativePremiumSplitRate', $this->facultativePremiumSplitRate, 5);
        Model::validateMaxLength('splitPremium', $this->splitPremium, 20);
        Model::validateMaxLength('reinsurer', $this->reinsurer, 100);
        Model::validateMaxLength('amortizeFeeRate', $this->amortizeFeeRate, 5);
        Model::validateMaxLength('amortizeFee', $this->amortizeFee, 20);
        Model::validateMaxLength('reinsuranceContractName', $this->reinsuranceContractName, 200);
        Model::validateMaxLength('overPayFacultative', $this->overPayFacultative, 5);
        Model::validateMaxLength('correctReason', $this->correctReason, 500);
        Model::validateMaxLength('projectName', $this->projectName, 100);
        Model::validateMaxLength('receiverPlatformId', $this->receiverPlatformId, 50);
        Model::validatePattern('insureStart', $this->insureStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('insureEnd', $this->insureEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->platformCode) {
            $res['platform_code'] = $this->platformCode;
        }
        if (null !== $this->directInsurerName) {
            $res['direct_insurer_name'] = $this->directInsurerName;
        }
        if (null !== $this->approvalType) {
            $res['approval_type'] = $this->approvalType;
        }
        if (null !== $this->approvalNo) {
            $res['approval_no'] = $this->approvalNo;
        }
        if (null !== $this->polNo) {
            $res['pol_no'] = $this->polNo;
        }
        if (null !== $this->jointInsuranceLogo) {
            $res['joint_insurance_logo'] = $this->jointInsuranceLogo;
        }
        if (null !== $this->jointInsuranceRate) {
            $res['joint_insurance_rate'] = $this->jointInsuranceRate;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->bbrName) {
            $res['bbr_name'] = $this->bbrName;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->insureEnd) {
            $res['insure_end'] = $this->insureEnd;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->insuranceAmount) {
            $res['insurance_amount'] = $this->insuranceAmount;
        }
        if (null !== $this->correctPremium) {
            $res['correct_premium'] = $this->correctPremium;
        }
        if (null !== $this->fixedInsuranceAmountSplitRate) {
            $res['fixed_insurance_amount_split_rate'] = $this->fixedInsuranceAmountSplitRate;
        }
        if (null !== $this->fixedPremiumSplitRate) {
            $res['fixed_premium_split_rate'] = $this->fixedPremiumSplitRate;
        }
        if (null !== $this->facultativeInsuranceAmountSplitRate) {
            $res['facultative_insurance_amount_split_rate'] = $this->facultativeInsuranceAmountSplitRate;
        }
        if (null !== $this->facultativePremiumSplitRate) {
            $res['facultative_premium_split_rate'] = $this->facultativePremiumSplitRate;
        }
        if (null !== $this->splitPremium) {
            $res['split_premium'] = $this->splitPremium;
        }
        if (null !== $this->reinsurer) {
            $res['reinsurer'] = $this->reinsurer;
        }
        if (null !== $this->amortizeFeeRate) {
            $res['amortize_fee_rate'] = $this->amortizeFeeRate;
        }
        if (null !== $this->amortizeFee) {
            $res['amortize_fee'] = $this->amortizeFee;
        }
        if (null !== $this->reinsuranceContractName) {
            $res['reinsurance_contract_name'] = $this->reinsuranceContractName;
        }
        if (null !== $this->overPayFacultative) {
            $res['over_pay_facultative'] = $this->overPayFacultative;
        }
        if (null !== $this->correctReason) {
            $res['correct_reason'] = $this->correctReason;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->receiverPlatformId) {
            $res['receiver_platform_id'] = $this->receiverPlatformId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushInsuranceRepcorrectRequest
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
        if (isset($map['platform_code'])) {
            $model->platformCode = $map['platform_code'];
        }
        if (isset($map['direct_insurer_name'])) {
            $model->directInsurerName = $map['direct_insurer_name'];
        }
        if (isset($map['approval_type'])) {
            $model->approvalType = $map['approval_type'];
        }
        if (isset($map['approval_no'])) {
            $model->approvalNo = $map['approval_no'];
        }
        if (isset($map['pol_no'])) {
            $model->polNo = $map['pol_no'];
        }
        if (isset($map['joint_insurance_logo'])) {
            $model->jointInsuranceLogo = $map['joint_insurance_logo'];
        }
        if (isset($map['joint_insurance_rate'])) {
            $model->jointInsuranceRate = $map['joint_insurance_rate'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['bbr_name'])) {
            $model->bbrName = $map['bbr_name'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['insure_end'])) {
            $model->insureEnd = $map['insure_end'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['insurance_amount'])) {
            $model->insuranceAmount = $map['insurance_amount'];
        }
        if (isset($map['correct_premium'])) {
            $model->correctPremium = $map['correct_premium'];
        }
        if (isset($map['fixed_insurance_amount_split_rate'])) {
            $model->fixedInsuranceAmountSplitRate = $map['fixed_insurance_amount_split_rate'];
        }
        if (isset($map['fixed_premium_split_rate'])) {
            $model->fixedPremiumSplitRate = $map['fixed_premium_split_rate'];
        }
        if (isset($map['facultative_insurance_amount_split_rate'])) {
            $model->facultativeInsuranceAmountSplitRate = $map['facultative_insurance_amount_split_rate'];
        }
        if (isset($map['facultative_premium_split_rate'])) {
            $model->facultativePremiumSplitRate = $map['facultative_premium_split_rate'];
        }
        if (isset($map['split_premium'])) {
            $model->splitPremium = $map['split_premium'];
        }
        if (isset($map['reinsurer'])) {
            $model->reinsurer = $map['reinsurer'];
        }
        if (isset($map['amortize_fee_rate'])) {
            $model->amortizeFeeRate = $map['amortize_fee_rate'];
        }
        if (isset($map['amortize_fee'])) {
            $model->amortizeFee = $map['amortize_fee'];
        }
        if (isset($map['reinsurance_contract_name'])) {
            $model->reinsuranceContractName = $map['reinsurance_contract_name'];
        }
        if (isset($map['over_pay_facultative'])) {
            $model->overPayFacultative = $map['over_pay_facultative'];
        }
        if (isset($map['correct_reason'])) {
            $model->correctReason = $map['correct_reason'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['receiver_platform_id'])) {
            $model->receiverPlatformId = $map['receiver_platform_id'];
        }

        return $model;
    }
}
