// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryMasterstationMasterdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户工号
    @NameInMap("workno")
    @Validation(required = true)
    public String workno;

    public static QueryMasterstationMasterdataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMasterstationMasterdataRequest self = new QueryMasterstationMasterdataRequest();
        return TeaModel.build(map, self);
    }

    public QueryMasterstationMasterdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMasterstationMasterdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMasterstationMasterdataRequest setWorkno(String workno) {
        this.workno = workno;
        return this;
    }
    public String getWorkno() {
        return this.workno;
    }

}
