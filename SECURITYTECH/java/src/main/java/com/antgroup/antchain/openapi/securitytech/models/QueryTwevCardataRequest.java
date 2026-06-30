// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTwevCardataRequest extends TeaModel {
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

    // 统计时间维度  MONTH（月）/WEEK（周）/DAY（日）
    @NameInMap("time_dimension")
    @Validation(required = true)
    public String timeDimension;

    // 时间戳（时间戳所在月/周/日内的数据，每月的第一天00:00， 每周的第一天00:00， 每日的00:00）
    @NameInMap("time_value")
    @Validation(required = true)
    public Long timeValue;

    // 前 n 月/周/日， 包含当前月/周/日（默认9）
    @NameInMap("past_days")
    @Validation(required = true)
    public Long pastDays;

    public static QueryTwevCardataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTwevCardataRequest self = new QueryTwevCardataRequest();
        return TeaModel.build(map, self);
    }

    public QueryTwevCardataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTwevCardataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTwevCardataRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryTwevCardataRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public QueryTwevCardataRequest setTimeDimension(String timeDimension) {
        this.timeDimension = timeDimension;
        return this;
    }
    public String getTimeDimension() {
        return this.timeDimension;
    }

    public QueryTwevCardataRequest setTimeValue(Long timeValue) {
        this.timeValue = timeValue;
        return this;
    }
    public Long getTimeValue() {
        return this.timeValue;
    }

    public QueryTwevCardataRequest setPastDays(Long pastDays) {
        this.pastDays = pastDays;
        return this;
    }
    public Long getPastDays() {
        return this.pastDays;
    }

}
