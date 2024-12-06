<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class ApplyEndorsementStrategyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 承保申请编号（蚂蚁内部）
    /**
     * @var string
     */
    public $insuranceApplicationNoInner;

    // 投保人信息(名称、证件号、证件类型)
    /**
     * @var string
     */
    public $applicant;

    // 被保人列表
    /**
     * @var string
     */
    public $insuredList;

    // 受益人列表
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

    // 申请保额， { "cent": 20000, "currency": "CNY" }
    /**
     * @var string
     */
    public $appliedInsuranceAmount;

    // 保费， { "cent": 20000, "currency": "CNY" }
    /**
     * @var string
     */
    public $appliedPremium;

    // 保费费率
    /**
     * @var string
     */
    public $premiumRate;
    protected $_name = [
        'authToken'                   => 'auth_token',
        'insuranceApplicationNoInner' => 'insurance_application_no_inner',
        'applicant'                   => 'applicant',
        'insuredList'                 => 'insured_list',
        'beneficiaryList'             => 'beneficiary_list',
        'objectList'                  => 'object_list',
        'insurancePeriodStart'        => 'insurance_period_start',
        'insurancePeriodEnd'          => 'insurance_period_end',
        'insurancePeriod'             => 'insurance_period',
        'appliedInsuranceAmount'      => 'applied_insurance_amount',
        'appliedPremium'              => 'applied_premium',
        'premiumRate'                 => 'premium_rate',
    ];

    public function validate()
    {
        Model::validateRequired('insuranceApplicationNoInner', $this->insuranceApplicationNoInner, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->insuranceApplicationNoInner) {
            $res['insurance_application_no_inner'] = $this->insuranceApplicationNoInner;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyEndorsementStrategyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['insurance_application_no_inner'])) {
            $model->insuranceApplicationNoInner = $map['insurance_application_no_inner'];
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

        return $model;
    }
}
