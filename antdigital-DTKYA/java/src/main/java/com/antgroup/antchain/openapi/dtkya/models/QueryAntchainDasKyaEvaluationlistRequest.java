// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaEvaluationlistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // agentDID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryAntchainDasKyaEvaluationlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaEvaluationlistRequest self = new QueryAntchainDasKyaEvaluationlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaEvaluationlistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDasKyaEvaluationlistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDasKyaEvaluationlistRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryAntchainDasKyaEvaluationlistRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAntchainDasKyaEvaluationlistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
