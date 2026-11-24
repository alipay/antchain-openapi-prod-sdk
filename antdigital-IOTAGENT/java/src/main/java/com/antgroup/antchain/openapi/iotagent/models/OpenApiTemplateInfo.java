// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class OpenApiTemplateInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("language")
    @Validation(required = true)
    public String language;

    /**
     * <strong>example:</strong>
     * <p>id_example</p>
     */
    @NameInMap("voice_id")
    @Validation(required = true)
    public String voiceId;

    /**
     * <strong>example:</strong>
     * <p>示例说明</p>
     */
    @NameInMap("role_prompt")
    @Validation(required = true)
    public String rolePrompt;

    /**
     * <strong>example:</strong>
     * <p>id_example</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("voice_parameters")
    @Validation(required = true)
    public OpenApiVoiceParameters voiceParameters;

    /**
     * <strong>example:</strong>
     * <p>id_example</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>测试产品</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("default_template")
    @Validation(required = true)
    public Boolean defaultTemplate;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("base_template_id")
    public String baseTemplateId;

    public static OpenApiTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
        OpenApiTemplateInfo self = new OpenApiTemplateInfo();
        return TeaModel.build(map, self);
    }

    public OpenApiTemplateInfo setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public OpenApiTemplateInfo setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public OpenApiTemplateInfo setRolePrompt(String rolePrompt) {
        this.rolePrompt = rolePrompt;
        return this;
    }
    public String getRolePrompt() {
        return this.rolePrompt;
    }

    public OpenApiTemplateInfo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public OpenApiTemplateInfo setVoiceParameters(OpenApiVoiceParameters voiceParameters) {
        this.voiceParameters = voiceParameters;
        return this;
    }
    public OpenApiVoiceParameters getVoiceParameters() {
        return this.voiceParameters;
    }

    public OpenApiTemplateInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public OpenApiTemplateInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiTemplateInfo setDefaultTemplate(Boolean defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
        return this;
    }
    public Boolean getDefaultTemplate() {
        return this.defaultTemplate;
    }

    public OpenApiTemplateInfo setBaseTemplateId(String baseTemplateId) {
        this.baseTemplateId = baseTemplateId;
        return this;
    }
    public String getBaseTemplateId() {
        return this.baseTemplateId;
    }

}
