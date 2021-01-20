// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackSupportcoderepoRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // techstackId
    @NameInMap("techstack_id")
    public Long techstackId;

    public static QueryBuildpackSupportcoderepoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackSupportcoderepoRequest self = new QueryBuildpackSupportcoderepoRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackSupportcoderepoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackSupportcoderepoRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

}
