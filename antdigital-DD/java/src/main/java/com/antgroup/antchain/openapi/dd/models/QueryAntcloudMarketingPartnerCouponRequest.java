// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingPartnerCouponRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 目标租户2088 ID，查询发放给该租户的优惠券
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商品规格Code列表
    @NameInMap("product_codes")
    @Validation(required = true)
    public java.util.List<String> productCodes;

    // 币种，目前仅支持CNY、USD
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 优惠券类型；不传或空列表表示全部类型
    @NameInMap("coupon_type")
    public java.util.List<String> couponType;

    // 优惠券状态；不传或空列表表示全部状态.
    // AVAILABLE正常/可用状态
    // EXHAUSTED 已使用完
    // ABANDONED 已作废
    // EXPIRED 已过期
    @NameInMap("coupon_status")
    public java.util.List<String> couponStatus;

    // 查询区间开始时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 查询区间结束时间
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 页码，从1开始
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 每页记录数，范围1～100
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryAntcloudMarketingPartnerCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingPartnerCouponRequest self = new QueryAntcloudMarketingPartnerCouponRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingPartnerCouponRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudMarketingPartnerCouponRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntcloudMarketingPartnerCouponRequest setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

    public QueryAntcloudMarketingPartnerCouponRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryAntcloudMarketingPartnerCouponRequest setCouponType(java.util.List<String> couponType) {
        this.couponType = couponType;
        return this;
    }
    public java.util.List<String> getCouponType() {
        return this.couponType;
    }

    public QueryAntcloudMarketingPartnerCouponRequest setCouponStatus(java.util.List<String> couponStatus) {
        this.couponStatus = couponStatus;
        return this;
    }
    public java.util.List<String> getCouponStatus() {
        return this.couponStatus;
    }

    public QueryAntcloudMarketingPartnerCouponRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryAntcloudMarketingPartnerCouponRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryAntcloudMarketingPartnerCouponRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAntcloudMarketingPartnerCouponRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
