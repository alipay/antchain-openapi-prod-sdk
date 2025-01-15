// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryCouponAvaliableRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商品code
    @NameInMap("product_codes")
    @Validation(required = true)
    public java.util.List<String> productCodes;

    // 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
    @NameInMap("coupon_type")
    public String couponType;

    // 业务发生时间
    @NameInMap("biz_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String bizTime;

    // 交易币种 CNY 人民币 USD美元
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    public static QueryCouponAvaliableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponAvaliableRequest self = new QueryCouponAvaliableRequest();
        return TeaModel.build(map, self);
    }

    public QueryCouponAvaliableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCouponAvaliableRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryCouponAvaliableRequest setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

    public QueryCouponAvaliableRequest setCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }
    public String getCouponType() {
        return this.couponType;
    }

    public QueryCouponAvaliableRequest setBizTime(String bizTime) {
        this.bizTime = bizTime;
        return this;
    }
    public String getBizTime() {
        return this.bizTime;
    }

    public QueryCouponAvaliableRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
