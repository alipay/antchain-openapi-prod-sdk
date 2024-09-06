// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class SmsMaterial extends TeaModel {
    // 素材名称
    @NameInMap("material_name")
    public String materialName;

    // 素材类型
    @NameInMap("material_type")
    @Validation(required = true)
    public String materialType;

    // 素材内容
    @NameInMap("material_content")
    @Validation(required = true)
    public String materialContent;

    public static SmsMaterial build(java.util.Map<String, ?> map) throws Exception {
        SmsMaterial self = new SmsMaterial();
        return TeaModel.build(map, self);
    }

    public SmsMaterial setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public SmsMaterial setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public SmsMaterial setMaterialContent(String materialContent) {
        this.materialContent = materialContent;
        return this;
    }
    public String getMaterialContent() {
        return this.materialContent;
    }

}
