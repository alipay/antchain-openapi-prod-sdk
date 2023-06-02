// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetMfaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户 id
    @NameInMap("user_id")
    public String userId;

    // MFA状态, 取值范围：ENABLED, DISABLED
    @NameInMap("status")
    public String status;

    // 密钥
    @NameInMap("secret_key")
    public String secretKey;

    // 最后一次密钥生成时间
    @NameInMap("last_generated_time")
    public String lastGeneratedTime;

    // (校验失败时)重试校验的次数
    @NameInMap("verify_attempts")
    public Long verifyAttempts;

    // 第一次校验失败时间
    @NameInMap("first_failure_time")
    public String firstFailureTime;

    public static GetMfaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMfaResponse self = new GetMfaResponse();
        return TeaModel.build(map, self);
    }

    public GetMfaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMfaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMfaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMfaResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetMfaResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetMfaResponse setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public GetMfaResponse setLastGeneratedTime(String lastGeneratedTime) {
        this.lastGeneratedTime = lastGeneratedTime;
        return this;
    }
    public String getLastGeneratedTime() {
        return this.lastGeneratedTime;
    }

    public GetMfaResponse setVerifyAttempts(Long verifyAttempts) {
        this.verifyAttempts = verifyAttempts;
        return this;
    }
    public Long getVerifyAttempts() {
        return this.verifyAttempts;
    }

    public GetMfaResponse setFirstFailureTime(String firstFailureTime) {
        this.firstFailureTime = firstFailureTime;
        return this;
    }
    public String getFirstFailureTime() {
        return this.firstFailureTime;
    }

}
