// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateSidecaropsConsistencyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 请求唯一性验证
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

    // 需要更新的cell名称数组
    @NameInMap("cell_names")
    @Validation(required = true)
    public java.util.List<String> cellNames;

    // 需要更新的sidecar属性
    @NameInMap("sidecar_config")
    @Validation(required = true)
    public SidecarConfig sidecarConfig;

    // 指定sidecar版本进行升级，不填入此字段时，默认使用对应sidecar的最新版本
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 发布单号
    @NameInMap("order_num")
    @Validation(required = true)
    public String orderNum;

    // 是否回滚流程
    @NameInMap("is_rollback")
    public Boolean isRollback;

    public static UpdateSidecaropsConsistencyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecaropsConsistencyRequest self = new UpdateSidecaropsConsistencyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSidecaropsConsistencyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSidecaropsConsistencyRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateSidecaropsConsistencyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSidecaropsConsistencyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateSidecaropsConsistencyRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateSidecaropsConsistencyRequest setCellNames(java.util.List<String> cellNames) {
        this.cellNames = cellNames;
        return this;
    }
    public java.util.List<String> getCellNames() {
        return this.cellNames;
    }

    public UpdateSidecaropsConsistencyRequest setSidecarConfig(SidecarConfig sidecarConfig) {
        this.sidecarConfig = sidecarConfig;
        return this;
    }
    public SidecarConfig getSidecarConfig() {
        return this.sidecarConfig;
    }

    public UpdateSidecaropsConsistencyRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public UpdateSidecaropsConsistencyRequest setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

    public UpdateSidecaropsConsistencyRequest setIsRollback(Boolean isRollback) {
        this.isRollback = isRollback;
        return this;
    }
    public Boolean getIsRollback() {
        return this.isRollback;
    }

}
