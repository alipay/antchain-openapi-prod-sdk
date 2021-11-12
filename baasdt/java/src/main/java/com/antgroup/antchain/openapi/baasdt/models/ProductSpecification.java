// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ProductSpecification extends TeaModel {
    // 规格名称
    @NameInMap("specification_name")
    @Validation(required = true)
    public String specificationName;

    // 规格值
    @NameInMap("specification_value")
    @Validation(required = true)
    public String specificationValue;

    public static ProductSpecification build(java.util.Map<String, ?> map) throws Exception {
        ProductSpecification self = new ProductSpecification();
        return TeaModel.build(map, self);
    }

    public ProductSpecification setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

    public ProductSpecification setSpecificationValue(String specificationValue) {
        this.specificationValue = specificationValue;
        return this;
    }
    public String getSpecificationValue() {
        return this.specificationValue;
    }

}
