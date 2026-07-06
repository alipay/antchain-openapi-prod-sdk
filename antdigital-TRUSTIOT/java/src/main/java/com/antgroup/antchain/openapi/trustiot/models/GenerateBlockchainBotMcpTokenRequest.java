// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class GenerateBlockchainBotMcpTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台下发的agnetId
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    public static GenerateBlockchainBotMcpTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateBlockchainBotMcpTokenRequest self = new GenerateBlockchainBotMcpTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateBlockchainBotMcpTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GenerateBlockchainBotMcpTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GenerateBlockchainBotMcpTokenRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

}
