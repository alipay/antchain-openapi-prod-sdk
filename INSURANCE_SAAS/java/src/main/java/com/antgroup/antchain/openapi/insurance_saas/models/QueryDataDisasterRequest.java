// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryDataDisasterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 行政区域代码
    @NameInMap("area_code")
    @Validation(required = true)
    public String areaCode;

    // 灾害类型：df:⼤⻛，by:暴⾬，xz:雪灾
    @NameInMap("disaster_type")
    @Validation(required = true)
    public String disasterType;

    // 查询起始日期
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 查询截止日期
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    public static QueryDataDisasterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataDisasterRequest self = new QueryDataDisasterRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataDisasterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataDisasterRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public QueryDataDisasterRequest setDisasterType(String disasterType) {
        this.disasterType = disasterType;
        return this;
    }
    public String getDisasterType() {
        return this.disasterType;
    }

    public QueryDataDisasterRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryDataDisasterRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
