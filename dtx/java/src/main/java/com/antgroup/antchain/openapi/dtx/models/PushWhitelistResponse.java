// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class PushWhitelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 容灾推送到{Master|Failover}成功
    @NameInMap("msg")
    public String msg;

    // success
    @NameInMap("success")
    public Boolean success;

    public static PushWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        PushWhitelistResponse self = new PushWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public PushWhitelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushWhitelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushWhitelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushWhitelistResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public PushWhitelistResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
