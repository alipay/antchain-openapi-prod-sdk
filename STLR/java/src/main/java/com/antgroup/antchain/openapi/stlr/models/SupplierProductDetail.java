// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class SupplierProductDetail extends TeaModel {
    // 供应商名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("supplier_name")
    public String supplierName;

    // 供应商产品名称
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("supplier_product_name")
    public String supplierProductName;

    // 填报单位
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("dosage_unit")
    public String dosageUnit;

    public static SupplierProductDetail build(java.util.Map<String, ?> map) throws Exception {
        SupplierProductDetail self = new SupplierProductDetail();
        return TeaModel.build(map, self);
    }

    public SupplierProductDetail setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public SupplierProductDetail setSupplierProductName(String supplierProductName) {
        this.supplierProductName = supplierProductName;
        return this;
    }
    public String getSupplierProductName() {
        return this.supplierProductName;
    }

    public SupplierProductDetail setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
        return this;
    }
    public String getDosageUnit() {
        return this.dosageUnit;
    }

}
