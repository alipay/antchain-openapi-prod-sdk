// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LoadContainerserviceDockerfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用包地址，可以为相对目录，或者远程可访问存储地址.
    // 用于组装Dockerfile模板中对应的应用包获取地址
    @NameInMap("package_url")
    @Validation(required = true)
    public String packageUrl;

    // 环境名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 容器服务所在namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    public static LoadContainerserviceDockerfileRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadContainerserviceDockerfileRequest self = new LoadContainerserviceDockerfileRequest();
        return TeaModel.build(map, self);
    }

    public LoadContainerserviceDockerfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LoadContainerserviceDockerfileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LoadContainerserviceDockerfileRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public LoadContainerserviceDockerfileRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public LoadContainerserviceDockerfileRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
