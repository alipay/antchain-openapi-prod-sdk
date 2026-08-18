// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class RegisterAntchainDasKyaEvaluationserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测评服务名称
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 测评服务描述
    @NameInMap("service_description")
    public String serviceDescription;

    // 测评类型
    @NameInMap("evaluation_type")
    @Validation(required = true)
    public String evaluationType;

    // 测评配置信息，比如测评的skll下载地址，测评的endpoint 服务地址
    @NameInMap("access_config")
    public String accessConfig;

    public static RegisterAntchainDasKyaEvaluationserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAntchainDasKyaEvaluationserviceRequest self = new RegisterAntchainDasKyaEvaluationserviceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAntchainDasKyaEvaluationserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterAntchainDasKyaEvaluationserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterAntchainDasKyaEvaluationserviceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RegisterAntchainDasKyaEvaluationserviceRequest setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public RegisterAntchainDasKyaEvaluationserviceRequest setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType;
        return this;
    }
    public String getEvaluationType() {
        return this.evaluationType;
    }

    public RegisterAntchainDasKyaEvaluationserviceRequest setAccessConfig(String accessConfig) {
        this.accessConfig = accessConfig;
        return this;
    }
    public String getAccessConfig() {
        return this.accessConfig;
    }

}
