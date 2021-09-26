<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PurchaseOrderInfoDetail extends Model
{
    // 租赁订单号
    //
    /**
     * @example dadadasda
     *
     * @var string
     */
    public $orderNumber;

    // 收货人姓名
    //
    /**
     * @example 立敢
     *
     * @var string
     */
    public $consigneeName;

    // 收货人身份证号
    /**
     * @example 424234324324234
     *
     * @var string
     */
    public $consigneeIdNumber;

    // 收货人手机号
    //
    /**
     * @example 13400113344
     *
     * @var string
     */
    public $consigneePhone;

    // 收货人地址
    /**
     * @example 北京市海淀区XXXXXXXX
     *
     * @var string
     */
    public $consigneeAddress;

    // 供货商名称
    //
    /**
     * @example fsafsafaf
     *
     * @var string
     */
    public $supplierName;

    // 供货商租户id
    //
    /**
     * @example fsffafaf
     *
     * @var string
     */
    public $supplierId;

    // 采购商id
    //
    /**
     * @example fafsafaf
     *
     * @var string
     */
    public $leaseId;

    // 商品信息列表
    /**
     * @example
     *
     * @var GoodsIdAndCount[]
     */
    public $goodsIdAndCount;
    protected $_name = [
        'orderNumber'       => 'order_number',
        'consigneeName'     => 'consignee_name',
        'consigneeIdNumber' => 'consignee_id_number',
        'consigneePhone'    => 'consignee_phone',
        'consigneeAddress'  => 'consignee_address',
        'supplierName'      => 'supplier_name',
        'supplierId'        => 'supplier_id',
        'leaseId'           => 'lease_id',
        'goodsIdAndCount'   => 'goods_id_and_count',
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
        Model::validateRequired('goodsIdAndCount', $this->goodsIdAndCount, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->goodsIdAndCount) {
            $res['goods_id_and_count'] = [];
            if (null !== $this->goodsIdAndCount && \is_array($this->goodsIdAndCount)) {
                $n = 0;
                foreach ($this->goodsIdAndCount as $item) {
                    $res['goods_id_and_count'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PurchaseOrderInfoDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['goods_id_and_count'])) {
            if (!empty($map['goods_id_and_count'])) {
                $model->goodsIdAndCount = [];
                $n                      = 0;
                foreach ($map['goods_id_and_count'] as $item) {
                    $model->goodsIdAndCount[$n++] = null !== $item ? GoodsIdAndCount::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
