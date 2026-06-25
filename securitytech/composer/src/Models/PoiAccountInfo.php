<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PoiAccountInfo extends Model
{
    // 账户ID
    /**
     * @example 0
     *
     * @var string
     */
    public $accountId;

    // 用户已支出金额
    /**
     * @example 0
     *
     * @var string
     */
    public $expenseAmount;

    // 商城已消费金额
    /**
     * @example 0
     *
     * @var string
     */
    public $consumeAmount;

    // 商城已冻结金额
    /**
     * @example 0
     *
     * @var string
     */
    public $frozenAmount;

    // 是否逾期
    /**
     * @example TRUE
     *
     * @var string
     */
    public $overdue;

    // 已还金额
    /**
     * @example 0
     *
     * @var string
     */
    public $repayAmount;

    // 解约后剩余应还金额
    /**
     * @example 0
     *
     * @var string
     */
    public $remainingAmount;

    // 解约后退还用户金额
    /**
     * @example 0
     *
     * @var string
     */
    public $refundAmountToUser;
    protected $_name = [
        'accountId'          => 'account_id',
        'expenseAmount'      => 'expense_amount',
        'consumeAmount'      => 'consume_amount',
        'frozenAmount'       => 'frozen_amount',
        'overdue'            => 'overdue',
        'repayAmount'        => 'repay_amount',
        'remainingAmount'    => 'remaining_amount',
        'refundAmountToUser' => 'refund_amount_to_user',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->expenseAmount) {
            $res['expense_amount'] = $this->expenseAmount;
        }
        if (null !== $this->consumeAmount) {
            $res['consume_amount'] = $this->consumeAmount;
        }
        if (null !== $this->frozenAmount) {
            $res['frozen_amount'] = $this->frozenAmount;
        }
        if (null !== $this->overdue) {
            $res['overdue'] = $this->overdue;
        }
        if (null !== $this->repayAmount) {
            $res['repay_amount'] = $this->repayAmount;
        }
        if (null !== $this->remainingAmount) {
            $res['remaining_amount'] = $this->remainingAmount;
        }
        if (null !== $this->refundAmountToUser) {
            $res['refund_amount_to_user'] = $this->refundAmountToUser;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PoiAccountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['expense_amount'])) {
            $model->expenseAmount = $map['expense_amount'];
        }
        if (isset($map['consume_amount'])) {
            $model->consumeAmount = $map['consume_amount'];
        }
        if (isset($map['frozen_amount'])) {
            $model->frozenAmount = $map['frozen_amount'];
        }
        if (isset($map['overdue'])) {
            $model->overdue = $map['overdue'];
        }
        if (isset($map['repay_amount'])) {
            $model->repayAmount = $map['repay_amount'];
        }
        if (isset($map['remaining_amount'])) {
            $model->remainingAmount = $map['remaining_amount'];
        }
        if (isset($map['refund_amount_to_user'])) {
            $model->refundAmountToUser = $map['refund_amount_to_user'];
        }

        return $model;
    }
}
