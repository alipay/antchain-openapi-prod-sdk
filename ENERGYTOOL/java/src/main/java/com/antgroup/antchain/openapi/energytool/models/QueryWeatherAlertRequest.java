// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryWeatherAlertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 调用方生成的请求唯一标识，不能为空。同一合约内新查询使用新 ID；相同 ID 已受理的同步请求不重放响应，重复或条件冲突将被拒绝。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 查询地点经度，十进制度数字符串，范围 -180～180。经纬度必须同时提供，与省市区地区输入二选一。
    @NameInMap("longitude")
    public String longitude;

    // 查询地点纬度，十进制度数字符串，范围 -90～90。与 longitude 成对填写，不支持批量，与地区输入互斥。
    @NameInMap("latitude")
    public String latitude;

    // 省级行政区全称或简称，可选；省市区组合须唯一定位，使用该行政区代表点查询，与经纬度互斥。
    @NameInMap("province")
    public String province;

    // 市级行政区全称或简称，可选，可结合省、区县消歧；与经纬度互斥，不代表区域平均天气。
    @NameInMap("city")
    public String city;

    // 区县全称或简称，可选，可结合省、市消歧；地区至少填一项且能唯一定位，与经纬度互斥。
    @NameInMap("district")
    public String district;

    // 合约编码，非必填。
    @NameInMap("agreement_code")
    public String agreementCode;

    public static QueryWeatherAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWeatherAlertRequest self = new QueryWeatherAlertRequest();
        return TeaModel.build(map, self);
    }

    public QueryWeatherAlertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWeatherAlertRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWeatherAlertRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public QueryWeatherAlertRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public QueryWeatherAlertRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryWeatherAlertRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryWeatherAlertRequest setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public QueryWeatherAlertRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

}
