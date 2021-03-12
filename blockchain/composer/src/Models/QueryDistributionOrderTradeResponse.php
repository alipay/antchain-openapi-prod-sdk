<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDistributionOrderTradeResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 买家id
    /**
     * @var string
     */
    public $buyerId;

    // 买家信息
    /**
     * @var string
     */
    public $buyerInfo;

    // 买家名称
    /**
     * @var string
     */
    public $buyerName;

    // 收银单号
    /**
     * @var string
     */
    public $cashierId;

    // 外部子订单id
    /**
     * @var string
     */
    public $childId;

    // 分销交易分佣信息
    /**
     * @var string
     */
    public $distributionInfo;

    // 分销商城id
    /**
     * @var string
     */
    public $distributionShopId;

    // 分销商城名称
    /**
     * @var string
     */
    public $distributionShopName;

    // 订单过期时间戳
    /**
     * @var int
     */
    public $expireTime;

    // 订单扩展信息
    /**
     * @var string
     */
    public $extend;

    // 内部渠道
    /**
     * @var string
     */
    public $innerSource;

    // 交易参与方
    /**
     * @var string
     */
    public $joinTrader;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 订单金额
    /**
     * @var string
     */
    public $orderPrice;

    // 外部父订单id
    /**
     * @var string
     */
    public $parentId;

    // 订单支付信息f
    /**
     * @var string
     */
    public $payInfo;

    // 结算状态 I待结算 S已结算
    /**
     * @var string
     */
    public $payStatus;

    // 商品描述
    /**
     * @var string
     */
    public $productDesc;

    // 商品id
    /**
     * @var string
     */
    public $productId;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 商品数量
    /**
     * @var int
     */
    public $productNum;

    // 商品单价
    /**
     * @var string
     */
    public $productPrice;

    // 商品类型
    /**
     * @var string
     */
    public $productType;

    // 推广人订单id
    /**
     * @var string
     */
    public $promoterOrderId;

    // 商品原始金额
    /**
     * @var string
     */
    public $realPrice;

    // 退款时间
    /**
     * @var int
     */
    public $refundTime;

    // 请求系统
    /**
     * @var string
     */
    public $reqSystem;

    // 卖家id
    /**
     * @var string
     */
    public $sellerId;

    // 卖家信息
    /**
     * @var string
     */
    public $sellerInfo;

    // 卖家名称
    /**
     * @var string
     */
    public $sellerName;

    // 分享人
    /**
     * @var string
     */
    public $share;

    // 商户id
    /**
     * @var string
     */
    public $shopId;

    // 订单渠道
    /**
     * @var string
     */
    public $source;

    // 状态 W-待付款、S-成功、F-失败、C-待确认
    /**
     * @var string
     */
    public $status;

    // 购买订单id
    /**
     * @var string
     */
    public $tradeId;

    // 交易时间戳
    /**
     * @var int
     */
    public $tradeTime;

    // 交易类型
    /**
     * @var string
     */
    public $tradeType;

    // 业务类型
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'buyerId'              => 'buyer_id',
        'buyerInfo'            => 'buyer_info',
        'buyerName'            => 'buyer_name',
        'cashierId'            => 'cashier_id',
        'childId'              => 'child_id',
        'distributionInfo'     => 'distribution_info',
        'distributionShopId'   => 'distribution_shop_id',
        'distributionShopName' => 'distribution_shop_name',
        'expireTime'           => 'expire_time',
        'extend'               => 'extend',
        'innerSource'          => 'inner_source',
        'joinTrader'           => 'join_trader',
        'orderId'              => 'order_id',
        'orderPrice'           => 'order_price',
        'parentId'             => 'parent_id',
        'payInfo'              => 'pay_info',
        'payStatus'            => 'pay_status',
        'productDesc'          => 'product_desc',
        'productId'            => 'product_id',
        'productName'          => 'product_name',
        'productNum'           => 'product_num',
        'productPrice'         => 'product_price',
        'productType'          => 'product_type',
        'promoterOrderId'      => 'promoter_order_id',
        'realPrice'            => 'real_price',
        'refundTime'           => 'refund_time',
        'reqSystem'            => 'req_system',
        'sellerId'             => 'seller_id',
        'sellerInfo'           => 'seller_info',
        'sellerName'           => 'seller_name',
        'share'                => 'share',
        'shopId'               => 'shop_id',
        'source'               => 'source',
        'status'               => 'status',
        'tradeId'              => 'trade_id',
        'tradeTime'            => 'trade_time',
        'tradeType'            => 'trade_type',
        'type'                 => 'type',
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
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->buyerInfo) {
            $res['buyer_info'] = $this->buyerInfo;
        }
        if (null !== $this->buyerName) {
            $res['buyer_name'] = $this->buyerName;
        }
        if (null !== $this->cashierId) {
            $res['cashier_id'] = $this->cashierId;
        }
        if (null !== $this->childId) {
            $res['child_id'] = $this->childId;
        }
        if (null !== $this->distributionInfo) {
            $res['distribution_info'] = $this->distributionInfo;
        }
        if (null !== $this->distributionShopId) {
            $res['distribution_shop_id'] = $this->distributionShopId;
        }
        if (null !== $this->distributionShopName) {
            $res['distribution_shop_name'] = $this->distributionShopName;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->extend) {
            $res['extend'] = $this->extend;
        }
        if (null !== $this->innerSource) {
            $res['inner_source'] = $this->innerSource;
        }
        if (null !== $this->joinTrader) {
            $res['join_trader'] = $this->joinTrader;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderPrice) {
            $res['order_price'] = $this->orderPrice;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->payInfo) {
            $res['pay_info'] = $this->payInfo;
        }
        if (null !== $this->payStatus) {
            $res['pay_status'] = $this->payStatus;
        }
        if (null !== $this->productDesc) {
            $res['product_desc'] = $this->productDesc;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productNum) {
            $res['product_num'] = $this->productNum;
        }
        if (null !== $this->productPrice) {
            $res['product_price'] = $this->productPrice;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->promoterOrderId) {
            $res['promoter_order_id'] = $this->promoterOrderId;
        }
        if (null !== $this->realPrice) {
            $res['real_price'] = $this->realPrice;
        }
        if (null !== $this->refundTime) {
            $res['refund_time'] = $this->refundTime;
        }
        if (null !== $this->reqSystem) {
            $res['req_system'] = $this->reqSystem;
        }
        if (null !== $this->sellerId) {
            $res['seller_id'] = $this->sellerId;
        }
        if (null !== $this->sellerInfo) {
            $res['seller_info'] = $this->sellerInfo;
        }
        if (null !== $this->sellerName) {
            $res['seller_name'] = $this->sellerName;
        }
        if (null !== $this->share) {
            $res['share'] = $this->share;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tradeId) {
            $res['trade_id'] = $this->tradeId;
        }
        if (null !== $this->tradeTime) {
            $res['trade_time'] = $this->tradeTime;
        }
        if (null !== $this->tradeType) {
            $res['trade_type'] = $this->tradeType;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDistributionOrderTradeResponse
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
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
        }
        if (isset($map['buyer_info'])) {
            $model->buyerInfo = $map['buyer_info'];
        }
        if (isset($map['buyer_name'])) {
            $model->buyerName = $map['buyer_name'];
        }
        if (isset($map['cashier_id'])) {
            $model->cashierId = $map['cashier_id'];
        }
        if (isset($map['child_id'])) {
            $model->childId = $map['child_id'];
        }
        if (isset($map['distribution_info'])) {
            $model->distributionInfo = $map['distribution_info'];
        }
        if (isset($map['distribution_shop_id'])) {
            $model->distributionShopId = $map['distribution_shop_id'];
        }
        if (isset($map['distribution_shop_name'])) {
            $model->distributionShopName = $map['distribution_shop_name'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['extend'])) {
            $model->extend = $map['extend'];
        }
        if (isset($map['inner_source'])) {
            $model->innerSource = $map['inner_source'];
        }
        if (isset($map['join_trader'])) {
            $model->joinTrader = $map['join_trader'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_price'])) {
            $model->orderPrice = $map['order_price'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['pay_info'])) {
            $model->payInfo = $map['pay_info'];
        }
        if (isset($map['pay_status'])) {
            $model->payStatus = $map['pay_status'];
        }
        if (isset($map['product_desc'])) {
            $model->productDesc = $map['product_desc'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_num'])) {
            $model->productNum = $map['product_num'];
        }
        if (isset($map['product_price'])) {
            $model->productPrice = $map['product_price'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['promoter_order_id'])) {
            $model->promoterOrderId = $map['promoter_order_id'];
        }
        if (isset($map['real_price'])) {
            $model->realPrice = $map['real_price'];
        }
        if (isset($map['refund_time'])) {
            $model->refundTime = $map['refund_time'];
        }
        if (isset($map['req_system'])) {
            $model->reqSystem = $map['req_system'];
        }
        if (isset($map['seller_id'])) {
            $model->sellerId = $map['seller_id'];
        }
        if (isset($map['seller_info'])) {
            $model->sellerInfo = $map['seller_info'];
        }
        if (isset($map['seller_name'])) {
            $model->sellerName = $map['seller_name'];
        }
        if (isset($map['share'])) {
            $model->share = $map['share'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['trade_id'])) {
            $model->tradeId = $map['trade_id'];
        }
        if (isset($map['trade_time'])) {
            $model->tradeTime = $map['trade_time'];
        }
        if (isset($map['trade_type'])) {
            $model->tradeType = $map['trade_type'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
