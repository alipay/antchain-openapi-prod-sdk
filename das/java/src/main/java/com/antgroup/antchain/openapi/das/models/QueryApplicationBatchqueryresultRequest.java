// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationBatchqueryresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传待查询数据集文件后得到的查询id，在此接口进行结果查询
    // 
    @NameInMap("query_id")
    @Validation(required = true)
    public String queryId;

    public static QueryApplicationBatchqueryresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationBatchqueryresultRequest self = new QueryApplicationBatchqueryresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationBatchqueryresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationBatchqueryresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApplicationBatchqueryresultRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
