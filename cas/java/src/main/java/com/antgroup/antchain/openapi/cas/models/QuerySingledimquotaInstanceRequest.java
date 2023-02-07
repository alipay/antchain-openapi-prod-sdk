// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QuerySingledimquotaInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // single_dim_groups
    @NameInMap("single_dim_groups")
    @Validation(required = true)
    public java.util.List<SingleDimGroup> singleDimGroups;

    public static QuerySingledimquotaInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySingledimquotaInstanceRequest self = new QuerySingledimquotaInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySingledimquotaInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySingledimquotaInstanceRequest setSingleDimGroups(java.util.List<SingleDimGroup> singleDimGroups) {
        this.singleDimGroups = singleDimGroups;
        return this;
    }
    public java.util.List<SingleDimGroup> getSingleDimGroups() {
        return this.singleDimGroups;
    }

}
