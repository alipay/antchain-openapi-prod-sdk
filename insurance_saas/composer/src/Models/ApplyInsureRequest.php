<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsureRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 投保申请号-外部，业务侧需保证唯一
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

    // 投保人信息(名称-memberName、证件号-certNo、证件类型-certType、手机号-memberMobileNo)
    /**
     * @var string
     */
    public $applicant;

    // 被保人列表(可空)，json格式参见投保人信息
    /**
     * @var string
     */
    public $insuredList;

    // 受益人列表(可空)
    /**
     * @var string
     */
    public $beneficiaryList;

    // 保险起期
    /**
     * @var string
     */
    public $insurancePeriodStart;

    // 保险止期
    /**
     * @var string
     */
    public $insurancePeriodEnd;

    // 申请保额，支持多币种， { "cent": 10000, "currency": "CNY" }
    /**
     * @var string
     */
    public $appliedInsuranceAmount;

    // 保期，单位：天
    /**
     * @var int
     */
    public $insurancePeriod;

    // 投保标的List，动态字段，根据险种所配置的标的传值
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
     * @return ApplyInsureRequest
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
