// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class GetTrackingTokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 临时ak
    @NameInMap("accesskey_id")
    public String accesskeyId;

    // 临时sk
    @NameInMap("accesskey_secret")
    public String accesskeySecret;

    // token
    @NameInMap("security_token")
    public String securityToken;

    // 失效时间
    @NameInMap("expiration")
    public String expiration;

    public static GetTrackingTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrackingTokenResponse self = new GetTrackingTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetTrackingTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTrackingTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTrackingTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTrackingTokenResponse setAccesskeyId(String accesskeyId) {
        this.accesskeyId = accesskeyId;
        return this;
    }
    public String getAccesskeyId() {
        return this.accesskeyId;
    }

    public GetTrackingTokenResponse setAccesskeySecret(String accesskeySecret) {
        this.accesskeySecret = accesskeySecret;
        return this;
    }
    public String getAccesskeySecret() {
        return this.accesskeySecret;
    }

    public GetTrackingTokenResponse setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetTrackingTokenResponse setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

}
