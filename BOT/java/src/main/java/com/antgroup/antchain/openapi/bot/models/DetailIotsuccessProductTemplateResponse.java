// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DetailIotsuccessProductTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("language")
    @Validation(required = true)
    public String language;

    @NameInMap("voice_id")
    @Validation(required = true)
    public String voiceId;

    @NameInMap("role_prompt")
    @Validation(required = true)
    public String rolePrompt;

    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    @NameInMap("voice_parameters")
    @Validation(required = true)
    public OpenApiVoiceParameters voiceParameters;

    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("default_template")
    @Validation(required = true)
    public Boolean defaultTemplate;

    @NameInMap("base_template_id")
    public String baseTemplateId;

    public static DetailIotsuccessProductTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailIotsuccessProductTemplateResponse self = new DetailIotsuccessProductTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DetailIotsuccessProductTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailIotsuccessProductTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailIotsuccessProductTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailIotsuccessProductTemplateResponse setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DetailIotsuccessProductTemplateResponse setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public DetailIotsuccessProductTemplateResponse setRolePrompt(String rolePrompt) {
        this.rolePrompt = rolePrompt;
        return this;
    }
    public String getRolePrompt() {
        return this.rolePrompt;
    }

    public DetailIotsuccessProductTemplateResponse setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public DetailIotsuccessProductTemplateResponse setVoiceParameters(OpenApiVoiceParameters voiceParameters) {
        this.voiceParameters = voiceParameters;
        return this;
    }
    public OpenApiVoiceParameters getVoiceParameters() {
        return this.voiceParameters;
    }

    public DetailIotsuccessProductTemplateResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DetailIotsuccessProductTemplateResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailIotsuccessProductTemplateResponse setDefaultTemplate(Boolean defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
        return this;
    }
    public Boolean getDefaultTemplate() {
        return this.defaultTemplate;
    }

    public DetailIotsuccessProductTemplateResponse setBaseTemplateId(String baseTemplateId) {
        this.baseTemplateId = baseTemplateId;
        return this;
    }
    public String getBaseTemplateId() {
        return this.baseTemplateId;
    }

}
