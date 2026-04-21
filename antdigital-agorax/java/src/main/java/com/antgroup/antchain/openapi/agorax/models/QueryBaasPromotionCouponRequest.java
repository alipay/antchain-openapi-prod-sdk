// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryBaasPromotionCouponRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // openId
    @NameInMap("open_id")
    public String openId;

    // appId
    @NameInMap("app_id")
    public String appId;

    // 活动ID
    @NameInMap("activity_id")
    @Validation(required = true)
    public String activityId;

    // 开始日期
    @NameInMap("start_date")
    public String startDate;

    // 结束日期
    @NameInMap("end_date")
    public String endDate;

    // 页码，默认 1，最小值 1
    @NameInMap("page_num")
    public Long pageNum;

    // 每页数量，默认 20，范围 1~100
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryBaasPromotionCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasPromotionCouponRequest self = new QueryBaasPromotionCouponRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasPromotionCouponRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasPromotionCouponRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasPromotionCouponRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryBaasPromotionCouponRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryBaasPromotionCouponRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public QueryBaasPromotionCouponRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryBaasPromotionCouponRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryBaasPromotionCouponRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryBaasPromotionCouponRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
