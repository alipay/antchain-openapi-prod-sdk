// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CheckContainerserviceConflictopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 应用服务名称
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 是否检查Sidercar有运维工单，默认false
    @NameInMap("check_sidercar")
    public Boolean checkSidercar;

    public static CheckContainerserviceConflictopsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckContainerserviceConflictopsRequest self = new CheckContainerserviceConflictopsRequest();
        return TeaModel.build(map, self);
    }

    public CheckContainerserviceConflictopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckContainerserviceConflictopsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CheckContainerserviceConflictopsRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public CheckContainerserviceConflictopsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CheckContainerserviceConflictopsRequest setCheckSidercar(Boolean checkSidercar) {
        this.checkSidercar = checkSidercar;
        return this;
    }
    public Boolean getCheckSidercar() {
        return this.checkSidercar;
    }

}
