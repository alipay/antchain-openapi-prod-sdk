// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestproductTestobjectTestsubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键
    @NameInMap("id")
    public Long id;

    // 名字
    @NameInMap("name")
    public String name;

    // 性别
    @NameInMap("sex")
    @Validation(required = true)
    public String sex;

    // 年龄
    @NameInMap("age")
    public Long age;

    public static QueryTestproductTestobjectTestsubRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestproductTestobjectTestsubRequest self = new QueryTestproductTestobjectTestsubRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestproductTestobjectTestsubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestproductTestobjectTestsubRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestproductTestobjectTestsubRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryTestproductTestobjectTestsubRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTestproductTestobjectTestsubRequest setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public QueryTestproductTestobjectTestsubRequest setAge(Long age) {
        this.age = age;
        return this;
    }
    public Long getAge() {
        return this.age;
    }

}
