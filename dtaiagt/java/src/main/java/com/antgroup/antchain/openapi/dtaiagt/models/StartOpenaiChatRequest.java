// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class StartOpenaiChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参数内容为 ChatCompletionRequest 的 JSON 字符串
    @NameInMap("chat_completion_request")
    @Validation(required = true)
    public String chatCompletionRequest;

    public static StartOpenaiChatRequest build(java.util.Map<String, ?> map) throws Exception {
        StartOpenaiChatRequest self = new StartOpenaiChatRequest();
        return TeaModel.build(map, self);
    }

    public StartOpenaiChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartOpenaiChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartOpenaiChatRequest setChatCompletionRequest(String chatCompletionRequest) {
        this.chatCompletionRequest = chatCompletionRequest;
        return this;
    }
    public String getChatCompletionRequest() {
        return this.chatCompletionRequest;
    }

}
