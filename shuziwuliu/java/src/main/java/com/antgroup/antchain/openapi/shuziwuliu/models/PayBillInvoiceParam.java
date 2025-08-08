// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PayBillInvoiceParam extends TeaModel {
    // 账单发票code
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("pay_bill_invoice_code")
    @Validation(required = true)
    public String payBillInvoiceCode;

    // 账单编号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("pay_bill_order_code")
    @Validation(required = true)
    public String payBillOrderCode;

    // 账单金额
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("pay_bill_amount")
    @Validation(required = true)
    public String payBillAmount;

    // 发票金额
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("invoice_amount")
    @Validation(required = true)
    public String invoiceAmount;

    // 操作动作
    /**
     * <strong>example:</strong>
     * <p>UPDATE、DELETE、INSERT</p>
     */
    @NameInMap("action")
    public String action;

    public static PayBillInvoiceParam build(java.util.Map<String, ?> map) throws Exception {
        PayBillInvoiceParam self = new PayBillInvoiceParam();
        return TeaModel.build(map, self);
    }

    public PayBillInvoiceParam setPayBillInvoiceCode(String payBillInvoiceCode) {
        this.payBillInvoiceCode = payBillInvoiceCode;
        return this;
    }
    public String getPayBillInvoiceCode() {
        return this.payBillInvoiceCode;
    }

    public PayBillInvoiceParam setPayBillOrderCode(String payBillOrderCode) {
        this.payBillOrderCode = payBillOrderCode;
        return this;
    }
    public String getPayBillOrderCode() {
        return this.payBillOrderCode;
    }

    public PayBillInvoiceParam setPayBillAmount(String payBillAmount) {
        this.payBillAmount = payBillAmount;
        return this;
    }
    public String getPayBillAmount() {
        return this.payBillAmount;
    }

    public PayBillInvoiceParam setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
        return this;
    }
    public String getInvoiceAmount() {
        return this.invoiceAmount;
    }

    public PayBillInvoiceParam setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}
