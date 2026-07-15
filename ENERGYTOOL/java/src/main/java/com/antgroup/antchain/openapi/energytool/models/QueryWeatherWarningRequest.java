// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherWarningRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 省份行政编码
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    // 查询日期，格式：yyyy-MM-dd
    @NameInMap("query_date")
    public String queryDate;

    // 城市行政编码
    @NameInMap("city")
    @Validation(required = true)
    public String city;

    public static QueryWeatherWarningRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherWarningRequest self = new QueryWeatherWarningRequest();
        return TeaModel.build(map, self);
    }

    public QueryWeatherWarningRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWeatherWarningRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryWeatherWarningRequest setQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public String getQueryDate() {
        return this.queryDate;
    }

    public QueryWeatherWarningRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

}
