// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FinishSidecaropsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 请求token
    @NameInMap("client_token")
    public String clientToken;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 请求单号
    @NameInMap("order_num")
    @Validation(required = true)
    public String orderNum;

    // 部署单元列表
    @NameInMap("cell_names")
    @Validation(required = true)
    public java.util.List<String> cellNames;

    // sidecar配置
    @NameInMap("sidecar_config")
    @Validation(required = true)
    public SidecarConfig sidecarConfig;

    // 是否回滚流程
    @NameInMap("is_rollback")
    public Boolean isRollback;

    public static FinishSidecaropsRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishSidecaropsRequest self = new FinishSidecaropsRequest();
        return TeaModel.build(map, self);
    }

    public FinishSidecaropsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishSidecaropsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public FinishSidecaropsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FinishSidecaropsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public FinishSidecaropsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public FinishSidecaropsRequest setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

    public FinishSidecaropsRequest setCellNames(java.util.List<String> cellNames) {
        this.cellNames = cellNames;
        return this;
    }
    public java.util.List<String> getCellNames() {
        return this.cellNames;
    }

    public FinishSidecaropsRequest setSidecarConfig(SidecarConfig sidecarConfig) {
        this.sidecarConfig = sidecarConfig;
        return this;
    }
    public SidecarConfig getSidecarConfig() {
        return this.sidecarConfig;
    }

    public FinishSidecaropsRequest setIsRollback(Boolean isRollback) {
        this.isRollback = isRollback;
        return this;
    }
    public Boolean getIsRollback() {
        return this.isRollback;
    }

}
