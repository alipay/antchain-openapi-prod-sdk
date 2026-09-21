// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherLongrangeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求唯一标识，用于请求追踪和问题定位。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 查询地点纬度，取值范围 -90～90。
    @NameInMap("latitude")
    @Validation(required = true)
    public String latitude;

    // 查询地点经度，取值范围 -180～180。
    @NameInMap("longitude")
    @Validation(required = true)
    public String longitude;

    // 预测截止天数，整数 16～45。返回未来第 16 天至第 forecast_days 天（含）的预测数据，每 6 小时一个数据点；
    @NameInMap("forecast_days")
    @Validation(required = true)
    public Long forecastDays;

    // 气象要素编码列表，至少一项，使用代码定义的驼峰编码，如 temperature2m、windSpeed10m；仅返回指定要素。
    @NameInMap("weather_variables")
    @Validation(required = true)
    public java.util.List<String> weatherVariables;

    public static QueryWeatherLongrangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherLongrangeRequest self = new QueryWeatherLongrangeRequest();
        return TeaModel.build(map, self);
    }

    public QueryWeatherLongrangeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWeatherLongrangeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherLongrangeRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public QueryWeatherLongrangeRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public QueryWeatherLongrangeRequest setForecastDays(Long forecastDays) {
        this.forecastDays = forecastDays;
        return this;
    }
    public Long getForecastDays() {
        return this.forecastDays;
    }

    public QueryWeatherLongrangeRequest setWeatherVariables(java.util.List<String> weatherVariables) {
        this.weatherVariables = weatherVariables;
        return this;
    }
    public java.util.List<String> getWeatherVariables() {
        return this.weatherVariables;
    }

}
