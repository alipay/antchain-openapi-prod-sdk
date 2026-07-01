<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryDeductRefundInfo extends Model
{
    // PAYERIDNUMBER
    /**
     * @example 付款方ID
     *
     * @var string
     */
    public $payerId;

    // 退款金额，单位分
    /**
     * @example 100
     *
     * @var int
     */
    public $amount;

    // 代扣计划ID
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269_1
     *
     * @var string
     */
    public $order;

    // 退款操作发起时间
    /**
     * @example 1589198173000
     *
     * @var string
     */
    public $timestamp;
    protected $_name = [
        'payerId'   => 'payer_id',
        'amount'    => 'amount',
        'order'     => 'order',
        'timestamp' => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('payerId', $this->payerId, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('order', $this->order, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payerId) {
            $res['payer_id'] = $this->payerId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractNotaryDeductRefundInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['payer_id'])) {
            $model->payerId = $map['payer_id'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
