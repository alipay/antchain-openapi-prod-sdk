// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherHistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 调用方生成的请求唯一标识，不能为空且最长 128 字符；同一合约内请使用新 ID 发起新查询，重复或冲突请求会被拒绝。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 查询地点经度，十进制度数字符串，范围 -180～180。经纬度需同时提供，与 province/city/district 地区输入二选一；
    @NameInMap("longitude")
    public String longitude;

    // 查询地点纬度，十进制度数字符串，范围 -90～90。经纬度需同时提供，与省市区输入二选一。
    @NameInMap("latitude")
    public String latitude;

    // 省级行政区全称或简称，可选。省市区组合必须能唯一定位地区；与经纬度互斥，使用行政区代表点查询。
    @NameInMap("province")
    public String province;

    // 市级行政区全称或简称，可选。可结合省、区县消歧；与经纬度互斥，不表示全市平均天气。
    @NameInMap("city")
    public String city;

    // 区县全称或简称，可选。可结合省、市消歧；至少提供一项地区信息且能唯一定位，与经纬度互斥。
    @NameInMap("district")
    public String district;

    // 实测查询开始日期，字符串格式 yyyyMMdd，包含当天；不得晚于 date_end。格式按 yyyyMMdd 解析。
    @NameInMap("date_start")
    @Validation(required = true)
    public String dateStart;

    // 实测查询结束日期，字符串格式 yyyyMMdd，包含当天；date_end 与 date_start 日期差小于 21 天，含首尾最多 21 天。
    @NameInMap("date_end")
    @Validation(required = true)
    public String dateEnd;

    // 实测气象要素编码列表，不可为空，数量不得超过产品合约许可。完整枚举（code:说明）：
    // temperature_2m:2米气温
    // relative_humidity_2m:2米相对湿度
    // surface_pressure:地表气压
    // precipitation:降水量
    // wind_speed_10m:10米风速
    // wind_direction_10m:10米风向
    // u_wind_10m:10米风速U分量（东西方向）
    // v_wind_10m:10米风速V分量（南北方向）
    // cloud_cover:总云量
    // soil_moisture_0_to_10:0至10厘米土壤体积含水量
    // soil_moisture_10_to_40:10至40厘米土壤体积含水量
    // soil_moisture_0_to_5:0至5厘米土壤体积含水量
    // soil_moisture_40_to_100:40至100厘米土壤体积含水量
    // soil_moisture_100_to_200:100至200厘米土壤体积含水量
    // soil_temperature_5:5厘米深度土壤温度
    // soil_temperature_10:10厘米深度土壤温度
    // soil_temperature_40:40厘米深度土壤温度
    // soil_temperature_100:100厘米深度土壤温度
    // soil_temperature_200:200厘米深度土壤温度
    // shortwave_radiation:短波辐照度。
    @NameInMap("weather_variables")
    @Validation(required = true)
    public java.util.List<String> weatherVariables;

    // 合约编码，非必填。
    @NameInMap("agreement_code")
    public String agreementCode;

    public static QueryWeatherHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherHistoryRequest self = new QueryWeatherHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryWeatherHistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWeatherHistoryRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherHistoryRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public QueryWeatherHistoryRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public QueryWeatherHistoryRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryWeatherHistoryRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryWeatherHistoryRequest setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public QueryWeatherHistoryRequest setDateStart(String dateStart) {
        this.dateStart = dateStart;
        return this;
    }
    public String getDateStart() {
        return this.dateStart;
    }

    public QueryWeatherHistoryRequest setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }
    public String getDateEnd() {
        return this.dateEnd;
    }

    public QueryWeatherHistoryRequest setWeatherVariables(java.util.List<String> weatherVariables) {
        this.weatherVariables = weatherVariables;
        return this;
    }
    public java.util.List<String> getWeatherVariables() {
        return this.weatherVariables;
    }

    public QueryWeatherHistoryRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

}
