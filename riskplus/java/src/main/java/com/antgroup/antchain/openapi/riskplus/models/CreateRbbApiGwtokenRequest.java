// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreateRbbApiGwtokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展字段
    @NameInMap("extension")
    public String extension;

    // 新人用户密码，用来做映射生成token
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    // 用户
    @NameInMap("username")
    @Validation(required = true)
    public String username;

    public static CreateRbbApiGwtokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRbbApiGwtokenRequest self = new CreateRbbApiGwtokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateRbbApiGwtokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRbbApiGwtokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRbbApiGwtokenRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public CreateRbbApiGwtokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateRbbApiGwtokenRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
