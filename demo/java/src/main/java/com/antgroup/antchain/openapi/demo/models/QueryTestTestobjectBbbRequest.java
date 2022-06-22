// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestTestobjectBbbRequest extends TeaModel {
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

    public static QueryTestTestobjectBbbRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestTestobjectBbbRequest self = new QueryTestTestobjectBbbRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestTestobjectBbbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestTestobjectBbbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestTestobjectBbbRequest setRequestParam1(String requestParam1) {
        this.requestParam1 = requestParam1;
        return this;
    }
    public String getRequestParam1() {
        return this.requestParam1;
    }

    public QueryTestTestobjectBbbRequest setRequestParam2(String requestParam2) {
        this.requestParam2 = requestParam2;
        return this;
    }
    public String getRequestParam2() {
        return this.requestParam2;
    }

}
