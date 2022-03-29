// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateXdashboardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // request data
    @NameInMap("data")
    @Validation(required = true)
    public XDashboardCRULResponseCURequest data;

    public static CreateXdashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateXdashboardRequest self = new CreateXdashboardRequest();
        return TeaModel.build(map, self);
    }

    public CreateXdashboardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateXdashboardRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateXdashboardRequest setData(XDashboardCRULResponseCURequest data) {
        this.data = data;
        return this;
    }
    public XDashboardCRULResponseCURequest getData() {
        return this.data;
    }

}
