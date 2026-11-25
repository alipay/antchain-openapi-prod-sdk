// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaLtworeviewsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询的 Agent DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 可选场景标识
    @NameInMap("scene_id")
    public String sceneId;

    // 可选审核状态：WAITING_REVIEW 或 COMPLETED
    @NameInMap("status")
    public String status;

    // 返回数量，范围 1 至 100，默认 20
    @NameInMap("limit")
    public Long limit;

    // 时间范围：ALL 为所有已保存数据，7D 为包含今天的近 7 个上海自然日，按 Session 最近观测时间筛选；默认 ALL
    @NameInMap("period")
    public String period;

    // 分页偏移量，默认 0，范围 0 至 50000；结合 limit 使用，统计总量不受分页影响
    @NameInMap("offset")
    public Long offset;

    // 可选 Session 标识；传入时查询该 Session 已保留的 Turn 判定及审核记录；不传时查询异常与待审核记录。Trace 视图不代表审核单
    @NameInMap("session_id")
    public String sessionId;

    public static QueryAntchainDasKyaLtworeviewsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaLtworeviewsRequest self = new QueryAntchainDasKyaLtworeviewsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaLtworeviewsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaLtworeviewsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaLtworeviewsRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryAntchainDasKyaLtworeviewsRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public QueryAntchainDasKyaLtworeviewsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntchainDasKyaLtworeviewsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public QueryAntchainDasKyaLtworeviewsRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryAntchainDasKyaLtworeviewsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryAntchainDasKyaLtworeviewsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
