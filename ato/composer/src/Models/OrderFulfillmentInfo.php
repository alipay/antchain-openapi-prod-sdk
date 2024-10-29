<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderFulfillmentInfo extends Model
{
    // 租期编号
    /**
     * @example 1
     *
     * @var int
     */
    public $leaseTermIndex;

    // 租期归还状态
    /**
     * @example CANCEL
     *
     * @var string
     */
    public $rentalReturnState;

    // 实际还款金额(分)
    /**
     * @example 123400
     *
     * @var int
     */
    public $realRepayMoney;

    // 租金(分)
    /**
     * @example 273800
     *
     * @var int
     */
    public $rentalMoney;

    // 每期实付时间
    /**
     * @example 2024-10-21 15:11:23.000
     *
     * @var string
     */
    public $returnTime;
    protected $_name = [
        'leaseTermIndex'    => 'lease_term_index',
        'rentalReturnState' => 'rental_return_state',
        'realRepayMoney'    => 'real_repay_money',
        'rentalMoney'       => 'rental_money',
        'returnTime'        => 'return_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->leaseTermIndex) {
            $res['lease_term_index'] = $this->leaseTermIndex;
        }
        if (null !== $this->rentalReturnState) {
            $res['rental_return_state'] = $this->rentalReturnState;
        }
        if (null !== $this->realRepayMoney) {
            $res['real_repay_money'] = $this->realRepayMoney;
        }
        if (null !== $this->rentalMoney) {
            $res['rental_money'] = $this->rentalMoney;
        }
        if (null !== $this->returnTime) {
            $res['return_time'] = $this->returnTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderFulfillmentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lease_term_index'])) {
            $model->leaseTermIndex = $map['lease_term_index'];
        }
        if (isset($map['rental_return_state'])) {
            $model->rentalReturnState = $map['rental_return_state'];
        }
        if (isset($map['real_repay_money'])) {
            $model->realRepayMoney = $map['real_repay_money'];
        }
        if (isset($map['rental_money'])) {
            $model->rentalMoney = $map['rental_money'];
        }
        if (isset($map['return_time'])) {
            $model->returnTime = $map['return_time'];
        }

        return $model;
    }
}
