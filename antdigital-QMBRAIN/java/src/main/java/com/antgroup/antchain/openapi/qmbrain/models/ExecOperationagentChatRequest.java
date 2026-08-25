// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

import com.aliyun.tea.*;

public class ExecOperationagentChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用大模型
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 调用场景
    @NameInMap("scene")
    public String scene;

    // 请求内容
    @NameInMap("messages")
    @Validation(required = true)
    public java.util.List<ChatMessage> messages;

    // 大模型请求参数
    @NameInMap("parameters")
    public ParameterData parameters;

    public static ExecOperationagentChatRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecOperationagentChatRequest self = new ExecOperationagentChatRequest();
        return TeaModel.build(map, self);
    }

    public ExecOperationagentChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecOperationagentChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecOperationagentChatRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExecOperationagentChatRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ExecOperationagentChatRequest setMessages(java.util.List<ChatMessage> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<ChatMessage> getMessages() {
        return this.messages;
    }

    public ExecOperationagentChatRequest setParameters(ParameterData parameters) {
        this.parameters = parameters;
        return this;
    }
    public ParameterData getParameters() {
        return this.parameters;
    }

}
