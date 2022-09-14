// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDataResultBatchqueryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传待查询数据集文件后得到的查询id，在此接口进行结果查询
    @NameInMap("query_id")
    @Validation(required = true)
    public String queryId;

    public static QueryDataResultBatchqueryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataResultBatchqueryRequest self = new QueryDataResultBatchqueryRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataResultBatchqueryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataResultBatchqueryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDataResultBatchqueryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
