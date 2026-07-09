<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RentBillItem extends Model
{
    // 租约分期ID
    /**
     * @example 12321321
     *
     * @var string
     */
    public $billItemId;

    // 租约分期名称
    /**
     * @example 第几期
     *
     * @var string
     */
    public $billItemName;

    // 租期开始日期
    /**
     * @example 2006-01-02 15:04:05
     *
     * @var string
     */
    public $billItemBegin;

    // 租期结束日期
    /**
     * @example 2006-02-02 15:04:05
     *
     * @var string
     */
    public $billItemEnd;

    // 租约金额
    /**
     * @example 5000
     *
     * @var string
     */
    public $billItemMoney;

    // 租约支付状态
    /**
     * @example 待支付，已支付，支付失败
     *
     * @var string
     */
    public $paymentState;
    protected $_name = [
        'billItemId'    => 'bill_item_id',
        'billItemName'  => 'bill_item_name',
        'billItemBegin' => 'bill_item_begin',
        'billItemEnd'   => 'bill_item_end',
        'billItemMoney' => 'bill_item_money',
        'paymentState'  => 'payment_state',
    ];

    public function validate()
    {
        Model::validateRequired('billItemId', $this->billItemId, true);
        Model::validateRequired('billItemBegin', $this->billItemBegin, true);
        Model::validateRequired('billItemEnd', $this->billItemEnd, true);
        Model::validateRequired('billItemMoney', $this->billItemMoney, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->billItemId) {
            $res['bill_item_id'] = $this->billItemId;
        }
        if (null !== $this->billItemName) {
            $res['bill_item_name'] = $this->billItemName;
        }
        if (null !== $this->billItemBegin) {
            $res['bill_item_begin'] = $this->billItemBegin;
        }
        if (null !== $this->billItemEnd) {
            $res['bill_item_end'] = $this->billItemEnd;
        }
        if (null !== $this->billItemMoney) {
            $res['bill_item_money'] = $this->billItemMoney;
        }
        if (null !== $this->paymentState) {
            $res['payment_state'] = $this->paymentState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RentBillItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bill_item_id'])) {
            $model->billItemId = $map['bill_item_id'];
        }
        if (isset($map['bill_item_name'])) {
            $model->billItemName = $map['bill_item_name'];
        }
        if (isset($map['bill_item_begin'])) {
            $model->billItemBegin = $map['bill_item_begin'];
        }
        if (isset($map['bill_item_end'])) {
            $model->billItemEnd = $map['bill_item_end'];
        }
        if (isset($map['bill_item_money'])) {
            $model->billItemMoney = $map['bill_item_money'];
        }
        if (isset($map['payment_state'])) {
            $model->paymentState = $map['payment_state'];
        }

        return $model;
    }
}
