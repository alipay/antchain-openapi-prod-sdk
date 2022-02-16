// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryMarketSolutionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 解决方案code
    @NameInMap("solution_code")
    @Validation(required = true)
    public String solutionCode;

    public static QueryMarketSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMarketSolutionRequest self = new QueryMarketSolutionRequest();
        return TeaModel.build(map, self);
    }

    public QueryMarketSolutionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMarketSolutionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMarketSolutionRequest setSolutionCode(String solutionCode) {
        this.solutionCode = solutionCode;
        return this;
    }
    public String getSolutionCode() {
        return this.solutionCode;
    }

}
