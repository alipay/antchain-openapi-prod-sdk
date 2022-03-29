// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryXdashboardTreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    public String workspaceName;

    //  
    @NameInMap("data")
    @Validation(required = true)
    public XDashboardQuery data;

    public static QueryXdashboardTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXdashboardTreeRequest self = new QueryXdashboardTreeRequest();
        return TeaModel.build(map, self);
    }

    public QueryXdashboardTreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryXdashboardTreeRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryXdashboardTreeRequest setData(XDashboardQuery data) {
        this.data = data;
        return this;
    }
    public XDashboardQuery getData() {
        return this.data;
    }

}
