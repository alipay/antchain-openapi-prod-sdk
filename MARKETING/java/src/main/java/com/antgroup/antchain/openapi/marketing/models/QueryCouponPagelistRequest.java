// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryCouponPagelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID	
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商品code	
    // 可多选 多个产品间用 , 分隔  如
    // ABC,DEF,GHI
    @NameInMap("product_codes")
    @Validation(required = true)
    public String productCodes;

    // 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券	
    // 
    @NameInMap("coupon_type")
    public String couponType;

    // 当前页，默认第一页
    @NameInMap("page_no")
    public Long pageNo;

    // 每页显示数量，默认10条	
    // 
    @NameInMap("page_size")
    public Long pageSize;

    // 币种，不传默认CNY人民币。
    @NameInMap("currency")
    public String currency;

    public static QueryCouponPagelistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponPagelistRequest self = new QueryCouponPagelistRequest();
        return TeaModel.build(map, self);
    }

    public QueryCouponPagelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCouponPagelistRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryCouponPagelistRequest setProductCodes(String productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public String getProductCodes() {
        return this.productCodes;
    }

    public QueryCouponPagelistRequest setCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }
    public String getCouponType() {
        return this.couponType;
    }

    public QueryCouponPagelistRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryCouponPagelistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCouponPagelistRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
