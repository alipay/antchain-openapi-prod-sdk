// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreateRbbTokenRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展字段
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 新人用户密码，用来做映射生成token
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    // 用户
    @NameInMap("username")
    @Validation(required = true)
    public String username;

    public static CreateRbbTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRbbTokenRequest self = new CreateRbbTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateRbbTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRbbTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRbbTokenRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateRbbTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateRbbTokenRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
