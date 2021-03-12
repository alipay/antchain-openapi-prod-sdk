// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAuthFrontendAccesstokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 访问令牌
    @NameInMap("access_token")
    public String accessToken;

    // 过期时间
    @NameInMap("expire")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expire;

    // refresh_token
    @NameInMap("refresh_token")
    public String refreshToken;

    // 和xreplay交互时使用的令牌
    @NameInMap("xreplay_token")
    public String xreplayToken;

    public static GetAuthFrontendAccesstokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthFrontendAccesstokenResponse self = new GetAuthFrontendAccesstokenResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthFrontendAccesstokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAuthFrontendAccesstokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAuthFrontendAccesstokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAuthFrontendAccesstokenResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetAuthFrontendAccesstokenResponse setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public GetAuthFrontendAccesstokenResponse setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GetAuthFrontendAccesstokenResponse setXreplayToken(String xreplayToken) {
        this.xreplayToken = xreplayToken;
        return this;
    }
    public String getXreplayToken() {
        return this.xreplayToken;
    }

}
