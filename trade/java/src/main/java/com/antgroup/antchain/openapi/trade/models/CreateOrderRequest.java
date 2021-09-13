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

    // 订单类型，NEW：新购；RENEW：续费
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

}
