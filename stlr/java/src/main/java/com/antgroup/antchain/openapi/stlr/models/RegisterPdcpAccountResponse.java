// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class RegisterPdcpAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户开通结果
    @NameInMap("data")
    public AccountRegisterResponse data;

    public static RegisterPdcpAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterPdcpAccountResponse self = new RegisterPdcpAccountResponse();
        return TeaModel.build(map, self);
    }

    public RegisterPdcpAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterPdcpAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterPdcpAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterPdcpAccountResponse setData(AccountRegisterResponse data) {
        this.data = data;
        return this;
    }
    public AccountRegisterResponse getData() {
        return this.data;
    }

}
