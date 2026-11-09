// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaRequirementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设置要求的 Agent DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 对端须通过的层级，至少包含 L1
    @NameInMap("required_levels")
    @Validation(required = true)
    public java.util.List<String> requiredLevels;

    public static PushAntchainDasKyaRequirementRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaRequirementRequest self = new PushAntchainDasKyaRequirementRequest();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaRequirementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAntchainDasKyaRequirementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAntchainDasKyaRequirementRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public PushAntchainDasKyaRequirementRequest setRequiredLevels(java.util.List<String> requiredLevels) {
        this.requiredLevels = requiredLevels;
        return this;
    }
    public java.util.List<String> getRequiredLevels() {
        return this.requiredLevels;
    }

}
