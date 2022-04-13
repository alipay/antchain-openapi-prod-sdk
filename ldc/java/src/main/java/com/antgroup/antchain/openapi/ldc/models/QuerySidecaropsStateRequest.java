// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySidecaropsStateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 命名空间组名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 需要查询的部署单元列表
    @NameInMap("cell_names")
    @Validation(required = true)
    public java.util.List<String> cellNames;

    // 运维单号
    @NameInMap("order_num")
    @Validation(required = true)
    public String orderNum;

    // sidecar配置
    @NameInMap("sidecar_config")
    @Validation(required = true)
    public SidecarConfig sidecarConfig;

    public static QuerySidecaropsStateRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySidecaropsStateRequest self = new QuerySidecaropsStateRequest();
        return TeaModel.build(map, self);
    }

    public QuerySidecaropsStateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySidecaropsStateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QuerySidecaropsStateRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QuerySidecaropsStateRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QuerySidecaropsStateRequest setCellNames(java.util.List<String> cellNames) {
        this.cellNames = cellNames;
        return this;
    }
    public java.util.List<String> getCellNames() {
        return this.cellNames;
    }

    public QuerySidecaropsStateRequest setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

    public QuerySidecaropsStateRequest setSidecarConfig(SidecarConfig sidecarConfig) {
        this.sidecarConfig = sidecarConfig;
        return this;
    }
    public SidecarConfig getSidecarConfig() {
        return this.sidecarConfig;
    }

}
