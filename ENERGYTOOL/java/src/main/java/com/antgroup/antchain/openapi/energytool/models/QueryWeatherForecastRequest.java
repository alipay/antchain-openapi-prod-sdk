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

    // 纬度，十进制度数，范围[-90,90]。与longitude成对传入；经纬度和province/city/district地区查询方式必须二选一，按地区查询时不传。
    @NameInMap("latitude")
    public String latitude;

    // 经度，十进制度数，范围[-180,180]。与latitude成对传入；经纬度和province/city/district地区查询方式必须二选一，按地区查询时不传。
    @NameInMap("longitude")
    public String longitude;

    // 需要预测的天数；未传 past_days 时必须大于等于 1；当前产品面向 15 天以内预测。注意：当输入为1时表示预测今天的数据，输入2时表示预测明天数据，以此推类。
    @NameInMap("forecast_days")
    @Validation(required = true)
    public Long forecastDays;

    // 此前预测的天数，可选且不能为负数。内部数据查询未传时按 0 处理，查询起点为当天减去 past_days。
    @NameInMap("past_days")
    public Long pastDays;

    // 非空，数量受合约限制。完整枚举：
    // temperature_2m:2m气温
    // relative_humidity_2m:2m相对湿度
    // dew_point_2m:2m露点温度
    // apparent_temperature:体感温度
    // pressure_msl:海平面气压
    // surface_pressure:地表气压
    // precipitation_probability:降水概率
    // precipitation:降水量
    // cloud_cover:总云量
    // cloud_cover_low:低云量
    // cloud_cover_mid:中云量
    // cloud_cover_high:高云量
    // shortwave_radiation:短波辐照
    // direct_radiation:直接辐照
    // diffuse_radiation:散射辐照
    // shortwave_radiation_mean:平均短波辐照
    // direct_radiation_mean:平均直接辐照
    // diffuse_radiation_mean:平均散射辐照
    // shortwave_radiation_instant:瞬时短波辐照
    // direct_radiation_instant:瞬时直接辐照
    // diffuse_radiation_instant:瞬时散射辐照
    // wind_speed_10m:10m风速
    // wind_direction_10m:10m风向
    // u_wind_10m:东西风分量
    // v_wind_10m:南北风分量
    // wind_gusts_10m:10m阵风
    // wind_speed_80m:80m风速
    // wind_direction_80m:80m风向
    // u_wind_80m:东西风分量
    // v_wind_80m:南北风分量
    // wind_speed_100m:100m风速
    // wind_direction_100m:100m风向
    // u_wind_100m:东西风分量
    // v_wind_100m:南北风分量
    // wind_speed_120m:120m风速
    // wind_direction_120m:120m风向
    // u_wind_120m:东西风分量
    // v_wind_120m:南北风分量
    // wind_speed_180m:180m风速
    // wind_direction_180m:180m风向
    // u_wind_180m:东西风分量
    // v_wind_180m:南北风分量
    // weather_code:WMO天气码
    // weather_type_code:原始整数天气码。
    @NameInMap("weather_variables")
    @Validation(required = true)
    public java.util.List<String> weatherVariables;

    // 合约编码，非必填。
    @NameInMap("agreement_code")
    public String agreementCode;

    // 省级行政区名称。地区查询时province/city/district至少填一项，须唯一匹配行政区；同名地区请补充上级地区。与latitude、longitude经纬度方式必须二选一。
    @NameInMap("province")
    public String province;

    // 市级行政区名称。地区查询时province/city/district至少填一项，须唯一匹配行政区；同名城市请补充province。与latitude、longitude经纬度方式必须二选一。
    @NameInMap("city")
    public String city;

    // 区县级行政区名称。地区查询时province/city/district至少填一项，须唯一匹配行政区；同名区县请补充province、city。与latitude、longitude经纬度方式必须二选一。
    @NameInMap("district")
    public String district;

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

    public QueryWeatherForecastRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

    public QueryWeatherForecastRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryWeatherForecastRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryWeatherForecastRequest setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

}
