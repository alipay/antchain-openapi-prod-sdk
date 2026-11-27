// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ExecAntchainDasKyaServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 已入驻 KYA 的目标服务 ID。
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 业务操作名，应与服务登记的操作一致。
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // Agent 对本次操作及业务输入的原始签名请求，包含 DID、key ID、AAP ID、意图、输入、nonce、时间戳和签名。
    @NameInMap("agent_request")
    @Validation(required = true)
    public KyaServiceAccessAgentRequest agentRequest;

    public static ExecAntchainDasKyaServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntchainDasKyaServiceRequest self = new ExecAntchainDasKyaServiceRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntchainDasKyaServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntchainDasKyaServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAntchainDasKyaServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ExecAntchainDasKyaServiceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ExecAntchainDasKyaServiceRequest setAgentRequest(KyaServiceAccessAgentRequest agentRequest) {
        this.agentRequest = agentRequest;
        return this;
    }
    public KyaServiceAccessAgentRequest getAgentRequest() {
        return this.agentRequest;
    }

}
