// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotagentAgentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体名称
    @NameInMap("agent_name")
    @Validation(required = true)
    public String agentName;

    // 实例Id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 系统提示词
    @NameInMap("system_prompt")
    public String systemPrompt;

    // 模型提供方
    @NameInMap("model_provider")
    @Validation(required = true)
    public String modelProvider;

    // 模型名称
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // sklil内容
    @NameInMap("skills")
    public java.util.List<SkillInfo> skills;

    // mcp配置
    @NameInMap("mcps")
    public java.util.List<McpInfo> mcps;

    public static CreateIotagentAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIotagentAgentRequest self = new CreateIotagentAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateIotagentAgentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIotagentAgentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIotagentAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public CreateIotagentAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIotagentAgentRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public CreateIotagentAgentRequest setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public CreateIotagentAgentRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateIotagentAgentRequest setSkills(java.util.List<SkillInfo> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<SkillInfo> getSkills() {
        return this.skills;
    }

    public CreateIotagentAgentRequest setMcps(java.util.List<McpInfo> mcps) {
        this.mcps = mcps;
        return this;
    }
    public java.util.List<McpInfo> getMcps() {
        return this.mcps;
    }

}
