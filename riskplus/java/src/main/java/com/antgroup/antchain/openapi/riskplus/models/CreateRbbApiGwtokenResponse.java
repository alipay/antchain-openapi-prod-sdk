// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreateRbbApiGwtokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回登录token
    @NameInMap("logintoken")
    public String logintoken;

    public static CreateRbbApiGwtokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRbbApiGwtokenResponse self = new CreateRbbApiGwtokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateRbbApiGwtokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateRbbApiGwtokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateRbbApiGwtokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateRbbApiGwtokenResponse setLogintoken(String logintoken) {
        this.logintoken = logintoken;
        return this;
    }
    public String getLogintoken() {
        return this.logintoken;
    }

}
