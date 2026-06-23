// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class DeductOmsField extends TeaModel {
    // 抵扣的资源包商品
    /**
     * <strong>example:</strong>
     * <p>testcode</p>
     */
    @NameInMap("product_code")
    public String productCode;

    // 计量项列表
    @NameInMap("oms_field")
    public java.util.List<String> omsField;

    public static DeductOmsField build(java.util.Map<String, ?> map) throws Exception {
        DeductOmsField self = new DeductOmsField();
        return TeaModel.build(map, self);
    }

    public DeductOmsField setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DeductOmsField setOmsField(java.util.List<String> omsField) {
        this.omsField = omsField;
        return this;
    }
    public java.util.List<String> getOmsField() {
        return this.omsField;
    }

}
