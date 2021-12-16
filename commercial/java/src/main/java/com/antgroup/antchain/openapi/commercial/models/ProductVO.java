// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ProductVO extends TeaModel {
    // 商品Code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 产品oxm类型
    @NameInMap("oxm_type")
    @Validation(required = true)
    public String oxmType;

    // 产品描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    public static ProductVO build(java.util.Map<String, ?> map) throws Exception {
        ProductVO self = new ProductVO();
        return TeaModel.build(map, self);
    }

    public ProductVO setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ProductVO setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ProductVO setOxmType(String oxmType) {
        this.oxmType = oxmType;
        return this;
    }
    public String getOxmType() {
        return this.oxmType;
    }

    public ProductVO setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
