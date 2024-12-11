// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class Supplier extends TeaModel {
    // 供应商id
    @NameInMap("supplier_id")
    @Validation(required = true)
    public String supplierId;

    // 供应商名字
    @NameInMap("supplier_name")
    @Validation(required = true)
    public String supplierName;

    public static Supplier build(java.util.Map<String, ?> map) throws Exception {
        Supplier self = new Supplier();
        return TeaModel.build(map, self);
    }

    public Supplier setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public Supplier setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

}
