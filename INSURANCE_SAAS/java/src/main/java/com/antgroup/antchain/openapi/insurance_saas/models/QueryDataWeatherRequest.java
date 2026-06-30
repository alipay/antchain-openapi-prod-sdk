// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryDataWeatherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 行政区域代码
    @NameInMap("area_code")
    public String areaCode;

    public static QueryDataWeatherRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataWeatherRequest self = new QueryDataWeatherRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataWeatherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataWeatherRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

}
