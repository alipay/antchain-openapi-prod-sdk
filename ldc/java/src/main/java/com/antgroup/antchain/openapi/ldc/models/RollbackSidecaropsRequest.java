// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RollbackSidecaropsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 请求幂等
    @NameInMap("client_token")
    public String clientToken;

    // 所属命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 所属工作空间
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // sidecar相关配置，包含image，feature等
    @NameInMap("sidecar_config")
    @Validation(required = true)
    public SidecarConfig sidecarConfig;

    // 指定sidecar的基线模板版本进行回滚
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 部署单元
    @NameInMap("cell_name")
    @Validation(required = true)
    public String cellName;

    // 要更新的hostname列表
    // 
    @NameInMap("server_identities")
    @Validation(required = true)
    public java.util.List<String> serverIdentities;

    // 工单id
    @NameInMap("order_num")
    @Validation(required = true)
    public String orderNum;

    public static RollbackSidecaropsRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackSidecaropsRequest self = new RollbackSidecaropsRequest();
        return TeaModel.build(map, self);
    }

    public RollbackSidecaropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackSidecaropsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RollbackSidecaropsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RollbackSidecaropsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RollbackSidecaropsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public RollbackSidecaropsRequest setSidecarConfig(SidecarConfig sidecarConfig) {
        this.sidecarConfig = sidecarConfig;
        return this;
    }
    public SidecarConfig getSidecarConfig() {
        return this.sidecarConfig;
    }

    public RollbackSidecaropsRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public RollbackSidecaropsRequest setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }
    public String getCellName() {
        return this.cellName;
    }

    public RollbackSidecaropsRequest setServerIdentities(java.util.List<String> serverIdentities) {
        this.serverIdentities = serverIdentities;
        return this;
    }
    public java.util.List<String> getServerIdentities() {
        return this.serverIdentities;
    }

    public RollbackSidecaropsRequest setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

}
