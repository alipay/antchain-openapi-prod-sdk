// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoicesPreviewResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发票预览记录号
    @NameInMap("invoice_preview_log_no")
    public String invoicePreviewLogNo;

    // 发票预览信息
    @NameInMap("preview_invoices")
    public java.util.List<InvoicePreviewVO> previewInvoices;

    public static ApplyInvoicesPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoicesPreviewResponse self = new ApplyInvoicesPreviewResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInvoicesPreviewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyInvoicesPreviewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyInvoicesPreviewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyInvoicesPreviewResponse setInvoicePreviewLogNo(String invoicePreviewLogNo) {
        this.invoicePreviewLogNo = invoicePreviewLogNo;
        return this;
    }
    public String getInvoicePreviewLogNo() {
        return this.invoicePreviewLogNo;
    }

    public ApplyInvoicesPreviewResponse setPreviewInvoices(java.util.List<InvoicePreviewVO> previewInvoices) {
        this.previewInvoices = previewInvoices;
        return this;
    }
    public java.util.List<InvoicePreviewVO> getPreviewInvoices() {
        return this.previewInvoices;
    }

}
