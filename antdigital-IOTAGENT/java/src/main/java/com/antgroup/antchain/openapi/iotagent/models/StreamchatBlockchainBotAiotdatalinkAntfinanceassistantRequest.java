// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求内容，内容为json字符串
    @NameInMap("chat_request")
    @Validation(required = true)
    public String chatRequest;

    public static StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest build(java.util.Map<String, ?> map) throws Exception {
        StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest self = new StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest();
        return TeaModel.build(map, self);
    }

    public StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest setChatRequest(String chatRequest) {
        this.chatRequest = chatRequest;
        return this;
    }
    public String getChatRequest() {
        return this.chatRequest;
    }

}
