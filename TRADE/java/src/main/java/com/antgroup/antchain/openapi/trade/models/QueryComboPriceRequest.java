// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryComboPriceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 套餐编码
    @NameInMap("combo_code")
    @Validation(required = true)
    public String comboCode;

    // 租户ID，和租户名二选一必填
    @NameInMap("tenant_id")
    public String tenantId;

    // 8位租户名，和租户ID二选一必填
    @NameInMap("tenant_name")
    public String tenantName;

    // 订单类型，新购：NEW，不填则默认NEW
    @NameInMap("order_type")
    public String orderType;

    // 优惠券ID
    @NameInMap("coupon_id")
    public String couponId;

    public static QueryComboPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComboPriceRequest self = new QueryComboPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryComboPriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComboPriceRequest setComboCode(String comboCode) {
        this.comboCode = comboCode;
        return this;
    }
    public String getComboCode() {
        return this.comboCode;
    }

    public QueryComboPriceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryComboPriceRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryComboPriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryComboPriceRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

}
