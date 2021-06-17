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

    // 应还本金，即放款金额
    /**
     * @var string
     */
    public $issuedAmount;

    // 还款银行名称
    /**
     * @var string
     */
    public $repayBankName;

    // 还款账号名称
    /**
     * @var string
     */
    public $repayAccName;

    // 还款账号
    /**
     * @var string
     */
    public $repayAccNo;

    // 实际已还本金
    /**
     * @var string
     */
    public $repayAmt;

    // 实际已还利息
    /**
     * @var string
     */
    public $repayInterest;

    // 实际已还总额
    /**
     * @var string
     */
    public $repayTotalAmt;

    // 借据状态
    /**
     * @var string
     */
    public $creditStatus;

    // 是否逾期,0是,1否
    /**
     * @var string
     */
    public $isOverdue;

    // 项目id
    /**
     * @var string
     */
    public $projectId;

    // 支用id
    /**
     * @var string
     */
    public $financingId;

    // 融资主体DID
    /**
     * @var string
     */
    public $financingSubjectDid;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'annualInterestRate'   => 'annual_interest_rate',
        'creditId'             => 'credit_id',
        'interestBearingEnd'   => 'interest_bearing_end',
        'interestBearingStart' => 'interest_bearing_start',
        'issuedAmount'         => 'issued_amount',
        'repayBankName'        => 'repay_bank_name',
        'repayAccName'         => 'repay_acc_name',
        'repayAccNo'           => 'repay_acc_no',
        'repayAmt'             => 'repay_amt',
        'repayInterest'        => 'repay_interest',
        'repayTotalAmt'        => 'repay_total_amt',
        'creditStatus'         => 'credit_status',
        'isOverdue'            => 'is_overdue',
        'projectId'            => 'project_id',
        'financingId'          => 'financing_id',
        'financingSubjectDid'  => 'financing_subject_did',
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
        if (null !== $this->repayBankName) {
            $res['repay_bank_name'] = $this->repayBankName;
        }
        if (null !== $this->repayAccName) {
            $res['repay_acc_name'] = $this->repayAccName;
        }
        if (null !== $this->repayAccNo) {
            $res['repay_acc_no'] = $this->repayAccNo;
        }
        if (null !== $this->repayAmt) {
            $res['repay_amt'] = $this->repayAmt;
        }
        if (null !== $this->repayInterest) {
            $res['repay_interest'] = $this->repayInterest;
        }
        if (null !== $this->repayTotalAmt) {
            $res['repay_total_amt'] = $this->repayTotalAmt;
        }
        if (null !== $this->creditStatus) {
            $res['credit_status'] = $this->creditStatus;
        }
        if (null !== $this->isOverdue) {
            $res['is_overdue'] = $this->isOverdue;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->financingId) {
            $res['financing_id'] = $this->financingId;
        }
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
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
        if (isset($map['repay_bank_name'])) {
            $model->repayBankName = $map['repay_bank_name'];
        }
        if (isset($map['repay_acc_name'])) {
            $model->repayAccName = $map['repay_acc_name'];
        }
        if (isset($map['repay_acc_no'])) {
            $model->repayAccNo = $map['repay_acc_no'];
        }
        if (isset($map['repay_amt'])) {
            $model->repayAmt = $map['repay_amt'];
        }
        if (isset($map['repay_interest'])) {
            $model->repayInterest = $map['repay_interest'];
        }
        if (isset($map['repay_total_amt'])) {
            $model->repayTotalAmt = $map['repay_total_amt'];
        }
        if (isset($map['credit_status'])) {
            $model->creditStatus = $map['credit_status'];
        }
        if (isset($map['is_overdue'])) {
            $model->isOverdue = $map['is_overdue'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['financing_id'])) {
            $model->financingId = $map['financing_id'];
        }
        if (isset($map['financing_subject_did'])) {
            $model->financingSubjectDid = $map['financing_subject_did'];
        }

        return $model;
    }
}
