<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyLeaseSupplierorderRequest extends Model
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

    // 供应商id
    /**
     * @var string
     */
    public $supplierId;

    // 商品信息
    /**
     * @var ApplySupplierOrderProductInput[]
     */
    public $productInfos;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'supplierId'        => 'supplier_id',
        'productInfos'      => 'product_infos',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('supplierId', $this->supplierId, true);
        Model::validateRequired('productInfos', $this->productInfos, true);
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
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }
        if (null !== $this->productInfos) {
            $res['product_infos'] = [];
            if (null !== $this->productInfos && \is_array($this->productInfos)) {
                $n = 0;
                foreach ($this->productInfos as $item) {
                    $res['product_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyLeaseSupplierorderRequest
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
        if (isset($map['supplier_id'])) {
            $model->supplierId = $map['supplier_id'];
        }
        if (isset($map['product_infos'])) {
            if (!empty($map['product_infos'])) {
                $model->productInfos = [];
                $n                   = 0;
                foreach ($map['product_infos'] as $item) {
                    $model->productInfos[$n++] = null !== $item ? ApplySupplierOrderProductInput::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
