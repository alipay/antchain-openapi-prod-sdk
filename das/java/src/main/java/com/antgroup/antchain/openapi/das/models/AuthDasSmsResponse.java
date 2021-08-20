// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthDasSmsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权状态
    @NameInMap("auth_status")
    public String authStatus;

    // VC
    @NameInMap("vc")
    public String vc;

    public static AuthDasSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthDasSmsResponse self = new AuthDasSmsResponse();
        return TeaModel.build(map, self);
    }

    public AuthDasSmsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthDasSmsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthDasSmsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthDasSmsResponse setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public AuthDasSmsResponse setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

}
