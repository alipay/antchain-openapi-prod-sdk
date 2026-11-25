// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaLtwosessionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询的 Agent DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 可选的场景稳定标识；为空查询全部场景
    @NameInMap("scene_id")
    public String sceneId;

    // 返回数量，范围 1 至 100，默认 20
    @NameInMap("limit")
    public Long limit;

    // 时间范围：ALL 为所有已保存数据，7D 为包含今天的近 7 个上海自然日，按 Session 最近观测时间筛选；默认 ALL
    @NameInMap("period")
    public String period;

    // 分页偏移量，默认 0，范围 0 至 50000；结合 limit 使用，统计总量不受分页影响
    @NameInMap("offset")
    public Long offset;

    public static QueryAntchainDasKyaLtwosessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaLtwosessionsRequest self = new QueryAntchainDasKyaLtwosessionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaLtwosessionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaLtwosessionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaLtwosessionsRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryAntchainDasKyaLtwosessionsRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public QueryAntchainDasKyaLtwosessionsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public QueryAntchainDasKyaLtwosessionsRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryAntchainDasKyaLtwosessionsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

}
