// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.models;

import com.aliyun.tea.*;

public class QueryDemoApdevcenterTestobjectTestsubaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 521)
    public String name;

    // test
    @NameInMap("test")
    @Validation(required = true)
    public String test;

    public static QueryDemoApdevcenterTestobjectTestsubaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoApdevcenterTestobjectTestsubaRequest self = new QueryDemoApdevcenterTestobjectTestsubaRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoApdevcenterTestobjectTestsubaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoApdevcenterTestobjectTestsubaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoApdevcenterTestobjectTestsubaRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryDemoApdevcenterTestobjectTestsubaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDemoApdevcenterTestobjectTestsubaRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
