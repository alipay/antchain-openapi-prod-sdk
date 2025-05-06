<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class EntrustGuaranteeProduct extends Model
{
    // 保障失效时间
    /**
     * @example 1733711492119
     *
     * @var int
     */
    public $guaranteeExpiryDate;

    // 保障生效时间
    /**
     * @example 1733711492119
     *
     * @var int
     */
    public $guaranteeEffectiveDate;

    // 保险等待期结束时间
    /**
     * @example 1733711492119
     *
     * @var int
     */
    public $waitingPeriodDeadLine;

    // 保单号
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $policyNo;

    // 平台定义产品码值
    /**
     * @example 平台定义产品码值
     *
     * @var string
     */
    public $guaranteeProductCode;

    // 保险公司的产品code
    /**
     * @example 保险公司的产品code
     *
     * @var string
     */
    public $insuranceProductCode;

    // 保险公司的产品描述
    /**
     * @example 保险公司的产品描述
     *
     * @var string
     */
    public $insuranceProductName;
    protected $_name = [
        'guaranteeExpiryDate'    => 'guarantee_expiry_date',
        'guaranteeEffectiveDate' => 'guarantee_effective_date',
        'waitingPeriodDeadLine'  => 'waiting_period_dead_line',
        'policyNo'               => 'policy_no',
        'guaranteeProductCode'   => 'guarantee_product_code',
        'insuranceProductCode'   => 'insurance_product_code',
        'insuranceProductName'   => 'insurance_product_name',
    ];

    public function validate()
    {
        Model::validateRequired('guaranteeExpiryDate', $this->guaranteeExpiryDate, true);
        Model::validateRequired('guaranteeEffectiveDate', $this->guaranteeEffectiveDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->guaranteeExpiryDate) {
            $res['guarantee_expiry_date'] = $this->guaranteeExpiryDate;
        }
        if (null !== $this->guaranteeEffectiveDate) {
            $res['guarantee_effective_date'] = $this->guaranteeEffectiveDate;
        }
        if (null !== $this->waitingPeriodDeadLine) {
            $res['waiting_period_dead_line'] = $this->waitingPeriodDeadLine;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->guaranteeProductCode) {
            $res['guarantee_product_code'] = $this->guaranteeProductCode;
        }
        if (null !== $this->insuranceProductCode) {
            $res['insurance_product_code'] = $this->insuranceProductCode;
        }
        if (null !== $this->insuranceProductName) {
            $res['insurance_product_name'] = $this->insuranceProductName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EntrustGuaranteeProduct
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['guarantee_expiry_date'])) {
            $model->guaranteeExpiryDate = $map['guarantee_expiry_date'];
        }
        if (isset($map['guarantee_effective_date'])) {
            $model->guaranteeEffectiveDate = $map['guarantee_effective_date'];
        }
        if (isset($map['waiting_period_dead_line'])) {
            $model->waitingPeriodDeadLine = $map['waiting_period_dead_line'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['guarantee_product_code'])) {
            $model->guaranteeProductCode = $map['guarantee_product_code'];
        }
        if (isset($map['insurance_product_code'])) {
            $model->insuranceProductCode = $map['insurance_product_code'];
        }
        if (isset($map['insurance_product_name'])) {
            $model->insuranceProductName = $map['insurance_product_name'];
        }

        return $model;
    }
}
