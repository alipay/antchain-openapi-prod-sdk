// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5422930d9e1e495b8a45d95c2aa52008.models;

import com.aliyun.tea.*;

public class QueryDemoSaasTestTestaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 张三
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 12
    @NameInMap("age")
    @Validation(required = true)
    public Long age;

    public static QueryDemoSaasTestTestaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoSaasTestTestaRequest self = new QueryDemoSaasTestTestaRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoSaasTestTestaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoSaasTestTestaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoSaasTestTestaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDemoSaasTestTestaRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
