// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryAgentCompletionRequest extends TeaModel {
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
    public Long aliveTime;

    // agent_id
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    public static QueryAgentCompletionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentCompletionRequest self = new QueryAgentCompletionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgentCompletionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAgentCompletionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAgentCompletionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAgentCompletionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryAgentCompletionRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryAgentCompletionRequest setAliveTime(Long aliveTime) {
        this.aliveTime = aliveTime;
        return this;
    }
    public Long getAliveTime() {
        return this.aliveTime;
    }

    public QueryAgentCompletionRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

}
