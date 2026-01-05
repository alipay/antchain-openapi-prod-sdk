<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class WithdrawalOrderDTO extends Model
{
    // orderId
    /**
     * @example 2011
     *
     * @var string
     */
    public $orderId;

    // orderDesc
    /**
     * @example order description test
     *
     * @var string
     */
    public $orderDesc;

    // orderType
    /**
     * @example WITHDRAWAL
     *
     * @var string
     */
    public $orderType;

    // orderStatus:INIT PENDING_CONFIRMATION PENDING_DEPOSIT RUNNING SUCCESS FAILED EXPIRED_CLOSED REFUND REJECTED
    /**
     * @example PENDING
     *
     * @var string
     */
    public $orderStatus;

    // withdrawal Amount
    /**
     * @example 1.01
     *
     * @var string
     */
    public $withdrawalAmount;
    protected $_name = [
        'orderId'          => 'order_id',
        'orderDesc'        => 'order_desc',
        'orderType'        => 'order_type',
        'orderStatus'      => 'order_status',
        'withdrawalAmount' => 'withdrawal_amount',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderDesc', $this->orderDesc, true);
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('withdrawalAmount', $this->withdrawalAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderDesc) {
            $res['order_desc'] = $this->orderDesc;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->withdrawalAmount) {
            $res['withdrawal_amount'] = $this->withdrawalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WithdrawalOrderDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_desc'])) {
            $model->orderDesc = $map['order_desc'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['withdrawal_amount'])) {
            $model->withdrawalAmount = $map['withdrawal_amount'];
        }

        return $model;
    }
}
