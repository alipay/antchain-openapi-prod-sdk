// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaLtworeviewdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审核事项所属 Agent DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 需要查询的审核事项唯一标识
    @NameInMap("review_id")
    @Validation(required = true)
    public String reviewId;

    public static QueryAntchainDasKyaLtworeviewdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaLtworeviewdetailRequest self = new QueryAntchainDasKyaLtworeviewdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaLtworeviewdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaLtworeviewdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaLtworeviewdetailRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryAntchainDasKyaLtworeviewdetailRequest setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public String getReviewId() {
        return this.reviewId;
    }

}
