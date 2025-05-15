// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryAgentSseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 会话id
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 查询词条
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 会话存活时长，单位毫秒，默认5分钟，最大不超过10分钟
    @NameInMap("alive_time")
    @Validation(required = true)
    public Long aliveTime;

    public static QueryAgentSseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentSseRequest self = new QueryAgentSseRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgentSseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAgentSseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAgentSseRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAgentSseRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryAgentSseRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryAgentSseRequest setAliveTime(Long aliveTime) {
        this.aliveTime = aliveTime;
        return this;
    }
    public Long getAliveTime() {
        return this.aliveTime;
    }

}
