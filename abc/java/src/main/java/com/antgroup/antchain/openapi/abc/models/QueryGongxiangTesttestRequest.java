// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class QueryGongxiangTesttestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 验证
    @NameInMap("character1")
    @Validation(required = true)
    public String character1;

    // 用于验证
    @NameInMap("character2")
    @Validation(required = true)
    public Long character2;

    public static QueryGongxiangTesttestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGongxiangTesttestRequest self = new QueryGongxiangTesttestRequest();
        return TeaModel.build(map, self);
    }

    public QueryGongxiangTesttestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGongxiangTesttestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGongxiangTesttestRequest setCharacter1(String character1) {
        this.character1 = character1;
        return this;
    }
    public String getCharacter1() {
        return this.character1;
    }

    public QueryGongxiangTesttestRequest setCharacter2(Long character2) {
        this.character2 = character2;
        return this;
    }
    public Long getCharacter2() {
        return this.character2;
    }

}
