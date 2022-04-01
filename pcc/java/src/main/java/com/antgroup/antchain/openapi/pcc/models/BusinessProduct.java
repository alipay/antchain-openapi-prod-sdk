// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class BusinessProduct extends TeaModel {
    // 业务产品code
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 产品线名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 归属业务线
    @NameInMap("business_line")
    @Validation(required = true)
    public String businessLine;

    // 归属产品线
    @NameInMap("product_line")
    @Validation(required = true)
    public String productLine;

    // spu列表
    @NameInMap("product_spu")
    @Validation(required = true)
    public java.util.List<ProductSpu> productSpu;

    public static BusinessProduct build(java.util.Map<String, ?> map) throws Exception {
        BusinessProduct self = new BusinessProduct();
        return TeaModel.build(map, self);
    }

    public BusinessProduct setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BusinessProduct setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BusinessProduct setBusinessLine(String businessLine) {
        this.businessLine = businessLine;
        return this;
    }
    public String getBusinessLine() {
        return this.businessLine;
    }

    public BusinessProduct setProductLine(String productLine) {
        this.productLine = productLine;
        return this;
    }
    public String getProductLine() {
        return this.productLine;
    }

    public BusinessProduct setProductSpu(java.util.List<ProductSpu> productSpu) {
        this.productSpu = productSpu;
        return this;
    }
    public java.util.List<ProductSpu> getProductSpu() {
        return this.productSpu;
    }

}
