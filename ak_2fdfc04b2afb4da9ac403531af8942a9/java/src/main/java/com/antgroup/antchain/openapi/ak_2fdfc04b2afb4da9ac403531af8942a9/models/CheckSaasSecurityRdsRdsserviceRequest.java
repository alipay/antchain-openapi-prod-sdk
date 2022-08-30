// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2fdfc04b2afb4da9ac403531af8942a9.models;

import com.aliyun.tea.*;

public class CheckSaasSecurityRdsRdsserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("rds_service_check_request")
    @Validation(required = true)
    public String rdsServiceCheckRequest;

    // 服务版本
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static CheckSaasSecurityRdsRdsserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSaasSecurityRdsRdsserviceRequest self = new CheckSaasSecurityRdsRdsserviceRequest();
        return TeaModel.build(map, self);
    }

    public CheckSaasSecurityRdsRdsserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckSaasSecurityRdsRdsserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckSaasSecurityRdsRdsserviceRequest setRdsServiceCheckRequest(String rdsServiceCheckRequest) {
        this.rdsServiceCheckRequest = rdsServiceCheckRequest;
        return this;
    }
    public String getRdsServiceCheckRequest() {
        return this.rdsServiceCheckRequest;
    }

    public CheckSaasSecurityRdsRdsserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
