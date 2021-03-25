// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateOauthTokenRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 过期时间
    @NameInMap("access_expired_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String accessExpiredTime;

    // access token
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 用户 ID
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 过期时间
    @NameInMap("refresh_expired_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String refreshExpiredTime;

    // refresh token
    @NameInMap("refresh_token")
    @Validation(required = true)
    public String refreshToken;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static UpdateOauthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOauthTokenRequest self = new UpdateOauthTokenRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOauthTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateOauthTokenRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateOauthTokenRequest setAccessExpiredTime(String accessExpiredTime) {
        this.accessExpiredTime = accessExpiredTime;
        return this;
    }
    public String getAccessExpiredTime() {
        return this.accessExpiredTime;
    }

    public UpdateOauthTokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateOauthTokenRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public UpdateOauthTokenRequest setRefreshExpiredTime(String refreshExpiredTime) {
        this.refreshExpiredTime = refreshExpiredTime;
        return this;
    }
    public String getRefreshExpiredTime() {
        return this.refreshExpiredTime;
    }

    public UpdateOauthTokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public UpdateOauthTokenRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
