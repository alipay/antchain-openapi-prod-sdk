// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class McpInfo extends TeaModel {
    // mcp名字
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 协议类型：STREAM_HTTP / SSE / STDIO（大小写不敏感）
    /**
     * <strong>example:</strong>
     * <p>STREAM_HTTP</p>
     */
    @NameInMap("transport")
    @Validation(required = true)
    public String transport;

    // 协议地址
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    // 请求头键值对 JSON 字符串，可含鉴权密钥
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("headers")
    public String headers;

    // mcp 幂等标识（agent.detail 回传值，编辑复用）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("mcp_id")
    @Validation(required = true)
    public String mcpId;

    // 工具名白名单：只列出的工具暴露给 LLM，至少 1 个
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("tools")
    public java.util.List<String> tools;

    // 该 MCP 的工具默认是否需要用户审批确认（R2 授权流）；缺省按服务端安全缺省 true
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("approval_required")
    public Boolean approvalRequired;

    // 免审批工具名名单：无需用户确认直接执行；缺省空（全部按 approval_required 判定）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("approval_exempt_tools")
    public java.util.List<String> approvalExemptTools;

    // 审批交互开关：true 时需审批工具经 INTERACTION_REQUIRED→DECIDE 用户确认；false 时需审批工具不派发（fail-closed）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("approval_enabled")
    public Boolean approvalEnabled;

    public static McpInfo build(java.util.Map<String, ?> map) throws Exception {
        McpInfo self = new McpInfo();
        return TeaModel.build(map, self);
    }

    public McpInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public McpInfo setTransport(String transport) {
        this.transport = transport;
        return this;
    }
    public String getTransport() {
        return this.transport;
    }

    public McpInfo setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public McpInfo setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public McpInfo setMcpId(String mcpId) {
        this.mcpId = mcpId;
        return this;
    }
    public String getMcpId() {
        return this.mcpId;
    }

    public McpInfo setTools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<String> getTools() {
        return this.tools;
    }

    public McpInfo setApprovalRequired(Boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
        return this;
    }
    public Boolean getApprovalRequired() {
        return this.approvalRequired;
    }

    public McpInfo setApprovalExemptTools(java.util.List<String> approvalExemptTools) {
        this.approvalExemptTools = approvalExemptTools;
        return this;
    }
    public java.util.List<String> getApprovalExemptTools() {
        return this.approvalExemptTools;
    }

    public McpInfo setApprovalEnabled(Boolean approvalEnabled) {
        this.approvalEnabled = approvalEnabled;
        return this;
    }
    public Boolean getApprovalEnabled() {
        return this.approvalEnabled;
    }

}
