<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class SyncPolicyResultRequest extends Model
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

    // 投保标的List，动态字段，根据险种所配置的标的传值
    /**
     * @var string
     */
    public $objectList;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;

    // 保额，JSON格式
    /**
     * @var string
     */
    public $insuranceAmount;

    // 保费,json格式
    //
    /**
     * @var string
     */
    public $insurancePremium;

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

    // 电子保单URL
    /**
     * @var string
     */
    public $policyUrl;
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
        'objectList'                        => 'object_list',
        'policyNo'                          => 'policy_no',
        'insuranceAmount'                   => 'insurance_amount',
        'insurancePremium'                  => 'insurance_premium',
        'insurancePeriodStart'              => 'insurance_period_start',
        'insurancePeriodEnd'                => 'insurance_period_end',
        'policyUrl'                         => 'policy_url',
    ];

    public function validate()
    {
        Model::validateRequired('insuranceApplicationNo', $this->insuranceApplicationNo, true);
        Model::validateRequired('insuranceCompanyNo', $this->insuranceCompanyNo, true);
        Model::validateRequired('trustworthyValueInsuranceTypeCode', $this->trustworthyValueInsuranceTypeCode, true);
        Model::validateRequired('insuranceProjectCode', $this->insuranceProjectCode, true);
        Model::validateRequired('insuranceOptionsCode', $this->insuranceOptionsCode, true);
        Model::validateRequired('applicant', $this->applicant, true);
        Model::validateRequired('objectList', $this->objectList, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('insuranceAmount', $this->insuranceAmount, true);
        Model::validateRequired('insurancePremium', $this->insurancePremium, true);
        Model::validateRequired('insurancePeriodStart', $this->insurancePeriodStart, true);
        Model::validateRequired('insurancePeriodEnd', $this->insurancePeriodEnd, true);
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
        if (null !== $this->objectList) {
            $res['object_list'] = $this->objectList;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->insuranceAmount) {
            $res['insurance_amount'] = $this->insuranceAmount;
        }
        if (null !== $this->insurancePremium) {
            $res['insurance_premium'] = $this->insurancePremium;
        }
        if (null !== $this->insurancePeriodStart) {
            $res['insurance_period_start'] = $this->insurancePeriodStart;
        }
        if (null !== $this->insurancePeriodEnd) {
            $res['insurance_period_end'] = $this->insurancePeriodEnd;
        }
        if (null !== $this->policyUrl) {
            $res['policy_url'] = $this->policyUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncPolicyResultRequest
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
        if (isset($map['object_list'])) {
            $model->objectList = $map['object_list'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['insurance_amount'])) {
            $model->insuranceAmount = $map['insurance_amount'];
        }
        if (isset($map['insurance_premium'])) {
            $model->insurancePremium = $map['insurance_premium'];
        }
        if (isset($map['insurance_period_start'])) {
            $model->insurancePeriodStart = $map['insurance_period_start'];
        }
        if (isset($map['insurance_period_end'])) {
            $model->insurancePeriodEnd = $map['insurance_period_end'];
        }
        if (isset($map['policy_url'])) {
            $model->policyUrl = $map['policy_url'];
        }

        return $model;
    }
}
