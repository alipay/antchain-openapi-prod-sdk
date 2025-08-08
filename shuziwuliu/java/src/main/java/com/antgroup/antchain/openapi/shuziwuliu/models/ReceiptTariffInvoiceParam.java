// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ReceiptTariffInvoiceParam extends TeaModel {
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("action")
    public String action;

    // 发票金额 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("invoice_amount")
    public String invoiceAmount;

    // 资费项金额 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("receipt_tariff_amount")
    public String receiptTariffAmount;

    // 资费单据编号 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("receipt_tariff_code")
    public String receiptTariffCode;

    // 资费项发票code
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("receipt_tariff_invoice_code")
    @Validation(required = true)
    public String receiptTariffInvoiceCode;

    public static ReceiptTariffInvoiceParam build(java.util.Map<String, ?> map) throws Exception {
        ReceiptTariffInvoiceParam self = new ReceiptTariffInvoiceParam();
        return TeaModel.build(map, self);
    }

    public ReceiptTariffInvoiceParam setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ReceiptTariffInvoiceParam setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
        return this;
    }
    public String getInvoiceAmount() {
        return this.invoiceAmount;
    }

    public ReceiptTariffInvoiceParam setReceiptTariffAmount(String receiptTariffAmount) {
        this.receiptTariffAmount = receiptTariffAmount;
        return this;
    }
    public String getReceiptTariffAmount() {
        return this.receiptTariffAmount;
    }

    public ReceiptTariffInvoiceParam setReceiptTariffCode(String receiptTariffCode) {
        this.receiptTariffCode = receiptTariffCode;
        return this;
    }
    public String getReceiptTariffCode() {
        return this.receiptTariffCode;
    }

    public ReceiptTariffInvoiceParam setReceiptTariffInvoiceCode(String receiptTariffInvoiceCode) {
        this.receiptTariffInvoiceCode = receiptTariffInvoiceCode;
        return this;
    }
    public String getReceiptTariffInvoiceCode() {
        return this.receiptTariffInvoiceCode;
    }

}
