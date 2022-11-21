// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_10abee70bc4f4d4d90334ebfb4895c12.models;

import com.aliyun.tea.*;

public class QueryDemoTestTestobjectBbbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测试入参
    @NameInMap("request_param1")
    @Validation(required = true)
    public String requestParam1;

    // 测试入参2
    @NameInMap("request_param2")
    @Validation(required = true)
    public String requestParam2;

    public static QueryDemoTestTestobjectBbbRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestTestobjectBbbRequest self = new QueryDemoTestTestobjectBbbRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestTestobjectBbbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoTestTestobjectBbbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoTestTestobjectBbbRequest setRequestParam1(String requestParam1) {
        this.requestParam1 = requestParam1;
        return this;
    }
    public String getRequestParam1() {
        return this.requestParam1;
    }

    public QueryDemoTestTestobjectBbbRequest setRequestParam2(String requestParam2) {
        this.requestParam2 = requestParam2;
        return this;
    }
    public String getRequestParam2() {
        return this.requestParam2;
    }

}
