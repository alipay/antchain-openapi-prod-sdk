// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class QueryTaskTriggerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 触发 id
    @NameInMap("inst_id")
    @Validation(required = true)
    public String instId;

    public static QueryTaskTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskTriggerRequest self = new QueryTaskTriggerRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskTriggerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTaskTriggerRequest setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

}
