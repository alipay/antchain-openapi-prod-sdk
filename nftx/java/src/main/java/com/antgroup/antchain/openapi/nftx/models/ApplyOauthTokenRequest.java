// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class ApplyOauthTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
    // 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
    // 本期只支持authorization_code
    @NameInMap("grant_type")
    @Validation(required = true)
    public String grantType;

    // 授权码，用户对应用授权后得到。
    // 本参数在 grant_type 为 authorization_code 时必填；为 refresh_token 时不填。
    @NameInMap("auth_code")
    public String authCode;

    // 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填
    @NameInMap("refresh_token")
    public String refreshToken;

    public static ApplyOauthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyOauthTokenRequest self = new ApplyOauthTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyOauthTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyOauthTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyOauthTokenRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public ApplyOauthTokenRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public ApplyOauthTokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
