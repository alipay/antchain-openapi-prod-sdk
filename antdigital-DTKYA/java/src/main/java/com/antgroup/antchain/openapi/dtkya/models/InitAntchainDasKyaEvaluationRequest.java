// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class InitAntchainDasKyaEvaluationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 评测id
    @NameInMap("evaluation_id")
    @Validation(required = true)
    public String evaluationId;

    // 参与考试的agent did
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    public static InitAntchainDasKyaEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainDasKyaEvaluationRequest self = new InitAntchainDasKyaEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public InitAntchainDasKyaEvaluationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAntchainDasKyaEvaluationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAntchainDasKyaEvaluationRequest setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public InitAntchainDasKyaEvaluationRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public InitAntchainDasKyaEvaluationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
