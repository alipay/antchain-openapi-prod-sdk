// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GetRbbLoginTokenResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 登录token，5分钟有效
    @NameInMap("logintoken")
    public String logintoken;

    public static GetRbbLoginTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRbbLoginTokenResponse self = new GetRbbLoginTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetRbbLoginTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRbbLoginTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRbbLoginTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRbbLoginTokenResponse setLogintoken(String logintoken) {
        this.logintoken = logintoken;
        return this;
    }
    public String getLogintoken() {
        return this.logintoken;
    }

}
