// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestproductTestobjectTestsubaaaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // test
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryTestproductTestobjectTestsubaaaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestproductTestobjectTestsubaaaRequest self = new QueryTestproductTestobjectTestsubaaaRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestproductTestobjectTestsubaaaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestproductTestobjectTestsubaaaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestproductTestobjectTestsubaaaRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryTestproductTestobjectTestsubaaaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
