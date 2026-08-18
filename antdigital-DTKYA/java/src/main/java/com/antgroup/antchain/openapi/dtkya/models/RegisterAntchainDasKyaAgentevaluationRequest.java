// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class RegisterAntchainDasKyaAgentevaluationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 评测服务编码
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    public static RegisterAntchainDasKyaAgentevaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAntchainDasKyaAgentevaluationRequest self = new RegisterAntchainDasKyaAgentevaluationRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAntchainDasKyaAgentevaluationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterAntchainDasKyaAgentevaluationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterAntchainDasKyaAgentevaluationRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
