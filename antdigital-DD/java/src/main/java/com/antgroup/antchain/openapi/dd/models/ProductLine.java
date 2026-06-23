// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ProductLine extends TeaModel {
    // 溯源产品
    /**
     * <strong>example:</strong>
     * <p>10051</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 产品线名称
    /**
     * <strong>example:</strong>
     * <p>溯源产品</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 业务产品线code
    /**
     * <strong>example:</strong>
     * <p>10010</p>
     */
    @NameInMap("business_line_code")
    @Validation(required = true)
    public String businessLineCode;

    // l3
    @NameInMap("business_product")
    @Validation(required = true)
    public java.util.List<BusinessProduct> businessProduct;

    public static ProductLine build(java.util.Map<String, ?> map) throws Exception {
        ProductLine self = new ProductLine();
        return TeaModel.build(map, self);
    }

    public ProductLine setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProductLine setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProductLine setBusinessLineCode(String businessLineCode) {
        this.businessLineCode = businessLineCode;
        return this;
    }
    public String getBusinessLineCode() {
        return this.businessLineCode;
    }

    public ProductLine setBusinessProduct(java.util.List<BusinessProduct> businessProduct) {
        this.businessProduct = businessProduct;
        return this;
    }
    public java.util.List<BusinessProduct> getBusinessProduct() {
        return this.businessProduct;
    }

}
