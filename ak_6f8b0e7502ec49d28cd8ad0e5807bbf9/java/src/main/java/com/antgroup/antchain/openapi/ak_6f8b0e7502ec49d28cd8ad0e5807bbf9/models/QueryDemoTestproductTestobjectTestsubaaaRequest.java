// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.models;

import com.aliyun.tea.*;

public class QueryDemoTestproductTestobjectTestsubaaaRequest extends TeaModel {
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

    public static QueryDemoTestproductTestobjectTestsubaaaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestproductTestobjectTestsubaaaRequest self = new QueryDemoTestproductTestobjectTestsubaaaRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestproductTestobjectTestsubaaaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoTestproductTestobjectTestsubaaaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoTestproductTestobjectTestsubaaaRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryDemoTestproductTestobjectTestsubaaaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
