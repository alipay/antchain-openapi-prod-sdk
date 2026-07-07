// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class MaterialDetail extends TeaModel {
    // 物料名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("material_name")
    public String materialName;

    // 供应商产品详情列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("supplier_product_list")
    public SupplierProductDetail supplierProductList;

    public static MaterialDetail build(java.util.Map<String, ?> map) throws Exception {
        MaterialDetail self = new MaterialDetail();
        return TeaModel.build(map, self);
    }

    public MaterialDetail setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public MaterialDetail setSupplierProductList(SupplierProductDetail supplierProductList) {
        this.supplierProductList = supplierProductList;
        return this;
    }
    public SupplierProductDetail getSupplierProductList() {
        return this.supplierProductList;
    }

}
