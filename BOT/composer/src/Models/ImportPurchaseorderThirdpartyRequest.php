<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportPurchaseorderThirdpartyRequest extends Model
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

    // 租赁订单号
    /**
     * @var string
     */
    public $orderNumber;

    // 收货人姓名
    /**
     * @var string
     */
    public $consigneeName;

    // 收货人身份证号
    /**
     * @var string
     */
    public $consigneeIdNumber;

    // 收货人手机号
    /**
     * @var string
     */
    public $consigneePhone;

    // 收货人地址
    /**
     * @var string
     */
    public $consigneeAddress;

    // 供货商名称
    /**
     * @var string
     */
    public $supplierName;

    // 供货商租户id
    /**
     * @var string
     */
    public $supplierId;

    // 采购商租户id
    /**
     * @var string
     */
    public $leaseId;

    // 商品信息列表
    /**
     * @var GoodsIdAndCount[]
     */
    public $goodsList;

    // 幂等号
    /**
     * @var string
     */
    public $idempotId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNumber'       => 'order_number',
        'consigneeName'     => 'consignee_name',
        'consigneeIdNumber' => 'consignee_id_number',
        'consigneePhone'    => 'consignee_phone',
        'consigneeAddress'  => 'consignee_address',
        'supplierName'      => 'supplier_name',
        'supplierId'        => 'supplier_id',
        'leaseId'           => 'lease_id',
        'goodsList'         => 'goods_list',
        'idempotId'         => 'idempot_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderNumber', $this->orderNumber, true);
        Model::validateRequired('consigneeName', $this->consigneeName, true);
        Model::validateRequired('consigneeIdNumber', $this->consigneeIdNumber, true);
        Model::validateRequired('consigneePhone', $this->consigneePhone, true);
        Model::validateRequired('consigneeAddress', $this->consigneeAddress, true);
        Model::validateRequired('supplierName', $this->supplierName, true);
        Model::validateRequired('supplierId', $this->supplierId, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('goodsList', $this->goodsList, true);
        Model::validateRequired('idempotId', $this->idempotId, true);
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
        if (null !== $this->orderNumber) {
            $res['order_number'] = $this->orderNumber;
        }
        if (null !== $this->consigneeName) {
            $res['consignee_name'] = $this->consigneeName;
        }
        if (null !== $this->consigneeIdNumber) {
            $res['consignee_id_number'] = $this->consigneeIdNumber;
        }
        if (null !== $this->consigneePhone) {
            $res['consignee_phone'] = $this->consigneePhone;
        }
        if (null !== $this->consigneeAddress) {
            $res['consignee_address'] = $this->consigneeAddress;
        }
        if (null !== $this->supplierName) {
            $res['supplier_name'] = $this->supplierName;
        }
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->goodsList) {
            $res['goods_list'] = [];
            if (null !== $this->goodsList && \is_array($this->goodsList)) {
                $n = 0;
                foreach ($this->goodsList as $item) {
                    $res['goods_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->idempotId) {
            $res['idempot_id'] = $this->idempotId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportPurchaseorderThirdpartyRequest
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
        if (isset($map['order_number'])) {
            $model->orderNumber = $map['order_number'];
        }
        if (isset($map['consignee_name'])) {
            $model->consigneeName = $map['consignee_name'];
        }
        if (isset($map['consignee_id_number'])) {
            $model->consigneeIdNumber = $map['consignee_id_number'];
        }
        if (isset($map['consignee_phone'])) {
            $model->consigneePhone = $map['consignee_phone'];
        }
        if (isset($map['consignee_address'])) {
            $model->consigneeAddress = $map['consignee_address'];
        }
        if (isset($map['supplier_name'])) {
            $model->supplierName = $map['supplier_name'];
        }
        if (isset($map['supplier_id'])) {
            $model->supplierId = $map['supplier_id'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['goods_list'])) {
            if (!empty($map['goods_list'])) {
                $model->goodsList = [];
                $n                = 0;
                foreach ($map['goods_list'] as $item) {
                    $model->goodsList[$n++] = null !== $item ? GoodsIdAndCount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['idempot_id'])) {
            $model->idempotId = $map['idempot_id'];
        }

        return $model;
    }
}
