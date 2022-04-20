// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class QueryAnalysisQueryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分析任务ID
    @NameInMap("analysis_id")
    @Validation(required = true)
    public Long analysisId;

    public static QueryAnalysisQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisQueryRequest self = new QueryAnalysisQueryRequest();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisQueryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAnalysisQueryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAnalysisQueryRequest setAnalysisId(Long analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public Long getAnalysisId() {
        return this.analysisId;
    }

}
