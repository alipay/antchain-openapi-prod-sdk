// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class TokenData extends TeaModel {
    // 授权token
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 授权类型
    @NameInMap("token_type")
    @Validation(required = true)
    public String tokenType;

    // 过期时间
    @NameInMap("expiresln")
    @Validation(required = true)
    public Long expiresln;

    // 重新刷新Token
    @NameInMap("refresh_token")
    @Validation(required = true)
    public String refreshToken;

    // sessionid
    @NameInMap("session_id")
    public String sessionId;

    public static TokenData build(java.util.Map<String, ?> map) throws Exception {
        TokenData self = new TokenData();
        return TeaModel.build(map, self);
    }

    public TokenData setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public TokenData setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

    public TokenData setExpiresln(Long expiresln) {
        this.expiresln = expiresln;
        return this;
    }
    public Long getExpiresln() {
        return this.expiresln;
    }

    public TokenData setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public TokenData setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
