// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class CreativeMaterial extends TeaModel {
    // Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
    /**
     * <strong>example:</strong>
     * <p>RETAIL</p>
     */
    @NameInMap("product_code")
    public String productCode;

    // 素材ID
    /**
     * <strong>example:</strong>
     * <p>d55ad74641ce8895ad1321e8b36c4d70</p>
     */
    @NameInMap("material_id")
    public String materialId;

    // 素材类型，如 IMAGE / ANIMATION / FONT
    /**
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("material_type")
    public String materialType;

    // 素材形式（SINGLE/PACKAGE）
    /**
     * <strong>example:</strong>
     * <p>SINGLE</p>
     */
    @NameInMap("material_form")
    public String materialForm;

    // 父素材ID
    /**
     * <strong>example:</strong>
     * <p>c96a7673a96a4178809f6c0f4da40558</p>
     */
    @NameInMap("parent_material_id")
    public String parentMaterialId;

    // 是否为封面
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("cover")
    public Boolean cover;

    // 素材名称
    /**
     * <strong>example:</strong>
     * <p>海报</p>
     */
    @NameInMap("name")
    public String name;

    // 素材文件URL
    /**
     * <strong>example:</strong>
     * <p>creative/20260909/sample.jpg</p>
     */
    @NameInMap("file_url")
    public String fileUrl;

    // 宽度（像素）
    /**
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("width")
    public Long width;

    // 高度（像素）
    /**
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("height")
    public Long height;

    // 字体族名（仅 FONT 类型）
    /**
     * <strong>example:</strong>
     * <p>DEMO_FONT</p>
     */
    @NameInMap("font_family")
    public String fontFamily;

    // 使用场景
    /**
     * <strong>example:</strong>
     * <p>BANNER</p>
     */
    @NameInMap("scene")
    public String scene;

    // 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
    /**
     * <strong>example:</strong>
     * <p>REFERENCE_STYLE</p>
     */
    @NameInMap("material_usage")
    public String materialUsage;

    // RETAIL
    /**
     * <strong>example:</strong>
     * <p>行业</p>
     */
    @NameInMap("industry")
    public String industry;

    // 投放平台，多个值使用英文逗号分隔
    /**
     * <strong>example:</strong>
     * <p>ALIPAY</p>
     */
    @NameInMap("publish_platforms")
    public String publishPlatforms;

    // 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
    /**
     * <strong>example:</strong>
     * <p>9:16</p>
     */
    @NameInMap("material_size_type")
    public String materialSizeType;

    // 空间类型：PERSONAL / ENTERPRISE
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("space_type")
    public String spaceType;

    // 所有者名称
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("owner_name")
    public String ownerName;

    // 创建时间，格式 yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2026-09-21 12:00:00</p>
     */
    @NameInMap("gmt_create")
    public String gmtCreate;

    public static CreativeMaterial build(java.util.Map<String, ?> map) throws Exception {
        CreativeMaterial self = new CreativeMaterial();
        return TeaModel.build(map, self);
    }

    public CreativeMaterial setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreativeMaterial setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public CreativeMaterial setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public CreativeMaterial setMaterialForm(String materialForm) {
        this.materialForm = materialForm;
        return this;
    }
    public String getMaterialForm() {
        return this.materialForm;
    }

    public CreativeMaterial setParentMaterialId(String parentMaterialId) {
        this.parentMaterialId = parentMaterialId;
        return this;
    }
    public String getParentMaterialId() {
        return this.parentMaterialId;
    }

    public CreativeMaterial setCover(Boolean cover) {
        this.cover = cover;
        return this;
    }
    public Boolean getCover() {
        return this.cover;
    }

    public CreativeMaterial setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreativeMaterial setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreativeMaterial setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public CreativeMaterial setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public CreativeMaterial setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }
    public String getFontFamily() {
        return this.fontFamily;
    }

    public CreativeMaterial setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreativeMaterial setMaterialUsage(String materialUsage) {
        this.materialUsage = materialUsage;
        return this;
    }
    public String getMaterialUsage() {
        return this.materialUsage;
    }

    public CreativeMaterial setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CreativeMaterial setPublishPlatforms(String publishPlatforms) {
        this.publishPlatforms = publishPlatforms;
        return this;
    }
    public String getPublishPlatforms() {
        return this.publishPlatforms;
    }

    public CreativeMaterial setMaterialSizeType(String materialSizeType) {
        this.materialSizeType = materialSizeType;
        return this;
    }
    public String getMaterialSizeType() {
        return this.materialSizeType;
    }

    public CreativeMaterial setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public CreativeMaterial setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public CreativeMaterial setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

}
