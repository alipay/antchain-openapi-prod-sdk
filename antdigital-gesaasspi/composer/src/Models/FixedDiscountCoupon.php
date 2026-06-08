<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class FixedDiscountCoupon extends Model
{
    // 【最高折扣金额】 最高折扣金额，单位分
    /**
     * @example 100
     *
     * @var int
     */
    public $discountAmountMax;

    // 【折扣百分比】 折扣百分比，例如88-八八折
    /**
     * @example 88
     *
     * @var int
     */
    public $discountPercent;

    // 【门槛】 使用券金额门槛，单位分
    /**
     * @example 100
     *
     * @var int
     */
    public $transactionMinimum;
    protected $_name = [
        'discountAmountMax'  => 'discount_amount_max',
        'discountPercent'    => 'discount_percent',
        'transactionMinimum' => 'transaction_minimum',
    ];

    public function validate()
    {
        Model::validateRequired('discountAmountMax', $this->discountAmountMax, true);
        Model::validateRequired('discountPercent', $this->discountPercent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->discountAmountMax) {
            $res['discount_amount_max'] = $this->discountAmountMax;
        }
        if (null !== $this->discountPercent) {
            $res['discount_percent'] = $this->discountPercent;
        }
        if (null !== $this->transactionMinimum) {
            $res['transaction_minimum'] = $this->transactionMinimum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FixedDiscountCoupon
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['discount_amount_max'])) {
            $model->discountAmountMax = $map['discount_amount_max'];
        }
        if (isset($map['discount_percent'])) {
            $model->discountPercent = $map['discount_percent'];
        }
        if (isset($map['transaction_minimum'])) {
            $model->transactionMinimum = $map['transaction_minimum'];
        }

        return $model;
    }
}
