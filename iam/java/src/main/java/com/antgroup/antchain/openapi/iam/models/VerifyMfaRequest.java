// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class VerifyMfaRequest extends TeaModel {
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

    public static VerifyMfaRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyMfaRequest self = new VerifyMfaRequest();
        return TeaModel.build(map, self);
    }

    public VerifyMfaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyMfaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifyMfaRequest setVerificationCode(Long verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }
    public Long getVerificationCode() {
        return this.verificationCode;
    }

}
