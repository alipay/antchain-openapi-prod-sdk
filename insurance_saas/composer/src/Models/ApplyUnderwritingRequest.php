<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class ApplyUnderwritingRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 报价单编号（蚂蚁内部）
    /**
     * @var string
     */
    public $quotationNoInner;

    // 承保申请号（保司）
    /**
     * @var string
     */
    public $insuranceApplicationNo;

    // 保司编码
    /**
     * @var string
     */
    public $insuranceCompanyNo;

    // 保险产品编码
    /**
     * @var string
     */
    public $trustworthyValueInsuranceTypeCode;

    // 保司项目代码
    /**
     * @var string
     */
    public $insuranceProjectCode;

    // 保司方案代码
    /**
     * @var string
     */
    public $insuranceOptionsCode;

    // 投保人信息(名称、证件号、证件类型)
    /**
     * @var string
     */
    public $applicant;

    // 被保人列表(可空)
    /**
     * @var string
     */
    public $insuredList;

    // 受益人列表(可空)
    /**
     * @var string
     */
    public $beneficiaryList;

    // 投保标的列表
    /**
     * @var string
     */
    public $objectList;

    // 保险起期 yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $insurancePeriodStart;

    // 保险止期 yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $insurancePeriodEnd;

    // 保期（天）
    /**
     * @var int
     */
    public $insurancePeriod;

    // 申请保额， {
    // "cent": 20000,
    // "currency": "CNY"
    // }
    /**
     * @var string
     */
    public $appliedInsuranceAmount;

    // 保费
    /**
     * @var string
     */
    public $appliedPremium;

    // 保费费率
    /**
     * @var string
     */
    public $premiumRate;

    // 承保申请的报价相关内容
    /**
     * @var string
     */
    public $quotation;
    protected $_name = [
        'authToken'                         => 'auth_token',
        'quotationNoInner'                  => 'quotation_no_inner',
        'insuranceApplicationNo'            => 'insurance_application_no',
        'insuranceCompanyNo'                => 'insurance_company_no',
        'trustworthyValueInsuranceTypeCode' => 'trustworthy_value_insurance_type_code',
        'insuranceProjectCode'              => 'insurance_project_code',
        'insuranceOptionsCode'              => 'insurance_options_code',
        'applicant'                         => 'applicant',
        'insuredList'                       => 'insured_list',
        'beneficiaryList'                   => 'beneficiary_list',
        'objectList'                        => 'object_list',
        'insurancePeriodStart'              => 'insurance_period_start',
        'insurancePeriodEnd'                => 'insurance_period_end',
        'insurancePeriod'                   => 'insurance_period',
        'appliedInsuranceAmount'            => 'applied_insurance_amount',
        'appliedPremium'                    => 'applied_premium',
        'premiumRate'                       => 'premium_rate',
        'quotation'                         => 'quotation',
    ];

    public function validate()
    {
        Model::validateRequired('insuranceApplicationNo', $this->insuranceApplicationNo, true);
        Model::validateRequired('insuranceCompanyNo', $this->insuranceCompanyNo, true);
        Model::validateRequired('trustworthyValueInsuranceTypeCode', $this->trustworthyValueInsuranceTypeCode, true);
        Model::validateRequired('insuranceProjectCode', $this->insuranceProjectCode, true);
        Model::validateRequired('insuranceOptionsCode', $this->insuranceOptionsCode, true);
        Model::validateRequired('applicant', $this->applicant, true);
        Model::validateRequired('insurancePeriodStart', $this->insurancePeriodStart, true);
        Model::validateRequired('insurancePeriod', $this->insurancePeriod, true);
        Model::validateRequired('appliedInsuranceAmount', $this->appliedInsuranceAmount, true);
        Model::validateRequired('appliedPremium', $this->appliedPremium, true);
        Model::validateRequired('premiumRate', $this->premiumRate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->quotationNoInner) {
            $res['quotation_no_inner'] = $this->quotationNoInner;
        }
        if (null !== $this->insuranceApplicationNo) {
            $res['insurance_application_no'] = $this->insuranceApplicationNo;
        }
        if (null !== $this->insuranceCompanyNo) {
            $res['insurance_company_no'] = $this->insuranceCompanyNo;
        }
        if (null !== $this->trustworthyValueInsuranceTypeCode) {
            $res['trustworthy_value_insurance_type_code'] = $this->trustworthyValueInsuranceTypeCode;
        }
        if (null !== $this->insuranceProjectCode) {
            $res['insurance_project_code'] = $this->insuranceProjectCode;
        }
        if (null !== $this->insuranceOptionsCode) {
            $res['insurance_options_code'] = $this->insuranceOptionsCode;
        }
        if (null !== $this->applicant) {
            $res['applicant'] = $this->applicant;
        }
        if (null !== $this->insuredList) {
            $res['insured_list'] = $this->insuredList;
        }
        if (null !== $this->beneficiaryList) {
            $res['beneficiary_list'] = $this->beneficiaryList;
        }
        if (null !== $this->objectList) {
            $res['object_list'] = $this->objectList;
        }
        if (null !== $this->insurancePeriodStart) {
            $res['insurance_period_start'] = $this->insurancePeriodStart;
        }
        if (null !== $this->insurancePeriodEnd) {
            $res['insurance_period_end'] = $this->insurancePeriodEnd;
        }
        if (null !== $this->insurancePeriod) {
            $res['insurance_period'] = $this->insurancePeriod;
        }
        if (null !== $this->appliedInsuranceAmount) {
            $res['applied_insurance_amount'] = $this->appliedInsuranceAmount;
        }
        if (null !== $this->appliedPremium) {
            $res['applied_premium'] = $this->appliedPremium;
        }
        if (null !== $this->premiumRate) {
            $res['premium_rate'] = $this->premiumRate;
        }
        if (null !== $this->quotation) {
            $res['quotation'] = $this->quotation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyUnderwritingRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['quotation_no_inner'])) {
            $model->quotationNoInner = $map['quotation_no_inner'];
        }
        if (isset($map['insurance_application_no'])) {
            $model->insuranceApplicationNo = $map['insurance_application_no'];
        }
        if (isset($map['insurance_company_no'])) {
            $model->insuranceCompanyNo = $map['insurance_company_no'];
        }
        if (isset($map['trustworthy_value_insurance_type_code'])) {
            $model->trustworthyValueInsuranceTypeCode = $map['trustworthy_value_insurance_type_code'];
        }
        if (isset($map['insurance_project_code'])) {
            $model->insuranceProjectCode = $map['insurance_project_code'];
        }
        if (isset($map['insurance_options_code'])) {
            $model->insuranceOptionsCode = $map['insurance_options_code'];
        }
        if (isset($map['applicant'])) {
            $model->applicant = $map['applicant'];
        }
        if (isset($map['insured_list'])) {
            $model->insuredList = $map['insured_list'];
        }
        if (isset($map['beneficiary_list'])) {
            $model->beneficiaryList = $map['beneficiary_list'];
        }
        if (isset($map['object_list'])) {
            $model->objectList = $map['object_list'];
        }
        if (isset($map['insurance_period_start'])) {
            $model->insurancePeriodStart = $map['insurance_period_start'];
        }
        if (isset($map['insurance_period_end'])) {
            $model->insurancePeriodEnd = $map['insurance_period_end'];
        }
        if (isset($map['insurance_period'])) {
            $model->insurancePeriod = $map['insurance_period'];
        }
        if (isset($map['applied_insurance_amount'])) {
            $model->appliedInsuranceAmount = $map['applied_insurance_amount'];
        }
        if (isset($map['applied_premium'])) {
            $model->appliedPremium = $map['applied_premium'];
        }
        if (isset($map['premium_rate'])) {
            $model->premiumRate = $map['premium_rate'];
        }
        if (isset($map['quotation'])) {
            $model->quotation = $map['quotation'];
        }

        return $model;
    }
}
