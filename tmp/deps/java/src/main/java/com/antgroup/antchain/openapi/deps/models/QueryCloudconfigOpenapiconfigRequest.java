// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCloudconfigOpenapiconfigRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryCloudconfigOpenapiconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudconfigOpenapiconfigRequest self = new QueryCloudconfigOpenapiconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryCloudconfigOpenapiconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCloudconfigOpenapiconfigRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryCloudconfigOpenapiconfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
