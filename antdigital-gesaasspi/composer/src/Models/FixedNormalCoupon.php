<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class FixedNormalCoupon extends Model
{
    // 【面额】 面额，单位：分。
    /**
     * @example 100
     *
     * @var int
     */
    public $couponAmount;

    // 【门槛】 使用券金额门槛，单位：分。
    /**
     * @example 100
     *
     * @var int
     */
    public $transactionMinimum;
    protected $_name = [
        'couponAmount'       => 'coupon_amount',
        'transactionMinimum' => 'transaction_minimum',
    ];

    public function validate()
    {
        Model::validateRequired('couponAmount', $this->couponAmount, true);
        Model::validateRequired('transactionMinimum', $this->transactionMinimum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->couponAmount) {
            $res['coupon_amount'] = $this->couponAmount;
        }
        if (null !== $this->transactionMinimum) {
            $res['transaction_minimum'] = $this->transactionMinimum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FixedNormalCoupon
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['coupon_amount'])) {
            $model->couponAmount = $map['coupon_amount'];
        }
        if (isset($map['transaction_minimum'])) {
            $model->transactionMinimum = $map['transaction_minimum'];
        }

        return $model;
    }
}
