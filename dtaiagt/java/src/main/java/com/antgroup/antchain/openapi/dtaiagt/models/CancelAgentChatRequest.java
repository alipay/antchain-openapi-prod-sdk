// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class CancelAgentChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求内容，内容为 AgentQuitReq 对象的json字符串
    @NameInMap("request")
    @Validation(required = true)
    public String request;

    public static CancelAgentChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAgentChatRequest self = new CancelAgentChatRequest();
        return TeaModel.build(map, self);
    }

    public CancelAgentChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelAgentChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelAgentChatRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

}
