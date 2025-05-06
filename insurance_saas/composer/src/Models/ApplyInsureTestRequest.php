<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsureTestRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // insurance_application_no
    /**
     * @var string
     */
    public $insuranceApplicationNo;

    // insurance_company_no
    /**
     * @var string
     */
    public $insuranceCompanyNo;

    // trustworthy_value_insurance_type_code
    /**
     * @var string
     */
    public $trustworthyValueInsuranceTypeCode;

    // insurance_project_code
    /**
     * @var string
     */
    public $insuranceProjectCode;

    // insurance_options_code
    /**
     * @var string
     */
    public $insuranceOptionsCode;

    // applicant
    /**
     * @var string
     */
    public $applicant;

    // insured_list
    /**
     * @var string
     */
    public $insuredList;

    // beneficiary_list
    /**
     * @var string
     */
    public $beneficiaryList;

    // insurance_period_start
    /**
     * @var string
     */
    public $insurancePeriodStart;

    // insurance_period_end
    /**
     * @var string
     */
    public $insurancePeriodEnd;

    // applied_insurance_amount
    /**
     * @var string
     */
    public $appliedInsuranceAmount;

    // insurance_period
    /**
     * @var string
     */
    public $insurancePeriod;

    // insured_object_list
    /**
     * @var string
     */
    public $insuredObjectList;
    protected $_name = [
        'authToken'                         => 'auth_token',
        'insuranceApplicationNo'            => 'insurance_application_no',
        'insuranceCompanyNo'                => 'insurance_company_no',
        'trustworthyValueInsuranceTypeCode' => 'trustworthy_value_insurance_type_code',
        'insuranceProjectCode'              => 'insurance_project_code',
        'insuranceOptionsCode'              => 'insurance_options_code',
        'applicant'                         => 'applicant',
        'insuredList'                       => 'insured_list',
        'beneficiaryList'                   => 'beneficiary_list',
        'insurancePeriodStart'              => 'insurance_period_start',
        'insurancePeriodEnd'                => 'insurance_period_end',
        'appliedInsuranceAmount'            => 'applied_insurance_amount',
        'insurancePeriod'                   => 'insurance_period',
        'insuredObjectList'                 => 'insured_object_list',
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
        Model::validateRequired('appliedInsuranceAmount', $this->appliedInsuranceAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
        if (null !== $this->insurancePeriodStart) {
            $res['insurance_period_start'] = $this->insurancePeriodStart;
        }
        if (null !== $this->insurancePeriodEnd) {
            $res['insurance_period_end'] = $this->insurancePeriodEnd;
        }
        if (null !== $this->appliedInsuranceAmount) {
            $res['applied_insurance_amount'] = $this->appliedInsuranceAmount;
        }
        if (null !== $this->insurancePeriod) {
            $res['insurance_period'] = $this->insurancePeriod;
        }
        if (null !== $this->insuredObjectList) {
            $res['insured_object_list'] = $this->insuredObjectList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsureTestRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
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
        if (isset($map['insurance_period_start'])) {
            $model->insurancePeriodStart = $map['insurance_period_start'];
        }
        if (isset($map['insurance_period_end'])) {
            $model->insurancePeriodEnd = $map['insurance_period_end'];
        }
        if (isset($map['applied_insurance_amount'])) {
            $model->appliedInsuranceAmount = $map['applied_insurance_amount'];
        }
        if (isset($map['insurance_period'])) {
            $model->insurancePeriod = $map['insurance_period'];
        }
        if (isset($map['insured_object_list'])) {
            $model->insuredObjectList = $map['insured_object_list'];
        }

        return $model;
    }
}
