// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class QueryTaskInstRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 触发的实例 id
    @NameInMap("inst_id")
    @Validation(required = true)
    public String instId;

    public static QueryTaskInstRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInstRequest self = new QueryTaskInstRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskInstRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTaskInstRequest setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

}
