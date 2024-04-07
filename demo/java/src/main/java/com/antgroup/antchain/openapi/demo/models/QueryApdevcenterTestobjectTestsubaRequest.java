// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryApdevcenterTestobjectTestsubaRequest extends TeaModel {
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

    public static QueryApdevcenterTestobjectTestsubaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApdevcenterTestobjectTestsubaRequest self = new QueryApdevcenterTestobjectTestsubaRequest();
        return TeaModel.build(map, self);
    }

    public QueryApdevcenterTestobjectTestsubaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApdevcenterTestobjectTestsubaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApdevcenterTestobjectTestsubaRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryApdevcenterTestobjectTestsubaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryApdevcenterTestobjectTestsubaRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
