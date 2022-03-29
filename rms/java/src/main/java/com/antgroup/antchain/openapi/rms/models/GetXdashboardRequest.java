// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetXdashboardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    public String workspaceName;

    //  
    @NameInMap("data")
    @Validation(required = true)
    public XResource data;

    public static GetXdashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetXdashboardRequest self = new GetXdashboardRequest();
        return TeaModel.build(map, self);
    }

    public GetXdashboardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetXdashboardRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetXdashboardRequest setData(XResource data) {
        this.data = data;
        return this;
    }
    public XResource getData() {
        return this.data;
    }

}
