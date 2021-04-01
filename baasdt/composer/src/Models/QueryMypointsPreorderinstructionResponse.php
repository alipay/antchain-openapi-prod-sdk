<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMypointsPreorderinstructionResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 业务请求单号
    /**
     * @var string
     */
    public $bizId;

    // 商家的预算库代码
    /**
     * @var string
     */
    public $budgetCode;

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

    // 备注信息
    /**
     * @var string
     */
    public $memo;

    // 商家在支付宝域的标识
    /**
     * @var string
     */
    public $pid;

    // 集分宝产品码
    /**
     * @var string
     */
    public $productCode;

    // 集分宝SKU预下单ID
    /**
     * @var string
     */
    public $preOrderId;

    // 订单中剩余的可下单商品数量
    /**
     * @var int
     */
    public $remainCount;

    // 包含集分宝数量(个)
    /**
     * @var int
     */
    public $skuAmount;

    // 集分宝SKU的ID
    /**
     * @var string
     */
    public $skuId;

    // SKU面值
    /**
     * @var string
     */
    public $skuValue;

    // 流水状态(0初始状态, 1采购失败可重试, 2采购失败不可重试, 3采购成功, 4预算库创建失败可重试, 5预算库创建失败不可重试, 6预算库叉棍见成功, 7预算调拨失败可重试, 8预算库调拨失败不可重试, 9预算库调拨成功)
    /**
     * @var int
     */
    public $status;

    // 商户在金融云的租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 总下单集分宝数量
    /**
     * @var int
     */
    public $totalAmount;

    // 集分宝SKU的预下单数量
    /**
     * @var int
     */
    public $totalCount;

    // 总下单金额
    /**
     * @var string
     */
    public $totalValue;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'bizId'       => 'biz_id',
        'budgetCode'  => 'budget_code',
        'chainId'     => 'chain_id',
        'env'         => 'env',
        'extendInfo'  => 'extend_info',
        'memo'        => 'memo',
        'pid'         => 'pid',
        'productCode' => 'product_code',
        'preOrderId'  => 'pre_order_id',
        'remainCount' => 'remain_count',
        'skuAmount'   => 'sku_amount',
        'skuId'       => 'sku_id',
        'skuValue'    => 'sku_value',
        'status'      => 'status',
        'tenantId'    => 'tenant_id',
        'totalAmount' => 'total_amount',
        'totalCount'  => 'total_count',
        'totalValue'  => 'total_value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
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
     *
     * @return QueryMypointsPreorderinstructionResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['budget_code'])) {
            $model->budgetCode = $map['budget_code'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = $map['extend_info'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['pid'])) {
            $model->pid = $map['pid'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['pre_order_id'])) {
            $model->preOrderId = $map['pre_order_id'];
        }
        if (isset($map['remain_count'])) {
            $model->remainCount = $map['remain_count'];
        }
        if (isset($map['sku_amount'])) {
            $model->skuAmount = $map['sku_amount'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['sku_value'])) {
            $model->skuValue = $map['sku_value'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['total_value'])) {
            $model->totalValue = $map['total_value'];
        }

        return $model;
    }
}
