// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteDeploymentCellRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 部署单元名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属工作空间名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static DeleteDeploymentCellRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentCellRequest self = new DeleteDeploymentCellRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDeploymentCellRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public DeleteDeploymentCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteDeploymentCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
