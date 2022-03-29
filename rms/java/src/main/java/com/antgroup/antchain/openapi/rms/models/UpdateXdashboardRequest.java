// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateXdashboardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // external workspace name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // update
    @NameInMap("data")
    @Validation(required = true)
    public XDashboardCRULResponseCURequest data;

    public static UpdateXdashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateXdashboardRequest self = new UpdateXdashboardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateXdashboardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateXdashboardRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateXdashboardRequest setData(XDashboardCRULResponseCURequest data) {
        this.data = data;
        return this;
    }
    public XDashboardCRULResponseCURequest getData() {
        return this.data;
    }

}
