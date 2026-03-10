<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeLoanstatusLxResponse extends Model
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

    // 放款结果，
    // 0:放款成功
    // 1:放款失败
    // 2.查无此单(重新发起支用申请接口,需要保证支用申请接口幂等)
    // 99:处理中
    /**
     * @var int
     */
    public $loanResult;

    // 描述信息
    /**
     * @var string
     */
    public $msg;

    // 成功必填，资方返回的阶梯结算利率，供生成对资还款计划时使用
    /**
     * @var int
     */
    public $settleRate;

    // 成功必填，YYYY-MM-DD HH:MM:SS
    /**
     * @var string
     */
    public $paymentTime;

    // 放款成功金额，成功必填，单位:元
    /**
     * @var int
     */
    public $loanAmt;

    // 放款流水号，成功必填
    /**
     * @var string
     */
    public $capitalLoanNo;

    // 收款人银行卡卡号，放款成功提供实际的放款目标账户
    /**
     * @var string
     */
    public $debitAccountNo;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'loanResult'     => 'loan_result',
        'msg'            => 'msg',
        'settleRate'     => 'settle_rate',
        'paymentTime'    => 'payment_time',
        'loanAmt'        => 'loan_amt',
        'capitalLoanNo'  => 'capital_loan_no',
        'debitAccountNo' => 'debit_account_no',
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
        if (null !== $this->loanResult) {
            $res['loan_result'] = $this->loanResult;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->settleRate) {
            $res['settle_rate'] = $this->settleRate;
        }
        if (null !== $this->paymentTime) {
            $res['payment_time'] = $this->paymentTime;
        }
        if (null !== $this->loanAmt) {
            $res['loan_amt'] = $this->loanAmt;
        }
        if (null !== $this->capitalLoanNo) {
            $res['capital_loan_no'] = $this->capitalLoanNo;
        }
        if (null !== $this->debitAccountNo) {
            $res['debit_account_no'] = $this->debitAccountNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeLoanstatusLxResponse
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
        if (isset($map['loan_result'])) {
            $model->loanResult = $map['loan_result'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['settle_rate'])) {
            $model->settleRate = $map['settle_rate'];
        }
        if (isset($map['payment_time'])) {
            $model->paymentTime = $map['payment_time'];
        }
        if (isset($map['loan_amt'])) {
            $model->loanAmt = $map['loan_amt'];
        }
        if (isset($map['capital_loan_no'])) {
            $model->capitalLoanNo = $map['capital_loan_no'];
        }
        if (isset($map['debit_account_no'])) {
            $model->debitAccountNo = $map['debit_account_no'];
        }

        return $model;
    }
}
