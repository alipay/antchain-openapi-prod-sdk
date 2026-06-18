<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class AccountInfo extends Model
{
    // STRING	账户ID
    /**
     * @example 0
     *
     * @var string
     */
    public $accountId;

    // 已消费金额
    /**
     * @example 0
     *
     * @var string
     */
    public $consumeAmount;

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

    // 可退还用户金额
    /**
     * @example 0
     *
     * @var string
     */
    public $refundAmountToUser;

    // 可退还资方金额
    /**
     * @example 0
     *
     * @var string
     */
    public $refundAmountToInvestor;
    protected $_name = [
        'accountId'              => 'account_id',
        'consumeAmount'          => 'consume_amount',
        'repayAmount'            => 'repay_amount',
        'remainingAmount'        => 'remaining_amount',
        'refundAmountToUser'     => 'refund_amount_to_user',
        'refundAmountToInvestor' => 'refund_amount_to_investor',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->consumeAmount) {
            $res['consume_amount'] = $this->consumeAmount;
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
        if (null !== $this->refundAmountToInvestor) {
            $res['refund_amount_to_investor'] = $this->refundAmountToInvestor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['consume_amount'])) {
            $model->consumeAmount = $map['consume_amount'];
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
        if (isset($map['refund_amount_to_investor'])) {
            $model->refundAmountToInvestor = $map['refund_amount_to_investor'];
        }

        return $model;
    }
}
