<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class ApplyClaimRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 报案单号
    /**
     * @var string
     */
    public $claimNotificationFormNo;

    // 保单号
    /**
     * @var string
     */
    public $insurancePolicyNo;

    // 保司编号
    /**
     * @var string
     */
    public $insuranceCompanyNo;

    // 保险产品代码
    /**
     * @var string
     */
    public $trustworthyValueInsuranceTypeCode;

    // 保司项目代码
    /**
     * @var string
     */
    public $insuranceOptionsCode;

    // 保司项目代码
    /**
     * @var string
     */
    public $insuranceProjectCode;

    // 出险时间
    /**
     * @var string
     */
    public $lossOccurredTime;

    // 出险原因
    /**
     * @var string
     */
    public $lossOccurredReason;

    // 出险地点
    /**
     * @var string
     */
    public $lossOccurredAddress;

    // 出险标的列表
    /**
     * @var string
     */
    public $objectList;

    // 报案金额
    /**
     * @var string
     */
    public $claimNotificationAmountLocalCurrency;

    // 报案人
    /**
     * @var string
     */
    public $reporter;

    // 报案材料列表
    /**
     * @var string
     */
    public $materialList;
    protected $_name = [
        'authToken'                            => 'auth_token',
        'claimNotificationFormNo'              => 'claim_notification_form_no',
        'insurancePolicyNo'                    => 'insurance_policy_no',
        'insuranceCompanyNo'                   => 'insurance_company_no',
        'trustworthyValueInsuranceTypeCode'    => 'trustworthy_value_insurance_type_code',
        'insuranceOptionsCode'                 => 'insurance_options_code',
        'insuranceProjectCode'                 => 'insurance_project_code',
        'lossOccurredTime'                     => 'loss_occurred_time',
        'lossOccurredReason'                   => 'loss_occurred_reason',
        'lossOccurredAddress'                  => 'loss_occurred_address',
        'objectList'                           => 'object_list',
        'claimNotificationAmountLocalCurrency' => 'claim_notification_amount_local_currency',
        'reporter'                             => 'reporter',
        'materialList'                         => 'material_list',
    ];

    public function validate()
    {
        Model::validateRequired('claimNotificationFormNo', $this->claimNotificationFormNo, true);
        Model::validateRequired('insurancePolicyNo', $this->insurancePolicyNo, true);
        Model::validateRequired('insuranceCompanyNo', $this->insuranceCompanyNo, true);
        Model::validateRequired('lossOccurredTime', $this->lossOccurredTime, true);
        Model::validateRequired('lossOccurredReason', $this->lossOccurredReason, true);
        Model::validateRequired('lossOccurredAddress', $this->lossOccurredAddress, true);
        Model::validateRequired('claimNotificationAmountLocalCurrency', $this->claimNotificationAmountLocalCurrency, true);
        Model::validateRequired('reporter', $this->reporter, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->claimNotificationFormNo) {
            $res['claim_notification_form_no'] = $this->claimNotificationFormNo;
        }
        if (null !== $this->insurancePolicyNo) {
            $res['insurance_policy_no'] = $this->insurancePolicyNo;
        }
        if (null !== $this->insuranceCompanyNo) {
            $res['insurance_company_no'] = $this->insuranceCompanyNo;
        }
        if (null !== $this->trustworthyValueInsuranceTypeCode) {
            $res['trustworthy_value_insurance_type_code'] = $this->trustworthyValueInsuranceTypeCode;
        }
        if (null !== $this->insuranceOptionsCode) {
            $res['insurance_options_code'] = $this->insuranceOptionsCode;
        }
        if (null !== $this->insuranceProjectCode) {
            $res['insurance_project_code'] = $this->insuranceProjectCode;
        }
        if (null !== $this->lossOccurredTime) {
            $res['loss_occurred_time'] = $this->lossOccurredTime;
        }
        if (null !== $this->lossOccurredReason) {
            $res['loss_occurred_reason'] = $this->lossOccurredReason;
        }
        if (null !== $this->lossOccurredAddress) {
            $res['loss_occurred_address'] = $this->lossOccurredAddress;
        }
        if (null !== $this->objectList) {
            $res['object_list'] = $this->objectList;
        }
        if (null !== $this->claimNotificationAmountLocalCurrency) {
            $res['claim_notification_amount_local_currency'] = $this->claimNotificationAmountLocalCurrency;
        }
        if (null !== $this->reporter) {
            $res['reporter'] = $this->reporter;
        }
        if (null !== $this->materialList) {
            $res['material_list'] = $this->materialList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyClaimRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['claim_notification_form_no'])) {
            $model->claimNotificationFormNo = $map['claim_notification_form_no'];
        }
        if (isset($map['insurance_policy_no'])) {
            $model->insurancePolicyNo = $map['insurance_policy_no'];
        }
        if (isset($map['insurance_company_no'])) {
            $model->insuranceCompanyNo = $map['insurance_company_no'];
        }
        if (isset($map['trustworthy_value_insurance_type_code'])) {
            $model->trustworthyValueInsuranceTypeCode = $map['trustworthy_value_insurance_type_code'];
        }
        if (isset($map['insurance_options_code'])) {
            $model->insuranceOptionsCode = $map['insurance_options_code'];
        }
        if (isset($map['insurance_project_code'])) {
            $model->insuranceProjectCode = $map['insurance_project_code'];
        }
        if (isset($map['loss_occurred_time'])) {
            $model->lossOccurredTime = $map['loss_occurred_time'];
        }
        if (isset($map['loss_occurred_reason'])) {
            $model->lossOccurredReason = $map['loss_occurred_reason'];
        }
        if (isset($map['loss_occurred_address'])) {
            $model->lossOccurredAddress = $map['loss_occurred_address'];
        }
        if (isset($map['object_list'])) {
            $model->objectList = $map['object_list'];
        }
        if (isset($map['claim_notification_amount_local_currency'])) {
            $model->claimNotificationAmountLocalCurrency = $map['claim_notification_amount_local_currency'];
        }
        if (isset($map['reporter'])) {
            $model->reporter = $map['reporter'];
        }
        if (isset($map['material_list'])) {
            $model->materialList = $map['material_list'];
        }

        return $model;
    }
}
