// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UpdateBlockchainBotIotsuccessProductTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 支持的BCP47语言值，目录为准
    @NameInMap("language")
    public String language;

    @NameInMap("voice_id")
    public String voiceId;

    @NameInMap("role_prompt")
    public String rolePrompt;

    @NameInMap("model_id")
    public String modelId;

    @NameInMap("voice_parameters")
    public OpenApiVoiceParameters voiceParameters;

    public static UpdateBlockchainBotIotsuccessProductTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainBotIotsuccessProductTemplateRequest self = new UpdateBlockchainBotIotsuccessProductTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainBotIotsuccessProductTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateRequest setRolePrompt(String rolePrompt) {
        this.rolePrompt = rolePrompt;
        return this;
    }
    public String getRolePrompt() {
        return this.rolePrompt;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateBlockchainBotIotsuccessProductTemplateRequest setVoiceParameters(OpenApiVoiceParameters voiceParameters) {
        this.voiceParameters = voiceParameters;
        return this;
    }
    public OpenApiVoiceParameters getVoiceParameters() {
        return this.voiceParameters;
    }

}
