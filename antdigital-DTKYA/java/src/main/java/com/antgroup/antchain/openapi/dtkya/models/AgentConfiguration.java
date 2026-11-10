// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class AgentConfiguration extends TeaModel {
    // Agent 产品或运行器名称
    /**
     * <strong>example:</strong>
     * <p>Codex</p>
     */
    @NameInMap("agent_name")
    @Validation(required = true)
    public String agentName;

    // Agent 产品版本
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("agent_version")
    public String agentVersion;

    // 配置的模型名称列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("configured_models")
    public java.util.List<String> configuredModels;

    // 配置的 MCP server 标识列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("mcp_servers")
    public java.util.List<String> mcpServers;

    // 配置的 Skill 标识列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("skills")
    public java.util.List<String> skills;

    // 配置的工具标识列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("tools")
    public java.util.List<String> tools;

    public static AgentConfiguration build(java.util.Map<String, ?> map) throws Exception {
        AgentConfiguration self = new AgentConfiguration();
        return TeaModel.build(map, self);
    }

    public AgentConfiguration setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public AgentConfiguration setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public AgentConfiguration setConfiguredModels(java.util.List<String> configuredModels) {
        this.configuredModels = configuredModels;
        return this;
    }
    public java.util.List<String> getConfiguredModels() {
        return this.configuredModels;
    }

    public AgentConfiguration setMcpServers(java.util.List<String> mcpServers) {
        this.mcpServers = mcpServers;
        return this;
    }
    public java.util.List<String> getMcpServers() {
        return this.mcpServers;
    }

    public AgentConfiguration setSkills(java.util.List<String> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<String> getSkills() {
        return this.skills;
    }

    public AgentConfiguration setTools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<String> getTools() {
        return this.tools;
    }

}
