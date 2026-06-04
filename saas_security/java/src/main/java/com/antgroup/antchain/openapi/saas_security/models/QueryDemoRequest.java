// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class QueryDemoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测试数据
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static QueryDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoRequest self = new QueryDemoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
