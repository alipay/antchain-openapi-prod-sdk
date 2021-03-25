// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMetaDeploymentcellRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // ids
    @NameInMap("ids")
    public java.util.List<String> ids;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryMetaDeploymentcellRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetaDeploymentcellRequest self = new QueryMetaDeploymentcellRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetaDeploymentcellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMetaDeploymentcellRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryMetaDeploymentcellRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryMetaDeploymentcellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
