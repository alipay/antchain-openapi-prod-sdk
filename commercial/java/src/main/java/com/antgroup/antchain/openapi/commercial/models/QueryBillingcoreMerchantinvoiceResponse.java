// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryBillingcoreMerchantinvoiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 主键id
    @NameInMap("id")
    public Long id;

    // 商户id
    @NameInMap("merchant_id")
    public String merchantId;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    // 订单金额
    @NameInMap("order_amt")
    public String orderAmt;

    // 币种
    @NameInMap("ccy")
    public String ccy;

    // 发票信息
    @NameInMap("invoice")
    public Invoice invoice;

    // 发票寄送地址
    @NameInMap("invoice_address")
    public InvoiceAddress invoiceAddress;

    // 发票电子邮箱
    @NameInMap("invoice_email")
    public InvoiceEmail invoiceEmail;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static QueryBillingcoreMerchantinvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillingcoreMerchantinvoiceResponse self = new QueryBillingcoreMerchantinvoiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryBillingcoreMerchantinvoiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBillingcoreMerchantinvoiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBillingcoreMerchantinvoiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBillingcoreMerchantinvoiceResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryBillingcoreMerchantinvoiceResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryBillingcoreMerchantinvoiceResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryBillingcoreMerchantinvoiceResponse setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
        return this;
    }
    public String getOrderAmt() {
        return this.orderAmt;
    }

    public QueryBillingcoreMerchantinvoiceResponse setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public QueryBillingcoreMerchantinvoiceResponse setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }

    public QueryBillingcoreMerchantinvoiceResponse setInvoiceAddress(InvoiceAddress invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
        return this;
    }
    public InvoiceAddress getInvoiceAddress() {
        return this.invoiceAddress;
    }

    public QueryBillingcoreMerchantinvoiceResponse setInvoiceEmail(InvoiceEmail invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
        return this;
    }
    public InvoiceEmail getInvoiceEmail() {
        return this.invoiceEmail;
    }

    public QueryBillingcoreMerchantinvoiceResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryBillingcoreMerchantinvoiceResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
