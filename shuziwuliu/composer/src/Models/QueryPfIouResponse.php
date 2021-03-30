<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryPfIouResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 执行年利率
    /**
     * @var string
     */
    public $annualInterestRate;

    // 借据Id
    /**
     * @var string
     */
    public $creditId;

    // 借据到期日
    /**
     * @var string
     */
    public $interestBearingEnd;

    // 借据起息日
    /**
     * @var string
     */
    public $interestBearingStart;

    // 发放金额
    /**
     * @var string
     */
    public $issuedAmount;

    // 贷款性质 0-正常 1-展期 2-一类逾期 3-二类逾期 4-呆滞 5-呆帐
    /**
     * @var string
     */
    public $loanNature;

    // 贷款状态 销户=结清 0-正常 1-销户 5-已发放未复核入账
    /**
     * @var string
     */
    public $loanStatus;

    // 下次结息日期
    /**
     * @var string
     */
    public $nextParsingDate;

    // 逾期计息方式 0-逾期利率 1-逾期罚息比例 2-协议违约利率
    /**
     * @var string
     */
    public $odiCalType;

    // 逾期罚息浮动比率
    /**
     * @var string
     */
    public $opiFloatingRatio;

    // 贷款入账账号
    /**
     * @var string
     */
    public $payAccount;

    // 本金余额
    /**
     * @var string
     */
    public $principalBalance;

    // 还款账号
    /**
     * @var string
     */
    public $repayAccount;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'annualInterestRate'   => 'annual_interest_rate',
        'creditId'             => 'credit_id',
        'interestBearingEnd'   => 'interest_bearing_end',
        'interestBearingStart' => 'interest_bearing_start',
        'issuedAmount'         => 'issued_amount',
        'loanNature'           => 'loan_nature',
        'loanStatus'           => 'loan_status',
        'nextParsingDate'      => 'next_parsing_date',
        'odiCalType'           => 'odi_cal_type',
        'opiFloatingRatio'     => 'opi_floating_ratio',
        'payAccount'           => 'pay_account',
        'principalBalance'     => 'principal_balance',
        'repayAccount'         => 'repay_account',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->annualInterestRate) {
            $res['annual_interest_rate'] = $this->annualInterestRate;
        }
        if (null !== $this->creditId) {
            $res['credit_id'] = $this->creditId;
        }
        if (null !== $this->interestBearingEnd) {
            $res['interest_bearing_end'] = $this->interestBearingEnd;
        }
        if (null !== $this->interestBearingStart) {
            $res['interest_bearing_start'] = $this->interestBearingStart;
        }
        if (null !== $this->issuedAmount) {
            $res['issued_amount'] = $this->issuedAmount;
        }
        if (null !== $this->loanNature) {
            $res['loan_nature'] = $this->loanNature;
        }
        if (null !== $this->loanStatus) {
            $res['loan_status'] = $this->loanStatus;
        }
        if (null !== $this->nextParsingDate) {
            $res['next_parsing_date'] = $this->nextParsingDate;
        }
        if (null !== $this->odiCalType) {
            $res['odi_cal_type'] = $this->odiCalType;
        }
        if (null !== $this->opiFloatingRatio) {
            $res['opi_floating_ratio'] = $this->opiFloatingRatio;
        }
        if (null !== $this->payAccount) {
            $res['pay_account'] = $this->payAccount;
        }
        if (null !== $this->principalBalance) {
            $res['principal_balance'] = $this->principalBalance;
        }
        if (null !== $this->repayAccount) {
            $res['repay_account'] = $this->repayAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPfIouResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['annual_interest_rate'])) {
            $model->annualInterestRate = $map['annual_interest_rate'];
        }
        if (isset($map['credit_id'])) {
            $model->creditId = $map['credit_id'];
        }
        if (isset($map['interest_bearing_end'])) {
            $model->interestBearingEnd = $map['interest_bearing_end'];
        }
        if (isset($map['interest_bearing_start'])) {
            $model->interestBearingStart = $map['interest_bearing_start'];
        }
        if (isset($map['issued_amount'])) {
            $model->issuedAmount = $map['issued_amount'];
        }
        if (isset($map['loan_nature'])) {
            $model->loanNature = $map['loan_nature'];
        }
        if (isset($map['loan_status'])) {
            $model->loanStatus = $map['loan_status'];
        }
        if (isset($map['next_parsing_date'])) {
            $model->nextParsingDate = $map['next_parsing_date'];
        }
        if (isset($map['odi_cal_type'])) {
            $model->odiCalType = $map['odi_cal_type'];
        }
        if (isset($map['opi_floating_ratio'])) {
            $model->opiFloatingRatio = $map['opi_floating_ratio'];
        }
        if (isset($map['pay_account'])) {
            $model->payAccount = $map['pay_account'];
        }
        if (isset($map['principal_balance'])) {
            $model->principalBalance = $map['principal_balance'];
        }
        if (isset($map['repay_account'])) {
            $model->repayAccount = $map['repay_account'];
        }

        return $model;
    }
}
