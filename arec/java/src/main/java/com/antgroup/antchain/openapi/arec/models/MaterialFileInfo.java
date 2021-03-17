// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class MaterialFileInfo extends TeaModel {
    // 文件路径
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    // 材料ID，默认值为2，代表身份证明
    @NameInMap("material_id")
    @Validation(required = true)
    public String materialId;

    // 材料名称
    @NameInMap("material_name")
    @Validation(required = true)
    public String materialName;

    // 材料类型，取值范围：1--申请文件，2--业务表格，3--证照，4--申请人像，5--受理回执单 ，6--缴款通知书，7--抵押登记证明，8--原证照，9--银行内部审批材料，10--网上申办凭证
    @NameInMap("material_type")
    public String materialType;

    // 材料类别，取值范围：1--原件，2--复印件，3--原件和复印件，4--申请人像，10--原证照 
    @NameInMap("material_category")
    public String materialCategory;

    // 材料份数
    @NameInMap("copies_number")
    @Validation(required = true)
    public Long copiesNumber;

    // 材料页数
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    public static MaterialFileInfo build(java.util.Map<String, ?> map) throws Exception {
        MaterialFileInfo self = new MaterialFileInfo();
        return TeaModel.build(map, self);
    }

    public MaterialFileInfo setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public MaterialFileInfo setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public MaterialFileInfo setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public MaterialFileInfo setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public MaterialFileInfo setMaterialCategory(String materialCategory) {
        this.materialCategory = materialCategory;
        return this;
    }
    public String getMaterialCategory() {
        return this.materialCategory;
    }

    public MaterialFileInfo setCopiesNumber(Long copiesNumber) {
        this.copiesNumber = copiesNumber;
        return this;
    }
    public Long getCopiesNumber() {
        return this.copiesNumber;
    }

    public MaterialFileInfo setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

}
