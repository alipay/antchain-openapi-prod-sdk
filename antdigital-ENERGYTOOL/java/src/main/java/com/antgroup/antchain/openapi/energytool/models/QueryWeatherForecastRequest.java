// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherForecastRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求 ID，由调用方生成，用于请求追踪，不可为空。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 纬度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
    @NameInMap("latitude")
    @Validation(required = true)
    public String latitude;

    // 经度，十进制度数；Java 类型 BigDecimal。查询位置须符合产品合约的站点授权范围。
    @NameInMap("longitude")
    @Validation(required = true)
    public String longitude;

    // 需要预测的天数；未传 past_days 时必须大于等于 1；当前产品面向 15 天以内预测。注意：当输入为1时表示预测今天的数据，输入2时表示预测明天数据，以此推类。
    @NameInMap("forecast_days")
    @Validation(required = true)
    public Long forecastDays;

    // 此前预测的天数，可选且不能为负数。内部数据查询未传时按 0 处理，查询起点为当天减去 past_days。
    @NameInMap("past_days")
    public Long pastDays;

    // 气象要素编码列表，不可为空，数量不得超过合约许可。示例包含温度、湿度、天气代码、10米风速、降水量和总云量；short_term_rain 须使用独立短临降水接口。
    @NameInMap("weather_variables")
    @Validation(required = true)
    public java.util.List<String> weatherVariables;

    public static QueryWeatherForecastRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherForecastRequest self = new QueryWeatherForecastRequest();
        return TeaModel.build(map, self);
    }

    public QueryWeatherForecastRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWeatherForecastRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherForecastRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public QueryWeatherForecastRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public QueryWeatherForecastRequest setForecastDays(Long forecastDays) {
        this.forecastDays = forecastDays;
        return this;
    }
    public Long getForecastDays() {
        return this.forecastDays;
    }

    public QueryWeatherForecastRequest setPastDays(Long pastDays) {
        this.pastDays = pastDays;
        return this;
    }
    public Long getPastDays() {
        return this.pastDays;
    }

    public QueryWeatherForecastRequest setWeatherVariables(java.util.List<String> weatherVariables) {
        this.weatherVariables = weatherVariables;
        return this;
    }
    public java.util.List<String> getWeatherVariables() {
        return this.weatherVariables;
    }

}
