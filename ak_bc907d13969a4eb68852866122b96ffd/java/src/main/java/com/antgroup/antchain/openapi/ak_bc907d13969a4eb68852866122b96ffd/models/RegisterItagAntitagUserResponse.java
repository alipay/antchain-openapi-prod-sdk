// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class RegisterItagAntitagUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求ID
    @NameInMap("requestid")
    public String requestid;

    // 结果码
    @NameInMap("code")
    public Long code;

    // 错误信息
    @NameInMap("errmsg")
    public String errmsg;

    // 结果消息
    @NameInMap("msg")
    public String msg;

    // 标注平台userid
    @NameInMap("result")
    public String result;

    // 结果
    @NameInMap("succ")
    public Boolean succ;

    public static RegisterItagAntitagUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterItagAntitagUserResponse self = new RegisterItagAntitagUserResponse();
        return TeaModel.build(map, self);
    }

    public RegisterItagAntitagUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterItagAntitagUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterItagAntitagUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterItagAntitagUserResponse setRequestid(String requestid) {
        this.requestid = requestid;
        return this;
    }
    public String getRequestid() {
        return this.requestid;
    }

    public RegisterItagAntitagUserResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public RegisterItagAntitagUserResponse setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
    public String getErrmsg() {
        return this.errmsg;
    }

    public RegisterItagAntitagUserResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public RegisterItagAntitagUserResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public RegisterItagAntitagUserResponse setSucc(Boolean succ) {
        this.succ = succ;
        return this;
    }
    public Boolean getSucc() {
        return this.succ;
    }

}
