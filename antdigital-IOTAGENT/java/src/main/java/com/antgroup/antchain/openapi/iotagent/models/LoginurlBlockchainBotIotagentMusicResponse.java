// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class LoginurlBlockchainBotIotagentMusicResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 云音乐 H5 登录 URL
    @NameInMap("login_url")
    public String loginUrl;

    // OAuth state（回调校验用）
    @NameInMap("state")
    public String state;

    public static LoginurlBlockchainBotIotagentMusicResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginurlBlockchainBotIotagentMusicResponse self = new LoginurlBlockchainBotIotagentMusicResponse();
        return TeaModel.build(map, self);
    }

    public LoginurlBlockchainBotIotagentMusicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public LoginurlBlockchainBotIotagentMusicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public LoginurlBlockchainBotIotagentMusicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public LoginurlBlockchainBotIotagentMusicResponse setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public LoginurlBlockchainBotIotagentMusicResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
