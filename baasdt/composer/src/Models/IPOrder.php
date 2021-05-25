<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPOrder extends Model
{
    // 订单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipOrderId;

    // 卖方
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb165345237549274
     *
     * @var string
     */
    public $sellerId;

    // 卖家名称
    /**
     * @example 卖家名称
     *
     * @var string
     */
    public $sellerName;

    // 买方
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb163472346869786987
     *
     * @var string
     */
    public $buyerId;

    // 买家名称
    /**
     * @example 买家名称
     *
     * @var string
     */
    public $buyerName;

    // 订单交易类型：0套餐交易，1授权交易
    /**
     * @example 0
     *
     * @var int
     */
    public $type;

    // ip id
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipId;

    // IP名称
    /**
     * @example IP名称
     *
     * @var string
     */
    public $ipName;

    // 渠道信息
    /**
     * @example channel
     *
     * @var string
     */
    public $channelId;

    // 套餐总量
    /**
     * @example 10000
     *
     * @var int
     */
    public $totalAmount;

    // 套餐已使用数量
    /**
     * @example 6000
     *
     * @var int
     */
    public $usedAmount;

    // 终端商品价格范围
    /**
     * @example 0-50
     *
     * @var string
     */
    public $priceRange;

    // 套餐交易总费用
    /**
     * @example 30000
     *
     * @var string
     */
    public $totalPrice;

    // 授权佣金比例
    /**
     * @example 0.006
     *
     * @var string
     */
    public $authRate;

    // 授权合作开始时间（毫秒时间戳）
    /**
     * @example
     *
     * @var int
     */
    public $authStartTime;

    // 授权合作结束时间
    /**
     * @example
     *
     * @var int
     */
    public $authEndTime;

    // 合同信息
    /**
     * @example oss://myexchange/1259371fc8f77d37...5dfb6d130facf32dd6d4257fa0.jpeg
     *
     * @var string
     */
    public $contract;

    // 设计稿信息
    /**
     * @example oss://myexchange/1259371fc8f77d37...5dfb6d130facf32dd6d4257fa1.jpeg
     *
     * @var string
     */
    public $designDraft;

    // 操作人
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $operator;

    // 操作者名称
    /**
     * @example 操作者名称
     *
     * @var string
     */
    public $operatorName;

    // 订单状态。TODO 补充枚举信息
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 订单创建时间，时间戳（毫秒）
    /**
     * @example 1684896477580
     *
     * @var int
     */
    public $createTime;

    // 订单最近更新时间
    /**
     * @example 1604896477580
     *
     * @var int
     */
    public $updateTime;

    // 收费模式：0 销售抽佣, 1 按量付费
    /**
     * @example 0
     *
     * @var int
     */
    public $chargeType;

    // 按量付费的收费单价（按量付费模式必填）
    /**
     * @example 1.11
     *
     * @var string
     */
    public $authPrice;

    // 是否有保底金
    /**
     * @example true, false
     *
     * @var bool
     */
    public $guaranteed;

    // 保底金金额
    /**
     * @example 10000.00
     *
     * @var string
     */
    public $guaranteedFund;

    // 保底商品个数（按量付费）
    /**
     * @example 1000
     *
     * @var int
     */
    public $guaranteedGoodsAmount;

    // 已使用的保底商品个数（按量付费），订单销售数量超过保底部分需按量付费
    /**
     * @example 5000
     *
     * @var int
     */
    public $usedGuaranteedGoodsAmount;

    // 保底商品销售金额（销售抽佣）
    /**
     * @example 10000.00
     *
     * @var string
     */
    public $guaranteedSales;

    // 已使用的保底商品销售金额（销售抽佣），订单销售额超过保底部分需按比例抽拥
    //
    /**
     * @example 5000.00
     *
     * @var string
     */
    public $usedGuaranteedSales;

    // 授权产品范围
    /**
     * @example 食品 | 家居百货
     *
     * @var string
     */
    public $authProductScope;

    // 授权地域范围
    /**
     * @example 中国大陆
     *
     * @var string
     */
    public $authAreaScope;

    // 商品销售渠道
    /**
     * @example 电商平台、社交电商、直播、线下实体、代理商
     *
     * @var string
     */
    public $salesChannel;

    // 0 IP交易，1 增值服务交易
    /**
     * @example 1
     *
     * @var int
     */
    public $goodsType;

    // 增值服务交易绑定的ip授权交易订单
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $relatedOrderId;

    // 是否已监修报审
    /**
     * @example true, false
     *
     * @var bool
     */
    public $superviseApprove;
    protected $_name = [
        'ipOrderId'                 => 'ip_order_id',
        'sellerId'                  => 'seller_id',
        'sellerName'                => 'seller_name',
        'buyerId'                   => 'buyer_id',
        'buyerName'                 => 'buyer_name',
        'type'                      => 'type',
        'ipId'                      => 'ip_id',
        'ipName'                    => 'ip_name',
        'channelId'                 => 'channel_id',
        'totalAmount'               => 'total_amount',
        'usedAmount'                => 'used_amount',
        'priceRange'                => 'price_range',
        'totalPrice'                => 'total_price',
        'authRate'                  => 'auth_rate',
        'authStartTime'             => 'auth_start_time',
        'authEndTime'               => 'auth_end_time',
        'contract'                  => 'contract',
        'designDraft'               => 'design_draft',
        'operator'                  => 'operator',
        'operatorName'              => 'operator_name',
        'status'                    => 'status',
        'createTime'                => 'create_time',
        'updateTime'                => 'update_time',
        'chargeType'                => 'charge_type',
        'authPrice'                 => 'auth_price',
        'guaranteed'                => 'guaranteed',
        'guaranteedFund'            => 'guaranteed_fund',
        'guaranteedGoodsAmount'     => 'guaranteed_goods_amount',
        'usedGuaranteedGoodsAmount' => 'used_guaranteed_goods_amount',
        'guaranteedSales'           => 'guaranteed_sales',
        'usedGuaranteedSales'       => 'used_guaranteed_sales',
        'authProductScope'          => 'auth_product_scope',
        'authAreaScope'             => 'auth_area_scope',
        'salesChannel'              => 'sales_channel',
        'goodsType'                 => 'goods_type',
        'relatedOrderId'            => 'related_order_id',
        'superviseApprove'          => 'supervise_approve',
    ];

    public function validate()
    {
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('sellerId', $this->sellerId, true);
        Model::validateRequired('sellerName', $this->sellerName, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('buyerName', $this->buyerName, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('ipName', $this->ipName, true);
        Model::validateRequired('channelId', $this->channelId, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('usedAmount', $this->usedAmount, true);
        Model::validateRequired('priceRange', $this->priceRange, true);
        Model::validateRequired('totalPrice', $this->totalPrice, true);
        Model::validateRequired('authRate', $this->authRate, true);
        Model::validateRequired('authStartTime', $this->authStartTime, true);
        Model::validateRequired('authEndTime', $this->authEndTime, true);
        Model::validateRequired('contract', $this->contract, true);
        Model::validateRequired('designDraft', $this->designDraft, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('chargeType', $this->chargeType, true);
        Model::validateRequired('authPrice', $this->authPrice, true);
        Model::validateRequired('guaranteed', $this->guaranteed, true);
        Model::validateRequired('guaranteedFund', $this->guaranteedFund, true);
        Model::validateRequired('guaranteedGoodsAmount', $this->guaranteedGoodsAmount, true);
        Model::validateRequired('usedGuaranteedGoodsAmount', $this->usedGuaranteedGoodsAmount, true);
        Model::validateRequired('guaranteedSales', $this->guaranteedSales, true);
        Model::validateRequired('usedGuaranteedSales', $this->usedGuaranteedSales, true);
        Model::validateRequired('authProductScope', $this->authProductScope, true);
        Model::validateRequired('authAreaScope', $this->authAreaScope, true);
        Model::validateRequired('salesChannel', $this->salesChannel, true);
        Model::validateRequired('goodsType', $this->goodsType, true);
        Model::validateRequired('relatedOrderId', $this->relatedOrderId, true);
        Model::validateRequired('superviseApprove', $this->superviseApprove, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->sellerId) {
            $res['seller_id'] = $this->sellerId;
        }
        if (null !== $this->sellerName) {
            $res['seller_name'] = $this->sellerName;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->buyerName) {
            $res['buyer_name'] = $this->buyerName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->ipName) {
            $res['ip_name'] = $this->ipName;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->usedAmount) {
            $res['used_amount'] = $this->usedAmount;
        }
        if (null !== $this->priceRange) {
            $res['price_range'] = $this->priceRange;
        }
        if (null !== $this->totalPrice) {
            $res['total_price'] = $this->totalPrice;
        }
        if (null !== $this->authRate) {
            $res['auth_rate'] = $this->authRate;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->designDraft) {
            $res['design_draft'] = $this->designDraft;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
        if (null !== $this->authPrice) {
            $res['auth_price'] = $this->authPrice;
        }
        if (null !== $this->guaranteed) {
            $res['guaranteed'] = $this->guaranteed;
        }
        if (null !== $this->guaranteedFund) {
            $res['guaranteed_fund'] = $this->guaranteedFund;
        }
        if (null !== $this->guaranteedGoodsAmount) {
            $res['guaranteed_goods_amount'] = $this->guaranteedGoodsAmount;
        }
        if (null !== $this->usedGuaranteedGoodsAmount) {
            $res['used_guaranteed_goods_amount'] = $this->usedGuaranteedGoodsAmount;
        }
        if (null !== $this->guaranteedSales) {
            $res['guaranteed_sales'] = $this->guaranteedSales;
        }
        if (null !== $this->usedGuaranteedSales) {
            $res['used_guaranteed_sales'] = $this->usedGuaranteedSales;
        }
        if (null !== $this->authProductScope) {
            $res['auth_product_scope'] = $this->authProductScope;
        }
        if (null !== $this->authAreaScope) {
            $res['auth_area_scope'] = $this->authAreaScope;
        }
        if (null !== $this->salesChannel) {
            $res['sales_channel'] = $this->salesChannel;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->relatedOrderId) {
            $res['related_order_id'] = $this->relatedOrderId;
        }
        if (null !== $this->superviseApprove) {
            $res['supervise_approve'] = $this->superviseApprove;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['seller_id'])) {
            $model->sellerId = $map['seller_id'];
        }
        if (isset($map['seller_name'])) {
            $model->sellerName = $map['seller_name'];
        }
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
        }
        if (isset($map['buyer_name'])) {
            $model->buyerName = $map['buyer_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['ip_name'])) {
            $model->ipName = $map['ip_name'];
        }
        if (isset($map['channel_id'])) {
            $model->channelId = $map['channel_id'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['used_amount'])) {
            $model->usedAmount = $map['used_amount'];
        }
        if (isset($map['price_range'])) {
            $model->priceRange = $map['price_range'];
        }
        if (isset($map['total_price'])) {
            $model->totalPrice = $map['total_price'];
        }
        if (isset($map['auth_rate'])) {
            $model->authRate = $map['auth_rate'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['contract'])) {
            $model->contract = $map['contract'];
        }
        if (isset($map['design_draft'])) {
            $model->designDraft = $map['design_draft'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['operator_name'])) {
            $model->operatorName = $map['operator_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['charge_type'])) {
            $model->chargeType = $map['charge_type'];
        }
        if (isset($map['auth_price'])) {
            $model->authPrice = $map['auth_price'];
        }
        if (isset($map['guaranteed'])) {
            $model->guaranteed = $map['guaranteed'];
        }
        if (isset($map['guaranteed_fund'])) {
            $model->guaranteedFund = $map['guaranteed_fund'];
        }
        if (isset($map['guaranteed_goods_amount'])) {
            $model->guaranteedGoodsAmount = $map['guaranteed_goods_amount'];
        }
        if (isset($map['used_guaranteed_goods_amount'])) {
            $model->usedGuaranteedGoodsAmount = $map['used_guaranteed_goods_amount'];
        }
        if (isset($map['guaranteed_sales'])) {
            $model->guaranteedSales = $map['guaranteed_sales'];
        }
        if (isset($map['used_guaranteed_sales'])) {
            $model->usedGuaranteedSales = $map['used_guaranteed_sales'];
        }
        if (isset($map['auth_product_scope'])) {
            $model->authProductScope = $map['auth_product_scope'];
        }
        if (isset($map['auth_area_scope'])) {
            $model->authAreaScope = $map['auth_area_scope'];
        }
        if (isset($map['sales_channel'])) {
            $model->salesChannel = $map['sales_channel'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['related_order_id'])) {
            $model->relatedOrderId = $map['related_order_id'];
        }
        if (isset($map['supervise_approve'])) {
            $model->superviseApprove = $map['supervise_approve'];
        }

        return $model;
    }
}
