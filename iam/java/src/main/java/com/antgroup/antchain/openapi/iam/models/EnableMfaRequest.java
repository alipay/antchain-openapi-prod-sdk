// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class EnableMfaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户 id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 验证码
    @NameInMap("verification_code")
    @Validation(required = true)
    public Long verificationCode;

    public static EnableMfaRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMfaRequest self = new EnableMfaRequest();
        return TeaModel.build(map, self);
    }

    public EnableMfaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableMfaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public EnableMfaRequest setVerificationCode(Long verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }
    public Long getVerificationCode() {
        return this.verificationCode;
    }

}
