// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateIotagentAgentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体id
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 智能体名字
    @NameInMap("agent_name")
    @Validation(required = true)
    public String agentName;

    // 智能体提示词
    @NameInMap("system_prompt")
    public String systemPrompt;

    // 模型提供方
    @NameInMap("model_provider")
    @Validation(required = true)
    public String modelProvider;

    // 模型id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // skill集合
    @NameInMap("skills")
    @Validation(required = true)
    public java.util.List<SkillInfo> skills;

    // mcp配置
    @NameInMap("mcps")
    public java.util.List<McpInfo> mcps;

    // 工具集合
    @NameInMap("tools")
    public java.util.List<String> tools;

    // 实例id，不允许编辑
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static UpdateIotagentAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIotagentAgentRequest self = new UpdateIotagentAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIotagentAgentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIotagentAgentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIotagentAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdateIotagentAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public UpdateIotagentAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public UpdateIotagentAgentRequest setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public UpdateIotagentAgentRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateIotagentAgentRequest setSkills(java.util.List<SkillInfo> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<SkillInfo> getSkills() {
        return this.skills;
    }

    public UpdateIotagentAgentRequest setMcps(java.util.List<McpInfo> mcps) {
        this.mcps = mcps;
        return this;
    }
    public java.util.List<McpInfo> getMcps() {
        return this.mcps;
    }

    public UpdateIotagentAgentRequest setTools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<String> getTools() {
        return this.tools;
    }

    public UpdateIotagentAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
