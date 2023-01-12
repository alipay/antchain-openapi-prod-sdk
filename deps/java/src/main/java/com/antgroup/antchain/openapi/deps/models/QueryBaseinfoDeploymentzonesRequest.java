// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBaseinfoDeploymentzonesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryBaseinfoDeploymentzonesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaseinfoDeploymentzonesRequest self = new QueryBaseinfoDeploymentzonesRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaseinfoDeploymentzonesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaseinfoDeploymentzonesRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBaseinfoDeploymentzonesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
