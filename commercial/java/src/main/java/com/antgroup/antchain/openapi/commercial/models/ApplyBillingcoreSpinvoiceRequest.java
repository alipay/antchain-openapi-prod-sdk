// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ApplyBillingcoreSpinvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 账单号，多个时逗号分隔
    @NameInMap("bill_nos")
    @Validation(required = true)
    public String billNos;

    // 账单总金额
    @NameInMap("bill_amt")
    @Validation(required = true)
    public String billAmt;

    // 币种
    @NameInMap("ccy")
    @Validation(required = true)
    public String ccy;

    // 销售方信息
    @NameInMap("seller_info")
    @Validation(required = true)
    public TaxInfo sellerInfo;

    // 购买方信息
    @NameInMap("buyer_info")
    @Validation(required = true)
    public TaxInfo buyerInfo;

    // 发票信息
    @NameInMap("invoice_infos")
    @Validation(required = true)
    public java.util.List<InvoiceInfo> invoiceInfos;

    public static ApplyBillingcoreSpinvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyBillingcoreSpinvoiceRequest self = new ApplyBillingcoreSpinvoiceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyBillingcoreSpinvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyBillingcoreSpinvoiceRequest setBillNos(String billNos) {
        this.billNos = billNos;
        return this;
    }
    public String getBillNos() {
        return this.billNos;
    }

    public ApplyBillingcoreSpinvoiceRequest setBillAmt(String billAmt) {
        this.billAmt = billAmt;
        return this;
    }
    public String getBillAmt() {
        return this.billAmt;
    }

    public ApplyBillingcoreSpinvoiceRequest setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public ApplyBillingcoreSpinvoiceRequest setSellerInfo(TaxInfo sellerInfo) {
        this.sellerInfo = sellerInfo;
        return this;
    }
    public TaxInfo getSellerInfo() {
        return this.sellerInfo;
    }

    public ApplyBillingcoreSpinvoiceRequest setBuyerInfo(TaxInfo buyerInfo) {
        this.buyerInfo = buyerInfo;
        return this;
    }
    public TaxInfo getBuyerInfo() {
        return this.buyerInfo;
    }

    public ApplyBillingcoreSpinvoiceRequest setInvoiceInfos(java.util.List<InvoiceInfo> invoiceInfos) {
        this.invoiceInfos = invoiceInfos;
        return this;
    }
    public java.util.List<InvoiceInfo> getInvoiceInfos() {
        return this.invoiceInfos;
    }

}
