// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySidecaropsReleaseinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称（借花场景即为应用服务名）
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // sidecar类型
    @NameInMap("sidecar_type")
    @Validation(required = true)
    public String sidecarType;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 变更单号
    @NameInMap("order_num")
    public String orderNum;

    // 应用服务发布sidecar的版本号，每次发布程序会自己分配一个，可用于作为查询key
    @NameInMap("release_version")
    public String releaseVersion;

    public static QuerySidecaropsReleaseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySidecaropsReleaseinfoRequest self = new QuerySidecaropsReleaseinfoRequest();
        return TeaModel.build(map, self);
    }

    public QuerySidecaropsReleaseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySidecaropsReleaseinfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QuerySidecaropsReleaseinfoRequest setSidecarType(String sidecarType) {
        this.sidecarType = sidecarType;
        return this;
    }
    public String getSidecarType() {
        return this.sidecarType;
    }

    public QuerySidecaropsReleaseinfoRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QuerySidecaropsReleaseinfoRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QuerySidecaropsReleaseinfoRequest setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

    public QuerySidecaropsReleaseinfoRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

}
