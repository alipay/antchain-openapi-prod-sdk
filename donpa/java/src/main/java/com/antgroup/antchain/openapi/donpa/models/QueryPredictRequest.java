// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class QueryPredictRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待预测请求体列表
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<PredictRequest> data;

    public static QueryPredictRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictRequest self = new QueryPredictRequest();
        return TeaModel.build(map, self);
    }

    public QueryPredictRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPredictRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPredictRequest setData(java.util.List<PredictRequest> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PredictRequest> getData() {
        return this.data;
    }

}
