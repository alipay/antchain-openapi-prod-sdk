// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class SubAgentInfo extends TeaModel {
    // 智能体ID
    /**
     * <strong>example:</strong>
     * <p>智能体ID</p>
     */
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 智能体名称
    /**
     * <strong>example:</strong>
     * <p>碳矩阵智能体</p>
     */
    @NameInMap("agent_name")
    @Validation(required = true)
    public String agentName;

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
     * <p>qwen-plus</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // skill信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("skills")
    @Validation(required = true)
    public java.util.List<String> skills;

    // mcp功能
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("mcps")
    @Validation(required = true)
    public java.util.List<String> mcps;

    // 实例id
    /**
     * <strong>example:</strong>
     * <p>实例id</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static SubAgentInfo build(java.util.Map<String, ?> map) throws Exception {
        SubAgentInfo self = new SubAgentInfo();
        return TeaModel.build(map, self);
    }

    public SubAgentInfo setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SubAgentInfo setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public SubAgentInfo setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public SubAgentInfo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubAgentInfo setSkills(java.util.List<String> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<String> getSkills() {
        return this.skills;
    }

    public SubAgentInfo setMcps(java.util.List<String> mcps) {
        this.mcps = mcps;
        return this;
    }
    public java.util.List<String> getMcps() {
        return this.mcps;
    }

    public SubAgentInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
