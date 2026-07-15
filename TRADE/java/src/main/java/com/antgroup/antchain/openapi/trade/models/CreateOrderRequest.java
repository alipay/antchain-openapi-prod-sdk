// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务流水号，调用方指定，幂等号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 租户ID，和租户名称二选一必填
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户名称，和租户ID二选一必填
    @NameInMap("tenant_name")
    public String tenantName;

    // 操作人ID，不填则默认和租户ID一致
    @NameInMap("operator_id")
    public String operatorId;

    // 商品编码
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 销售主体，不传默认ZL6
    @NameInMap("ou")
    public String ou;

    // 订单类型，NEW：新购；RENEW：续费； MODIFY：变配
    // 不填默认新购
    @NameInMap("order_type")
    public String orderType;

    // 订购周期对象，当商品是周期订阅类型时，必填
    @NameInMap("duration")
    public OrderDuration duration;

    // 优惠券ID
    @NameInMap("coupon_id")
    public String couponId;

    // 数量，不填默认1
    @NameInMap("quantity")
    public Long quantity;

    // 商品订购属性，开通型商品部需要填写
    @NameInMap("commodity_attrs")
    public java.util.List<CommodityOrderAttribute> commodityAttrs;

    // 履约选项
    @NameInMap("fulfillment_options")
    public FulfillmentOptions fulfillmentOptions;

    // 支付选项
    @NameInMap("pay_options")
    public PayOptions payOptions;

    // 价格策略
    @NameInMap("price_strategy")
    public PriceStrategy priceStrategy;

    // 实例ID，续费/变配场景必传
    @NameInMap("instance_id")
    public String instanceId;

    // 售卖市场。10100000：鹊凿市场；12000002：国际ZAN市场；其他市场编码请联系中台获取
    @NameInMap("sale_market")
    @Validation(required = true)
    public String saleMarket;

    // 扩展属性，JSON字符串
    @NameInMap("extended_properties")
    public String extendedProperties;

    // 批次流水号，外部合同下单场景，传入向中台申请的合同ID
    @NameInMap("batch_biz_no")
    public String batchBizNo;

    // 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
    @NameInMap("prepay_amount")
    public PrepayAmount prepayAmount;

    // 后付商品签约价，用于在履约阶段生成一客一价
    @NameInMap("post_pay_price")
    public PostPayPrice postPayPrice;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOrderRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CreateOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateOrderRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateOrderRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public CreateOrderRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateOrderRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public CreateOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateOrderRequest setDuration(OrderDuration duration) {
        this.duration = duration;
        return this;
    }
    public OrderDuration getDuration() {
        return this.duration;
    }

    public CreateOrderRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public CreateOrderRequest setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public CreateOrderRequest setCommodityAttrs(java.util.List<CommodityOrderAttribute> commodityAttrs) {
        this.commodityAttrs = commodityAttrs;
        return this;
    }
    public java.util.List<CommodityOrderAttribute> getCommodityAttrs() {
        return this.commodityAttrs;
    }

    public CreateOrderRequest setFulfillmentOptions(FulfillmentOptions fulfillmentOptions) {
        this.fulfillmentOptions = fulfillmentOptions;
        return this;
    }
    public FulfillmentOptions getFulfillmentOptions() {
        return this.fulfillmentOptions;
    }

    public CreateOrderRequest setPayOptions(PayOptions payOptions) {
        this.payOptions = payOptions;
        return this;
    }
    public PayOptions getPayOptions() {
        return this.payOptions;
    }

    public CreateOrderRequest setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
        return this;
    }
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    public CreateOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOrderRequest setSaleMarket(String saleMarket) {
        this.saleMarket = saleMarket;
        return this;
    }
    public String getSaleMarket() {
        return this.saleMarket;
    }

    public CreateOrderRequest setExtendedProperties(String extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }
    public String getExtendedProperties() {
        return this.extendedProperties;
    }

    public CreateOrderRequest setBatchBizNo(String batchBizNo) {
        this.batchBizNo = batchBizNo;
        return this;
    }
    public String getBatchBizNo() {
        return this.batchBizNo;
    }

    public CreateOrderRequest setPrepayAmount(PrepayAmount prepayAmount) {
        this.prepayAmount = prepayAmount;
        return this;
    }
    public PrepayAmount getPrepayAmount() {
        return this.prepayAmount;
    }

    public CreateOrderRequest setPostPayPrice(PostPayPrice postPayPrice) {
        this.postPayPrice = postPayPrice;
        return this;
    }
    public PostPayPrice getPostPayPrice() {
        return this.postPayPrice;
    }

}
