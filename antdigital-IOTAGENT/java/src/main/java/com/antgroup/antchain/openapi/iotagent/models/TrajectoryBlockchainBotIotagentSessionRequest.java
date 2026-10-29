// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class TrajectoryBlockchainBotIotagentSessionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 会话ID
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 作用域类型 TURNS|CONTEXT_OPERATIONS，默认 TURNS
    @NameInMap("scope")
    public String scope;

    // 分页游标，首次为空
    @NameInMap("cursor")
    public String cursor;

    // 每页大小 1-50，默认 20
    @NameInMap("page_size")
    public Long pageSize;

    // 诊断标签过滤，逗号分隔
    @NameInMap("diagnostics")
    public String diagnostics;

    // 关键词搜索，最长100字
    @NameInMap("keyword")
    public String keyword;

    // 排序 NONE|DURATION|TOKENS
    @NameInMap("top_by")
    public String topBy;

    public static TrajectoryBlockchainBotIotagentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        TrajectoryBlockchainBotIotagentSessionRequest self = new TrajectoryBlockchainBotIotagentSessionRequest();
        return TeaModel.build(map, self);
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setDiagnostics(String diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }
    public String getDiagnostics() {
        return this.diagnostics;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public TrajectoryBlockchainBotIotagentSessionRequest setTopBy(String topBy) {
        this.topBy = topBy;
        return this;
    }
    public String getTopBy() {
        return this.topBy;
    }

}
