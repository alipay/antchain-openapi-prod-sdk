// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateMetaDeploymentcellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // deployment_cell
    @NameInMap("deployment_cell")
    @Validation(required = true)
    public String deploymentCell;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static UpdateMetaDeploymentcellRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaDeploymentcellRequest self = new UpdateMetaDeploymentcellRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaDeploymentcellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMetaDeploymentcellRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateMetaDeploymentcellRequest setDeploymentCell(String deploymentCell) {
        this.deploymentCell = deploymentCell;
        return this;
    }
    public String getDeploymentCell() {
        return this.deploymentCell;
    }

    public UpdateMetaDeploymentcellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
