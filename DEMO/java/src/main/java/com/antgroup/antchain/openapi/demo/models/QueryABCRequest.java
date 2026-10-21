// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryABCRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测试字段
    @NameInMap("test")
    @Validation(required = true)
    public DemoClass test;

    // trse
    @NameInMap("idcard")
    @Validation(required = true)
    public AnotherClass idcard;

    // 1
    @NameInMap("person")
    @Validation(required = true)
    public PersonInfo person;

    public static QueryABCRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryABCRequest self = new QueryABCRequest();
        return TeaModel.build(map, self);
    }

    public QueryABCRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryABCRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryABCRequest setTest(DemoClass test) {
        this.test = test;
        return this;
    }
    public DemoClass getTest() {
        return this.test;
    }

    public QueryABCRequest setIdcard(AnotherClass idcard) {
        this.idcard = idcard;
        return this;
    }
    public AnotherClass getIdcard() {
        return this.idcard;
    }

    public QueryABCRequest setPerson(PersonInfo person) {
        this.person = person;
        return this;
    }
    public PersonInfo getPerson() {
        return this.person;
    }

}
