<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcRepayTrial extends Model
{
    // 合同编号
    /**
     * @example 123
     *
     * @var string
     */
    public $contractNo;

    // 数字格式,精确到分。借据已结清,会返回还款总金额为0
    /**
     * @example 23
     *
     * @var string
     */
    public $totalAmount;

    // 利息数字格式,精确到分
    /**
     * @example 1.23
     *
     * @var string
     */
    public $interestAmount;

    // 本金 数字格式,精确到分
    /**
     * @example 2.35
     *
     * @var string
     */
    public $principalAmount;

    // 罚息 数字格式,精确到分
    /**
     * @example 1.23
     *
     * @var string
     */
    public $penaltyInterestAmount;

    // 复利 数字格式,精确到分
    /**
     * @example 1.23
     *
     * @var string
     */
    public $compoundInterestAmount;
    protected $_name = [
        'contractNo'             => 'contract_no',
        'totalAmount'            => 'total_amount',
        'interestAmount'         => 'interest_amount',
        'principalAmount'        => 'principal_amount',
        'penaltyInterestAmount'  => 'penalty_interest_amount',
        'compoundInterestAmount' => 'compound_interest_amount',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->interestAmount) {
            $res['interest_amount'] = $this->interestAmount;
        }
        if (null !== $this->principalAmount) {
            $res['principal_amount'] = $this->principalAmount;
        }
        if (null !== $this->penaltyInterestAmount) {
            $res['penalty_interest_amount'] = $this->penaltyInterestAmount;
        }
        if (null !== $this->compoundInterestAmount) {
            $res['compound_interest_amount'] = $this->compoundInterestAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcRepayTrial
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['interest_amount'])) {
            $model->interestAmount = $map['interest_amount'];
        }
        if (isset($map['principal_amount'])) {
            $model->principalAmount = $map['principal_amount'];
        }
        if (isset($map['penalty_interest_amount'])) {
            $model->penaltyInterestAmount = $map['penalty_interest_amount'];
        }
        if (isset($map['compound_interest_amount'])) {
            $model->compoundInterestAmount = $map['compound_interest_amount'];
        }

        return $model;
    }
}
