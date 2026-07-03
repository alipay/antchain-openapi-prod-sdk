// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class AgentInfoVO extends TeaModel {
    // 智能体ID
    /**
     * <strong>example:</strong>
     * <p>7265889323732762624</p>
     */
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 智能体名称
    /**
     * <strong>example:</strong>
     * <p>小蚁</p>
     */
    @NameInMap("agent_name")
    @Validation(required = true)
    public String agentName;

    // 语言编码
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("lang_code")
    @Validation(required = true)
    public String langCode;

    // 音色ID
    /**
     * <strong>example:</strong>
     * <p>longjing_v2</p>
     */
    @NameInMap("tts_voice_id")
    @Validation(required = true)
    public String ttsVoiceId;

    // 系统提示词
    /**
     * <strong>example:</strong>
     * <p>你是一个某某智能体</p>
     */
    @NameInMap("system_prompt")
    @Validation(required = true)
    public String systemPrompt;

    // 可选模型列表
    /**
     * <strong>example:</strong>
     * <p>[{&quot;label&quot;:&quot;qwen-plus&quot;,&quot;value&quot;:&quot;qwen-plus&quot;},{&quot;label&quot;:&quot;glm4.7&quot;,&quot;value&quot;:&quot;glm4.7&quot;},{&quot;label&quot;:&quot;glm5&quot;,&quot;value&quot;:&quot;glm5&quot;}]</p>
     */
    @NameInMap("llm_model_list")
    public java.util.List<DictionaryInfoBO> llmModelList;

    // 可选音色列表
    /**
     * <strong>example:</strong>
     * <p>[{&quot;label&quot;:&quot;甜甜（女声普通话）&quot;,&quot;value&quot;:&quot;Tina&quot;},{&quot;label&quot;:&quot;拉迪奥·戈尔（男声葡萄牙语）&quot;,&quot;value&quot;:&quot;Radio Gol&quot;}]</p>
     */
    @NameInMap("tts_voice_list")
    public java.util.List<DictionaryInfoBO> ttsVoiceList;

    // 可选语言列表
    /**
     * <strong>example:</strong>
     * <p>[{&quot;label&quot;: &quot;中文&quot;,&quot;value&quot;: &quot;zh&quot;},{&quot;label&quot;: &quot;英文&quot;,&quot;value&quot;: &quot;en&quot;}]</p>
     */
    @NameInMap("language_list")
    public java.util.List<DictionaryInfoBO> languageList;

    // 父模板智能体名称
    /**
     * <strong>example:</strong>
     * <p>小蚁模板</p>
     */
    @NameInMap("parent_template_agent_name")
    public String parentTemplateAgentName;

    public static AgentInfoVO build(java.util.Map<String, ?> map) throws Exception {
        AgentInfoVO self = new AgentInfoVO();
        return TeaModel.build(map, self);
    }

    public AgentInfoVO setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public AgentInfoVO setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public AgentInfoVO setLangCode(String langCode) {
        this.langCode = langCode;
        return this;
    }
    public String getLangCode() {
        return this.langCode;
    }

    public AgentInfoVO setTtsVoiceId(String ttsVoiceId) {
        this.ttsVoiceId = ttsVoiceId;
        return this;
    }
    public String getTtsVoiceId() {
        return this.ttsVoiceId;
    }

    public AgentInfoVO setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public AgentInfoVO setLlmModelList(java.util.List<DictionaryInfoBO> llmModelList) {
        this.llmModelList = llmModelList;
        return this;
    }
    public java.util.List<DictionaryInfoBO> getLlmModelList() {
        return this.llmModelList;
    }

    public AgentInfoVO setTtsVoiceList(java.util.List<DictionaryInfoBO> ttsVoiceList) {
        this.ttsVoiceList = ttsVoiceList;
        return this;
    }
    public java.util.List<DictionaryInfoBO> getTtsVoiceList() {
        return this.ttsVoiceList;
    }

    public AgentInfoVO setLanguageList(java.util.List<DictionaryInfoBO> languageList) {
        this.languageList = languageList;
        return this;
    }
    public java.util.List<DictionaryInfoBO> getLanguageList() {
        return this.languageList;
    }

    public AgentInfoVO setParentTemplateAgentName(String parentTemplateAgentName) {
        this.parentTemplateAgentName = parentTemplateAgentName;
        return this;
    }
    public String getParentTemplateAgentName() {
        return this.parentTemplateAgentName;
    }

}
