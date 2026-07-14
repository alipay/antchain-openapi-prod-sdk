// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoiceLine extends TeaModel {
    // 含税金额
    /**
     * <strong>example:</strong>
     * <p>133880</p>
     */
    @NameInMap("amt")
    @Validation(required = true)
    public String amt;

    // 税额
    /**
     * <strong>example:</strong>
     * <p>45</p>
     */
    @NameInMap("tax_amt")
    @Validation(required = true)
    public String taxAmt;

    // 税率
    /**
     * <strong>example:</strong>
     * <p>0.13</p>
     */
    @NameInMap("tax_rate")
    @Validation(required = true)
    public String taxRate;

    // 不含税金额
    /**
     * <strong>example:</strong>
     * <p>24556</p>
     */
    @NameInMap("tax_exclusive_amt")
    @Validation(required = true)
    public String taxExclusiveAmt;

    // 含税单价
    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("unit_amt")
    @Validation(required = true)
    public String unitAmt;

    // 服务大类编号
    /**
     * <strong>example:</strong>
     * <p>2345455</p>
     */
    @NameInMap("tax_classification_code")
    @Validation(required = true)
    public String taxClassificationCode;

    // 货物或劳务名称
    /**
     * <strong>example:</strong>
     * <p>技术服务费</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 产品CODE
    /**
     * <strong>example:</strong>
     * <p>SPU33445</p>
     */
    @NameInMap("product_code")
    public String productCode;

    // 规格型号
    /**
     * <strong>example:</strong>
     * <p>333</p>
     */
    @NameInMap("product_specification")
    public String productSpecification;

    // 计量单位
    /**
     * <strong>example:</strong>
     * <p>个</p>
     */
    @NameInMap("measurement_nnit")
    public String measurementNnit;

    // 数量，默认为1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quantity")
    public String quantity;

    // 发票行ID
    /**
     * <strong>example:</strong>
     * <p>33455666</p>
     */
    @NameInMap("invoice_line_id")
    @Validation(required = true)
    public String invoiceLineId;

    // 劳务与货物名称的后缀，主要有账期（202309）、PID（2088XXXX）等
    /**
     * <strong>example:</strong>
     * <p>202309</p>
     */
    @NameInMap("product_name_suffix")
    public String productNameSuffix;

    public static ApplyInvoiceLine build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceLine self = new ApplyInvoiceLine();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceLine setAmt(String amt) {
        this.amt = amt;
        return this;
    }
    public String getAmt() {
        return this.amt;
    }

    public ApplyInvoiceLine setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
        return this;
    }
    public String getTaxAmt() {
        return this.taxAmt;
    }

    public ApplyInvoiceLine setTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    public String getTaxRate() {
        return this.taxRate;
    }

    public ApplyInvoiceLine setTaxExclusiveAmt(String taxExclusiveAmt) {
        this.taxExclusiveAmt = taxExclusiveAmt;
        return this;
    }
    public String getTaxExclusiveAmt() {
        return this.taxExclusiveAmt;
    }

    public ApplyInvoiceLine setUnitAmt(String unitAmt) {
        this.unitAmt = unitAmt;
        return this;
    }
    public String getUnitAmt() {
        return this.unitAmt;
    }

    public ApplyInvoiceLine setTaxClassificationCode(String taxClassificationCode) {
        this.taxClassificationCode = taxClassificationCode;
        return this;
    }
    public String getTaxClassificationCode() {
        return this.taxClassificationCode;
    }

    public ApplyInvoiceLine setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ApplyInvoiceLine setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ApplyInvoiceLine setProductSpecification(String productSpecification) {
        this.productSpecification = productSpecification;
        return this;
    }
    public String getProductSpecification() {
        return this.productSpecification;
    }

    public ApplyInvoiceLine setMeasurementNnit(String measurementNnit) {
        this.measurementNnit = measurementNnit;
        return this;
    }
    public String getMeasurementNnit() {
        return this.measurementNnit;
    }

    public ApplyInvoiceLine setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public ApplyInvoiceLine setInvoiceLineId(String invoiceLineId) {
        this.invoiceLineId = invoiceLineId;
        return this;
    }
    public String getInvoiceLineId() {
        return this.invoiceLineId;
    }

    public ApplyInvoiceLine setProductNameSuffix(String productNameSuffix) {
        this.productNameSuffix = productNameSuffix;
        return this;
    }
    public String getProductNameSuffix() {
        return this.productNameSuffix;
    }

}
