// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionOrderTradeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 买家id
    @NameInMap("buyer_id")
    public String buyerId;

    // 买家信息
    @NameInMap("buyer_info")
    public String buyerInfo;

    // 买家名称
    @NameInMap("buyer_name")
    public String buyerName;

    // 收银单号
    @NameInMap("cashier_id")
    public String cashierId;

    // 外部子订单id
    @NameInMap("child_id")
    public String childId;

    // 分销交易分佣信息
    @NameInMap("distribution_info")
    public String distributionInfo;

    // 分销商城id
    @NameInMap("distribution_shop_id")
    public String distributionShopId;

    // 分销商城名称
    @NameInMap("distribution_shop_name")
    public String distributionShopName;

    // 订单过期时间戳
    @NameInMap("expire_time")
    public Long expireTime;

    // 订单扩展信息
    @NameInMap("extend")
    public String extend;

    // 内部渠道
    @NameInMap("inner_source")
    public String innerSource;

    // 交易参与方
    @NameInMap("join_trader")
    public String joinTrader;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 订单金额
    @NameInMap("order_price")
    public String orderPrice;

    // 外部父订单id
    @NameInMap("parent_id")
    public String parentId;

    // 订单支付信息f
    @NameInMap("pay_info")
    public String payInfo;

    // 结算状态 I待结算 S已结算
    @NameInMap("pay_status")
    public String payStatus;

    // 商品描述
    @NameInMap("product_desc")
    public String productDesc;

    // 商品id
    @NameInMap("product_id")
    public String productId;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 商品数量
    @NameInMap("product_num")
    public Long productNum;

    // 商品单价
    @NameInMap("product_price")
    public String productPrice;

    // 商品类型
    @NameInMap("product_type")
    public String productType;

    // 推广人订单id
    @NameInMap("promoter_order_id")
    public String promoterOrderId;

    // 商品原始金额
    @NameInMap("real_price")
    public String realPrice;

    // 退款时间
    @NameInMap("refund_time")
    public Long refundTime;

    // 请求系统
    @NameInMap("req_system")
    public String reqSystem;

    // 卖家id
    @NameInMap("seller_id")
    public String sellerId;

    // 卖家信息
    @NameInMap("seller_info")
    public String sellerInfo;

    // 卖家名称
    @NameInMap("seller_name")
    public String sellerName;

    // 分享人
    @NameInMap("share")
    public String share;

    // 商户id
    @NameInMap("shop_id")
    public String shopId;

    // 订单渠道
    @NameInMap("source")
    public String source;

    // 状态 W-待付款、S-成功、F-失败、C-待确认
    @NameInMap("status")
    public String status;

    // 购买订单id
    @NameInMap("trade_id")
    public String tradeId;

    // 交易时间戳
    @NameInMap("trade_time")
    public Long tradeTime;

    // 交易类型
    @NameInMap("trade_type")
    public String tradeType;

    // 业务类型
    @NameInMap("type")
    public String type;

    public static QueryDistributionOrderTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionOrderTradeResponse self = new QueryDistributionOrderTradeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDistributionOrderTradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDistributionOrderTradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDistributionOrderTradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDistributionOrderTradeResponse setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public QueryDistributionOrderTradeResponse setBuyerInfo(String buyerInfo) {
        this.buyerInfo = buyerInfo;
        return this;
    }
    public String getBuyerInfo() {
        return this.buyerInfo;
    }

    public QueryDistributionOrderTradeResponse setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public QueryDistributionOrderTradeResponse setCashierId(String cashierId) {
        this.cashierId = cashierId;
        return this;
    }
    public String getCashierId() {
        return this.cashierId;
    }

    public QueryDistributionOrderTradeResponse setChildId(String childId) {
        this.childId = childId;
        return this;
    }
    public String getChildId() {
        return this.childId;
    }

    public QueryDistributionOrderTradeResponse setDistributionInfo(String distributionInfo) {
        this.distributionInfo = distributionInfo;
        return this;
    }
    public String getDistributionInfo() {
        return this.distributionInfo;
    }

    public QueryDistributionOrderTradeResponse setDistributionShopId(String distributionShopId) {
        this.distributionShopId = distributionShopId;
        return this;
    }
    public String getDistributionShopId() {
        return this.distributionShopId;
    }

    public QueryDistributionOrderTradeResponse setDistributionShopName(String distributionShopName) {
        this.distributionShopName = distributionShopName;
        return this;
    }
    public String getDistributionShopName() {
        return this.distributionShopName;
    }

    public QueryDistributionOrderTradeResponse setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public QueryDistributionOrderTradeResponse setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public QueryDistributionOrderTradeResponse setInnerSource(String innerSource) {
        this.innerSource = innerSource;
        return this;
    }
    public String getInnerSource() {
        return this.innerSource;
    }

    public QueryDistributionOrderTradeResponse setJoinTrader(String joinTrader) {
        this.joinTrader = joinTrader;
        return this;
    }
    public String getJoinTrader() {
        return this.joinTrader;
    }

    public QueryDistributionOrderTradeResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryDistributionOrderTradeResponse setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public String getOrderPrice() {
        return this.orderPrice;
    }

    public QueryDistributionOrderTradeResponse setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public QueryDistributionOrderTradeResponse setPayInfo(String payInfo) {
        this.payInfo = payInfo;
        return this;
    }
    public String getPayInfo() {
        return this.payInfo;
    }

    public QueryDistributionOrderTradeResponse setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public QueryDistributionOrderTradeResponse setProductDesc(String productDesc) {
        this.productDesc = productDesc;
        return this;
    }
    public String getProductDesc() {
        return this.productDesc;
    }

    public QueryDistributionOrderTradeResponse setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryDistributionOrderTradeResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryDistributionOrderTradeResponse setProductNum(Long productNum) {
        this.productNum = productNum;
        return this;
    }
    public Long getProductNum() {
        return this.productNum;
    }

    public QueryDistributionOrderTradeResponse setProductPrice(String productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public String getProductPrice() {
        return this.productPrice;
    }

    public QueryDistributionOrderTradeResponse setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryDistributionOrderTradeResponse setPromoterOrderId(String promoterOrderId) {
        this.promoterOrderId = promoterOrderId;
        return this;
    }
    public String getPromoterOrderId() {
        return this.promoterOrderId;
    }

    public QueryDistributionOrderTradeResponse setRealPrice(String realPrice) {
        this.realPrice = realPrice;
        return this;
    }
    public String getRealPrice() {
        return this.realPrice;
    }

    public QueryDistributionOrderTradeResponse setRefundTime(Long refundTime) {
        this.refundTime = refundTime;
        return this;
    }
    public Long getRefundTime() {
        return this.refundTime;
    }

    public QueryDistributionOrderTradeResponse setReqSystem(String reqSystem) {
        this.reqSystem = reqSystem;
        return this;
    }
    public String getReqSystem() {
        return this.reqSystem;
    }

    public QueryDistributionOrderTradeResponse setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public QueryDistributionOrderTradeResponse setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo;
        return this;
    }
    public String getSellerInfo() {
        return this.sellerInfo;
    }

    public QueryDistributionOrderTradeResponse setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }
    public String getSellerName() {
        return this.sellerName;
    }

    public QueryDistributionOrderTradeResponse setShare(String share) {
        this.share = share;
        return this;
    }
    public String getShare() {
        return this.share;
    }

    public QueryDistributionOrderTradeResponse setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public QueryDistributionOrderTradeResponse setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryDistributionOrderTradeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDistributionOrderTradeResponse setTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    public String getTradeId() {
        return this.tradeId;
    }

    public QueryDistributionOrderTradeResponse setTradeTime(Long tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }
    public Long getTradeTime() {
        return this.tradeTime;
    }

    public QueryDistributionOrderTradeResponse setTradeType(String tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public String getTradeType() {
        return this.tradeType;
    }

    public QueryDistributionOrderTradeResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
