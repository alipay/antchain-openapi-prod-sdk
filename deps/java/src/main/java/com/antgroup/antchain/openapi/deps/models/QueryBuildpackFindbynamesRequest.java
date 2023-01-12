// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbynamesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // techstackNames
    @NameInMap("techstack_names")
    public java.util.List<String> techstackNames;

    public static QueryBuildpackFindbynamesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbynamesRequest self = new QueryBuildpackFindbynamesRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbynamesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackFindbynamesRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBuildpackFindbynamesRequest setTechstackNames(java.util.List<String> techstackNames) {
        this.techstackNames = techstackNames;
        return this;
    }
    public java.util.List<String> getTechstackNames() {
        return this.techstackNames;
    }

}
