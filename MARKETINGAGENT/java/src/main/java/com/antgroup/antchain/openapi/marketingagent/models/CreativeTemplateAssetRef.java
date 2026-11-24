// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class CreativeTemplateAssetRef extends TeaModel {
    // 与 prompt 里的 @{商品图,ref-01} 对应
    /**
     * <strong>example:</strong>
     * <p>ref-01</p>
     */
    @NameInMap("entity_id")
    @Validation(required = true)
    public String entityId;

    // 对应列表类型：`IMAGE`、`AUDIO` 或 VIDEO
    /**
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("material_type")
    @Validation(required = true)
    public String materialType;

    // 来源类型：`MATERIAL`、`AFTS`、`OSS` 或 URL
    /**
     * <strong>example:</strong>
     * <p>MATERIAL</p>
     */
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 来源定位值；`sourceType=MATERIAL` 时填平台素材 ID
    /**
     * <strong>example:</strong>
     * <p>material-image-demo-001</p>
     */
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 用途提示，可省略
    /**
     * <strong>example:</strong>
     * <p>参考商品外观</p>
     */
    @NameInMap("usage_hint")
    public String usageHint;

    public static CreativeTemplateAssetRef build(java.util.Map<String, ?> map) throws Exception {
        CreativeTemplateAssetRef self = new CreativeTemplateAssetRef();
        return TeaModel.build(map, self);
    }

    public CreativeTemplateAssetRef setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreativeTemplateAssetRef setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public CreativeTemplateAssetRef setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreativeTemplateAssetRef setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreativeTemplateAssetRef setUsageHint(String usageHint) {
        this.usageHint = usageHint;
        return this;
    }
    public String getUsageHint() {
        return this.usageHint;
    }

}
