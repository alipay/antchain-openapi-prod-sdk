// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryXdatasourceTreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    public String workspaceName;

    //  
    @NameInMap("data")
    public XDatasourceQuery data;

    public static QueryXdatasourceTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXdatasourceTreeRequest self = new QueryXdatasourceTreeRequest();
        return TeaModel.build(map, self);
    }

    public QueryXdatasourceTreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryXdatasourceTreeRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryXdatasourceTreeRequest setData(XDatasourceQuery data) {
        this.data = data;
        return this;
    }
    public XDatasourceQuery getData() {
        return this.data;
    }

}
