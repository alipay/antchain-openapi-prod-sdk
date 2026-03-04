// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevCartravelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 登录态token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 车辆中控id
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 统计时间维度 MONTH（月）/WEEK（周）/DAY（日）
    @NameInMap("time_dimension")
    @Validation(required = true)
    public String timeDimension;

    // 时间戳（时间戳所在月/周/日内的数据，每月的第一天00:00， 每周的第一天00:00， 每日的00:00）
    @NameInMap("time_value")
    @Validation(required = true)
    public Long timeValue;

    // 页数
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 每页条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryTwevCartravelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevCartravelRequest self = new QueryTwevCartravelRequest();
        return TeaModel.build(map, self);
    }

    public QueryTwevCartravelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTwevCartravelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTwevCartravelRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryTwevCartravelRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryTwevCartravelRequest setTimeDimension(String timeDimension) {
        this.timeDimension = timeDimension;
        return this;
    }
    public String getTimeDimension() {
        return this.timeDimension;
    }

    public QueryTwevCartravelRequest setTimeValue(Long timeValue) {
        this.timeValue = timeValue;
        return this;
    }
    public Long getTimeValue() {
        return this.timeValue;
    }

    public QueryTwevCartravelRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryTwevCartravelRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
