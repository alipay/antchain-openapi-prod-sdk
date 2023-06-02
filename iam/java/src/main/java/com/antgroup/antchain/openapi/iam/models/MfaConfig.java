// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class MfaConfig extends TeaModel {
    // 用户id
    @NameInMap("user_id")
    public String userId;

    // MFA状态, 取值范围：ENABLED, DISABLED
    @NameInMap("status")
    public String status;

    // MFA类型，取值范围：SELF(自有MFA), SYMANTEC(赛门铁克MFA)
    @NameInMap("type")
    public String type;

    // 密钥
    @NameInMap("secret_key")
    public String secretKey;

    // 最后一次密钥生成时间
    @NameInMap("last_generated_time")
    public String lastGeneratedTime;

    // (校验失败时)重试校验的次数, 0 代表不限次数
    @NameInMap("verify_attempts")
    public Long verifyAttempts;

    // 第一次校验失败时间, ISO8601格式
    @NameInMap("first_failure_time")
    public String firstFailureTime;

    public static MfaConfig build(java.util.Map<String, ?> map) throws Exception {
        MfaConfig self = new MfaConfig();
        return TeaModel.build(map, self);
    }

    public MfaConfig setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MfaConfig setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MfaConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MfaConfig setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public MfaConfig setLastGeneratedTime(String lastGeneratedTime) {
        this.lastGeneratedTime = lastGeneratedTime;
        return this;
    }
    public String getLastGeneratedTime() {
        return this.lastGeneratedTime;
    }

    public MfaConfig setVerifyAttempts(Long verifyAttempts) {
        this.verifyAttempts = verifyAttempts;
        return this;
    }
    public Long getVerifyAttempts() {
        return this.verifyAttempts;
    }

    public MfaConfig setFirstFailureTime(String firstFailureTime) {
        this.firstFailureTime = firstFailureTime;
        return this;
    }
    public String getFirstFailureTime() {
        return this.firstFailureTime;
    }

}
