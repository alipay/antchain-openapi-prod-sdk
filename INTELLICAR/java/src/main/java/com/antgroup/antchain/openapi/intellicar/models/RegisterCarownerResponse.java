// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class RegisterCarownerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("push_success")
    public Boolean pushSuccess;

    // token
    @NameInMap("token")
    public String token;

    public static RegisterCarownerResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterCarownerResponse self = new RegisterCarownerResponse();
        return TeaModel.build(map, self);
    }

    public RegisterCarownerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterCarownerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterCarownerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterCarownerResponse setPushSuccess(Boolean pushSuccess) {
        this.pushSuccess = pushSuccess;
        return this;
    }
    public Boolean getPushSuccess() {
        return this.pushSuccess;
    }

    public RegisterCarownerResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
