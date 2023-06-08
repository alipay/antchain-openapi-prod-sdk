<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEFINCASHIER\Models;

use AlibabaCloud\Tea\Model;

class AmountItem extends Model
{
    // 余额，单位元
    /**
     * @example 0.01
     *
     * @var string
     */
    public $balanceAmount;

    // 币种，CNY-人民币
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;

    // 冻结余额，单位元
    /**
     * @example 0.01
     *
     * @var string
     */
    public $frozenBalanceAmount;
    protected $_name = [
        'balanceAmount'       => 'balance_amount',
        'currency'            => 'currency',
        'frozenBalanceAmount' => 'frozen_balance_amount',
    ];

    public function validate()
    {
        Model::validateRequired('balanceAmount', $this->balanceAmount, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('frozenBalanceAmount', $this->frozenBalanceAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->balanceAmount) {
            $res['balance_amount'] = $this->balanceAmount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->frozenBalanceAmount) {
            $res['frozen_balance_amount'] = $this->frozenBalanceAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AmountItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['balance_amount'])) {
            $model->balanceAmount = $map['balance_amount'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['frozen_balance_amount'])) {
            $model->frozenBalanceAmount = $map['frozen_balance_amount'];
        }

        return $model;
    }
}
