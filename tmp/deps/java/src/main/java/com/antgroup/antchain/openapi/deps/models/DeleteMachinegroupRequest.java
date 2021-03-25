// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteMachinegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // recursive
    @NameInMap("recursive")
    @Validation(required = true)
    public Boolean recursive;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static DeleteMachinegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMachinegroupRequest self = new DeleteMachinegroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMachinegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteMachinegroupRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public DeleteMachinegroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteMachinegroupRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public DeleteMachinegroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
