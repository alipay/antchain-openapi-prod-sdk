// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class AgentVO extends TeaModel {
    // Agent的唯一标识符
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // Agent唯一uid
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("unique_code")
    @Validation(required = true)
    public String uniqueCode;

    // Agent名称
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // Agent 版本
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("agent_version")
    @Validation(required = true)
    public String agentVersion;

    // Agent类型 "multi", "多智能体应用" "workflow", "工作流应用""lite", "轻量应用"  "external", "外部应用"
    /**
     * <strong>example:</strong>
     * <p>lite</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // Agent描述
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;这是一个智能助手&quot; </p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // Agent创建人
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    // Agent创建时间
    // 
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // Agent编辑时间
    // 
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // Agent安全审核配置
    // 
    @NameInMap("sec_config")
    @Validation(required = true)
    public AgentSecConfig secConfig;

    // 欢迎语
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;欢迎使用智能助手&quot; </p>
     */
    @NameInMap("welcome")
    @Validation(required = true)
    public String welcome;

    // 是否展示关联问题
    // 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("show_related_questions")
    @Validation(required = true)
    public Boolean showRelatedQuestions;

    // 关联问题自定义prompt
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;请推荐相关问题&quot; </p>
     */
    @NameInMap("related_question_prompt")
    @Validation(required = true)
    public String relatedQuestionPrompt;

    // 额外信息 ，Map<String, Object>
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extra_info")
    @Validation(required = true)
    public String extraInfo;

    // extra_info (额外信息) 字段的json形式，格式为：Map<String, Object>
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extra_info_json")
    @Validation(required = true)
    public String extraInfoJson;

    // 交互类型 VOICE / AVATAR / VIDEO
    // 
    /**
     * <strong>example:</strong>
     * <p>VOICE</p>
     */
    @NameInMap("interaction_type")
    @Validation(required = true)
    public String interactionType;

    // 音色
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("voice")
    @Validation(required = true)
    public String voice;

    // agent模型版本 {model}/{version}#{adapter} (deprecated)
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;gpt-3.5-turbo&quot; </p>
     */
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // Agent模型配置表
    // 
    @NameInMap("model_list")
    @Validation(required = true)
    public java.util.List<AgentModelParams> modelList;

    // Agent关联知识库ID列表
    // 
    @NameInMap("ref_library_ids")
    @Validation(required = true)
    public java.util.List<String> refLibraryIds;

    // Agent关联插件信息表, key为插件主键id, value为信息
    // 
    @NameInMap("ref_plugins")
    @Validation(required = true)
    public java.util.List<AgentRefPluginInfo> refPlugins;

    // 关联的mcpServer
    // 
    @NameInMap("ref_mcp_servers")
    @Validation(required = true)
    public java.util.List<AgentRefPluginInfo> refMcpServers;

    // 隶属multi-agent的sub agents
    // 
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("sub_agents")
    @Validation(required = true)
    public java.util.List<SubAgentInfo> subAgents;

    // Agent关联workflow信息表, key为intent wutong id, value为信息
    // 
    @NameInMap("ref_workflows")
    @Validation(required = true)
    public java.util.List<AgentRefPluginInfo> refWorkflows;

    // 关联卡片id列表
    // 
    @NameInMap("ref_card_ids")
    @Validation(required = true)
    public java.util.List<String> refCardIds;

    public static AgentVO build(java.util.Map<String, ?> map) throws Exception {
        AgentVO self = new AgentVO();
        return TeaModel.build(map, self);
    }

    public AgentVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AgentVO setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
        return this;
    }
    public String getUniqueCode() {
        return this.uniqueCode;
    }

    public AgentVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgentVO setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public AgentVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AgentVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentVO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public AgentVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AgentVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AgentVO setSecConfig(AgentSecConfig secConfig) {
        this.secConfig = secConfig;
        return this;
    }
    public AgentSecConfig getSecConfig() {
        return this.secConfig;
    }

    public AgentVO setWelcome(String welcome) {
        this.welcome = welcome;
        return this;
    }
    public String getWelcome() {
        return this.welcome;
    }

    public AgentVO setShowRelatedQuestions(Boolean showRelatedQuestions) {
        this.showRelatedQuestions = showRelatedQuestions;
        return this;
    }
    public Boolean getShowRelatedQuestions() {
        return this.showRelatedQuestions;
    }

    public AgentVO setRelatedQuestionPrompt(String relatedQuestionPrompt) {
        this.relatedQuestionPrompt = relatedQuestionPrompt;
        return this;
    }
    public String getRelatedQuestionPrompt() {
        return this.relatedQuestionPrompt;
    }

    public AgentVO setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public AgentVO setExtraInfoJson(String extraInfoJson) {
        this.extraInfoJson = extraInfoJson;
        return this;
    }
    public String getExtraInfoJson() {
        return this.extraInfoJson;
    }

    public AgentVO setInteractionType(String interactionType) {
        this.interactionType = interactionType;
        return this;
    }
    public String getInteractionType() {
        return this.interactionType;
    }

    public AgentVO setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public AgentVO setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public AgentVO setModelList(java.util.List<AgentModelParams> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<AgentModelParams> getModelList() {
        return this.modelList;
    }

    public AgentVO setRefLibraryIds(java.util.List<String> refLibraryIds) {
        this.refLibraryIds = refLibraryIds;
        return this;
    }
    public java.util.List<String> getRefLibraryIds() {
        return this.refLibraryIds;
    }

    public AgentVO setRefPlugins(java.util.List<AgentRefPluginInfo> refPlugins) {
        this.refPlugins = refPlugins;
        return this;
    }
    public java.util.List<AgentRefPluginInfo> getRefPlugins() {
        return this.refPlugins;
    }

    public AgentVO setRefMcpServers(java.util.List<AgentRefPluginInfo> refMcpServers) {
        this.refMcpServers = refMcpServers;
        return this;
    }
    public java.util.List<AgentRefPluginInfo> getRefMcpServers() {
        return this.refMcpServers;
    }

    public AgentVO setSubAgents(java.util.List<SubAgentInfo> subAgents) {
        this.subAgents = subAgents;
        return this;
    }
    public java.util.List<SubAgentInfo> getSubAgents() {
        return this.subAgents;
    }

    public AgentVO setRefWorkflows(java.util.List<AgentRefPluginInfo> refWorkflows) {
        this.refWorkflows = refWorkflows;
        return this;
    }
    public java.util.List<AgentRefPluginInfo> getRefWorkflows() {
        return this.refWorkflows;
    }

    public AgentVO setRefCardIds(java.util.List<String> refCardIds) {
        this.refCardIds = refCardIds;
        return this;
    }
    public java.util.List<String> getRefCardIds() {
        return this.refCardIds;
    }

}
