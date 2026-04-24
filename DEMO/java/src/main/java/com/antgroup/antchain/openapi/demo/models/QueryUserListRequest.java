// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryUserListRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // xx
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 1
    @NameInMap("role")
    public QueryMap role;

    // 卡片
    @NameInMap("test_class")
    public Card testClass;

    public static QueryUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserListRequest self = new QueryUserListRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserListRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserListRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUserListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryUserListRequest setRole(QueryMap role) {
        this.role = role;
        return this;
    }
    public QueryMap getRole() {
        return this.role;
    }

    public QueryUserListRequest setTestClass(Card testClass) {
        this.testClass = testClass;
        return this;
    }
    public Card getTestClass() {
        return this.testClass;
    }

}
