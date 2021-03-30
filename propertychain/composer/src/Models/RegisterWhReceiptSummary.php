<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RegisterWhReceiptSummary extends Model
{
    // 注册仓单申请单ID
    /**
     * @example registerWhReceiptId
     *
     * @var string
     */
    public $registerWhReceiptId;

    // 仓单ID
    /**
     * @example warehouseReceiptId
     *
     * @var string
     */
    public $warehouseReceiptId;

    // 注册仓单申请单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
    /**
     * @example WAITING
     *
     * @var string
     */
    public $status;

    // 申请时间，单位：ms
    /**
     * @example 1413241234
     *
     * @var int
     */
    public $applyTime;

    // 货物品类
    /**
     * @example commodityCategory
     *
     * @var string
     */
    public $commodityCategory;

    // 数量 + 单位
    /**
     * @example 13个
     *
     * @var string
     */
    public $quantity;

    // 重量 + 单位
    /**
     * @example 13克
     *
     * @var string
     */
    public $weight;

    // 存货人名称
    /**
     * @example customerName
     *
     * @var string
     */
    public $customerName;

    // 保管人名称
    /**
     * @example custodianName
     *
     * @var string
     */
    public $custodianName;
    protected $_name = [
        'registerWhReceiptId' => 'register_wh_receipt_id',
        'warehouseReceiptId'  => 'warehouse_receipt_id',
        'status'              => 'status',
        'applyTime'           => 'apply_time',
        'commodityCategory'   => 'commodity_category',
        'quantity'            => 'quantity',
        'weight'              => 'weight',
        'customerName'        => 'customer_name',
        'custodianName'       => 'custodian_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->registerWhReceiptId) {
            $res['register_wh_receipt_id'] = $this->registerWhReceiptId;
        }
        if (null !== $this->warehouseReceiptId) {
            $res['warehouse_receipt_id'] = $this->warehouseReceiptId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->applyTime) {
            $res['apply_time'] = $this->applyTime;
        }
        if (null !== $this->commodityCategory) {
            $res['commodity_category'] = $this->commodityCategory;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->custodianName) {
            $res['custodian_name'] = $this->custodianName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterWhReceiptSummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['register_wh_receipt_id'])) {
            $model->registerWhReceiptId = $map['register_wh_receipt_id'];
        }
        if (isset($map['warehouse_receipt_id'])) {
            $model->warehouseReceiptId = $map['warehouse_receipt_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['apply_time'])) {
            $model->applyTime = $map['apply_time'];
        }
        if (isset($map['commodity_category'])) {
            $model->commodityCategory = $map['commodity_category'];
        }
        if (isset($map['quantity'])) {
            $model->quantity = $map['quantity'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['custodian_name'])) {
            $model->custodianName = $map['custodian_name'];
        }

        return $model;
    }
}
