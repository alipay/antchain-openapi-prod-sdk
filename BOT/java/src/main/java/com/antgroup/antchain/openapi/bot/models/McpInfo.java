// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class McpInfo extends TeaModel {
    // mcp名字
    /**
     * <strong>example:</strong>
     * <p>mcp名字</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 协议类型
    /**
     * <strong>example:</strong>
     * <p>streamable_http / sse</p>
     */
    @NameInMap("transport")
    @Validation(required = true)
    public String transport;

    // 协议地址
    /**
     * <strong>example:</strong>
     * <p>协议地址</p>
     */
    @NameInMap("endpoint")
    @Validation(required = true)
    public String endpoint;

    // json
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("headers")
    @Validation(required = true)
    public String headers;

    // mcp_id
    /**
     * <strong>example:</strong>
     * <p>mcp_id</p>
     */
    @NameInMap("mcp_id")
    @Validation(required = true)
    public String mcpId;

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

}
