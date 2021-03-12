// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDistributionOrderTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 买家id
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 买家信息
    @NameInMap("buyer_info")
    @Validation(required = true)
    public String buyerInfo;

    // 买家名称
    @NameInMap("buyer_name")
    @Validation(required = true)
    public String buyerName;

    // 收银单号
    @NameInMap("cashier_id")
    @Validation(required = true)
    public String cashierId;

    // 外部子订单id
    @NameInMap("child_id")
    @Validation(required = true)
    public String childId;

    // 分销交易分佣信息
    @NameInMap("distribution_info")
    @Validation(required = true)
    public String distributionInfo;

    // 分销商城id
    @NameInMap("distribution_shop_id")
    @Validation(required = true)
    public String distributionShopId;

    // 分销商城名称
    @NameInMap("distribution_shop_name")
    @Validation(required = true)
    public String distributionShopName;

    // 订单过期时间戳
    @NameInMap("expire_time")
    @Validation(required = true)
    public Long expireTime;

    // 订单扩展信息
    @NameInMap("extend")
    @Validation(required = true)
    public String extend;

    // 内部渠道
    @NameInMap("inner_source")
    @Validation(required = true)
    public String innerSource;

    // 交易参与方
    @NameInMap("join_trader")
    @Validation(required = true)
    public String joinTrader;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单金额 单位 分
    @NameInMap("order_price")
    @Validation(required = true)
    public Long orderPrice;

    // 外部父订单id
    @NameInMap("parent_id")
    @Validation(required = true)
    public String parentId;

    // 订单支付信息
    @NameInMap("pay_info")
    @Validation(required = true)
    public String payInfo;

    // 结算状态 I待结算 S已结算
    @NameInMap("pay_status")
    @Validation(required = true)
    public String payStatus;

    // 上级推广金额
    @NameInMap("prev_promoter_price")
    @Validation(required = true)
    public String prevPromoterPrice;

    // 商品描述
    @NameInMap("product_desc")
    @Validation(required = true)
    public String productDesc;

    // 商品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 商品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 商品数量
    @NameInMap("product_num")
    @Validation(required = true)
    public Long productNum;

    // 商品价格
    @NameInMap("product_price")
    @Validation(required = true)
    public String productPrice;

    // 商品类型
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 推广订单id
    @NameInMap("promoter_order_id")
    @Validation(required = true)
    public String promoterOrderId;

    // 商品原始金额
    @NameInMap("real_price")
    @Validation(required = true)
    public String realPrice;

    // 退款时间戳
    @NameInMap("refund_time")
    @Validation(required = true)
    public Long refundTime;

    // 请求系统
    @NameInMap("req_system")
    @Validation(required = true)
    public String reqSystem;

    // 卖方id
    @NameInMap("seller_id")
    @Validation(required = true)
    public String sellerId;

    // 卖方信息
    @NameInMap("seller_info")
    @Validation(required = true)
    public String sellerInfo;

    // 卖方名称
    @NameInMap("seller_name")
    @Validation(required = true)
    public String sellerName;

    // 分享人
    @NameInMap("share")
    @Validation(required = true)
    public String share;

    // 商户id
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    // 订单渠道
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 交易状态 W-待付款、S-成功、F-失败、C-待确认
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 购买订单id
    @NameInMap("trade_id")
    @Validation(required = true)
    public String tradeId;

    // 交易时间戳
    @NameInMap("trade_time")
    @Validation(required = true)
    public Long tradeTime;

    // 交易类型
    @NameInMap("trade_type")
    @Validation(required = true)
    public String tradeType;

    // 业务类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static CreateDistributionOrderTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionOrderTradeRequest self = new CreateDistributionOrderTradeRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributionOrderTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributionOrderTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributionOrderTradeRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public CreateDistributionOrderTradeRequest setBuyerInfo(String buyerInfo) {
        this.buyerInfo = buyerInfo;
        return this;
    }
    public String getBuyerInfo() {
        return this.buyerInfo;
    }

    public CreateDistributionOrderTradeRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public CreateDistributionOrderTradeRequest setCashierId(String cashierId) {
        this.cashierId = cashierId;
        return this;
    }
    public String getCashierId() {
        return this.cashierId;
    }

    public CreateDistributionOrderTradeRequest setChildId(String childId) {
        this.childId = childId;
        return this;
    }
    public String getChildId() {
        return this.childId;
    }

    public CreateDistributionOrderTradeRequest setDistributionInfo(String distributionInfo) {
        this.distributionInfo = distributionInfo;
        return this;
    }
    public String getDistributionInfo() {
        return this.distributionInfo;
    }

    public CreateDistributionOrderTradeRequest setDistributionShopId(String distributionShopId) {
        this.distributionShopId = distributionShopId;
        return this;
    }
    public String getDistributionShopId() {
        return this.distributionShopId;
    }

    public CreateDistributionOrderTradeRequest setDistributionShopName(String distributionShopName) {
        this.distributionShopName = distributionShopName;
        return this;
    }
    public String getDistributionShopName() {
        return this.distributionShopName;
    }

    public CreateDistributionOrderTradeRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateDistributionOrderTradeRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public CreateDistributionOrderTradeRequest setInnerSource(String innerSource) {
        this.innerSource = innerSource;
        return this;
    }
    public String getInnerSource() {
        return this.innerSource;
    }

    public CreateDistributionOrderTradeRequest setJoinTrader(String joinTrader) {
        this.joinTrader = joinTrader;
        return this;
    }
    public String getJoinTrader() {
        return this.joinTrader;
    }

    public CreateDistributionOrderTradeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDistributionOrderTradeRequest setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Long getOrderPrice() {
        return this.orderPrice;
    }

    public CreateDistributionOrderTradeRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateDistributionOrderTradeRequest setPayInfo(String payInfo) {
        this.payInfo = payInfo;
        return this;
    }
    public String getPayInfo() {
        return this.payInfo;
    }

    public CreateDistributionOrderTradeRequest setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public CreateDistributionOrderTradeRequest setPrevPromoterPrice(String prevPromoterPrice) {
        this.prevPromoterPrice = prevPromoterPrice;
        return this;
    }
    public String getPrevPromoterPrice() {
        return this.prevPromoterPrice;
    }

    public CreateDistributionOrderTradeRequest setProductDesc(String productDesc) {
        this.productDesc = productDesc;
        return this;
    }
    public String getProductDesc() {
        return this.productDesc;
    }

    public CreateDistributionOrderTradeRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateDistributionOrderTradeRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateDistributionOrderTradeRequest setProductNum(Long productNum) {
        this.productNum = productNum;
        return this;
    }
    public Long getProductNum() {
        return this.productNum;
    }

    public CreateDistributionOrderTradeRequest setProductPrice(String productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public String getProductPrice() {
        return this.productPrice;
    }

    public CreateDistributionOrderTradeRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateDistributionOrderTradeRequest setPromoterOrderId(String promoterOrderId) {
        this.promoterOrderId = promoterOrderId;
        return this;
    }
    public String getPromoterOrderId() {
        return this.promoterOrderId;
    }

    public CreateDistributionOrderTradeRequest setRealPrice(String realPrice) {
        this.realPrice = realPrice;
        return this;
    }
    public String getRealPrice() {
        return this.realPrice;
    }

    public CreateDistributionOrderTradeRequest setRefundTime(Long refundTime) {
        this.refundTime = refundTime;
        return this;
    }
    public Long getRefundTime() {
        return this.refundTime;
    }

    public CreateDistributionOrderTradeRequest setReqSystem(String reqSystem) {
        this.reqSystem = reqSystem;
        return this;
    }
    public String getReqSystem() {
        return this.reqSystem;
    }

    public CreateDistributionOrderTradeRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public CreateDistributionOrderTradeRequest setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo;
        return this;
    }
    public String getSellerInfo() {
        return this.sellerInfo;
    }

    public CreateDistributionOrderTradeRequest setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }
    public String getSellerName() {
        return this.sellerName;
    }

    public CreateDistributionOrderTradeRequest setShare(String share) {
        this.share = share;
        return this;
    }
    public String getShare() {
        return this.share;
    }

    public CreateDistributionOrderTradeRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public CreateDistributionOrderTradeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateDistributionOrderTradeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateDistributionOrderTradeRequest setTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    public String getTradeId() {
        return this.tradeId;
    }

    public CreateDistributionOrderTradeRequest setTradeTime(Long tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }
    public Long getTradeTime() {
        return this.tradeTime;
    }

    public CreateDistributionOrderTradeRequest setTradeType(String tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public String getTradeType() {
        return this.tradeType;
    }

    public CreateDistributionOrderTradeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
