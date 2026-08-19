// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotagentAgentteamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例Id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 智能体名称
    @NameInMap("agent_name")
    @Validation(required = true)
    public String agentName;

    // 系统提示词
    @NameInMap("system_prompt")
    public String systemPrompt;

    // 模型提供方
    @NameInMap("model_provider")
    @Validation(required = true)
    public String modelProvider;

    // 实例id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 子智能体ids
    @NameInMap("sub_agents")
    @Validation(required = true)
    public java.util.List<String> subAgents;

    public static CreateIotagentAgentteamRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIotagentAgentteamRequest self = new CreateIotagentAgentteamRequest();
        return TeaModel.build(map, self);
    }

    public CreateIotagentAgentteamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIotagentAgentteamRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIotagentAgentteamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIotagentAgentteamRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public CreateIotagentAgentteamRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public CreateIotagentAgentteamRequest setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public CreateIotagentAgentteamRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateIotagentAgentteamRequest setSubAgents(java.util.List<String> subAgents) {
        this.subAgents = subAgents;
        return this;
    }
    public java.util.List<String> getSubAgents() {
        return this.subAgents;
    }

}
