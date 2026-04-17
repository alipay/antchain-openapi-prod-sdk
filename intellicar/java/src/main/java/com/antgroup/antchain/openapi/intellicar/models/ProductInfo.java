// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class ProductInfo extends TeaModel {
    // 能源类型
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("fueltype")
    @Validation(required = true)
    public String fueltype;

    // 车型名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 车型id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static ProductInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductInfo self = new ProductInfo();
        return TeaModel.build(map, self);
    }

    public ProductInfo setFueltype(String fueltype) {
        this.fueltype = fueltype;
        return this;
    }
    public String getFueltype() {
        return this.fueltype;
    }

    public ProductInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProductInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
