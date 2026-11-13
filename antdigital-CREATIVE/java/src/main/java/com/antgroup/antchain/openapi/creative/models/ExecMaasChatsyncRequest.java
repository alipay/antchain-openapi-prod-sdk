// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class ExecMaasChatsyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 幂等标识，由客户端生成
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 文本模型编码
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 非空消息列表
    @NameInMap("messages")
    @Validation(required = true)
    public java.util.List<ChatMessages> messages;

    // 模型参数 JSON 字符串
    @NameInMap("ext_params")
    public String extParams;

    public static ExecMaasChatsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecMaasChatsyncRequest self = new ExecMaasChatsyncRequest();
        return TeaModel.build(map, self);
    }

    public ExecMaasChatsyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecMaasChatsyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecMaasChatsyncRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecMaasChatsyncRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExecMaasChatsyncRequest setMessages(java.util.List<ChatMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<ChatMessages> getMessages() {
        return this.messages;
    }

    public ExecMaasChatsyncRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

}
