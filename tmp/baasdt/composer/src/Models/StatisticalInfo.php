<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class StatisticalInfo extends Model
{
    // 可用于消费的信用Token等值金额(单位:元, 精确到小数点后12位)
    /**
     * @example 100.22
     *
     * @var string
     */
    public $creditTokenBalance;

    // 可用于消费的Token等值金额(单位:元, 精确到小数点后12位)
    /**
     * @example 10.01
     *
     * @var string
     */
    public $debitTokenBalance;

    // 目前持有的他人Token的金额(单位:元, 精确到小数点后12位)
    /**
     * @example 100.00
     *
     * @var string
     */
    public $otherTokenBalance;

    // 已消费的累积金额(单位:元, 精确到小数点后12位)
    /**
     * @example 100.00
     *
     * @var string
     */
    public $usedTokenBalance;
    protected $_name = [
        'creditTokenBalance' => 'credit_token_balance',
        'debitTokenBalance'  => 'debit_token_balance',
        'otherTokenBalance'  => 'other_token_balance',
        'usedTokenBalance'   => 'used_token_balance',
    ];

    public function validate()
    {
        Model::validateRequired('creditTokenBalance', $this->creditTokenBalance, true);
        Model::validateRequired('debitTokenBalance', $this->debitTokenBalance, true);
        Model::validateRequired('otherTokenBalance', $this->otherTokenBalance, true);
        Model::validateRequired('usedTokenBalance', $this->usedTokenBalance, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creditTokenBalance) {
            $res['credit_token_balance'] = $this->creditTokenBalance;
        }
        if (null !== $this->debitTokenBalance) {
            $res['debit_token_balance'] = $this->debitTokenBalance;
        }
        if (null !== $this->otherTokenBalance) {
            $res['other_token_balance'] = $this->otherTokenBalance;
        }
        if (null !== $this->usedTokenBalance) {
            $res['used_token_balance'] = $this->usedTokenBalance;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StatisticalInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['credit_token_balance'])) {
            $model->creditTokenBalance = $map['credit_token_balance'];
        }
        if (isset($map['debit_token_balance'])) {
            $model->debitTokenBalance = $map['debit_token_balance'];
        }
        if (isset($map['other_token_balance'])) {
            $model->otherTokenBalance = $map['other_token_balance'];
        }
        if (isset($map['used_token_balance'])) {
            $model->usedTokenBalance = $map['used_token_balance'];
        }

        return $model;
    }
}
