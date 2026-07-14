// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class PushIntlinvoicesProformainvoiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请是否成功
    @NameInMap("success")
    public Boolean success;

    // 返回结果码
    @NameInMap("resultcode")
    public String resultcode;

    // 返回结果描述
    @NameInMap("resultmessage")
    public String resultmessage;

    public static PushIntlinvoicesProformainvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PushIntlinvoicesProformainvoiceResponse self = new PushIntlinvoicesProformainvoiceResponse();
        return TeaModel.build(map, self);
    }

    public PushIntlinvoicesProformainvoiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushIntlinvoicesProformainvoiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushIntlinvoicesProformainvoiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushIntlinvoicesProformainvoiceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PushIntlinvoicesProformainvoiceResponse setResultcode(String resultcode) {
        this.resultcode = resultcode;
        return this;
    }
    public String getResultcode() {
        return this.resultcode;
    }

    public PushIntlinvoicesProformainvoiceResponse setResultmessage(String resultmessage) {
        this.resultmessage = resultmessage;
        return this;
    }
    public String getResultmessage() {
        return this.resultmessage;
    }

}
