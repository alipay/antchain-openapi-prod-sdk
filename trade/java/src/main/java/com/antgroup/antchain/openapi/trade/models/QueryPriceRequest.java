// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryPriceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品主数据编码
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 租户ID，和租户名称二选一必填
    @NameInMap("tenant_id")
    public String tenantId;

    // 8位租户名，和租户ID二选一必选
    @NameInMap("tenant_name")
    public String tenantName;

    // 商品数量，不传则默认1
    @NameInMap("quantity")
    public Long quantity;

    // 业务发生时间，不传则默认当前时间
    @NameInMap("biz_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String bizTime;

    // 订购周期，周期型商品必填，如资源包/包年包月商品
    @NameInMap("order_duration")
    public OrderDuration orderDuration;

    // 商品规格列表
    // 针对量价型商品，统一使用SYS_USAGE_AMOUNT
    // 针对资源包商品，统一使用CAPACITY
    @NameInMap("commodity_order_attrs")
    public java.util.List<CommodityOrderAttribute> commodityOrderAttrs;

    // 币种，元：CNY，不传默认CNY
    @NameInMap("currency")
    public String currency;

    // 优惠券ID
    @NameInMap("coupon_id")
    public String couponId;

    public static QueryPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceRequest self = new QueryPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryPriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPriceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public QueryPriceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryPriceRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryPriceRequest setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public QueryPriceRequest setBizTime(String bizTime) {
        this.bizTime = bizTime;
        return this;
    }
    public String getBizTime() {
        return this.bizTime;
    }

    public QueryPriceRequest setOrderDuration(OrderDuration orderDuration) {
        this.orderDuration = orderDuration;
        return this;
    }
    public OrderDuration getOrderDuration() {
        return this.orderDuration;
    }

    public QueryPriceRequest setCommodityOrderAttrs(java.util.List<CommodityOrderAttribute> commodityOrderAttrs) {
        this.commodityOrderAttrs = commodityOrderAttrs;
        return this;
    }
    public java.util.List<CommodityOrderAttribute> getCommodityOrderAttrs() {
        return this.commodityOrderAttrs;
    }

    public QueryPriceRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryPriceRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

}
