<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class NotifyPolicyResultRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 蚂蚁承保申请号
    /**
     * @var string
     */
    public $insuranceApplicationNoInner;

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
        'authToken'                   => 'auth_token',
        'insuranceApplicationNoInner' => 'insurance_application_no_inner',
        'policyNo'                    => 'policy_no',
        'insuranceAmount'             => 'insurance_amount',
        'insurancePremium'            => 'insurance_premium',
        'insurancePeriodStart'        => 'insurance_period_start',
        'insurancePeriodEnd'          => 'insurance_period_end',
        'policyUrl'                   => 'policy_url',
    ];

    public function validate()
    {
        Model::validateRequired('insuranceApplicationNoInner', $this->insuranceApplicationNoInner, true);
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
        if (null !== $this->insuranceApplicationNoInner) {
            $res['insurance_application_no_inner'] = $this->insuranceApplicationNoInner;
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
     * @return NotifyPolicyResultRequest
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
