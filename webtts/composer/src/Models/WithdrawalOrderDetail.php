<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class WithdrawalOrderDetail extends Model
{
    // withdrawalAmount
    /**
     * @example 1.00
     *
     * @var string
     */
    public $withdrawalAmount;
    protected $_name = [
        'withdrawalAmount' => 'withdrawal_amount',
    ];

    public function validate()
    {
        Model::validateRequired('withdrawalAmount', $this->withdrawalAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->withdrawalAmount) {
            $res['withdrawal_amount'] = $this->withdrawalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WithdrawalOrderDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['withdrawal_amount'])) {
            $model->withdrawalAmount = $map['withdrawal_amount'];
        }

        return $model;
    }
}
