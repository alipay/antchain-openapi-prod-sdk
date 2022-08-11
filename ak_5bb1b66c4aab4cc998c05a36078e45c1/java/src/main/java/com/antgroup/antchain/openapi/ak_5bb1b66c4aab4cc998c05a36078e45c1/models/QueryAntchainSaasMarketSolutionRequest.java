// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class QueryAntchainSaasMarketSolutionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 解决方案code
    @NameInMap("solution_code")
    @Validation(required = true)
    public String solutionCode;

    // 查询结果
    @NameInMap("result_data")
    public java.util.List<KeyValuePair> resultData;

    public static QueryAntchainSaasMarketSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSaasMarketSolutionRequest self = new QueryAntchainSaasMarketSolutionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSaasMarketSolutionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainSaasMarketSolutionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainSaasMarketSolutionRequest setSolutionCode(String solutionCode) {
        this.solutionCode = solutionCode;
        return this;
    }
    public String getSolutionCode() {
        return this.solutionCode;
    }

    public QueryAntchainSaasMarketSolutionRequest setResultData(java.util.List<KeyValuePair> resultData) {
        this.resultData = resultData;
        return this;
    }
    public java.util.List<KeyValuePair> getResultData() {
        return this.resultData;
    }

}
