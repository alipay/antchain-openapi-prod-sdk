// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class CheckRdsRdsserviceRequest extends TeaModel {
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

    public static CheckRdsRdsserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRdsRdsserviceRequest self = new CheckRdsRdsserviceRequest();
        return TeaModel.build(map, self);
    }

    public CheckRdsRdsserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckRdsRdsserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckRdsRdsserviceRequest setRdsServiceCheckRequest(String rdsServiceCheckRequest) {
        this.rdsServiceCheckRequest = rdsServiceCheckRequest;
        return this;
    }
    public String getRdsServiceCheckRequest() {
        return this.rdsServiceCheckRequest;
    }

    public CheckRdsRdsserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
