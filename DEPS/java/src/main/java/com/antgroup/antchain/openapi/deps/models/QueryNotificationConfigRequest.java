// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryNotificationConfigRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryNotificationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNotificationConfigRequest self = new QueryNotificationConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryNotificationConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNotificationConfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
