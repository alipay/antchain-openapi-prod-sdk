<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class FinanceCertifyRentalInfo extends Model
{
    // 租期
    /**
     * @example 1
     *
     * @var int
     */
    public $rentTerm;

    // 本期扣款金额，123400表示12.34元
    /**
     * @example 123400
     *
     * @var int
     */
    public $rentalMoney;

    // 还款日期，格式为"2019-07-31 12:00:00"
    /**
     * @example 2019-07-31 12:00:00
     *
     * @var string
     */
    public $rentalReturnTime;
    protected $_name = [
        'rentTerm'         => 'rent_term',
        'rentalMoney'      => 'rental_money',
        'rentalReturnTime' => 'rental_return_time',
    ];

    public function validate()
    {
        Model::validateRequired('rentTerm', $this->rentTerm, true);
        Model::validateRequired('rentalMoney', $this->rentalMoney, true);
        Model::validateRequired('rentalReturnTime', $this->rentalReturnTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rentTerm) {
            $res['rent_term'] = $this->rentTerm;
        }
        if (null !== $this->rentalMoney) {
            $res['rental_money'] = $this->rentalMoney;
        }
        if (null !== $this->rentalReturnTime) {
            $res['rental_return_time'] = $this->rentalReturnTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinanceCertifyRentalInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rent_term'])) {
            $model->rentTerm = $map['rent_term'];
        }
        if (isset($map['rental_money'])) {
            $model->rentalMoney = $map['rental_money'];
        }
        if (isset($map['rental_return_time'])) {
            $model->rentalReturnTime = $map['rental_return_time'];
        }

        return $model;
    }
}
