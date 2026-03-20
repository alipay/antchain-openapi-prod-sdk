<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcRepayQuery extends Model
{
    // 合同编号
    /**
     * @example 91234500123400000R
     *
     * @var string
     */
    public $contractNo;

    // 借据号
    /**
     * @example 91234500123400000R
     *
     * @var string
     */
    public $loanNo;

    // 贷款金额
    /**
     * @example 25.34
     *
     * @var string
     */
    public $loanamt;

    // 实时借据状态
    /**
     * @example 1
     *
     * @var string
     */
    public $loanStatus;

    // 总期次
    /**
     * @example 25
     *
     * @var string
     */
    public $totalNum;

    // 还款方式
    /**
     * @example 1
     *
     * @var string
     */
    public $repayType;

    // 应还总金额
    /**
     * @example 25.34
     *
     * @var string
     */
    public $repayAmount;

    // 实还总金额
    /**
     * @example 2.34
     *
     * @var string
     */
    public $actualSum;

    // 这笔借据所在期次的还款日。格式:yyyy/MM/dd
    /**
     * @example 2023/05/01
     *
     * @var string
     */
    public $duedate;

    // 实还日期 格式:yyyy/MM/dd
    /**
     * @example 2023/05/01
     *
     * @var string
     */
    public $actualpayDate;

    // 应还本金 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $corpus;

    // 实还本金 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $actualPayprincipalAmt;

    // 应还利息 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $interest;

    // 实还利息 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $actualPayinterestAmt;

    // 应还罚息 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $payPrincipalPenaltyAmt;

    // 实还罚息 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $actualPayprincipalPenaltyAmt;

    // 应还复利 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $payInterestPenaltyAmt;

    // 实还复利 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $actualPayinterestPenaltyAmt;

    // 应还贴息利息 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $paySplitinterestAmt;

    // 实还贴息利息 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $actualPaysplitinterestAmt;

    // 币种
    /**
     * @example RMB
     *
     * @var string
     */
    public $currency;

    // 还款期次 这笔还款对应期次。单位:整数
    /**
     * @example 25
     *
     * @var string
     */
    public $repaymentNum;

    // 优惠金额 单位:元,格式:数字,小数点后两位
    /**
     * @example 1.23
     *
     * @var string
     */
    public $reduceAmt;

    // 还款类型
    /**
     * @example 1
     *
     * @var string
     */
    public $billType;

    // 流水号
    /**
     * @example PANO124414515555
     *
     * @var string
     */
    public $transactionNo;

    // 还款交易流水号 若为还款，则与还款通知流水保持一致
    /**
     * @example PANO124414515555
     *
     * @var string
     */
    public $transactionSerialno;

    // 是否附言还款
    /**
     * @example 1
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'contractNo'                   => 'contract_no',
        'loanNo'                       => 'loan_no',
        'loanamt'                      => 'loanamt',
        'loanStatus'                   => 'loan_status',
        'totalNum'                     => 'total_num',
        'repayType'                    => 'repay_type',
        'repayAmount'                  => 'repay_amount',
        'actualSum'                    => 'actual_sum',
        'duedate'                      => 'duedate',
        'actualpayDate'                => 'actualpay_date',
        'corpus'                       => 'corpus',
        'actualPayprincipalAmt'        => 'actual_payprincipal_amt',
        'interest'                     => 'interest',
        'actualPayinterestAmt'         => 'actual_payinterest_amt',
        'payPrincipalPenaltyAmt'       => 'pay_principal_penalty_amt',
        'actualPayprincipalPenaltyAmt' => 'actual_payprincipal_penalty_amt',
        'payInterestPenaltyAmt'        => 'pay_interest_penalty_amt',
        'actualPayinterestPenaltyAmt'  => 'actual_payinterest_penalty_amt',
        'paySplitinterestAmt'          => 'pay_splitinterest_amt',
        'actualPaysplitinterestAmt'    => 'actual_paysplitinterest_amt',
        'currency'                     => 'currency',
        'repaymentNum'                 => 'repayment_num',
        'reduceAmt'                    => 'reduce_amt',
        'billType'                     => 'bill_type',
        'transactionNo'                => 'transaction_no',
        'transactionSerialno'          => 'transaction_serialno',
        'remark'                       => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('contractNo', $this->contractNo, true);
        Model::validateRequired('loanNo', $this->loanNo, true);
        Model::validateRequired('loanamt', $this->loanamt, true);
        Model::validateRequired('loanStatus', $this->loanStatus, true);
        Model::validateRequired('totalNum', $this->totalNum, true);
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('transactionSerialno', $this->transactionSerialno, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->loanNo) {
            $res['loan_no'] = $this->loanNo;
        }
        if (null !== $this->loanamt) {
            $res['loanamt'] = $this->loanamt;
        }
        if (null !== $this->loanStatus) {
            $res['loan_status'] = $this->loanStatus;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->repayAmount) {
            $res['repay_amount'] = $this->repayAmount;
        }
        if (null !== $this->actualSum) {
            $res['actual_sum'] = $this->actualSum;
        }
        if (null !== $this->duedate) {
            $res['duedate'] = $this->duedate;
        }
        if (null !== $this->actualpayDate) {
            $res['actualpay_date'] = $this->actualpayDate;
        }
        if (null !== $this->corpus) {
            $res['corpus'] = $this->corpus;
        }
        if (null !== $this->actualPayprincipalAmt) {
            $res['actual_payprincipal_amt'] = $this->actualPayprincipalAmt;
        }
        if (null !== $this->interest) {
            $res['interest'] = $this->interest;
        }
        if (null !== $this->actualPayinterestAmt) {
            $res['actual_payinterest_amt'] = $this->actualPayinterestAmt;
        }
        if (null !== $this->payPrincipalPenaltyAmt) {
            $res['pay_principal_penalty_amt'] = $this->payPrincipalPenaltyAmt;
        }
        if (null !== $this->actualPayprincipalPenaltyAmt) {
            $res['actual_payprincipal_penalty_amt'] = $this->actualPayprincipalPenaltyAmt;
        }
        if (null !== $this->payInterestPenaltyAmt) {
            $res['pay_interest_penalty_amt'] = $this->payInterestPenaltyAmt;
        }
        if (null !== $this->actualPayinterestPenaltyAmt) {
            $res['actual_payinterest_penalty_amt'] = $this->actualPayinterestPenaltyAmt;
        }
        if (null !== $this->paySplitinterestAmt) {
            $res['pay_splitinterest_amt'] = $this->paySplitinterestAmt;
        }
        if (null !== $this->actualPaysplitinterestAmt) {
            $res['actual_paysplitinterest_amt'] = $this->actualPaysplitinterestAmt;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->repaymentNum) {
            $res['repayment_num'] = $this->repaymentNum;
        }
        if (null !== $this->reduceAmt) {
            $res['reduce_amt'] = $this->reduceAmt;
        }
        if (null !== $this->billType) {
            $res['bill_type'] = $this->billType;
        }
        if (null !== $this->transactionNo) {
            $res['transaction_no'] = $this->transactionNo;
        }
        if (null !== $this->transactionSerialno) {
            $res['transaction_serialno'] = $this->transactionSerialno;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcRepayQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['loan_no'])) {
            $model->loanNo = $map['loan_no'];
        }
        if (isset($map['loanamt'])) {
            $model->loanamt = $map['loanamt'];
        }
        if (isset($map['loan_status'])) {
            $model->loanStatus = $map['loan_status'];
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['repay_amount'])) {
            $model->repayAmount = $map['repay_amount'];
        }
        if (isset($map['actual_sum'])) {
            $model->actualSum = $map['actual_sum'];
        }
        if (isset($map['duedate'])) {
            $model->duedate = $map['duedate'];
        }
        if (isset($map['actualpay_date'])) {
            $model->actualpayDate = $map['actualpay_date'];
        }
        if (isset($map['corpus'])) {
            $model->corpus = $map['corpus'];
        }
        if (isset($map['actual_payprincipal_amt'])) {
            $model->actualPayprincipalAmt = $map['actual_payprincipal_amt'];
        }
        if (isset($map['interest'])) {
            $model->interest = $map['interest'];
        }
        if (isset($map['actual_payinterest_amt'])) {
            $model->actualPayinterestAmt = $map['actual_payinterest_amt'];
        }
        if (isset($map['pay_principal_penalty_amt'])) {
            $model->payPrincipalPenaltyAmt = $map['pay_principal_penalty_amt'];
        }
        if (isset($map['actual_payprincipal_penalty_amt'])) {
            $model->actualPayprincipalPenaltyAmt = $map['actual_payprincipal_penalty_amt'];
        }
        if (isset($map['pay_interest_penalty_amt'])) {
            $model->payInterestPenaltyAmt = $map['pay_interest_penalty_amt'];
        }
        if (isset($map['actual_payinterest_penalty_amt'])) {
            $model->actualPayinterestPenaltyAmt = $map['actual_payinterest_penalty_amt'];
        }
        if (isset($map['pay_splitinterest_amt'])) {
            $model->paySplitinterestAmt = $map['pay_splitinterest_amt'];
        }
        if (isset($map['actual_paysplitinterest_amt'])) {
            $model->actualPaysplitinterestAmt = $map['actual_paysplitinterest_amt'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['repayment_num'])) {
            $model->repaymentNum = $map['repayment_num'];
        }
        if (isset($map['reduce_amt'])) {
            $model->reduceAmt = $map['reduce_amt'];
        }
        if (isset($map['bill_type'])) {
            $model->billType = $map['bill_type'];
        }
        if (isset($map['transaction_no'])) {
            $model->transactionNo = $map['transaction_no'];
        }
        if (isset($map['transaction_serialno'])) {
            $model->transactionSerialno = $map['transaction_serialno'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
