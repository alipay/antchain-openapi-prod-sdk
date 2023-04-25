// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryAreaCityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 省份名称
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    // 城市
    @NameInMap("city")
    public String city;

    // 租户来源-用于租户间功能和数据的隔离
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static QueryAreaCityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAreaCityRequest self = new QueryAreaCityRequest();
        return TeaModel.build(map, self);
    }

    public QueryAreaCityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAreaCityRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryAreaCityRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryAreaCityRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
