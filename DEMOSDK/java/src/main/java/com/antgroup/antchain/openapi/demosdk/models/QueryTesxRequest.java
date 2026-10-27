// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class QueryTesxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 12
    @NameInMap("test")
    public DemoClass test;

    // 12
    @NameInMap("test_new")
    public TestDemo testNew;

    public static QueryTesxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTesxRequest self = new QueryTesxRequest();
        return TeaModel.build(map, self);
    }

    public QueryTesxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTesxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTesxRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTesxRequest setTest(DemoClass test) {
        this.test = test;
        return this;
    }
    public DemoClass getTest() {
        return this.test;
    }

    public QueryTesxRequest setTestNew(TestDemo testNew) {
        this.testNew = testNew;
        return this;
    }
    public TestDemo getTestNew() {
        return this.testNew;
    }

}
