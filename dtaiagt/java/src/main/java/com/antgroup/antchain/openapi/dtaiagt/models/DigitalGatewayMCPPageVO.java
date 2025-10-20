// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DigitalGatewayMCPPageVO extends TeaModel {
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
     * <p>server_id</p>
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

    // server_name
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

    // description
    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    //  mcp分类
    @NameInMap("categories")
    @Validation(required = true)
    public java.util.List<String> categories;

    public static DigitalGatewayMCPPageVO build(java.util.Map<String, ?> map) throws Exception {
        DigitalGatewayMCPPageVO self = new DigitalGatewayMCPPageVO();
        return TeaModel.build(map, self);
    }

    public DigitalGatewayMCPPageVO setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DigitalGatewayMCPPageVO setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public DigitalGatewayMCPPageVO setServerCode(String serverCode) {
        this.serverCode = serverCode;
        return this;
    }
    public String getServerCode() {
        return this.serverCode;
    }

    public DigitalGatewayMCPPageVO setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

    public DigitalGatewayMCPPageVO setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public DigitalGatewayMCPPageVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DigitalGatewayMCPPageVO setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

}
