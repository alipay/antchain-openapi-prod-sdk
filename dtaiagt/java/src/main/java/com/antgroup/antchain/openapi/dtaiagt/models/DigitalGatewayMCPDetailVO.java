// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DigitalGatewayMCPDetailVO extends TeaModel {
    // server_host
    /**
     * <strong>example:</strong>
     * <p>server_host</p>
     */
    @NameInMap("server_host")
    @Validation(required = true)
    public String serverHost;

    // server请求协议
    /**
     * <strong>example:</strong>
     * <p>transport_protocol</p>
     */
    @NameInMap("transport_protocol")
    @Validation(required = true)
    public String transportProtocol;

    // 网关请求令牌
    /**
     * <strong>example:</strong>
     * <p>server_token</p>
     */
    @NameInMap("server_token")
    @Validation(required = true)
    public String serverToken;

    // 空间id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    // server_id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("server_id")
    @Validation(required = true)
    public String serverId;

    // server_code
    /**
     * <strong>example:</strong>
     * <p>server_code</p>
     */
    @NameInMap("server_code")
    @Validation(required = true)
    public String serverCode;

    // server名称
    /**
     * <strong>example:</strong>
     * <p>server_name</p>
     */
    @NameInMap("server_name")
    @Validation(required = true)
    public String serverName;

    // icon
    /**
     * <strong>example:</strong>
     * <p>icon</p>
     */
    @NameInMap("icon")
    @Validation(required = true)
    public String icon;

    // server描述
    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // mcp上架信息（富文本）
    /**
     * <strong>example:</strong>
     * <p>docs</p>
     */
    @NameInMap("docs")
    @Validation(required = true)
    public String docs;

    // 工具列表
    @NameInMap("tool_list")
    @Validation(required = true)
    public java.util.List<ToolInfoVO> toolList;

    public static DigitalGatewayMCPDetailVO build(java.util.Map<String, ?> map) throws Exception {
        DigitalGatewayMCPDetailVO self = new DigitalGatewayMCPDetailVO();
        return TeaModel.build(map, self);
    }

    public DigitalGatewayMCPDetailVO setServerHost(String serverHost) {
        this.serverHost = serverHost;
        return this;
    }
    public String getServerHost() {
        return this.serverHost;
    }

    public DigitalGatewayMCPDetailVO setTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
        return this;
    }
    public String getTransportProtocol() {
        return this.transportProtocol;
    }

    public DigitalGatewayMCPDetailVO setServerToken(String serverToken) {
        this.serverToken = serverToken;
        return this;
    }
    public String getServerToken() {
        return this.serverToken;
    }

    public DigitalGatewayMCPDetailVO setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DigitalGatewayMCPDetailVO setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public DigitalGatewayMCPDetailVO setServerCode(String serverCode) {
        this.serverCode = serverCode;
        return this;
    }
    public String getServerCode() {
        return this.serverCode;
    }

    public DigitalGatewayMCPDetailVO setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

    public DigitalGatewayMCPDetailVO setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public DigitalGatewayMCPDetailVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DigitalGatewayMCPDetailVO setDocs(String docs) {
        this.docs = docs;
        return this;
    }
    public String getDocs() {
        return this.docs;
    }

    public DigitalGatewayMCPDetailVO setToolList(java.util.List<ToolInfoVO> toolList) {
        this.toolList = toolList;
        return this;
    }
    public java.util.List<ToolInfoVO> getToolList() {
        return this.toolList;
    }

}
