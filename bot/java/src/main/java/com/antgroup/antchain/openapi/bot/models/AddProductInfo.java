// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddProductInfo extends TeaModel {
    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 产品描述
    @NameInMap("remark")
    public String remark;

    public static AddProductInfo build(java.util.Map<String, ?> map) throws Exception {
        AddProductInfo self = new AddProductInfo();
        return TeaModel.build(map, self);
    }

    public AddProductInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public AddProductInfo setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddProductInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
