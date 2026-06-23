// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class QuerySecuritycoreSecurityuniformserviceRequest extends TeaModel {
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

    public static QuerySecuritycoreSecurityuniformserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecuritycoreSecurityuniformserviceRequest self = new QuerySecuritycoreSecurityuniformserviceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecuritycoreSecurityuniformserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecuritycoreSecurityuniformserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecuritycoreSecurityuniformserviceRequest setSecurityUniformRequest(SecurityUniformRequest securityUniformRequest) {
        this.securityUniformRequest = securityUniformRequest;
        return this;
    }
    public SecurityUniformRequest getSecurityUniformRequest() {
        return this.securityUniformRequest;
    }

    public QuerySecuritycoreSecurityuniformserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
