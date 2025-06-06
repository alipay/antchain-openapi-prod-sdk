// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ApplyTrustloginTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 系统来源
    @NameInMap("source_system")
    @Validation(required = true)
    public String sourceSystem;

    // 登录账号
    @NameInMap("login_name")
    public String loginName;

    public static ApplyTrustloginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTrustloginTokenRequest self = new ApplyTrustloginTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTrustloginTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyTrustloginTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ApplyTrustloginTokenRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public ApplyTrustloginTokenRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
