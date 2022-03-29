// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryXmetadataTagRequest extends TeaModel {
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
    public XTarget data;

    public static QueryXmetadataTagRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXmetadataTagRequest self = new QueryXmetadataTagRequest();
        return TeaModel.build(map, self);
    }

    public QueryXmetadataTagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryXmetadataTagRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryXmetadataTagRequest setData(XTarget data) {
        this.data = data;
        return this;
    }
    public XTarget getData() {
        return this.data;
    }

}
