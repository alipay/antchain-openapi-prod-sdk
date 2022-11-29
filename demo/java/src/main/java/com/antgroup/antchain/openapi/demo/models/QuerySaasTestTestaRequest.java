// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QuerySaasTestTestaRequest extends TeaModel {
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

    public static QuerySaasTestTestaRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySaasTestTestaRequest self = new QuerySaasTestTestaRequest();
        return TeaModel.build(map, self);
    }

    public QuerySaasTestTestaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySaasTestTestaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySaasTestTestaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QuerySaasTestTestaRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
