// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class PreviewInvoiceLine extends TeaModel {
    // 货物名称(商品名称)
    /**
     * <strong>example:</strong>
     * <p>技术服务费</p>
     */
    @NameInMap("line_product_name")
    @Validation(required = true)
    public String lineProductName;

    // 税率
    /**
     * <strong>example:</strong>
     * <p>0.13</p>
     */
    @NameInMap("tax_rate")
    @Validation(required = true)
    public String taxRate;

    // 发票行含税金额，单位:元
    /**
     * <strong>example:</strong>
     * <p>102.98</p>
     */
    @NameInMap("line_amt")
    @Validation(required = true)
    public String lineAmt;

    // 币种，默认156
    /**
     * <strong>example:</strong>
     * <p>156</p>
     */
    @NameInMap("ccy")
    public String ccy;

    // 单位
    /**
     * <strong>example:</strong>
     * <p>个</p>
     */
    @NameInMap("measurement_unit")
    public String measurementUnit;

    // 关联的L5商品
    /**
     * <strong>example:</strong>
     * <p>SQBRFSZL601262688</p>
     */
    @NameInMap("relate_commodity_code")
    @Validation(required = true)
    public String relateCommodityCode;

    // 服务类型 如：AFTECH_SERVICE
    /**
     * <strong>example:</strong>
     * <p>AFTECH_SERVICE</p>
     */
    @NameInMap("service_mode")
    public String serviceMode;

    // 规格型号
    /**
     * <strong>example:</strong>
     * <p>规格型号</p>
     */
    @NameInMap("product_specification")
    public String productSpecification;

    public static PreviewInvoiceLine build(java.util.Map<String, ?> map) throws Exception {
        PreviewInvoiceLine self = new PreviewInvoiceLine();
        return TeaModel.build(map, self);
    }

    public PreviewInvoiceLine setLineProductName(String lineProductName) {
        this.lineProductName = lineProductName;
        return this;
    }
    public String getLineProductName() {
        return this.lineProductName;
    }

    public PreviewInvoiceLine setTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    public String getTaxRate() {
        return this.taxRate;
    }

    public PreviewInvoiceLine setLineAmt(String lineAmt) {
        this.lineAmt = lineAmt;
        return this;
    }
    public String getLineAmt() {
        return this.lineAmt;
    }

    public PreviewInvoiceLine setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public PreviewInvoiceLine setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
        return this;
    }
    public String getMeasurementUnit() {
        return this.measurementUnit;
    }

    public PreviewInvoiceLine setRelateCommodityCode(String relateCommodityCode) {
        this.relateCommodityCode = relateCommodityCode;
        return this;
    }
    public String getRelateCommodityCode() {
        return this.relateCommodityCode;
    }

    public PreviewInvoiceLine setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode;
        return this;
    }
    public String getServiceMode() {
        return this.serviceMode;
    }

    public PreviewInvoiceLine setProductSpecification(String productSpecification) {
        this.productSpecification = productSpecification;
        return this;
    }
    public String getProductSpecification() {
        return this.productSpecification;
    }

}
