// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7257696016e54ac8a1e0ed2d532c3c09.models;

import com.aliyun.tea.*;

public class AuthorizeRecordsPairs extends TeaModel {
    // 授权业务
    @NameInMap("auth_business_code")
    @Validation(required = true)
    public String authBusinessCode;

    // 授权密钥
    @NameInMap("auth_business_secret")
    @Validation(required = true)
    public String authBusinessSecret;

    public static AuthorizeRecordsPairs build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRecordsPairs self = new AuthorizeRecordsPairs();
        return TeaModel.build(map, self);
    }

    public AuthorizeRecordsPairs setAuthBusinessCode(String authBusinessCode) {
        this.authBusinessCode = authBusinessCode;
        return this;
    }
    public String getAuthBusinessCode() {
        return this.authBusinessCode;
    }

    public AuthorizeRecordsPairs setAuthBusinessSecret(String authBusinessSecret) {
        this.authBusinessSecret = authBusinessSecret;
        return this;
    }
    public String getAuthBusinessSecret() {
        return this.authBusinessSecret;
    }

}
