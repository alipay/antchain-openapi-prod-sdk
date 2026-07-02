// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GenerateMcpTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台下发的agnetId
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    public static GenerateMcpTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateMcpTokenRequest self = new GenerateMcpTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateMcpTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GenerateMcpTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GenerateMcpTokenRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

}
