// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetLoginconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

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

    // 状态, 取值范围：NORMAL(正常状态), LOCK(锁定), ONE_PARTY_MIGRATING(一方化迁移中), ONE_PARTY_MIGRATION_LOCK(一方化迁移完成，禁用蚂蚁登录)
    @NameInMap("status")
    public String status;

    // 并发登录的ip数量，小于1表示不限制
    @NameInMap("concurrent_ip_count")
    public Long concurrentIpCount;

    public static GetLoginconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginconfigResponse self = new GetLoginconfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetLoginconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLoginconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetLoginconfigResponse setPasswordMinLength(Long passwordMinLength) {
        this.passwordMinLength = passwordMinLength;
        return this;
    }
    public Long getPasswordMinLength() {
        return this.passwordMinLength;
    }

    public GetLoginconfigResponse setPasswordMaxLength(Long passwordMaxLength) {
        this.passwordMaxLength = passwordMaxLength;
        return this;
    }
    public Long getPasswordMaxLength() {
        return this.passwordMaxLength;
    }

    public GetLoginconfigResponse setPasswordLowercaseLetter(Boolean passwordLowercaseLetter) {
        this.passwordLowercaseLetter = passwordLowercaseLetter;
        return this;
    }
    public Boolean getPasswordLowercaseLetter() {
        return this.passwordLowercaseLetter;
    }

    public GetLoginconfigResponse setPasswordUppercaseLetter(Boolean passwordUppercaseLetter) {
        this.passwordUppercaseLetter = passwordUppercaseLetter;
        return this;
    }
    public Boolean getPasswordUppercaseLetter() {
        return this.passwordUppercaseLetter;
    }

    public GetLoginconfigResponse setPasswordLetter(Boolean passwordLetter) {
        this.passwordLetter = passwordLetter;
        return this;
    }
    public Boolean getPasswordLetter() {
        return this.passwordLetter;
    }

    public GetLoginconfigResponse setPasswordDigit(Boolean passwordDigit) {
        this.passwordDigit = passwordDigit;
        return this;
    }
    public Boolean getPasswordDigit() {
        return this.passwordDigit;
    }

    public GetLoginconfigResponse setPasswordSpecialChar(Boolean passwordSpecialChar) {
        this.passwordSpecialChar = passwordSpecialChar;
        return this;
    }
    public Boolean getPasswordSpecialChar() {
        return this.passwordSpecialChar;
    }

    public GetLoginconfigResponse setPasswordValidCheck(Boolean passwordValidCheck) {
        this.passwordValidCheck = passwordValidCheck;
        return this;
    }
    public Boolean getPasswordValidCheck() {
        return this.passwordValidCheck;
    }

    public GetLoginconfigResponse setPasswordValidPeriod(Long passwordValidPeriod) {
        this.passwordValidPeriod = passwordValidPeriod;
        return this;
    }
    public Long getPasswordValidPeriod() {
        return this.passwordValidPeriod;
    }

    public GetLoginconfigResponse setPasswordExpiredLogin(Boolean passwordExpiredLogin) {
        this.passwordExpiredLogin = passwordExpiredLogin;
        return this;
    }
    public Boolean getPasswordExpiredLogin() {
        return this.passwordExpiredLogin;
    }

    public GetLoginconfigResponse setPasswordHistoryCheck(Boolean passwordHistoryCheck) {
        this.passwordHistoryCheck = passwordHistoryCheck;
        return this;
    }
    public Boolean getPasswordHistoryCheck() {
        return this.passwordHistoryCheck;
    }

    public GetLoginconfigResponse setPasswordHistoryNum(Long passwordHistoryNum) {
        this.passwordHistoryNum = passwordHistoryNum;
        return this;
    }
    public Long getPasswordHistoryNum() {
        return this.passwordHistoryNum;
    }

    public GetLoginconfigResponse setVerifyAttemptsCheck(Boolean verifyAttemptsCheck) {
        this.verifyAttemptsCheck = verifyAttemptsCheck;
        return this;
    }
    public Boolean getVerifyAttemptsCheck() {
        return this.verifyAttemptsCheck;
    }

    public GetLoginconfigResponse setVerifyAttemptsWindow(Long verifyAttemptsWindow) {
        this.verifyAttemptsWindow = verifyAttemptsWindow;
        return this;
    }
    public Long getVerifyAttemptsWindow() {
        return this.verifyAttemptsWindow;
    }

    public GetLoginconfigResponse setVerifyAttemptsThreshold(Long verifyAttemptsThreshold) {
        this.verifyAttemptsThreshold = verifyAttemptsThreshold;
        return this;
    }
    public Long getVerifyAttemptsThreshold() {
        return this.verifyAttemptsThreshold;
    }

    public GetLoginconfigResponse setLockoutDuration(Long lockoutDuration) {
        this.lockoutDuration = lockoutDuration;
        return this;
    }
    public Long getLockoutDuration() {
        return this.lockoutDuration;
    }

    public GetLoginconfigResponse setActiveCheck(Boolean activeCheck) {
        this.activeCheck = activeCheck;
        return this;
    }
    public Boolean getActiveCheck() {
        return this.activeCheck;
    }

    public GetLoginconfigResponse setActivePeriod(Long activePeriod) {
        this.activePeriod = activePeriod;
        return this;
    }
    public Long getActivePeriod() {
        return this.activePeriod;
    }

    public GetLoginconfigResponse setPasswordSelfManage(Boolean passwordSelfManage) {
        this.passwordSelfManage = passwordSelfManage;
        return this;
    }
    public Boolean getPasswordSelfManage() {
        return this.passwordSelfManage;
    }

    public GetLoginconfigResponse setMfaSelfManage(Boolean mfaSelfManage) {
        this.mfaSelfManage = mfaSelfManage;
        return this;
    }
    public Boolean getMfaSelfManage() {
        return this.mfaSelfManage;
    }

    public GetLoginconfigResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLoginconfigResponse setConcurrentIpCount(Long concurrentIpCount) {
        this.concurrentIpCount = concurrentIpCount;
        return this;
    }
    public Long getConcurrentIpCount() {
        return this.concurrentIpCount;
    }

}
