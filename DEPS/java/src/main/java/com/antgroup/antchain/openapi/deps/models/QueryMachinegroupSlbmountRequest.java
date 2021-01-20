// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMachinegroupSlbmountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 分组 id
    @NameInMap("id")
    public String id;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryMachinegroupSlbmountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMachinegroupSlbmountRequest self = new QueryMachinegroupSlbmountRequest();
        return TeaModel.build(map, self);
    }

    public QueryMachinegroupSlbmountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMachinegroupSlbmountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryMachinegroupSlbmountRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
