// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class CreateBlockchainBotIotsuccessProductTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

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

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("base_template_id")
    public String baseTemplateId;

    public static CreateBlockchainBotIotsuccessProductTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainBotIotsuccessProductTemplateRequest self = new CreateBlockchainBotIotsuccessProductTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setRolePrompt(String rolePrompt) {
        this.rolePrompt = rolePrompt;
        return this;
    }
    public String getRolePrompt() {
        return this.rolePrompt;
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setVoiceParameters(OpenApiVoiceParameters voiceParameters) {
        this.voiceParameters = voiceParameters;
        return this;
    }
    public OpenApiVoiceParameters getVoiceParameters() {
        return this.voiceParameters;
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBlockchainBotIotsuccessProductTemplateRequest setBaseTemplateId(String baseTemplateId) {
        this.baseTemplateId = baseTemplateId;
        return this;
    }
    public String getBaseTemplateId() {
        return this.baseTemplateId;
    }

}
