// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SaveIoaAgentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 智能体名称
    @NameInMap("agent_name")
    public String agentName;

    // 语言Code
    @NameInMap("lang_code")
    public String langCode;

    // 音色ID
    @NameInMap("tts_voice_id")
    public String ttsVoiceId;

    // 系统提示词
    @NameInMap("system_prompt")
    public String systemPrompt;

    // 父模板智能体ID
    @NameInMap("parent_template_agent_id")
    public String parentTemplateAgentId;

    public static SaveIoaAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveIoaAgentRequest self = new SaveIoaAgentRequest();
        return TeaModel.build(map, self);
    }

    public SaveIoaAgentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveIoaAgentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveIoaAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SaveIoaAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public SaveIoaAgentRequest setLangCode(String langCode) {
        this.langCode = langCode;
        return this;
    }
    public String getLangCode() {
        return this.langCode;
    }

    public SaveIoaAgentRequest setTtsVoiceId(String ttsVoiceId) {
        this.ttsVoiceId = ttsVoiceId;
        return this;
    }
    public String getTtsVoiceId() {
        return this.ttsVoiceId;
    }

    public SaveIoaAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public SaveIoaAgentRequest setParentTemplateAgentId(String parentTemplateAgentId) {
        this.parentTemplateAgentId = parentTemplateAgentId;
        return this;
    }
    public String getParentTemplateAgentId() {
        return this.parentTemplateAgentId;
    }

}
