// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ApplyBillingcoreMerchantinvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 发票信息
    @NameInMap("invoice")
    @Validation(required = true)
    public Invoice invoice;

    // 发票寄送地址
    @NameInMap("invoice_address")
    public InvoiceAddress invoiceAddress;

    // 发票电子邮箱
    @NameInMap("invoice_email")
    public InvoiceEmail invoiceEmail;

    public static ApplyBillingcoreMerchantinvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyBillingcoreMerchantinvoiceRequest self = new ApplyBillingcoreMerchantinvoiceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyBillingcoreMerchantinvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyBillingcoreMerchantinvoiceRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ApplyBillingcoreMerchantinvoiceRequest setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }

    public ApplyBillingcoreMerchantinvoiceRequest setInvoiceAddress(InvoiceAddress invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
        return this;
    }
    public InvoiceAddress getInvoiceAddress() {
        return this.invoiceAddress;
    }

    public ApplyBillingcoreMerchantinvoiceRequest setInvoiceEmail(InvoiceEmail invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
        return this;
    }
    public InvoiceEmail getInvoiceEmail() {
        return this.invoiceEmail;
    }

}
