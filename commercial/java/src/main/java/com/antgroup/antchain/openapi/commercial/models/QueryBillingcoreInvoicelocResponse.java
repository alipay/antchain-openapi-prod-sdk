// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryBillingcoreInvoicelocResponse extends TeaModel {
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

    // 发票寄送地址
    @NameInMap("invoice_address")
    public InvoiceAddress invoiceAddress;

    // 发票电子邮箱
    @NameInMap("invoice_email")
    public InvoiceEmail invoiceEmail;

    public static QueryBillingcoreInvoicelocResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillingcoreInvoicelocResponse self = new QueryBillingcoreInvoicelocResponse();
        return TeaModel.build(map, self);
    }

    public QueryBillingcoreInvoicelocResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBillingcoreInvoicelocResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBillingcoreInvoicelocResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBillingcoreInvoicelocResponse setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }

    public QueryBillingcoreInvoicelocResponse setInvoiceAddress(InvoiceAddress invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
        return this;
    }
    public InvoiceAddress getInvoiceAddress() {
        return this.invoiceAddress;
    }

    public QueryBillingcoreInvoicelocResponse setInvoiceEmail(InvoiceEmail invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
        return this;
    }
    public InvoiceEmail getInvoiceEmail() {
        return this.invoiceEmail;
    }

}
