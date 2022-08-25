// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6efc6591476e4813ac8f7c9b6359c0b7.models;

import com.aliyun.tea.*;

public class QuerySaasSecurityTscenterUmidqueryserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户token id
    @NameInMap("token_id")
    @Validation(required = true)
    public String tokenId;

    // 服务版本
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static QuerySaasSecurityTscenterUmidqueryserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySaasSecurityTscenterUmidqueryserviceRequest self = new QuerySaasSecurityTscenterUmidqueryserviceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySaasSecurityTscenterUmidqueryserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySaasSecurityTscenterUmidqueryserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySaasSecurityTscenterUmidqueryserviceRequest setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }
    public String getTokenId() {
        return this.tokenId;
    }

    public QuerySaasSecurityTscenterUmidqueryserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
