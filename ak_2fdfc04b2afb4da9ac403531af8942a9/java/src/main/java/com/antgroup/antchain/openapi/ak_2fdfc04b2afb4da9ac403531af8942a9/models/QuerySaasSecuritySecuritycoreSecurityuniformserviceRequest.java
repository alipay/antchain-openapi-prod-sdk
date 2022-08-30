// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2fdfc04b2afb4da9ac403531af8942a9.models;

import com.aliyun.tea.*;

public class QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("security_uniform_request")
    @Validation(required = true)
    public SecurityUniformRequest securityUniformRequest;

    // 123
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest self = new QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest setSecurityUniformRequest(SecurityUniformRequest securityUniformRequest) {
        this.securityUniformRequest = securityUniformRequest;
        return this;
    }
    public SecurityUniformRequest getSecurityUniformRequest() {
        return this.securityUniformRequest;
    }

    public QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
