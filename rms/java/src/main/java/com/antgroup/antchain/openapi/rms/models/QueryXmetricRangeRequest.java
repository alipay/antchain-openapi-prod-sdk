// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryXmetricRangeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    //  start end 必填
    @NameInMap("data")
    @Validation(required = true)
    public XMetricQuery data;

    public static QueryXmetricRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXmetricRangeRequest self = new QueryXmetricRangeRequest();
        return TeaModel.build(map, self);
    }

    public QueryXmetricRangeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryXmetricRangeRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryXmetricRangeRequest setData(XMetricQuery data) {
        this.data = data;
        return this;
    }
    public XMetricQuery getData() {
        return this.data;
    }

}
