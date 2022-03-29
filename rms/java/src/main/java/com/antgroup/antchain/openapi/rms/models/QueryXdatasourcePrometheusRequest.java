// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryXdatasourcePrometheusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    public String workspaceName;

    //  
    @NameInMap("data")
    @Validation(required = true)
    public XPrometheusQuery data;

    public static QueryXdatasourcePrometheusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXdatasourcePrometheusRequest self = new QueryXdatasourcePrometheusRequest();
        return TeaModel.build(map, self);
    }

    public QueryXdatasourcePrometheusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryXdatasourcePrometheusRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryXdatasourcePrometheusRequest setData(XPrometheusQuery data) {
        this.data = data;
        return this;
    }
    public XPrometheusQuery getData() {
        return this.data;
    }

}
