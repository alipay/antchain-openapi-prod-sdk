// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class RegisterCarownerCyResponse extends TeaModel {
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

    public static RegisterCarownerCyResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterCarownerCyResponse self = new RegisterCarownerCyResponse();
        return TeaModel.build(map, self);
    }

    public RegisterCarownerCyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterCarownerCyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterCarownerCyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterCarownerCyResponse setPushSuccess(Boolean pushSuccess) {
        this.pushSuccess = pushSuccess;
        return this;
    }
    public Boolean getPushSuccess() {
        return this.pushSuccess;
    }

}
