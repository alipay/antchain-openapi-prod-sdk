// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryFhtestFhRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 年龄
    @NameInMap("age")
    @Validation(required = true)
    public Long age;

    // 判断字段
    @NameInMap("judge")
    public Boolean judge;

    public static QueryFhtestFhRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFhtestFhRequest self = new QueryFhtestFhRequest();
        return TeaModel.build(map, self);
    }

    public QueryFhtestFhRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFhtestFhRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFhtestFhRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryFhtestFhRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

    public QueryFhtestFhRequest setJudge(Boolean judge) {
        this.judge = judge;
        return this;
    }
    public Boolean getJudge() {
        return this.judge;
    }

}
