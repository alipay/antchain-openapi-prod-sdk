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

    // 纬度，十进制度数，范围[-90,90]。与longitude成对传入；经纬度和province/city/district地区查询方式必须二选一，按地区查询时不传。
    @NameInMap("latitude")
    public String latitude;

    // 经度，十进制度数，范围[-180,180]。与latitude成对传入；经纬度和province/city/district地区查询方式必须二选一，按地区查询时不传。
    @NameInMap("longitude")
    public String longitude;

    // 预测截止天数，整数 16～45。返回未来第 16 天至第 forecast_days 天（含）的预测数据，每 6 小时一个数据点；
    @NameInMap("forecast_days")
    @Validation(required = true)
    public Long forecastDays;

    // 中长期气象要素编码列表，不可为空，数量不得超过产品合约许可。完整枚举（code:说明）：
    // temperature2m:2米气温
    // dewPoint2m:2米露点温度
    // apparentTemperature:体感温度
    // relativeHumidity2m:2米相对湿度
    // pressureMsl:海平面气压
    // surfacePressure:地表气压
    // weatherCode:平台天气现象枚举，如RAIN_LIGHT（小雨）
    // weather_type_code:原始天气现象整数码，以字符串返回
    // precipitation:降水量
    // cloudCover:总云量
    // windSpeed10m:10米风速
    // windSpeed100m:100米风速
    // windSpeed200m:200米风速
    // windDirection10m:10米风向
    // windDirection100m:100米风向
    // windDirection200m:200米风向
    // shortwaveRadiationInstant:瞬时短波辐照度
    // directRadiationInstant:瞬时直接辐照度
    // diffuseRadiationInstant:瞬时散射辐照度
    // shortwaveRadiation:短波辐照度
    // directRadiation:直接辐照度
    // diffuseRadiation:散射辐照度
    // windGusts10m:10米阵风风速
    // temperatureMax2m:2米日最高气温
    // temperatureMin2m:2米日最低气温。
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

    public QueryWeatherLongrangeRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

    public QueryWeatherLongrangeRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryWeatherLongrangeRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryWeatherLongrangeRequest setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

}
