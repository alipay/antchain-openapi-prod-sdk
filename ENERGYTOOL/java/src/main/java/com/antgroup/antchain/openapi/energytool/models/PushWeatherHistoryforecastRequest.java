// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class PushWeatherHistoryforecastRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 调用方生成的请求唯一标识，不能为空，最长 128 字符。相同合约、相同 ID 和相同规范化条件重复提交返回原 ID，不新建任务；条件冲突拒绝。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 经度字符串，范围 -180～180，可用逗号分隔批量点，最多 100 组；与 latitude 按序一一对应，禁止空项。与省市区地区输入二选一。
    @NameInMap("longitude")
    public String longitude;

    // 纬度字符串，范围 -90～90，可用逗号分隔；数量、顺序与 longitude 一致，最多 100 组。
    @NameInMap("latitude")
    public String latitude;

    // 省级行政区全称或简称。省市区组合应能唯一定位一个地区，不支持逗号批量；与经纬度互斥。
    @NameInMap("province")
    public String province;

    // 市级行政区全称或简称，可结合省、区县消歧；地区输入代表该行政区代表点，不是全区域平均值。
    @NameInMap("city")
    public String city;

    // 区县全称或简称，可结合省、市消歧；地区至少填一项且唯一，禁止与经纬度混用。
    @NameInMap("district")
    public String district;

    // 历史预测批次开始日期，格式 yyyy-MM-dd，包含当天；不能早于受理日减三年，不能晚于 date_end。
    @NameInMap("date_start")
    @Validation(required = true)
    public String dateStart;

    // 历史预测批次结束日期，格式 yyyy-MM-dd，包含当天；不能晚于受理日当天。
    @NameInMap("date_end")
    @Validation(required = true)
    public String dateEnd;

    // 非空，含重复最多44项。枚举：
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

    public static PushWeatherHistoryforecastRequest build(java.util.Map<String, ?> map) throws Exception {
        PushWeatherHistoryforecastRequest self = new PushWeatherHistoryforecastRequest();
        return TeaModel.build(map, self);
    }

    public PushWeatherHistoryforecastRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushWeatherHistoryforecastRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushWeatherHistoryforecastRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public PushWeatherHistoryforecastRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public PushWeatherHistoryforecastRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public PushWeatherHistoryforecastRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public PushWeatherHistoryforecastRequest setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public PushWeatherHistoryforecastRequest setDateStart(String dateStart) {
        this.dateStart = dateStart;
        return this;
    }
    public String getDateStart() {
        return this.dateStart;
    }

    public PushWeatherHistoryforecastRequest setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }
    public String getDateEnd() {
        return this.dateEnd;
    }

    public PushWeatherHistoryforecastRequest setWeatherVariables(java.util.List<String> weatherVariables) {
        this.weatherVariables = weatherVariables;
        return this;
    }
    public java.util.List<String> getWeatherVariables() {
        return this.weatherVariables;
    }

    public PushWeatherHistoryforecastRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

}
