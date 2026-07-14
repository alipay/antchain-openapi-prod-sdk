// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class InvoiceMaterialVO extends TeaModel {
    // 发票介质，01: 电子发票; 02: 纸质发票
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("material")
    @Validation(required = true)
    public String material;

    // 名称
    /**
     * <strong>example:</strong>
     * <p>电子发票</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static InvoiceMaterialVO build(java.util.Map<String, ?> map) throws Exception {
        InvoiceMaterialVO self = new InvoiceMaterialVO();
        return TeaModel.build(map, self);
    }

    public InvoiceMaterialVO setMaterial(String material) {
        this.material = material;
        return this;
    }
    public String getMaterial() {
        return this.material;
    }

    public InvoiceMaterialVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
