// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateMetaDeploymentcellRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // deployment_cell
    @NameInMap("deployment_cell")
    public String deploymentCell;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static CreateMetaDeploymentcellRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaDeploymentcellRequest self = new CreateMetaDeploymentcellRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetaDeploymentcellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMetaDeploymentcellRequest setDeploymentCell(String deploymentCell) {
        this.deploymentCell = deploymentCell;
        return this;
    }
    public String getDeploymentCell() {
        return this.deploymentCell;
    }

    public CreateMetaDeploymentcellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
