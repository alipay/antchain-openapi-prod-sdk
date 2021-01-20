// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppVersionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 版本构建id
    @NameInMap("build_id")
    public String buildId;

    public static QueryAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppVersionRequest self = new QueryAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppVersionRequest setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

}
