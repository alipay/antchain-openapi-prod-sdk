// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class OfferMaster extends TeaModel {
    // 内部商品码
    @NameInMap("inner_code")
    @Validation(required = true)
    public String innerCode;

    // 用于展示的格式化商品编码
    @NameInMap("format_code")
    @Validation(required = true)
    public String formatCode;

    // 外部商品编码
    @NameInMap("outer_code")
    @Validation(required = true)
    public String outerCode;

    // 商品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 商品描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 渠道产品编码
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // l4编码
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
