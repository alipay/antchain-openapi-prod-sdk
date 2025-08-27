<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderRepayStrategy extends Model
{
    // 还款期数
    /**
     * @example 1
     *
     * @var int
     */
    public $termIndex;

    // 每期应还租金(分)
    /**
     * @example 10000
     *
     * @var int
     */
    public $rentalMoney;

    // 每期应付时间
    /**
     * @example 2024-10-21
     *
     * @var string
     */
    public $payDay;

    // 付款项目列表
    /**
     * @example
     *
     * @var PaymentItem[]
     */
    public $paymentItemList;
    protected $_name = [
        'termIndex'       => 'term_index',
        'rentalMoney'     => 'rental_money',
        'payDay'          => 'pay_day',
        'paymentItemList' => 'payment_item_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->termIndex) {
            $res['term_index'] = $this->termIndex;
        }
        if (null !== $this->rentalMoney) {
            $res['rental_money'] = $this->rentalMoney;
        }
        if (null !== $this->payDay) {
            $res['pay_day'] = $this->payDay;
        }
        if (null !== $this->paymentItemList) {
            $res['payment_item_list'] = [];
            if (null !== $this->paymentItemList && \is_array($this->paymentItemList)) {
                $n = 0;
                foreach ($this->paymentItemList as $item) {
                    $res['payment_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderRepayStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['term_index'])) {
            $model->termIndex = $map['term_index'];
        }
        if (isset($map['rental_money'])) {
            $model->rentalMoney = $map['rental_money'];
        }
        if (isset($map['pay_day'])) {
            $model->payDay = $map['pay_day'];
        }
        if (isset($map['payment_item_list'])) {
            if (!empty($map['payment_item_list'])) {
                $model->paymentItemList = [];
                $n                      = 0;
                foreach ($map['payment_item_list'] as $item) {
                    $model->paymentItemList[$n++] = null !== $item ? PaymentItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
