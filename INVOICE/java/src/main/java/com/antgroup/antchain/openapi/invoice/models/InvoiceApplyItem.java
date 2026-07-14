// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class InvoiceApplyItem extends TeaModel {
    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("item_name")
    @Validation(required = true)
    public String itemName;

    // 不含税金额
    /**
     * <strong>example:</strong>
     * <p>5520</p>
     */
    @NameInMap("excluding_tax_of_amount")
    @Validation(required = true)
    public String excludingTaxOfAmount;

    // 商品CODE
    /**
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("item_code")
    public String itemCode;

    // 含税金额
    /**
     * <strong>example:</strong>
     * <p>3452</p>
     */
    @NameInMap("amount")
    public String amount;

    // 关联单据号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("invoice_rcpt_no")
    public String invoiceRcptNo;

    public static InvoiceApplyItem build(java.util.Map<String, ?> map) throws Exception {
        InvoiceApplyItem self = new InvoiceApplyItem();
        return TeaModel.build(map, self);
    }

    public InvoiceApplyItem setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public InvoiceApplyItem setExcludingTaxOfAmount(String excludingTaxOfAmount) {
        this.excludingTaxOfAmount = excludingTaxOfAmount;
        return this;
    }
    public String getExcludingTaxOfAmount() {
        return this.excludingTaxOfAmount;
    }

    public InvoiceApplyItem setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public InvoiceApplyItem setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public InvoiceApplyItem setInvoiceRcptNo(String invoiceRcptNo) {
        this.invoiceRcptNo = invoiceRcptNo;
        return this;
    }
    public String getInvoiceRcptNo() {
        return this.invoiceRcptNo;
    }

}
