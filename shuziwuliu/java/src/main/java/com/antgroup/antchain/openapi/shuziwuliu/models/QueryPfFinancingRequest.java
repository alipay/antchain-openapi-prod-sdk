// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfFinancingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支用Id
    @NameInMap("financing_id")
    @Validation(required = true)
    public String financingId;

    public static QueryPfFinancingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPfFinancingRequest self = new QueryPfFinancingRequest();
        return TeaModel.build(map, self);
    }

    public QueryPfFinancingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPfFinancingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPfFinancingRequest setFinancingId(String financingId) {
        this.financingId = financingId;
        return this;
    }
    public String getFinancingId() {
        return this.financingId;
    }

}
