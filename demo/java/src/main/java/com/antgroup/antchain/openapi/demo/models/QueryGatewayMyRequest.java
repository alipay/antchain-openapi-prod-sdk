// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryGatewayMyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 字符串类型入参
    @NameInMap("test_1")
    @Validation(required = true)
    public String test1;

    // 数字入参
    @NameInMap("test_2")
    @Validation(required = true)
    public Long test2;

    // 布尔值入参
    @NameInMap("test_3")
    @Validation(required = true)
    public Boolean test3;

    public static QueryGatewayMyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayMyRequest self = new QueryGatewayMyRequest();
        return TeaModel.build(map, self);
    }

    public QueryGatewayMyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGatewayMyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGatewayMyRequest setTest1(String test1) {
        this.test1 = test1;
        return this;
    }
    public String getTest1() {
        return this.test1;
    }

    public QueryGatewayMyRequest setTest2(Long test2) {
        this.test2 = test2;
        return this;
    }
    public Long getTest2() {
        return this.test2;
    }

    public QueryGatewayMyRequest setTest3(Boolean test3) {
        this.test3 = test3;
        return this;
    }
    public Boolean getTest3() {
        return this.test3;
    }

}
