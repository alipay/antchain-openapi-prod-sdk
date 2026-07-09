<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OrderPushInfo extends Model
{
    // 订单号
    /**
     * @example 208395
     *
     * @var string
     */
    public $orderId;

    // 时间戳，取订单上链timestamp字段
    /**
     * @example 1665490037182
     *
     * @var string
     */
    public $orderCollectTime;

    // 订单总金额
    /**
     * @example 12000.37
     *
     * @var string
     */
    public $totalAmount;

    // 租户id
    /**
     * @example 1
     *
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'orderId'          => 'order_id',
        'orderCollectTime' => 'order_collect_time',
        'totalAmount'      => 'total_amount',
        'tenantId'         => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderCollectTime', $this->orderCollectTime, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderCollectTime) {
            $res['order_collect_time'] = $this->orderCollectTime;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderPushInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_collect_time'])) {
            $model->orderCollectTime = $map['order_collect_time'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
