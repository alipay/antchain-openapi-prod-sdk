// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class QueryApiserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    // 套件
    @NameInMap("suite")
    @Validation(required = true)
    public String suite;

    // api名字
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    public static QueryApiserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiserviceRequest self = new QueryApiserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiserviceRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public QueryApiserviceRequest setSuite(String suite) {
        this.suite = suite;
        return this;
    }
    public String getSuite() {
        return this.suite;
    }

    public QueryApiserviceRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

}
