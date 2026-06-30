// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubheTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测试id字段
    @NameInMap("testid")
    @Validation(required = true)
    public String testid;

    public static QueryDubheTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubheTestRequest self = new QueryDubheTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubheTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubheTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubheTestRequest setTestid(String testid) {
        this.testid = testid;
        return this;
    }
    public String getTestid() {
        return this.testid;
    }

}
