// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class InvoiceLineVO extends TeaModel {
    // 发票行金额
    /**
     * <strong>example:</strong>
     * <p>10.09</p>
     */
    @NameInMap("line_amt")
    @Validation(required = true)
    public String lineAmt;

    // 发票行ID
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("line_id")
    @Validation(required = true)
    public String lineId;

    // 税额
    /**
     * <strong>example:</strong>
     * <p>20.09</p>
     */
    @NameInMap("tax_amt")
    @Validation(required = true)
    public String taxAmt;

    // 税率
    /**
     * <strong>example:</strong>
     * <p>0.06</p>
     */
    @NameInMap("tax_rate")
    @Validation(required = true)
    public String taxRate;

    // 货物或劳务名称，如 软件服务费201612
    /**
     * <strong>example:</strong>
     * <p>软件服务费201612</p>
     */
    @NameInMap("line_product_name")
    @Validation(required = true)
    public String lineProductName;

    // 不含税金额
    /**
     * <strong>example:</strong>
     * <p>93.24</p>
     */
    @NameInMap("tax_exclusive_amt")
    public String taxExclusiveAmt;

    // 数量
    /**
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("quantity")
    public Long quantity;

    // 单位
    /**
     * <strong>example:</strong>
     * <p>个</p>
     */
    @NameInMap("unit")
    public String unit;

    // 单价
    /**
     * <strong>example:</strong>
     * <p>2.34</p>
     */
    @NameInMap("unit_price")
    public String unitPrice;

    // 规格型号
    /**
     * <strong>example:</strong>
     * <p>规格型号</p>
     */
    @NameInMap("specification_model")
    public String specificationModel;

    // 服务大类
    /**
     * <strong>example:</strong>
     * <p>技术服务费</p>
     */
    @NameInMap("tax_classification_name")
    public String taxClassificationName;

    // 税收分类编号
    /**
     * <strong>example:</strong>
     * <p>344555</p>
     */
    @NameInMap("tax_classification_code")
    public String taxClassificationCode;

    // 货物或劳务名称后缀
    /**
     * <strong>example:</strong>
     * <p>202306</p>
     */
    @NameInMap("product_name_suffix")
    public String productNameSuffix;

    public static InvoiceLineVO build(java.util.Map<String, ?> map) throws Exception {
        InvoiceLineVO self = new InvoiceLineVO();
        return TeaModel.build(map, self);
    }

    public InvoiceLineVO setLineAmt(String lineAmt) {
        this.lineAmt = lineAmt;
        return this;
    }
    public String getLineAmt() {
        return this.lineAmt;
    }

    public InvoiceLineVO setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

    public InvoiceLineVO setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
        return this;
    }
    public String getTaxAmt() {
        return this.taxAmt;
    }

    public InvoiceLineVO setTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    public String getTaxRate() {
        return this.taxRate;
    }

    public InvoiceLineVO setLineProductName(String lineProductName) {
        this.lineProductName = lineProductName;
        return this;
    }
    public String getLineProductName() {
        return this.lineProductName;
    }

    public InvoiceLineVO setTaxExclusiveAmt(String taxExclusiveAmt) {
        this.taxExclusiveAmt = taxExclusiveAmt;
        return this;
    }
    public String getTaxExclusiveAmt() {
        return this.taxExclusiveAmt;
    }

    public InvoiceLineVO setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public InvoiceLineVO setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public InvoiceLineVO setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    public String getUnitPrice() {
        return this.unitPrice;
    }

    public InvoiceLineVO setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
        return this;
    }
    public String getSpecificationModel() {
        return this.specificationModel;
    }

    public InvoiceLineVO setTaxClassificationName(String taxClassificationName) {
        this.taxClassificationName = taxClassificationName;
        return this;
    }
    public String getTaxClassificationName() {
        return this.taxClassificationName;
    }

    public InvoiceLineVO setTaxClassificationCode(String taxClassificationCode) {
        this.taxClassificationCode = taxClassificationCode;
        return this;
    }
    public String getTaxClassificationCode() {
        return this.taxClassificationCode;
    }

    public InvoiceLineVO setProductNameSuffix(String productNameSuffix) {
        this.productNameSuffix = productNameSuffix;
        return this;
    }
    public String getProductNameSuffix() {
        return this.productNameSuffix;
    }

}
