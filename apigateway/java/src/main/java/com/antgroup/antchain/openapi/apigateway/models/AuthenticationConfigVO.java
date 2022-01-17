// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AuthenticationConfigVO extends TeaModel {
    // access_key
    @NameInMap("access_key")
    public String accessKey;

    // secret_key
    @NameInMap("secret_key")
    public String secretKey;

    public static AuthenticationConfigVO build(java.util.Map<String, ?> map) throws Exception {
        AuthenticationConfigVO self = new AuthenticationConfigVO();
        return TeaModel.build(map, self);
    }

    public AuthenticationConfigVO setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public AuthenticationConfigVO setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

}
