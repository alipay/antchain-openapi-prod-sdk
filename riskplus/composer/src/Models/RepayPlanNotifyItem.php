<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RepayPlanNotifyItem extends Model
{
    // 当前期数
    /**
     * @example 1
     *
     * @var int
     */
    public $loanTerm;

    // 应还日，yyyy-MM-dd
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $expectRepayDate;

    // 应还总额(元)
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $expectRepayAmount;

    // 应还本金(元)
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $expectRepayPrincipal;

    // 应还利息(元)
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $expectRepayInterest;

    // 应还担保费(元)
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $expectRepayGuarantee;

    // 起息日，格式 YYYY-MM-DD
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $interestStartDate;

    // 实还总额(元)，如未还则传0
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $repayAmount;

    // 已还本金(元)，如未还则传0
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $repaidPrincipal;

    // 已还利息(元)，如未还则传0
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $repaidInterest;

    // 应还罚息(元)，
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $expectRepayMuclt;

    // 已还罚息(元)，如未还则传0
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $repaidPenalty;

    // 状态标志
    // 0-正常未到期
    // 1-正常已还清
    // 2-逾期
    /**
     * @example 0
     *
     * @var string
     */
    public $scheduleStatus;
    protected $_name = [
        'loanTerm'             => 'loan_term',
        'expectRepayDate'      => 'expect_repay_date',
        'expectRepayAmount'    => 'expect_repay_amount',
        'expectRepayPrincipal' => 'expect_repay_principal',
        'expectRepayInterest'  => 'expect_repay_interest',
        'expectRepayGuarantee' => 'expect_repay_guarantee',
        'interestStartDate'    => 'interest_start_date',
        'repayAmount'          => 'repay_amount',
        'repaidPrincipal'      => 'repaid_principal',
        'repaidInterest'       => 'repaid_interest',
        'expectRepayMuclt'     => 'expect_repay_muclt',
        'repaidPenalty'        => 'repaid_penalty',
        'scheduleStatus'       => 'schedule_status',
    ];

    public function validate()
    {
        Model::validateRequired('loanTerm', $this->loanTerm, true);
        Model::validateRequired('expectRepayDate', $this->expectRepayDate, true);
        Model::validateRequired('expectRepayAmount', $this->expectRepayAmount, true);
        Model::validateRequired('expectRepayPrincipal', $this->expectRepayPrincipal, true);
        Model::validateRequired('expectRepayInterest', $this->expectRepayInterest, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->loanTerm) {
            $res['loan_term'] = $this->loanTerm;
        }
        if (null !== $this->expectRepayDate) {
            $res['expect_repay_date'] = $this->expectRepayDate;
        }
        if (null !== $this->expectRepayAmount) {
            $res['expect_repay_amount'] = $this->expectRepayAmount;
        }
        if (null !== $this->expectRepayPrincipal) {
            $res['expect_repay_principal'] = $this->expectRepayPrincipal;
        }
        if (null !== $this->expectRepayInterest) {
            $res['expect_repay_interest'] = $this->expectRepayInterest;
        }
        if (null !== $this->expectRepayGuarantee) {
            $res['expect_repay_guarantee'] = $this->expectRepayGuarantee;
        }
        if (null !== $this->interestStartDate) {
            $res['interest_start_date'] = $this->interestStartDate;
        }
        if (null !== $this->repayAmount) {
            $res['repay_amount'] = $this->repayAmount;
        }
        if (null !== $this->repaidPrincipal) {
            $res['repaid_principal'] = $this->repaidPrincipal;
        }
        if (null !== $this->repaidInterest) {
            $res['repaid_interest'] = $this->repaidInterest;
        }
        if (null !== $this->expectRepayMuclt) {
            $res['expect_repay_muclt'] = $this->expectRepayMuclt;
        }
        if (null !== $this->repaidPenalty) {
            $res['repaid_penalty'] = $this->repaidPenalty;
        }
        if (null !== $this->scheduleStatus) {
            $res['schedule_status'] = $this->scheduleStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayPlanNotifyItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['loan_term'])) {
            $model->loanTerm = $map['loan_term'];
        }
        if (isset($map['expect_repay_date'])) {
            $model->expectRepayDate = $map['expect_repay_date'];
        }
        if (isset($map['expect_repay_amount'])) {
            $model->expectRepayAmount = $map['expect_repay_amount'];
        }
        if (isset($map['expect_repay_principal'])) {
            $model->expectRepayPrincipal = $map['expect_repay_principal'];
        }
        if (isset($map['expect_repay_interest'])) {
            $model->expectRepayInterest = $map['expect_repay_interest'];
        }
        if (isset($map['expect_repay_guarantee'])) {
            $model->expectRepayGuarantee = $map['expect_repay_guarantee'];
        }
        if (isset($map['interest_start_date'])) {
            $model->interestStartDate = $map['interest_start_date'];
        }
        if (isset($map['repay_amount'])) {
            $model->repayAmount = $map['repay_amount'];
        }
        if (isset($map['repaid_principal'])) {
            $model->repaidPrincipal = $map['repaid_principal'];
        }
        if (isset($map['repaid_interest'])) {
            $model->repaidInterest = $map['repaid_interest'];
        }
        if (isset($map['expect_repay_muclt'])) {
            $model->expectRepayMuclt = $map['expect_repay_muclt'];
        }
        if (isset($map['repaid_penalty'])) {
            $model->repaidPenalty = $map['repaid_penalty'];
        }
        if (isset($map['schedule_status'])) {
            $model->scheduleStatus = $map['schedule_status'];
        }

        return $model;
    }
}
