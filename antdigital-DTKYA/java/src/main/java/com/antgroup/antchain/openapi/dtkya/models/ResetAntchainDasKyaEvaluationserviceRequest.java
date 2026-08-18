// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ResetAntchainDasKyaEvaluationserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务编码
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // 评测服务名称
    @NameInMap("service_name")
    public String serviceName;

    // 评测服务描述
    @NameInMap("service_description")
    public String serviceDescription;

    // 评测配置
    @NameInMap("access_config")
    public String accessConfig;

    // 升级目标版本（当前版本+1）
    @NameInMap("expected_version")
    @Validation(required = true)
    public String expectedVersion;

    public static ResetAntchainDasKyaEvaluationserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAntchainDasKyaEvaluationserviceRequest self = new ResetAntchainDasKyaEvaluationserviceRequest();
        return TeaModel.build(map, self);
    }

    public ResetAntchainDasKyaEvaluationserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetAntchainDasKyaEvaluationserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetAntchainDasKyaEvaluationserviceRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public ResetAntchainDasKyaEvaluationserviceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ResetAntchainDasKyaEvaluationserviceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public ResetAntchainDasKyaEvaluationserviceRequest setAccessConfig(String accessConfig) {
        this.accessConfig = accessConfig;
        return this;
    }
    public String getAccessConfig() {
        return this.accessConfig;
    }

    public ResetAntchainDasKyaEvaluationserviceRequest setExpectedVersion(String expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public String getExpectedVersion() {
        return this.expectedVersion;
    }

}
