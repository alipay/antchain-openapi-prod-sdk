// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class StartIagentCchatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求内容，内容为 AgentChatReq 对象的json字符串
    @NameInMap("agent_chat_request")
    @Validation(required = true)
    public String agentChatRequest;

    public static StartIagentCchatRequest build(java.util.Map<String, ?> map) throws Exception {
        StartIagentCchatRequest self = new StartIagentCchatRequest();
        return TeaModel.build(map, self);
    }

    public StartIagentCchatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartIagentCchatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartIagentCchatRequest setAgentChatRequest(String agentChatRequest) {
        this.agentChatRequest = agentChatRequest;
        return this;
    }
    public String getAgentChatRequest() {
        return this.agentChatRequest;
    }

}
