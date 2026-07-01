<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SyncLeaseSupplierorderstatusRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 订单采购状态，已取消[CANCEL，已拒收REFUSE_DELIVER，待发货TOBE_DELIVER，已退货RETURN_BACK]
    /**
     * @var string
     */
    public $supplierStatus;

    // 租赁商家金融科技租户id
    /**
     * @var string
     */
    public $leaseId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'supplierStatus'    => 'supplier_status',
        'leaseId'           => 'lease_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('supplierStatus', $this->supplierStatus, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->supplierStatus) {
            $res['supplier_status'] = $this->supplierStatus;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncLeaseSupplierorderstatusRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['supplier_status'])) {
            $model->supplierStatus = $map['supplier_status'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }

        return $model;
    }
}
