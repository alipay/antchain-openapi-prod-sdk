// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckCloudconfigBgdeploymentcellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // require_release
    @NameInMap("require_release")
    public Boolean requireRelease;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CheckCloudconfigBgdeploymentcellRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudconfigBgdeploymentcellRequest self = new CheckCloudconfigBgdeploymentcellRequest();
        return TeaModel.build(map, self);
    }

    public CheckCloudconfigBgdeploymentcellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckCloudconfigBgdeploymentcellRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CheckCloudconfigBgdeploymentcellRequest setRequireRelease(Boolean requireRelease) {
        this.requireRelease = requireRelease;
        return this;
    }
    public Boolean getRequireRelease() {
        return this.requireRelease;
    }

    public CheckCloudconfigBgdeploymentcellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
