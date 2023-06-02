// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class UpdateLoginconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 密码最小长度
    @NameInMap("password_min_length")
    public Long passwordMinLength;

    // 密码最大长度
    @NameInMap("password_max_length")
    public Long passwordMaxLength;

    // 密码是否必须包含小写字母
    @NameInMap("password_lowercase_letter")
    public Boolean passwordLowercaseLetter;

    // 密码是否必须包含大写字母
    @NameInMap("password_uppercase_letter")
    public Boolean passwordUppercaseLetter;

    // 密码是否必须包含字母
    @NameInMap("password_letter")
    public Boolean passwordLetter;

    // 密码是否必须包含数字
    @NameInMap("password_digit")
    public Boolean passwordDigit;

    // 密码是否必须包含特殊字符
    @NameInMap("password_special_char")
    public Boolean passwordSpecialChar;

    // 是否检查密码有效
    @NameInMap("password_valid_check")
    public Boolean passwordValidCheck;

    // 密码有效期
    @NameInMap("password_valid_period")
    public Long passwordValidPeriod;

    // 密码过期后是否允许登录
    @NameInMap("password_expired_login")
    public Boolean passwordExpiredLogin;

    // 是否检查密码历史
    @NameInMap("password_history_check")
    public Boolean passwordHistoryCheck;

    // 密码历史个数
    @NameInMap("password_history_num")
    public Long passwordHistoryNum;

    // 重试校验是否触发锁定
    @NameInMap("verify_attempts_check")
    public Boolean verifyAttemptsCheck;

    // 重试校验窗口
    @NameInMap("verify_attempts_window")
    public Long verifyAttemptsWindow;

    // 重试校验触发锁定阈值
    @NameInMap("verify_attempts_threshold")
    public Long verifyAttemptsThreshold;

    // 锁定时间
    @NameInMap("lockout_duration")
    public Long lockoutDuration;

    // 是否检查账户活跃
    @NameInMap("active_check")
    public Boolean activeCheck;

    // 活跃周期，非活跃时锁定登录
    @NameInMap("active_period")
    public Long activePeriod;

    // 是否允许自主管理密码
    @NameInMap("password_self_manage")
    public Boolean passwordSelfManage;

    // 是否允许自主管理MFA
    @NameInMap("mfa_self_manage")
    public Boolean mfaSelfManage;

    // 并发登录的ip数量，小于1表示不限制
    @NameInMap("concurrent_ip_count")
    public Long concurrentIpCount;

    public static UpdateLoginconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginconfigRequest self = new UpdateLoginconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoginconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateLoginconfigRequest setPasswordMinLength(Long passwordMinLength) {
        this.passwordMinLength = passwordMinLength;
        return this;
    }
    public Long getPasswordMinLength() {
        return this.passwordMinLength;
    }

    public UpdateLoginconfigRequest setPasswordMaxLength(Long passwordMaxLength) {
        this.passwordMaxLength = passwordMaxLength;
        return this;
    }
    public Long getPasswordMaxLength() {
        return this.passwordMaxLength;
    }

    public UpdateLoginconfigRequest setPasswordLowercaseLetter(Boolean passwordLowercaseLetter) {
        this.passwordLowercaseLetter = passwordLowercaseLetter;
        return this;
    }
    public Boolean getPasswordLowercaseLetter() {
        return this.passwordLowercaseLetter;
    }

    public UpdateLoginconfigRequest setPasswordUppercaseLetter(Boolean passwordUppercaseLetter) {
        this.passwordUppercaseLetter = passwordUppercaseLetter;
        return this;
    }
    public Boolean getPasswordUppercaseLetter() {
        return this.passwordUppercaseLetter;
    }

    public UpdateLoginconfigRequest setPasswordLetter(Boolean passwordLetter) {
        this.passwordLetter = passwordLetter;
        return this;
    }
    public Boolean getPasswordLetter() {
        return this.passwordLetter;
    }

    public UpdateLoginconfigRequest setPasswordDigit(Boolean passwordDigit) {
        this.passwordDigit = passwordDigit;
        return this;
    }
    public Boolean getPasswordDigit() {
        return this.passwordDigit;
    }

    public UpdateLoginconfigRequest setPasswordSpecialChar(Boolean passwordSpecialChar) {
        this.passwordSpecialChar = passwordSpecialChar;
        return this;
    }
    public Boolean getPasswordSpecialChar() {
        return this.passwordSpecialChar;
    }

    public UpdateLoginconfigRequest setPasswordValidCheck(Boolean passwordValidCheck) {
        this.passwordValidCheck = passwordValidCheck;
        return this;
    }
    public Boolean getPasswordValidCheck() {
        return this.passwordValidCheck;
    }

    public UpdateLoginconfigRequest setPasswordValidPeriod(Long passwordValidPeriod) {
        this.passwordValidPeriod = passwordValidPeriod;
        return this;
    }
    public Long getPasswordValidPeriod() {
        return this.passwordValidPeriod;
    }

    public UpdateLoginconfigRequest setPasswordExpiredLogin(Boolean passwordExpiredLogin) {
        this.passwordExpiredLogin = passwordExpiredLogin;
        return this;
    }
    public Boolean getPasswordExpiredLogin() {
        return this.passwordExpiredLogin;
    }

    public UpdateLoginconfigRequest setPasswordHistoryCheck(Boolean passwordHistoryCheck) {
        this.passwordHistoryCheck = passwordHistoryCheck;
        return this;
    }
    public Boolean getPasswordHistoryCheck() {
        return this.passwordHistoryCheck;
    }

    public UpdateLoginconfigRequest setPasswordHistoryNum(Long passwordHistoryNum) {
        this.passwordHistoryNum = passwordHistoryNum;
        return this;
    }
    public Long getPasswordHistoryNum() {
        return this.passwordHistoryNum;
    }

    public UpdateLoginconfigRequest setVerifyAttemptsCheck(Boolean verifyAttemptsCheck) {
        this.verifyAttemptsCheck = verifyAttemptsCheck;
        return this;
    }
    public Boolean getVerifyAttemptsCheck() {
        return this.verifyAttemptsCheck;
    }

    public UpdateLoginconfigRequest setVerifyAttemptsWindow(Long verifyAttemptsWindow) {
        this.verifyAttemptsWindow = verifyAttemptsWindow;
        return this;
    }
    public Long getVerifyAttemptsWindow() {
        return this.verifyAttemptsWindow;
    }

    public UpdateLoginconfigRequest setVerifyAttemptsThreshold(Long verifyAttemptsThreshold) {
        this.verifyAttemptsThreshold = verifyAttemptsThreshold;
        return this;
    }
    public Long getVerifyAttemptsThreshold() {
        return this.verifyAttemptsThreshold;
    }

    public UpdateLoginconfigRequest setLockoutDuration(Long lockoutDuration) {
        this.lockoutDuration = lockoutDuration;
        return this;
    }
    public Long getLockoutDuration() {
        return this.lockoutDuration;
    }

    public UpdateLoginconfigRequest setActiveCheck(Boolean activeCheck) {
        this.activeCheck = activeCheck;
        return this;
    }
    public Boolean getActiveCheck() {
        return this.activeCheck;
    }

    public UpdateLoginconfigRequest setActivePeriod(Long activePeriod) {
        this.activePeriod = activePeriod;
        return this;
    }
    public Long getActivePeriod() {
        return this.activePeriod;
    }

    public UpdateLoginconfigRequest setPasswordSelfManage(Boolean passwordSelfManage) {
        this.passwordSelfManage = passwordSelfManage;
        return this;
    }
    public Boolean getPasswordSelfManage() {
        return this.passwordSelfManage;
    }

    public UpdateLoginconfigRequest setMfaSelfManage(Boolean mfaSelfManage) {
        this.mfaSelfManage = mfaSelfManage;
        return this;
    }
    public Boolean getMfaSelfManage() {
        return this.mfaSelfManage;
    }

    public UpdateLoginconfigRequest setConcurrentIpCount(Long concurrentIpCount) {
        this.concurrentIpCount = concurrentIpCount;
        return this;
    }
    public Long getConcurrentIpCount() {
        return this.concurrentIpCount;
    }

}
