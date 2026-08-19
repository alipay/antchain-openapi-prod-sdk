// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaEvaluationdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // agentdid
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 评测id
    @NameInMap("evaluation_id")
    @Validation(required = true)
    public String evaluationId;

    public static QueryAntchainDasKyaEvaluationdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaEvaluationdetailRequest self = new QueryAntchainDasKyaEvaluationdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaEvaluationdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaEvaluationdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaEvaluationdetailRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryAntchainDasKyaEvaluationdetailRequest setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

}
