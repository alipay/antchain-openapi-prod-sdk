<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplySupplierOrderProductOutput extends Model
{
    // 订单id
    /**
     * @example 2020223123
     *
     * @var string
     */
    public $orderId;

    // 链上采购单id
    /**
     * @example 23042340234234
     *
     * @var string
     */
    public $purOrderId;

    // 待采购：READY_DELIVER
    // 已采购：DELIVERED
    // 已拒发：REJECTED
    // 已退货：RETURNED
    // 已取消：CANCELED
    /**
     * @example 链上采购状态
     *
     * @var string
     */
    public $purOrderStatus;

    // 供应商id
    /**
     * @example ABCDEFGH
     *
     * @var string
     */
    public $supplierId;
    protected $_name = [
        'orderId'        => 'order_id',
        'purOrderId'     => 'pur_order_id',
        'purOrderStatus' => 'pur_order_status',
        'supplierId'     => 'supplier_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('purOrderId', $this->purOrderId, true);
        Model::validateRequired('purOrderStatus', $this->purOrderStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->purOrderId) {
            $res['pur_order_id'] = $this->purOrderId;
        }
        if (null !== $this->purOrderStatus) {
            $res['pur_order_status'] = $this->purOrderStatus;
        }
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplySupplierOrderProductOutput
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['pur_order_id'])) {
            $model->purOrderId = $map['pur_order_id'];
        }
        if (isset($map['pur_order_status'])) {
            $model->purOrderStatus = $map['pur_order_status'];
        }
        if (isset($map['supplier_id'])) {
            $model->supplierId = $map['supplier_id'];
        }

        return $model;
    }
}
