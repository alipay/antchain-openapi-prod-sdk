// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryXdashboardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    //   
    @NameInMap("data")
    @Validation(required = true)
    public XDashboardQuery data;

    public static QueryXdashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXdashboardRequest self = new QueryXdashboardRequest();
        return TeaModel.build(map, self);
    }

    public QueryXdashboardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryXdashboardRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryXdashboardRequest setData(XDashboardQuery data) {
        this.data = data;
        return this;
    }
    public XDashboardQuery getData() {
        return this.data;
    }

}
