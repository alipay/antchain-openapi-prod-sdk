// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckCloudconfigAppserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CheckCloudconfigAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudconfigAppserviceRequest self = new CheckCloudconfigAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public CheckCloudconfigAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckCloudconfigAppserviceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CheckCloudconfigAppserviceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
