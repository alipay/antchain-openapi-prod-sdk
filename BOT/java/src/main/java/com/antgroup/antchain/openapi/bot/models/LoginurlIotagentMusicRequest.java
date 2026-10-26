// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class LoginurlIotagentMusicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体 ID，与client_id至少填1项
    @NameInMap("agent_id")
    public String agentId;

    // 客户端 ID，与agent_id至少填1项
    @NameInMap("client_id")
    public String clientId;

    public static LoginurlIotagentMusicRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginurlIotagentMusicRequest self = new LoginurlIotagentMusicRequest();
        return TeaModel.build(map, self);
    }

    public LoginurlIotagentMusicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LoginurlIotagentMusicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public LoginurlIotagentMusicRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public LoginurlIotagentMusicRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

}
