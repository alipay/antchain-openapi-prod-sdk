// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaLtwooverviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询 L2 总览的 Agent DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 时间范围：ALL 为所有已保存数据，7D 为包含今天的近 7 个上海自然日，按 Session 最近观测时间筛选；默认 ALL
    @NameInMap("period")
    public String period;

    public static QueryAntchainDasKyaLtwooverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaLtwooverviewRequest self = new QueryAntchainDasKyaLtwooverviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaLtwooverviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaLtwooverviewRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaLtwooverviewRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryAntchainDasKyaLtwooverviewRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

}
