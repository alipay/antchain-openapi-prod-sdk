// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class QueryDeepanalysisQueryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 深度分析任务ID
    @NameInMap("analysis_id")
    @Validation(required = true)
    public Long analysisId;

    public static QueryDeepanalysisQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeepanalysisQueryRequest self = new QueryDeepanalysisQueryRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeepanalysisQueryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeepanalysisQueryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeepanalysisQueryRequest setAnalysisId(Long analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public Long getAnalysisId() {
        return this.analysisId;
    }

}
