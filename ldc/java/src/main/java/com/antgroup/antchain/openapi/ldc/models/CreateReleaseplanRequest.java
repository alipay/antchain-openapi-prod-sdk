// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateReleaseplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 创建发布单需要的应用服务信息
    @NameInMap("app_services")
    @Validation(required = true)
    public java.util.List<ReleasePlanSpecAppService> appServices;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 是否自动执行
    @NameInMap("is_auto_execute")
    public Boolean isAutoExecute;

    // 发布单标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 默认CLOUD_NATIVE_GROUP_RELEASE
    @NameInMap("ops_type")
    public String opsType;

    public static CreateReleaseplanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReleaseplanRequest self = new CreateReleaseplanRequest();
        return TeaModel.build(map, self);
    }

    public CreateReleaseplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateReleaseplanRequest setAppServices(java.util.List<ReleasePlanSpecAppService> appServices) {
        this.appServices = appServices;
        return this;
    }
    public java.util.List<ReleasePlanSpecAppService> getAppServices() {
        return this.appServices;
    }

    public CreateReleaseplanRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateReleaseplanRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateReleaseplanRequest setIsAutoExecute(Boolean isAutoExecute) {
        this.isAutoExecute = isAutoExecute;
        return this;
    }
    public Boolean getIsAutoExecute() {
        return this.isAutoExecute;
    }

    public CreateReleaseplanRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateReleaseplanRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

}
