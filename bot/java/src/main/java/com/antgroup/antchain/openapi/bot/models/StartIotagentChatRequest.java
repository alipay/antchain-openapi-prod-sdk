// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartIotagentChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求内容，内容为json字符串
    @NameInMap("agent_chat_request")
    @Validation(required = true)
    public String agentChatRequest;

    public static StartIotagentChatRequest build(java.util.Map<String, ?> map) throws Exception {
        StartIotagentChatRequest self = new StartIotagentChatRequest();
        return TeaModel.build(map, self);
    }

    public StartIotagentChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartIotagentChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartIotagentChatRequest setAgentChatRequest(String agentChatRequest) {
        this.agentChatRequest = agentChatRequest;
        return this;
    }
    public String getAgentChatRequest() {
        return this.agentChatRequest;
    }

}
