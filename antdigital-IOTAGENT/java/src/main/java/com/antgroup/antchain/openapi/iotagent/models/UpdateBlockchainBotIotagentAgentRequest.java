// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UpdateBlockchainBotIotagentAgentRequest extends TeaModel {
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

    // 实例id，不允许编辑
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static UpdateBlockchainBotIotagentAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainBotIotagentAgentRequest self = new UpdateBlockchainBotIotagentAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainBotIotagentAgentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBlockchainBotIotagentAgentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBlockchainBotIotagentAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdateBlockchainBotIotagentAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public UpdateBlockchainBotIotagentAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public UpdateBlockchainBotIotagentAgentRequest setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public UpdateBlockchainBotIotagentAgentRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateBlockchainBotIotagentAgentRequest setSkills(java.util.List<SkillInfo> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<SkillInfo> getSkills() {
        return this.skills;
    }

    public UpdateBlockchainBotIotagentAgentRequest setMcps(java.util.List<McpInfo> mcps) {
        this.mcps = mcps;
        return this;
    }
    public java.util.List<McpInfo> getMcps() {
        return this.mcps;
    }

    public UpdateBlockchainBotIotagentAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
