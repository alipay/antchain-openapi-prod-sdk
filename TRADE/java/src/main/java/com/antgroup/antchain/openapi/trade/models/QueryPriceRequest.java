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

    // 订购周期，基于周期定价的商品必填
    @NameInMap("order_duration")
    public OrderDuration orderDuration;

    // 商品规格列表，按实际商品定义的和价格相关的属性传入
    // 1.续费询价不需要传
    // 2.变配询价需要传入变化的规格属性
    @NameInMap("commodity_order_attrs")
    public java.util.List<CommodityOrderAttribute> commodityOrderAttrs;

    // 币种，元：CNY，不传默认CNY
    @NameInMap("currency")
    public String currency;

    // 优惠券ID
    @NameInMap("coupon_id")
    public String couponId;

    // 不填默认为NEW；NEW：新购；RENEW：续费；MODIFY：变配
    @NameInMap("order_type")
    public String orderType;

    // 实例ID，续费/变配场景必传
    @NameInMap("instance_id")
    public String instanceId;

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

    public QueryPriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
