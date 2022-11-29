// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryGongxiangTestDemoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 验证字符
    @NameInMap("character1")
    @Validation(required = true)
    public String character1;

    public static QueryGongxiangTestDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGongxiangTestDemoRequest self = new QueryGongxiangTestDemoRequest();
        return TeaModel.build(map, self);
    }

    public QueryGongxiangTestDemoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGongxiangTestDemoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGongxiangTestDemoRequest setCharacter1(String character1) {
        this.character1 = character1;
        return this;
    }
    public String getCharacter1() {
        return this.character1;
    }

}
