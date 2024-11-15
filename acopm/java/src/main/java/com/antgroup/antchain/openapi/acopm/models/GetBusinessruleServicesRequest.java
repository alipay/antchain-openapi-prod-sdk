// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class GetBusinessruleServicesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // api名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // 版本号（可不填）
    @NameInMap("api_version")
    public String apiVersion;

    public static GetBusinessruleServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessruleServicesRequest self = new GetBusinessruleServicesRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessruleServicesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBusinessruleServicesRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public GetBusinessruleServicesRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

}
