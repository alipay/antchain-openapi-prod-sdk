// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaEvaluationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 评测id
    @NameInMap("evaluation_id")
    @Validation(required = true)
    public String evaluationId;

    // 被评测agent did
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 评测结果
    @NameInMap("evaluation_result")
    @Validation(required = true)
    public String evaluationResult;

    // 评测结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    public static PushAntchainDasKyaEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaEvaluationRequest self = new PushAntchainDasKyaEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaEvaluationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAntchainDasKyaEvaluationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAntchainDasKyaEvaluationRequest setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public PushAntchainDasKyaEvaluationRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public PushAntchainDasKyaEvaluationRequest setEvaluationResult(String evaluationResult) {
        this.evaluationResult = evaluationResult;
        return this;
    }
    public String getEvaluationResult() {
        return this.evaluationResult;
    }

    public PushAntchainDasKyaEvaluationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
