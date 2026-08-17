// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

import com.aliyun.tea.*;

public class ExecOperationagentSsechatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型类型
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 场景
    @NameInMap("scene")
    public String scene;

    // 请求内容
    @NameInMap("messages")
    @Validation(required = true)
    public java.util.List<ChatMessage> messages;

    public static ExecOperationagentSsechatRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecOperationagentSsechatRequest self = new ExecOperationagentSsechatRequest();
        return TeaModel.build(map, self);
    }

    public ExecOperationagentSsechatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecOperationagentSsechatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecOperationagentSsechatRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExecOperationagentSsechatRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ExecOperationagentSsechatRequest setMessages(java.util.List<ChatMessage> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<ChatMessage> getMessages() {
        return this.messages;
    }

}
