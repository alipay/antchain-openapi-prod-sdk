// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestTimeTestaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // a
    @NameInMap("a")
    public String a;

    // b
    @NameInMap("b")
    public TestClass b;

    public static QueryTestTimeTestaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestTimeTestaRequest self = new QueryTestTimeTestaRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestTimeTestaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestTimeTestaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestTimeTestaRequest setA(String a) {
        this.a = a;
        return this;
    }
    public String getA() {
        return this.a;
    }

    public QueryTestTimeTestaRequest setB(TestClass b) {
        this.b = b;
        return this;
    }
    public TestClass getB() {
        return this.b;
    }

}
