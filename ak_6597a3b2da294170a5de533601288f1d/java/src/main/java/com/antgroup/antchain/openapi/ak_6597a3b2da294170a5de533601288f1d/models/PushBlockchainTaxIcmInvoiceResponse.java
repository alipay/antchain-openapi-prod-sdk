// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6597a3b2da294170a5de533601288f1d.models;

import com.aliyun.tea.*;

public class PushBlockchainTaxIcmInvoiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    public static PushBlockchainTaxIcmInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PushBlockchainTaxIcmInvoiceResponse self = new PushBlockchainTaxIcmInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public PushBlockchainTaxIcmInvoiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushBlockchainTaxIcmInvoiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushBlockchainTaxIcmInvoiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

}
