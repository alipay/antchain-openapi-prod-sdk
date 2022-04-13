// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DescribeContainerserviceRevisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 容器服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static DescribeContainerserviceRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerserviceRevisionRequest self = new DescribeContainerserviceRevisionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerserviceRevisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeContainerserviceRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeContainerserviceRevisionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeContainerserviceRevisionRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
