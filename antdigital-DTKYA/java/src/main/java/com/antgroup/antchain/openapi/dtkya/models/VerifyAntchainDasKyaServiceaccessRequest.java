// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerifyAntchainDasKyaServiceaccessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 已入驻的目标服务 ID；需与调用方有权提供的服务一致。
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 本次请求的业务操作；须属于已登记服务且在 AAP 授权范围内。
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // Agent 发给 MCP 的原始签名请求，MCP 原样转交 KYA 核验。
    @NameInMap("agent_request")
    @Validation(required = true)
    public KyaInvocationAgentRequest agentRequest;

    public static VerifyAntchainDasKyaServiceaccessRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDasKyaServiceaccessRequest self = new VerifyAntchainDasKyaServiceaccessRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDasKyaServiceaccessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAntchainDasKyaServiceaccessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAntchainDasKyaServiceaccessRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public VerifyAntchainDasKyaServiceaccessRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public VerifyAntchainDasKyaServiceaccessRequest setAgentRequest(KyaInvocationAgentRequest agentRequest) {
        this.agentRequest = agentRequest;
        return this;
    }
    public KyaInvocationAgentRequest getAgentRequest() {
        return this.agentRequest;
    }

}
