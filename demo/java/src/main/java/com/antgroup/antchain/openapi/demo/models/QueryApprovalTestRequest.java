// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryApprovalTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 字符串
    @NameInMap("input")
    @Validation(required = true)
    public String input;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // age
    @NameInMap("age")
    @Validation(required = true)
    public String age;

    public static QueryApprovalTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApprovalTestRequest self = new QueryApprovalTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryApprovalTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApprovalTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApprovalTestRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public QueryApprovalTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryApprovalTestRequest setAge(String age) {
        this.age = age;
        return this;
    }
    public String getAge() {
        return this.age;
    }

}
