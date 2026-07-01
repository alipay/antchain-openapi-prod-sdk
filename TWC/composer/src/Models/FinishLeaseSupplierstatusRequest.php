<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class FinishLeaseSupplierstatusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 采购订单id，由采购平台生成
    /**
     * @var string
     */
    public $supplierOrderNo;

    // 租赁订单id
    /**
     * @var string
     */
    public $orderId;

    // 租赁方id，非采购平台
    /**
     * @var string
     */
    public $leaseId;

    // 当前的采购状态
    /**
     * @var string
     */
    public $supplierOrderStatus;

    // 物流订单id
    /**
     * @var SupplierLogisticInfo
     */
    public $supplierLogisticInfo;

    // 采购平台回传的商品订单信息
    /**
     * @var SupplierOrderProductInfo[]
     */
    public $supplierOrderProductInfos;

    // 供应商id
    /**
     * @var string
     */
    public $supplierId;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'supplierOrderNo'           => 'supplier_order_no',
        'orderId'                   => 'order_id',
        'leaseId'                   => 'lease_id',
        'supplierOrderStatus'       => 'supplier_order_status',
        'supplierLogisticInfo'      => 'supplier_logistic_info',
        'supplierOrderProductInfos' => 'supplier_order_product_infos',
        'supplierId'                => 'supplier_id',
    ];

    public function validate()
    {
        Model::validateRequired('supplierOrderNo', $this->supplierOrderNo, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('supplierOrderStatus', $this->supplierOrderStatus, true);
        Model::validateRequired('supplierLogisticInfo', $this->supplierLogisticInfo, true);
        Model::validateRequired('supplierOrderProductInfos', $this->supplierOrderProductInfos, true);
        Model::validateRequired('supplierId', $this->supplierId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->supplierOrderNo) {
            $res['supplier_order_no'] = $this->supplierOrderNo;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->supplierOrderStatus) {
            $res['supplier_order_status'] = $this->supplierOrderStatus;
        }
        if (null !== $this->supplierLogisticInfo) {
            $res['supplier_logistic_info'] = null !== $this->supplierLogisticInfo ? $this->supplierLogisticInfo->toMap() : null;
        }
        if (null !== $this->supplierOrderProductInfos) {
            $res['supplier_order_product_infos'] = [];
            if (null !== $this->supplierOrderProductInfos && \is_array($this->supplierOrderProductInfos)) {
                $n = 0;
                foreach ($this->supplierOrderProductInfos as $item) {
                    $res['supplier_order_product_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishLeaseSupplierstatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['supplier_order_no'])) {
            $model->supplierOrderNo = $map['supplier_order_no'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['supplier_order_status'])) {
            $model->supplierOrderStatus = $map['supplier_order_status'];
        }
        if (isset($map['supplier_logistic_info'])) {
            $model->supplierLogisticInfo = SupplierLogisticInfo::fromMap($map['supplier_logistic_info']);
        }
        if (isset($map['supplier_order_product_infos'])) {
            if (!empty($map['supplier_order_product_infos'])) {
                $model->supplierOrderProductInfos = [];
                $n                                = 0;
                foreach ($map['supplier_order_product_infos'] as $item) {
                    $model->supplierOrderProductInfos[$n++] = null !== $item ? SupplierOrderProductInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['supplier_id'])) {
            $model->supplierId = $map['supplier_id'];
        }

        return $model;
    }
}
