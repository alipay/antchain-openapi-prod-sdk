// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetConfigOverviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static GetConfigOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigOverviewRequest self = new GetConfigOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigOverviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetConfigOverviewRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
