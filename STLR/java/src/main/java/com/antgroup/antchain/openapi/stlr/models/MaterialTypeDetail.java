// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class MaterialTypeDetail extends TeaModel {
    // 物料类型名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("material_type")
    public String materialType;

    // 物料产品详情表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("material_list")
    public java.util.List<MaterialDetail> materialList;

    public static MaterialTypeDetail build(java.util.Map<String, ?> map) throws Exception {
        MaterialTypeDetail self = new MaterialTypeDetail();
        return TeaModel.build(map, self);
    }

    public MaterialTypeDetail setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public MaterialTypeDetail setMaterialList(java.util.List<MaterialDetail> materialList) {
        this.materialList = materialList;
        return this;
    }
    public java.util.List<MaterialDetail> getMaterialList() {
        return this.materialList;
    }

}
