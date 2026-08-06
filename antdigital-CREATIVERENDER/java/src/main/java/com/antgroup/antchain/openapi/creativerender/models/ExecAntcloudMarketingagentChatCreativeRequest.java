// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentChatCreativeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 会话ID，如需支持多轮对话，需要传入之前的会话ID
    @NameInMap("session_id")
    public String sessionId;

    // 服务类型（默认IMAGE_RENDER）
    @NameInMap("entry_type")
    public String entryType;

    // 表达用户意图
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    // 参考样式
    @NameInMap("reference_style")
    public CreativeAssetRef referenceStyle;

    // 输入元素
    @NameInMap("input_elements")
    public java.util.List<CreativeAssetRef> inputElements;

    // 使用场景
    @NameInMap("scene")
    public String scene;

    // 生图宽度
    @NameInMap("width")
    public Long width;

    // 生图高度
    @NameInMap("height")
    public Long height;

    public static ExecAntcloudMarketingagentChatCreativeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentChatCreativeRequest self = new ExecAntcloudMarketingagentChatCreativeRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentChatCreativeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentChatCreativeRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ExecAntcloudMarketingagentChatCreativeRequest setEntryType(String entryType) {
        this.entryType = entryType;
        return this;
    }
    public String getEntryType() {
        return this.entryType;
    }

    public ExecAntcloudMarketingagentChatCreativeRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ExecAntcloudMarketingagentChatCreativeRequest setReferenceStyle(CreativeAssetRef referenceStyle) {
        this.referenceStyle = referenceStyle;
        return this;
    }
    public CreativeAssetRef getReferenceStyle() {
        return this.referenceStyle;
    }

    public ExecAntcloudMarketingagentChatCreativeRequest setInputElements(java.util.List<CreativeAssetRef> inputElements) {
        this.inputElements = inputElements;
        return this;
    }
    public java.util.List<CreativeAssetRef> getInputElements() {
        return this.inputElements;
    }

    public ExecAntcloudMarketingagentChatCreativeRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ExecAntcloudMarketingagentChatCreativeRequest setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public ExecAntcloudMarketingagentChatCreativeRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

}
