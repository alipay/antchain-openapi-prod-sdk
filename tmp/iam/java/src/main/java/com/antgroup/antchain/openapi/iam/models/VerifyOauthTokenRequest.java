// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class VerifyOauthTokenRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // token值
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 是否刷新access_token有限期
    @NameInMap("extend")
    public Boolean extend;

    // token应用场景，LOGIN或AUTH
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static VerifyOauthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyOauthTokenRequest self = new VerifyOauthTokenRequest();
        return TeaModel.build(map, self);
    }

    public VerifyOauthTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyOauthTokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public VerifyOauthTokenRequest setExtend(Boolean extend) {
        this.extend = extend;
        return this;
    }
    public Boolean getExtend() {
        return this.extend;
    }

    public VerifyOauthTokenRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
