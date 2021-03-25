// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckCloudconfigOlduiRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CheckCloudconfigOlduiRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudconfigOlduiRequest self = new CheckCloudconfigOlduiRequest();
        return TeaModel.build(map, self);
    }

    public CheckCloudconfigOlduiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckCloudconfigOlduiRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CheckCloudconfigOlduiRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
