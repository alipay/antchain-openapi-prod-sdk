// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InitSilentauthRealnameResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实名认证流程ID，线下授权发起时作为 user_flowid 传入
    @NameInMap("auth_flow_id")
    public String authFlowId;

    // 支付宝刷脸认证链接，23小时内有效
    @NameInMap("auth_url")
    public String authUrl;

    public static InitSilentauthRealnameResponse build(java.util.Map<String, ?> map) throws Exception {
        InitSilentauthRealnameResponse self = new InitSilentauthRealnameResponse();
        return TeaModel.build(map, self);
    }

    public InitSilentauthRealnameResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitSilentauthRealnameResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitSilentauthRealnameResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitSilentauthRealnameResponse setAuthFlowId(String authFlowId) {
        this.authFlowId = authFlowId;
        return this;
    }
    public String getAuthFlowId() {
        return this.authFlowId;
    }

    public InitSilentauthRealnameResponse setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }
    public String getAuthUrl() {
        return this.authUrl;
    }

}
