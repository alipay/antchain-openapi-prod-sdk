<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\SupplierProductInfo;

class CreateLeaseSupplierinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId' => 'application_id',
        'extraInfo' => 'extra_info',
        'logisticsOrderId' => 'logistics_order_id',
        'orderId' => 'order_id',
        'phase' => 'phase',
        'purchaseOrderId' => 'purchase_order_id',
        'supplierProductList' => 'supplier_product_list',
        'maintainedBySupplier' => 'maintained_by_supplier',
        'deliverTime' => 'deliver_time',
    ];
    public function validate() {
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('logisticsOrderId', $this->logisticsOrderId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('purchaseOrderId', $this->purchaseOrderId, true);
        Model::validateRequired('supplierProductList', $this->supplierProductList, true);
        Model::validateRequired('maintainedBySupplier', $this->maintainedBySupplier, true);
        Model::validateRequired('deliverTime', $this->deliverTime, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->logisticsOrderId) {
            $res['logistics_order_id'] = $this->logisticsOrderId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->purchaseOrderId) {
            $res['purchase_order_id'] = $this->purchaseOrderId;
        }
        if (null !== $this->supplierProductList) {
            $res['supplier_product_list'] = [];
            if(null !== $this->supplierProductList && is_array($this->supplierProductList)){
                $n = 0;
                foreach($this->supplierProductList as $item){
                    $res['supplier_product_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->maintainedBySupplier) {
            $res['maintained_by_supplier'] = $this->maintainedBySupplier;
        }
        if (null !== $this->deliverTime) {
            $res['deliver_time'] = $this->deliverTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateLeaseSupplierinfoRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['application_id'])){
            $model->applicationId = $map['application_id'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['logistics_order_id'])){
            $model->logisticsOrderId = $map['logistics_order_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['phase'])){
            $model->phase = $map['phase'];
        }
        if(isset($map['purchase_order_id'])){
            $model->purchaseOrderId = $map['purchase_order_id'];
        }
        if(isset($map['supplier_product_list'])){
            if(!empty($map['supplier_product_list'])){
                $model->supplierProductList = [];
                $n = 0;
                foreach($map['supplier_product_list'] as $item) {
                    $model->supplierProductList[$n++] = null !== $item ? SupplierProductInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['maintained_by_supplier'])){
            $model->maintainedBySupplier = $map['maintained_by_supplier'];
        }
        if(isset($map['deliver_time'])){
            $model->deliverTime = $map['deliver_time'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 租赁方及资方定义的合约id
    /**
     * @var string
     */
    public $applicationId;

    // 额外字段定义
    /**
     * @var string
     */
    public $extraInfo;

    // 供应商发货的物流单号
    /**
     * @var string
     */
    public $logisticsOrderId;

    // 用户的租赁订单id
    /**
     * @var string
     */
    public $orderId;

    // 额外字段定义对应的阶段，请咨询对应的资方
    /**
     * @var string
     */
    public $phase;

    // 采购订单id
    /**
     * @var string
     */
    public $purchaseOrderId;

    // 产品详细信息
    /**
     * @var SupplierProductInfo[]
     */
    public $supplierProductList;

    // 1自有物流 2顺丰
    /**
     * @var int
     */
    public $maintainedBySupplier;

    // 发货时间
    /**
     * @var string
     */
    public $deliverTime;

}
