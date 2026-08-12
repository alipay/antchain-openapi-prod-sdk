// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse extends TeaModel {
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

    public static PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse self = new PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse();
        return TeaModel.build(map, self);
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse setResultcode(String resultcode) {
        this.resultcode = resultcode;
        return this;
    }
    public String getResultcode() {
        return this.resultcode;
    }

    public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse setResultmessage(String resultmessage) {
        this.resultmessage = resultmessage;
        return this;
    }
    public String getResultmessage() {
        return this.resultmessage;
    }

}
