// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ResetInnerMermngcontractwebofficetokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 访问token
    @NameInMap("access_token")
    public String accessToken;

    // 访问token过期时间
    @NameInMap("access_token_expired_time")
    public String accessTokenExpiredTime;

    // 刷新token
    @NameInMap("refresh_token")
    public String refreshToken;

    // 刷新token过期时间
    @NameInMap("refresh_token_expired_time")
    public String refreshTokenExpiredTime;

    public static ResetInnerMermngcontractwebofficetokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetInnerMermngcontractwebofficetokenResponse self = new ResetInnerMermngcontractwebofficetokenResponse();
        return TeaModel.build(map, self);
    }

    public ResetInnerMermngcontractwebofficetokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ResetInnerMermngcontractwebofficetokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ResetInnerMermngcontractwebofficetokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ResetInnerMermngcontractwebofficetokenResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ResetInnerMermngcontractwebofficetokenResponse setAccessTokenExpiredTime(String accessTokenExpiredTime) {
        this.accessTokenExpiredTime = accessTokenExpiredTime;
        return this;
    }
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    public ResetInnerMermngcontractwebofficetokenResponse setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public ResetInnerMermngcontractwebofficetokenResponse setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
        this.refreshTokenExpiredTime = refreshTokenExpiredTime;
        return this;
    }
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

}
