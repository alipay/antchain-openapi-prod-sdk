<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class RentalInstallmentPerformance extends Model
{
    // 被申请人还款期数
    /**
     * @example 10
     *
     * @var int
     */
    public $repaymentPeriod;

    // 被申请人第几期租金支付方式
    /**
     * @example 支付宝
     *
     * @var string
     */
    public $rentPaymentType;

    // 被申请人第几期还款时间
    /**
     * @example 2021-05-07
     *
     * @var string
     */
    public $appliedRepaymentTime;

    // 被申请人第几期还款金额
    /**
     * @example 123.00
     *
     * @var string
     */
    public $appliedRepaymentAmount;
    protected $_name = [
        'repaymentPeriod'        => 'repayment_period',
        'rentPaymentType'        => 'rent_payment_type',
        'appliedRepaymentTime'   => 'applied_repayment_time',
        'appliedRepaymentAmount' => 'applied_repayment_amount',
    ];

    public function validate()
    {
        Model::validateRequired('repaymentPeriod', $this->repaymentPeriod, true);
        Model::validateRequired('rentPaymentType', $this->rentPaymentType, true);
        Model::validateRequired('appliedRepaymentTime', $this->appliedRepaymentTime, true);
        Model::validateRequired('appliedRepaymentAmount', $this->appliedRepaymentAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->repaymentPeriod) {
            $res['repayment_period'] = $this->repaymentPeriod;
        }
        if (null !== $this->rentPaymentType) {
            $res['rent_payment_type'] = $this->rentPaymentType;
        }
        if (null !== $this->appliedRepaymentTime) {
            $res['applied_repayment_time'] = $this->appliedRepaymentTime;
        }
        if (null !== $this->appliedRepaymentAmount) {
            $res['applied_repayment_amount'] = $this->appliedRepaymentAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RentalInstallmentPerformance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['repayment_period'])) {
            $model->repaymentPeriod = $map['repayment_period'];
        }
        if (isset($map['rent_payment_type'])) {
            $model->rentPaymentType = $map['rent_payment_type'];
        }
        if (isset($map['applied_repayment_time'])) {
            $model->appliedRepaymentTime = $map['applied_repayment_time'];
        }
        if (isset($map['applied_repayment_amount'])) {
            $model->appliedRepaymentAmount = $map['applied_repayment_amount'];
        }

        return $model;
    }
}
