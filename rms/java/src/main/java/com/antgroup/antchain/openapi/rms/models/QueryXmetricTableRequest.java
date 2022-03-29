// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryXmetricTableRequest extends TeaModel {
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
    public XMetricQuery data;

    public static QueryXmetricTableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXmetricTableRequest self = new QueryXmetricTableRequest();
        return TeaModel.build(map, self);
    }

    public QueryXmetricTableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryXmetricTableRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryXmetricTableRequest setData(XMetricQuery data) {
        this.data = data;
        return this;
    }
    public XMetricQuery getData() {
        return this.data;
    }

}
