// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GetRbbLoginTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户名
    @NameInMap("username")
    @Validation(required = true)
    public String username;

    // 密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    // 扩展json字符串
    @NameInMap("extension")
    public String extension;

    public static GetRbbLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRbbLoginTokenRequest self = new GetRbbLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetRbbLoginTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRbbLoginTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetRbbLoginTokenRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public GetRbbLoginTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetRbbLoginTokenRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
