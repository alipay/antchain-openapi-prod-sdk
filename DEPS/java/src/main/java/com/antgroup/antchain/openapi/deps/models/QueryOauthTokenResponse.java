// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryOauthTokenResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 过期时间
    @NameInMap("access_expired_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String accessExpiredTime;

    // access token
    @NameInMap("access_token")
    public String accessToken;

    // 用户 id
    @NameInMap("customer_id")
    public String customerId;

    // 过期时间
    @NameInMap("refresh_expired_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String refreshExpiredTime;

    // refresh token
    @NameInMap("refresh_token")
    public String refreshToken;

    // 租户名
    @NameInMap("tenant")
    public String tenant;

    // 租户 ID
    @NameInMap("tenant_id")
    public String tenantId;

    public static QueryOauthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOauthTokenResponse self = new QueryOauthTokenResponse();
        return TeaModel.build(map, self);
    }

    public QueryOauthTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOauthTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOauthTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOauthTokenResponse setAccessExpiredTime(String accessExpiredTime) {
        this.accessExpiredTime = accessExpiredTime;
        return this;
    }
    public String getAccessExpiredTime() {
        return this.accessExpiredTime;
    }

    public QueryOauthTokenResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public QueryOauthTokenResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryOauthTokenResponse setRefreshExpiredTime(String refreshExpiredTime) {
        this.refreshExpiredTime = refreshExpiredTime;
        return this;
    }
    public String getRefreshExpiredTime() {
        return this.refreshExpiredTime;
    }

    public QueryOauthTokenResponse setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public QueryOauthTokenResponse setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryOauthTokenResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
