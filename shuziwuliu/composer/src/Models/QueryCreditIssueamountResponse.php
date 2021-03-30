<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditIssueamountResponse extends Model
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

    // 剩余金额
    /**
     * @var string
     */
    public $balanceAmt;

    // 已清分金额
    /**
     * @var string
     */
    public $cashAmt;

    // 欠的滞纳金金额
    /**
     * @var string
     */
    public $debtIntAmt;

    // 欠款本金金额
    /**
     * @var string
     */
    public $debtPrinAmt;

    // 该凭证下的总欠款金额
    /**
     * @var string
     */
    public $debtTotalAmt;

    // 信用凭证到期时间
    /**
     * @var string
     */
    public $expireDate;

    // 冻结的金额
    /**
     * @var string
     */
    public $freezeAmt;

    // 信用凭证id
    /**
     * @var string
     */
    public $issueId;

    // 累计已还滞纳金金额
    /**
     * @var string
     */
    public $paidIntAmt;

    // 凭证总金额
    /**
     * @var string
     */
    public $ticketAmt;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'balanceAmt'   => 'balance_amt',
        'cashAmt'      => 'cash_amt',
        'debtIntAmt'   => 'debt_int_amt',
        'debtPrinAmt'  => 'debt_prin_amt',
        'debtTotalAmt' => 'debt_total_amt',
        'expireDate'   => 'expire_date',
        'freezeAmt'    => 'freeze_amt',
        'issueId'      => 'issue_id',
        'paidIntAmt'   => 'paid_int_amt',
        'ticketAmt'    => 'ticket_amt',
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
        if (null !== $this->balanceAmt) {
            $res['balance_amt'] = $this->balanceAmt;
        }
        if (null !== $this->cashAmt) {
            $res['cash_amt'] = $this->cashAmt;
        }
        if (null !== $this->debtIntAmt) {
            $res['debt_int_amt'] = $this->debtIntAmt;
        }
        if (null !== $this->debtPrinAmt) {
            $res['debt_prin_amt'] = $this->debtPrinAmt;
        }
        if (null !== $this->debtTotalAmt) {
            $res['debt_total_amt'] = $this->debtTotalAmt;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->freezeAmt) {
            $res['freeze_amt'] = $this->freezeAmt;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->paidIntAmt) {
            $res['paid_int_amt'] = $this->paidIntAmt;
        }
        if (null !== $this->ticketAmt) {
            $res['ticket_amt'] = $this->ticketAmt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCreditIssueamountResponse
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
        if (isset($map['balance_amt'])) {
            $model->balanceAmt = $map['balance_amt'];
        }
        if (isset($map['cash_amt'])) {
            $model->cashAmt = $map['cash_amt'];
        }
        if (isset($map['debt_int_amt'])) {
            $model->debtIntAmt = $map['debt_int_amt'];
        }
        if (isset($map['debt_prin_amt'])) {
            $model->debtPrinAmt = $map['debt_prin_amt'];
        }
        if (isset($map['debt_total_amt'])) {
            $model->debtTotalAmt = $map['debt_total_amt'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['freeze_amt'])) {
            $model->freezeAmt = $map['freeze_amt'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['paid_int_amt'])) {
            $model->paidIntAmt = $map['paid_int_amt'];
        }
        if (isset($map['ticket_amt'])) {
            $model->ticketAmt = $map['ticket_amt'];
        }

        return $model;
    }
}
