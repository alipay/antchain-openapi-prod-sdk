// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class InitSidecaropsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务名称
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 预留用于防止请求重放
    @NameInMap("client_token")
    public String clientToken;

    // 应用服务所属命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 需要被注入的sidecar配置列表，可以同时注入多个
    @NameInMap("sidecar_configs")
    @Validation(required = true)
    public java.util.List<SidecarConfig> sidecarConfigs;

    // 部署单元名称
    @NameInMap("cell_name")
    @Validation(required = true)
    public String cellName;

    // 要被注入的pod列表，列表元素为pod的名称
    @NameInMap("server_identities")
    @Validation(required = true)
    public java.util.List<String> serverIdentities;

    // 执行单号，所以批次共用同一单号
    @NameInMap("order_num")
    @Validation(required = true)
    public String orderNum;

    public static InitSidecaropsRequest build(java.util.Map<String, ?> map) throws Exception {
        InitSidecaropsRequest self = new InitSidecaropsRequest();
        return TeaModel.build(map, self);
    }

    public InitSidecaropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitSidecaropsRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public InitSidecaropsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InitSidecaropsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public InitSidecaropsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public InitSidecaropsRequest setSidecarConfigs(java.util.List<SidecarConfig> sidecarConfigs) {
        this.sidecarConfigs = sidecarConfigs;
        return this;
    }
    public java.util.List<SidecarConfig> getSidecarConfigs() {
        return this.sidecarConfigs;
    }

    public InitSidecaropsRequest setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }
    public String getCellName() {
        return this.cellName;
    }

    public InitSidecaropsRequest setServerIdentities(java.util.List<String> serverIdentities) {
        this.serverIdentities = serverIdentities;
        return this;
    }
    public java.util.List<String> getServerIdentities() {
        return this.serverIdentities;
    }

    public InitSidecaropsRequest setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

}
