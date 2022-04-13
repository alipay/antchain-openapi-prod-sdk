// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateSidecaropsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 保证请求幂等性
    @NameInMap("client_token")
    public String clientToken;

    // 所属命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 所属工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // sidecar的类型，如mosn，odp
    @NameInMap("sidecar_config")
    @Validation(required = true)
    public SidecarConfig sidecarConfig;

    // 指定sidecar的基线模板版本进行升级，可选，不填时，默认选中指定sidecar的最新版本进行升级
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 单元名称
    @NameInMap("cell_name")
    @Validation(required = true)
    public String cellName;

    // 要更新的hostname列表
    @NameInMap("server_identities")
    @Validation(required = true)
    public java.util.List<String> serverIdentities;

    // 工单id
    @NameInMap("order_num")
    @Validation(required = true)
    public String orderNum;

    public static UpdateSidecaropsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecaropsRequest self = new UpdateSidecaropsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSidecaropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSidecaropsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateSidecaropsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSidecaropsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateSidecaropsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateSidecaropsRequest setSidecarConfig(SidecarConfig sidecarConfig) {
        this.sidecarConfig = sidecarConfig;
        return this;
    }
    public SidecarConfig getSidecarConfig() {
        return this.sidecarConfig;
    }

    public UpdateSidecaropsRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public UpdateSidecaropsRequest setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }
    public String getCellName() {
        return this.cellName;
    }

    public UpdateSidecaropsRequest setServerIdentities(java.util.List<String> serverIdentities) {
        this.serverIdentities = serverIdentities;
        return this;
    }
    public java.util.List<String> getServerIdentities() {
        return this.serverIdentities;
    }

    public UpdateSidecaropsRequest setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

}
