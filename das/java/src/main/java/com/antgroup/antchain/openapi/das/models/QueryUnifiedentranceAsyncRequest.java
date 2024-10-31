// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryUnifiedentranceAsyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 整个需求的入参，map json
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 数据集服务id
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    public static QueryUnifiedentranceAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedentranceAsyncRequest self = new QueryUnifiedentranceAsyncRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedentranceAsyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedentranceAsyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUnifiedentranceAsyncRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public QueryUnifiedentranceAsyncRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

}
