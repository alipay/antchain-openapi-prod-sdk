// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class OfferMaster extends TeaModel {
    // 内部商品码
    /**
     * <strong>example:</strong>
     * <p>baas_pre</p>
     */
    @NameInMap("inner_code")
    @Validation(required = true)
    public String innerCode;

    // 用于展示的格式化商品编码
    /**
     * <strong>example:</strong>
     * <p>PBC0000C013P-R</p>
     */
    @NameInMap("format_code")
    @Validation(required = true)
    public String formatCode;

    // 外部商品编码
    /**
     * <strong>example:</strong>
     * <p>baas_pre</p>
     */
    @NameInMap("outer_code")
    @Validation(required = true)
    public String outerCode;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>蚂蚁链BaaS平台（包年包月）</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 商品描述
    /**
     * <strong>example:</strong>
     * <p>商品描述</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 产品code
    /**
     * <strong>example:</strong>
     * <p>productCode</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 渠道产品编码
    /**
     * <strong>example:</strong>
     * <p>TWCBAG</p>
     */
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // l4编码
    /**
     * <strong>example:</strong>
     * <p>MSRJSPU00000028</p>
     */
    @NameInMap("spu_code")
    @Validation(required = true)
    public String spuCode;

    public static OfferMaster build(java.util.Map<String, ?> map) throws Exception {
        OfferMaster self = new OfferMaster();
        return TeaModel.build(map, self);
    }

    public OfferMaster setInnerCode(String innerCode) {
        this.innerCode = innerCode;
        return this;
    }
    public String getInnerCode() {
        return this.innerCode;
    }

    public OfferMaster setFormatCode(String formatCode) {
        this.formatCode = formatCode;
        return this;
    }
    public String getFormatCode() {
        return this.formatCode;
    }

    public OfferMaster setOuterCode(String outerCode) {
        this.outerCode = outerCode;
        return this;
    }
    public String getOuterCode() {
        return this.outerCode;
    }

    public OfferMaster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OfferMaster setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OfferMaster setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public OfferMaster setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public OfferMaster setSpuCode(String spuCode) {
        this.spuCode = spuCode;
        return this;
    }
    public String getSpuCode() {
        return this.spuCode;
    }

}
