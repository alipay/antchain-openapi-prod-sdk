// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class VerifyTrustloginTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 系统来源
    // 
    @NameInMap("source_system")
    @Validation(required = true)
    public String sourceSystem;

    // 申请免密登录时获取的token
    // 
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    public static VerifyTrustloginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyTrustloginTokenRequest self = new VerifyTrustloginTokenRequest();
        return TeaModel.build(map, self);
    }

    public VerifyTrustloginTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyTrustloginTokenRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public VerifyTrustloginTokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
