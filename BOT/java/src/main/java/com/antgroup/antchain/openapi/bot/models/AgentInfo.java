// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AgentInfo extends TeaModel {
    // 智能体id
    /**
     * <strong>example:</strong>
     * <p>11223344556778899</p>
     */
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 智能体名字
    /**
     * <strong>example:</strong>
     * <p>碳矩阵智能体</p>
     */
    @NameInMap("agent_name")
    @Validation(required = true)
    public String agentName;

    // 系统提示词
    /**
     * <strong>example:</strong>
     * <p>你是碳矩阵智能助手</p>
     */
    @NameInMap("system_prompt")
    @Validation(required = true)
    public String systemPrompt;

    // 模型提供方
    /**
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("model_provider")
    @Validation(required = true)
    public String modelProvider;

    // 模型
    /**
     * <strong>example:</strong>
     * <p>11223344556778899</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // skills信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("skills")
    @Validation(required = true)
    public java.util.List<String> skills;

    // mcp信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("mcps")
    @Validation(required = true)
    public java.util.List<String> mcps;

    // 子智能体id
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("sub_agents")
    public java.util.List<String> subAgents;

    // 子智能体详情
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("sub_agent_info_list")
    public SubAgentInfo subAgentInfoList;

    // 实例id
    /**
     * <strong>example:</strong>
     * <p>11223344556778899</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static AgentInfo build(java.util.Map<String, ?> map) throws Exception {
        AgentInfo self = new AgentInfo();
        return TeaModel.build(map, self);
    }

    public AgentInfo setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public AgentInfo setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public AgentInfo setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public AgentInfo setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public AgentInfo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public AgentInfo setSkills(java.util.List<String> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<String> getSkills() {
        return this.skills;
    }

    public AgentInfo setMcps(java.util.List<String> mcps) {
        this.mcps = mcps;
        return this;
    }
    public java.util.List<String> getMcps() {
        return this.mcps;
    }

    public AgentInfo setSubAgents(java.util.List<String> subAgents) {
        this.subAgents = subAgents;
        return this;
    }
    public java.util.List<String> getSubAgents() {
        return this.subAgents;
    }

    public AgentInfo setSubAgentInfoList(SubAgentInfo subAgentInfoList) {
        this.subAgentInfoList = subAgentInfoList;
        return this;
    }
    public SubAgentInfo getSubAgentInfoList() {
        return this.subAgentInfoList;
    }

    public AgentInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
