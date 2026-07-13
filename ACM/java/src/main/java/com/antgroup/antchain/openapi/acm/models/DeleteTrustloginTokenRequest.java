// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class DeleteTrustloginTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 系统来源
    @NameInMap("source_system")
    @Validation(required = true)
    public String sourceSystem;

    // 免登凭证
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    public static DeleteTrustloginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrustloginTokenRequest self = new DeleteTrustloginTokenRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrustloginTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteTrustloginTokenRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public DeleteTrustloginTokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
