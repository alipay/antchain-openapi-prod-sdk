// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UpdateBlockchainBotIotagentAgentteamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 实例id
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

    // 模型
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 子智能体ids
    @NameInMap("sub_agents")
    @Validation(required = true)
    public java.util.List<String> subAgents;

    public static UpdateBlockchainBotIotagentAgentteamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainBotIotagentAgentteamRequest self = new UpdateBlockchainBotIotagentAgentteamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainBotIotagentAgentteamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBlockchainBotIotagentAgentteamRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBlockchainBotIotagentAgentteamRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdateBlockchainBotIotagentAgentteamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateBlockchainBotIotagentAgentteamRequest setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    public UpdateBlockchainBotIotagentAgentteamRequest setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public UpdateBlockchainBotIotagentAgentteamRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateBlockchainBotIotagentAgentteamRequest setSubAgents(java.util.List<String> subAgents) {
        this.subAgents = subAgents;
        return this;
    }
    public java.util.List<String> getSubAgents() {
        return this.subAgents;
    }

}
