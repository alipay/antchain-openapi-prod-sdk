// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaLthreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 配置所属 Agent DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 是否启用 L3
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    public static PushAntchainDasKyaLthreeRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaLthreeRequest self = new PushAntchainDasKyaLthreeRequest();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaLthreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAntchainDasKyaLthreeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAntchainDasKyaLthreeRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public PushAntchainDasKyaLthreeRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
