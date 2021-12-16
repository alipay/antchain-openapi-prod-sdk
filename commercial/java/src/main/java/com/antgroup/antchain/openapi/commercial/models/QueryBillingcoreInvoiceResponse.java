// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryBillingcoreInvoiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发票信息
    @NameInMap("invoice")
    public Invoice invoice;

    public static QueryBillingcoreInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillingcoreInvoiceResponse self = new QueryBillingcoreInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryBillingcoreInvoiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBillingcoreInvoiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBillingcoreInvoiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBillingcoreInvoiceResponse setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }

}
