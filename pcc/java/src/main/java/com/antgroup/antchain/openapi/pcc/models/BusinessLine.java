// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class BusinessLine extends TeaModel {
    // 产品线code
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 1级产品线name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // L2
    @NameInMap("product_line")
    @Validation(required = true)
    public java.util.List<ProductLine> productLine;

    public static BusinessLine build(java.util.Map<String, ?> map) throws Exception {
        BusinessLine self = new BusinessLine();
        return TeaModel.build(map, self);
    }

    public BusinessLine setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BusinessLine setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BusinessLine setProductLine(java.util.List<ProductLine> productLine) {
        this.productLine = productLine;
        return this;
    }
    public java.util.List<ProductLine> getProductLine() {
        return this.productLine;
    }

}
