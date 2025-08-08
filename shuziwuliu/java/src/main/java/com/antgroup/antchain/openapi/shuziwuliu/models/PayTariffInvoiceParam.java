// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PayTariffInvoiceParam extends TeaModel {
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
    @NameInMap("pay_tariff_amount")
    public String payTariffAmount;

    // 资费单据编号 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("pay_tariff_code")
    public String payTariffCode;

    // 资费项发票code
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("pay_tariff_invoice_code")
    @Validation(required = true)
    public String payTariffInvoiceCode;

    public static PayTariffInvoiceParam build(java.util.Map<String, ?> map) throws Exception {
        PayTariffInvoiceParam self = new PayTariffInvoiceParam();
        return TeaModel.build(map, self);
    }

    public PayTariffInvoiceParam setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public PayTariffInvoiceParam setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
        return this;
    }
    public String getInvoiceAmount() {
        return this.invoiceAmount;
    }

    public PayTariffInvoiceParam setPayTariffAmount(String payTariffAmount) {
        this.payTariffAmount = payTariffAmount;
        return this;
    }
    public String getPayTariffAmount() {
        return this.payTariffAmount;
    }

    public PayTariffInvoiceParam setPayTariffCode(String payTariffCode) {
        this.payTariffCode = payTariffCode;
        return this;
    }
    public String getPayTariffCode() {
        return this.payTariffCode;
    }

    public PayTariffInvoiceParam setPayTariffInvoiceCode(String payTariffInvoiceCode) {
        this.payTariffInvoiceCode = payTariffInvoiceCode;
        return this;
    }
    public String getPayTariffInvoiceCode() {
        return this.payTariffInvoiceCode;
    }

}
