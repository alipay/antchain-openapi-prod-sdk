// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class RegisterTagChanganResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权码
    @NameInMap("access_token")
    public String accessToken;

    // 授权码过期时间，单位s，默认2小时（7200s）
    @NameInMap("expires_in")
    public Long expiresIn;

    public static RegisterTagChanganResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterTagChanganResponse self = new RegisterTagChanganResponse();
        return TeaModel.build(map, self);
    }

    public RegisterTagChanganResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterTagChanganResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterTagChanganResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterTagChanganResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RegisterTagChanganResponse setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

}
