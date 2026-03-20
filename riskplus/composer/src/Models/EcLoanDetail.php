<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcLoanDetail extends Model
{
    // 借据号
    /**
     * @example ACCAL202301120798255316102054428
     *
     * @var string
     */
    public $loanAcctNo;

    // 贷款金额
    /**
     * @example 1.23
     *
     * @var int
     */
    public $loanAmt;

    // 贷款发放日
    /**
     * @example 2023/05/01
     *
     * @var string
     */
    public $loanStartDate;

    // 贷款到期日
    /**
     * @example 2023/05/01
     *
     * @var string
     */
    public $loanEndDate;

    // 利率类型
    /**
     * @example 1
     *
     * @var string
     */
    public $rateType;

    // 利率单位
    /**
     * @example 1
     *
     * @var string
     */
    public $rateUnit;

    // 贷款利率 年化利率(%)
    /**
     * @example 1.23
     *
     * @var string
     */
    public $loanIntRate;

    // 当前剩余本金
    /**
     * @example 1.23
     *
     * @var string
     */
    public $currRemainCorpus;

    // 还款方式
    /**
     * @example 1
     *
     * @var string
     */
    public $loanRepayType;

    // 最后一次计息日
    /**
     * @example 2023/05/01
     *
     * @var string
     */
    public $lastCountIntDate;

    // 当前期数
    /**
     * @example 25
     *
     * @var string
     */
    public $currentTerm;

    // 当期应还日期
    /**
     * @example 2023/05/01
     *
     * @var string
     */
    public $curRepayDay;

    // 对应期次应还金额
    /**
     * @example 1.23
     *
     * @var int
     */
    public $curRemainAmt;

    // 当期已还总额
    /**
     * @example 1.23
     *
     * @var int
     */
    public $currentPaidAmt;

    // 对应期次应还本金
    /**
     * @example 1.23
     *
     * @var int
     */
    public $curPrincipalAmount;

    // 对应期次已还本金
    /**
     * @example 1.23
     *
     * @var int
     */
    public $actPrincipalAmount;

    // 对应期次应还利息
    /**
     * @example 1.23
     *
     * @var int
     */
    public $curInterestAmount;

    // 对应期次已还利息
    /**
     * @example 1.23
     *
     * @var int
     */
    public $actInterestAmount;

    // 对应期次应还正常利息
    /**
     * @example 1.23
     *
     * @var int
     */
    public $curNormalInterestAmt;

    // 对应期次已还正常利息
    /**
     * @example 1.23
     *
     * @var int
     */
    public $actCurNormalInterestAmt;

    // 对应期次应还罚息
    /**
     * @example 1.23
     *
     * @var int
     */
    public $curPrincipalPenaltyAmt;

    // 对应期次已还罚息
    /**
     * @example 1.23
     *
     * @var int
     */
    public $actCurPrincipalPenaltyAmt;

    // 对应期次应还复利
    /**
     * @example 1.23
     *
     * @var int
     */
    public $curInterestPenaltyAmt;

    // 对应期次已还复利
    /**
     * @example 1.23
     *
     * @var int
     */
    public $actCurInterestPenaltyAmt;

    // 总期数
    /**
     * @example 1
     *
     * @var string
     */
    public $totalNum;

    // 借据状态
    /**
     * @example 1
     *
     * @var string
     */
    public $loanStatus;

    // 总欠款本息
    /**
     * @example 1.23
     *
     * @var string
     */
    public $totalOweCorpusInterest;
    protected $_name = [
        'loanAcctNo'                => 'loan_acct_no',
        'loanAmt'                   => 'loan_amt',
        'loanStartDate'             => 'loan_start_date',
        'loanEndDate'               => 'loan_end_date',
        'rateType'                  => 'rate_type',
        'rateUnit'                  => 'rate_unit',
        'loanIntRate'               => 'loan_int_rate',
        'currRemainCorpus'          => 'curr_remain_corpus',
        'loanRepayType'             => 'loan_repay_type',
        'lastCountIntDate'          => 'last_count_int_date',
        'currentTerm'               => 'current_term',
        'curRepayDay'               => 'cur_repay_day',
        'curRemainAmt'              => 'cur_remain_amt',
        'currentPaidAmt'            => 'current_paid_amt',
        'curPrincipalAmount'        => 'cur_principal_amount',
        'actPrincipalAmount'        => 'act_principal_amount',
        'curInterestAmount'         => 'cur_interest_amount',
        'actInterestAmount'         => 'act_interest_amount',
        'curNormalInterestAmt'      => 'cur_normal_interest_amt',
        'actCurNormalInterestAmt'   => 'act_cur_normal_interest_amt',
        'curPrincipalPenaltyAmt'    => 'cur_principal_penalty_amt',
        'actCurPrincipalPenaltyAmt' => 'act_cur_principal_penalty_amt',
        'curInterestPenaltyAmt'     => 'cur_interest_penalty_amt',
        'actCurInterestPenaltyAmt'  => 'act_cur_interest_penalty_amt',
        'totalNum'                  => 'total_num',
        'loanStatus'                => 'loan_status',
        'totalOweCorpusInterest'    => 'total_owe_corpus_interest',
    ];

    public function validate()
    {
        Model::validateRequired('loanAcctNo', $this->loanAcctNo, true);
        Model::validateRequired('loanAmt', $this->loanAmt, true);
        Model::validateRequired('loanStartDate', $this->loanStartDate, true);
        Model::validateRequired('loanEndDate', $this->loanEndDate, true);
        Model::validateRequired('rateType', $this->rateType, true);
        Model::validateRequired('rateUnit', $this->rateUnit, true);
        Model::validateRequired('loanIntRate', $this->loanIntRate, true);
        Model::validateRequired('currRemainCorpus', $this->currRemainCorpus, true);
        Model::validateRequired('loanRepayType', $this->loanRepayType, true);
        Model::validateRequired('lastCountIntDate', $this->lastCountIntDate, true);
        Model::validateRequired('currentTerm', $this->currentTerm, true);
        Model::validateRequired('curRepayDay', $this->curRepayDay, true);
        Model::validateRequired('curRemainAmt', $this->curRemainAmt, true);
        Model::validateRequired('currentPaidAmt', $this->currentPaidAmt, true);
        Model::validateRequired('curPrincipalAmount', $this->curPrincipalAmount, true);
        Model::validateRequired('actPrincipalAmount', $this->actPrincipalAmount, true);
        Model::validateRequired('curInterestAmount', $this->curInterestAmount, true);
        Model::validateRequired('actInterestAmount', $this->actInterestAmount, true);
        Model::validateRequired('curNormalInterestAmt', $this->curNormalInterestAmt, true);
        Model::validateRequired('actCurNormalInterestAmt', $this->actCurNormalInterestAmt, true);
        Model::validateRequired('curPrincipalPenaltyAmt', $this->curPrincipalPenaltyAmt, true);
        Model::validateRequired('actCurPrincipalPenaltyAmt', $this->actCurPrincipalPenaltyAmt, true);
        Model::validateRequired('curInterestPenaltyAmt', $this->curInterestPenaltyAmt, true);
        Model::validateRequired('actCurInterestPenaltyAmt', $this->actCurInterestPenaltyAmt, true);
        Model::validateRequired('totalNum', $this->totalNum, true);
        Model::validateRequired('loanStatus', $this->loanStatus, true);
        Model::validateRequired('totalOweCorpusInterest', $this->totalOweCorpusInterest, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->loanAcctNo) {
            $res['loan_acct_no'] = $this->loanAcctNo;
        }
        if (null !== $this->loanAmt) {
            $res['loan_amt'] = $this->loanAmt;
        }
        if (null !== $this->loanStartDate) {
            $res['loan_start_date'] = $this->loanStartDate;
        }
        if (null !== $this->loanEndDate) {
            $res['loan_end_date'] = $this->loanEndDate;
        }
        if (null !== $this->rateType) {
            $res['rate_type'] = $this->rateType;
        }
        if (null !== $this->rateUnit) {
            $res['rate_unit'] = $this->rateUnit;
        }
        if (null !== $this->loanIntRate) {
            $res['loan_int_rate'] = $this->loanIntRate;
        }
        if (null !== $this->currRemainCorpus) {
            $res['curr_remain_corpus'] = $this->currRemainCorpus;
        }
        if (null !== $this->loanRepayType) {
            $res['loan_repay_type'] = $this->loanRepayType;
        }
        if (null !== $this->lastCountIntDate) {
            $res['last_count_int_date'] = $this->lastCountIntDate;
        }
        if (null !== $this->currentTerm) {
            $res['current_term'] = $this->currentTerm;
        }
        if (null !== $this->curRepayDay) {
            $res['cur_repay_day'] = $this->curRepayDay;
        }
        if (null !== $this->curRemainAmt) {
            $res['cur_remain_amt'] = $this->curRemainAmt;
        }
        if (null !== $this->currentPaidAmt) {
            $res['current_paid_amt'] = $this->currentPaidAmt;
        }
        if (null !== $this->curPrincipalAmount) {
            $res['cur_principal_amount'] = $this->curPrincipalAmount;
        }
        if (null !== $this->actPrincipalAmount) {
            $res['act_principal_amount'] = $this->actPrincipalAmount;
        }
        if (null !== $this->curInterestAmount) {
            $res['cur_interest_amount'] = $this->curInterestAmount;
        }
        if (null !== $this->actInterestAmount) {
            $res['act_interest_amount'] = $this->actInterestAmount;
        }
        if (null !== $this->curNormalInterestAmt) {
            $res['cur_normal_interest_amt'] = $this->curNormalInterestAmt;
        }
        if (null !== $this->actCurNormalInterestAmt) {
            $res['act_cur_normal_interest_amt'] = $this->actCurNormalInterestAmt;
        }
        if (null !== $this->curPrincipalPenaltyAmt) {
            $res['cur_principal_penalty_amt'] = $this->curPrincipalPenaltyAmt;
        }
        if (null !== $this->actCurPrincipalPenaltyAmt) {
            $res['act_cur_principal_penalty_amt'] = $this->actCurPrincipalPenaltyAmt;
        }
        if (null !== $this->curInterestPenaltyAmt) {
            $res['cur_interest_penalty_amt'] = $this->curInterestPenaltyAmt;
        }
        if (null !== $this->actCurInterestPenaltyAmt) {
            $res['act_cur_interest_penalty_amt'] = $this->actCurInterestPenaltyAmt;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        if (null !== $this->loanStatus) {
            $res['loan_status'] = $this->loanStatus;
        }
        if (null !== $this->totalOweCorpusInterest) {
            $res['total_owe_corpus_interest'] = $this->totalOweCorpusInterest;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcLoanDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['loan_acct_no'])) {
            $model->loanAcctNo = $map['loan_acct_no'];
        }
        if (isset($map['loan_amt'])) {
            $model->loanAmt = $map['loan_amt'];
        }
        if (isset($map['loan_start_date'])) {
            $model->loanStartDate = $map['loan_start_date'];
        }
        if (isset($map['loan_end_date'])) {
            $model->loanEndDate = $map['loan_end_date'];
        }
        if (isset($map['rate_type'])) {
            $model->rateType = $map['rate_type'];
        }
        if (isset($map['rate_unit'])) {
            $model->rateUnit = $map['rate_unit'];
        }
        if (isset($map['loan_int_rate'])) {
            $model->loanIntRate = $map['loan_int_rate'];
        }
        if (isset($map['curr_remain_corpus'])) {
            $model->currRemainCorpus = $map['curr_remain_corpus'];
        }
        if (isset($map['loan_repay_type'])) {
            $model->loanRepayType = $map['loan_repay_type'];
        }
        if (isset($map['last_count_int_date'])) {
            $model->lastCountIntDate = $map['last_count_int_date'];
        }
        if (isset($map['current_term'])) {
            $model->currentTerm = $map['current_term'];
        }
        if (isset($map['cur_repay_day'])) {
            $model->curRepayDay = $map['cur_repay_day'];
        }
        if (isset($map['cur_remain_amt'])) {
            $model->curRemainAmt = $map['cur_remain_amt'];
        }
        if (isset($map['current_paid_amt'])) {
            $model->currentPaidAmt = $map['current_paid_amt'];
        }
        if (isset($map['cur_principal_amount'])) {
            $model->curPrincipalAmount = $map['cur_principal_amount'];
        }
        if (isset($map['act_principal_amount'])) {
            $model->actPrincipalAmount = $map['act_principal_amount'];
        }
        if (isset($map['cur_interest_amount'])) {
            $model->curInterestAmount = $map['cur_interest_amount'];
        }
        if (isset($map['act_interest_amount'])) {
            $model->actInterestAmount = $map['act_interest_amount'];
        }
        if (isset($map['cur_normal_interest_amt'])) {
            $model->curNormalInterestAmt = $map['cur_normal_interest_amt'];
        }
        if (isset($map['act_cur_normal_interest_amt'])) {
            $model->actCurNormalInterestAmt = $map['act_cur_normal_interest_amt'];
        }
        if (isset($map['cur_principal_penalty_amt'])) {
            $model->curPrincipalPenaltyAmt = $map['cur_principal_penalty_amt'];
        }
        if (isset($map['act_cur_principal_penalty_amt'])) {
            $model->actCurPrincipalPenaltyAmt = $map['act_cur_principal_penalty_amt'];
        }
        if (isset($map['cur_interest_penalty_amt'])) {
            $model->curInterestPenaltyAmt = $map['cur_interest_penalty_amt'];
        }
        if (isset($map['act_cur_interest_penalty_amt'])) {
            $model->actCurInterestPenaltyAmt = $map['act_cur_interest_penalty_amt'];
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }
        if (isset($map['loan_status'])) {
            $model->loanStatus = $map['loan_status'];
        }
        if (isset($map['total_owe_corpus_interest'])) {
            $model->totalOweCorpusInterest = $map['total_owe_corpus_interest'];
        }

        return $model;
    }
}
