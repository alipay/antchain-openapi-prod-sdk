<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryDeductCancelInfo extends Model
{
    // 付款方的区块链合同签署账号
    /**
     * @example someId
     *
     * @var string
     */
    public $payerId;

    // 是否取消成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $cancelStatus;

    // 取消操作发起时间
    /**
     * @example 1589198173000
     *
     * @var string
     */
    public $timestamp;

    // 代扣订单号，多个订单号之间以‘,’隔开
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269_1
     *
     * @var string
     */
    public $orders;
    protected $_name = [
        'payerId'      => 'payer_id',
        'cancelStatus' => 'cancel_status',
        'timestamp'    => 'timestamp',
        'orders'       => 'orders',
    ];

    public function validate()
    {
        Model::validateRequired('payerId', $this->payerId, true);
        Model::validateRequired('cancelStatus', $this->cancelStatus, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('orders', $this->orders, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payerId) {
            $res['payer_id'] = $this->payerId;
        }
        if (null !== $this->cancelStatus) {
            $res['cancel_status'] = $this->cancelStatus;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractNotaryDeductCancelInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['payer_id'])) {
            $model->payerId = $map['payer_id'];
        }
        if (isset($map['cancel_status'])) {
            $model->cancelStatus = $map['cancel_status'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['orders'])) {
            $model->orders = $map['orders'];
        }

        return $model;
    }
}
