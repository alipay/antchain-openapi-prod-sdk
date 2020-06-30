<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMypointsOrderinstructionResponse extends Model {
    protected $_name = [
        'bizId' => 'biz_id',
        'budgetCode' => 'budget_code',
        'chainId' => 'chain_id',
        'env' => 'env',
        'extendInfo' => 'extend_info',
        'orderId' => 'order_id',
        'skuAmount' => 'sku_amount',
        'skuId' => 'sku_id',
        'skuValue' => 'sku_value',
        'status' => 'status',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->budgetCode) {
            $res['budget_code'] = $this->budgetCode;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->skuAmount) {
            $res['sku_amount'] = $this->skuAmount;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->skuValue) {
            $res['sku_value'] = $this->skuValue;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMypointsOrderinstructionResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['biz_id'])){
            $model->bizId = $map['biz_id'];
        }
        if(isset($map['budget_code'])){
            $model->budgetCode = $map['budget_code'];
        }
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['env'])){
            $model->env = $map['env'];
        }
        if(isset($map['extend_info'])){
            $model->extendInfo = $map['extend_info'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['sku_amount'])){
            $model->skuAmount = $map['sku_amount'];
        }
        if(isset($map['sku_id'])){
            $model->skuId = $map['sku_id'];
        }
        if(isset($map['sku_value'])){
            $model->skuValue = $map['sku_value'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    /**
     * @description 业务请求单号
     * @example S20200707123456
     * @var string
     */
    public $bizId;

    /**
     * @description 商家的预算库代码
     * @example BudgetCode12345
     * @var string
     */
    public $budgetCode;

    /**
     * @description 链ID
     * @example mypoints
     * @var string
     */
    public $chainId;

    /**
     * @description 环境标识
     * @example prod
     * @var string
     */
    public $env;

    /**
     * @description 扩展信息
     * @example 扩展信息
     * @var string
     */
    public $extendInfo;

    /**
     * @description 订单ID(env+chain_id+tenant_id+sku_id+biz_id)
     * @example prodmypointsHUIJUHYGSKU0001S20200618123
     * @var string
     */
    public $orderId;

    /**
     * @description 包含集分宝数量(个)
     * @example 100
     * @var integer
     */
    public $skuAmount;

    /**
     * @description SKU ID
     * @example 523645376abc5346576
     * @var string
     */
    public $skuId;

    /**
     * @description 面值
     * @example 1
     * @var string
     */
    public $skuValue;

    /**
     * @description 状态(0:初始,1:失败可重试,2:失败不可重试,3:成功)
     * @example 0
     * @var integer
     */
    public $status;

    /**
     * @description 商家在金融云的租户ID
     * @example IJUHYGUH
     * @var string
     */
    public $tenantId;

}
