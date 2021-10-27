// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyPrivatecompanyTwometaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 调用返回值。"0"为调用成功。
    @NameInMap("code")
    public String code;

    // 校验是否通过。
    @NameInMap("pass")
    public Boolean pass;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    public static VerifyPrivatecompanyTwometaResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyPrivatecompanyTwometaResponse self = new VerifyPrivatecompanyTwometaResponse();
        return TeaModel.build(map, self);
    }

    public VerifyPrivatecompanyTwometaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyPrivatecompanyTwometaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyPrivatecompanyTwometaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyPrivatecompanyTwometaResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyPrivatecompanyTwometaResponse setPass(Boolean pass) {
        this.pass = pass;
        return this;
    }
    public Boolean getPass() {
        return this.pass;
    }

    public VerifyPrivatecompanyTwometaResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
