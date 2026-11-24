// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotsuccessProductTemplateRequest extends TeaModel {
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

    public static CreateIotsuccessProductTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIotsuccessProductTemplateRequest self = new CreateIotsuccessProductTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateIotsuccessProductTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIotsuccessProductTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIotsuccessProductTemplateRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateIotsuccessProductTemplateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateIotsuccessProductTemplateRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public CreateIotsuccessProductTemplateRequest setRolePrompt(String rolePrompt) {
        this.rolePrompt = rolePrompt;
        return this;
    }
    public String getRolePrompt() {
        return this.rolePrompt;
    }

    public CreateIotsuccessProductTemplateRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateIotsuccessProductTemplateRequest setVoiceParameters(OpenApiVoiceParameters voiceParameters) {
        this.voiceParameters = voiceParameters;
        return this;
    }
    public OpenApiVoiceParameters getVoiceParameters() {
        return this.voiceParameters;
    }

    public CreateIotsuccessProductTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIotsuccessProductTemplateRequest setBaseTemplateId(String baseTemplateId) {
        this.baseTemplateId = baseTemplateId;
        return this;
    }
    public String getBaseTemplateId() {
        return this.baseTemplateId;
    }

}
