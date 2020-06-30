<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMypointsPreorderinstructionResponse extends Model {
    protected $_name = [
        'bizId' => 'biz_id',
        'budgetCode' => 'budget_code',
        'chainId' => 'chain_id',
        'env' => 'env',
        'extendInfo' => 'extend_info',
        'pid' => 'pid',
        'pointLibCode' => 'point_lib_code',
        'preOrderId' => 'pre_order_id',
        'remainCount' => 'remain_count',
        'skuAmount' => 'sku_amount',
        'skuId' => 'sku_id',
        'skuValue' => 'sku_value',
        'status' => 'status',
        'tenantId' => 'tenant_id',
        'totalAmount' => 'total_amount',
        'totalCount' => 'total_count',
        'totalValue' => 'total_value',
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
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }
        if (null !== $this->pointLibCode) {
            $res['point_lib_code'] = $this->pointLibCode;
        }
        if (null !== $this->preOrderId) {
            $res['pre_order_id'] = $this->preOrderId;
        }
        if (null !== $this->remainCount) {
            $res['remain_count'] = $this->remainCount;
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
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->totalValue) {
            $res['total_value'] = $this->totalValue;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMypointsPreorderinstructionResponse
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
        if(isset($map['pid'])){
            $model->pid = $map['pid'];
        }
        if(isset($map['point_lib_code'])){
            $model->pointLibCode = $map['point_lib_code'];
        }
        if(isset($map['pre_order_id'])){
            $model->preOrderId = $map['pre_order_id'];
        }
        if(isset($map['remain_count'])){
            $model->remainCount = $map['remain_count'];
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
        if(isset($map['total_amount'])){
            $model->totalAmount = $map['total_amount'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['total_value'])){
            $model->totalValue = $map['total_value'];
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
     * @description 商家在支付宝域的标识
     * @example 53246237452364
     * @var string
     */
    public $pid;

    /**
     * @description 商家的积分库代码
     * @example PointsLibCode123456
     * @var string
     */
    public $pointLibCode;

    /**
     * @description 集分宝SKU预下单ID
     * @example PREORDER001
     * @var string
     */
    public $preOrderId;

    /**
     * @description 订单中剩余的可下单商品数量
     * @example 10
     * @var integer
     */
    public $remainCount;

    /**
     * @description 包含集分宝数量(个)
     * @example 100
     * @var integer
     */
    public $skuAmount;

    /**
     * @description 集分宝SKU的ID
     * @example 5236457abc26378
     * @var string
     */
    public $skuId;

    /**
     * @description SKU面值
     * @example 1
     * @var string
     */
    public $skuValue;

    /**
     * @description 流水状态(0初始状态,1采购成功,2调拨成功)
     * @example 0
     * @var integer
     */
    public $status;

    /**
     * @description 商户在金融云的租户ID
     * @example JIUHYGYU
     * @var string
     */
    public $tenantId;

    /**
     * @description 总下单集分宝数量
     * @example 10000
     * @var integer
     */
    public $totalAmount;

    /**
     * @description 集分宝SKU的预下单数量
     * @example 100
     * @var integer
     */
    public $totalCount;

    /**
     * @description 总下单金额
     * @example 100
     * @var string
     */
    public $totalValue;

}
