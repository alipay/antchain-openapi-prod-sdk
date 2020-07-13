<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAasAntdaoMypointsOrderinstructionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bizId' => 'biz_id',
        'chainId' => 'chain_id',
        'env' => 'env',
        'extendInfo' => 'extend_info',
        'orderId' => 'order_id',
        'preOrderId' => 'pre_order_id',
        'skuAmount' => 'sku_amount',
        'skuId' => 'sku_id',
        'skuValue' => 'sku_value',
        'status' => 'status',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
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
        if (null !== $this->preOrderId) {
            $res['pre_order_id'] = $this->preOrderId;
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
     * @return QueryAasAntdaoMypointsOrderinstructionResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['biz_id'])){
            $model->bizId = $map['biz_id'];
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
        if(isset($map['pre_order_id'])){
            $model->preOrderId = $map['pre_order_id'];
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
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 业务请求单号
    /**
     * @var string
     */
    public $bizId;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 环境标识
    /**
     * @var string
     */
    public $env;

    // 扩展信息
    /**
     * @var string
     */
    public $extendInfo;

    // 订单ID(env+chain_id+tenant_id+sku_id+biz_id)
    /**
     * @var string
     */
    public $orderId;

    // 预下单ID
    /**
     * @var string
     */
    public $preOrderId;

    // 包含集分宝数量(个)
    /**
     * @var integer
     */
    public $skuAmount;

    // SKU ID
    /**
     * @var string
     */
    public $skuId;

    // 面值
    /**
     * @var string
     */
    public $skuValue;

    // 状态(0:初始,1:失败可重试,2:失败不可重试,3:成功)
    /**
     * @var integer
     */
    public $status;

    // 商家在金融云的租户ID
    /**
     * @var string
     */
    public $tenantId;

}
