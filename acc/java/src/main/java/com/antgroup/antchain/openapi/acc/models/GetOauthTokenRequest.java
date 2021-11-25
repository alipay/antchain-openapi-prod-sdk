// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class GetOauthTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权类型
    @NameInMap("grant_type")
    @Validation(required = true)
    public String grantType;

    // 授权码
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // client端申请oauth时的口令
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 过期时间
    @NameInMap("expires")
    public Long expires;

    public static GetOauthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOauthTokenRequest self = new GetOauthTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetOauthTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetOauthTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetOauthTokenRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public GetOauthTokenRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public GetOauthTokenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetOauthTokenRequest setExpires(Long expires) {
        this.expires = expires;
        return this;
    }
    public Long getExpires() {
        return this.expires;
    }

}
