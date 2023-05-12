// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DebugParticipatorsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口返回信息
    @NameInMap("msg")
    public String msg;

    // 接口返回码
    @NameInMap("success")
    public Boolean success;

    public static DebugParticipatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DebugParticipatorsResponse self = new DebugParticipatorsResponse();
        return TeaModel.build(map, self);
    }

    public DebugParticipatorsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DebugParticipatorsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DebugParticipatorsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DebugParticipatorsResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DebugParticipatorsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
