// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class CreativeAssetRef extends TeaModel {
    // 素材来源
    /**
     * <strong>example:</strong>
     * <p>URL</p>
     */
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 素材ID，只有素材来源于creative的素材库中才需要填入
    /**
     * <strong>example:</strong>
     * <p>5bf62f7dd73b4efa8dea7a2665cd2173</p>
     */
    @NameInMap("material_id")
    public String materialId;

    // 可公网访问的素材url地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://mdn.alipayobjects.com/wofi_creative/afts/file/80mwSruGUE4AAAAAAAAAAAAA-FZ4AQJr">https://mdn.alipayobjects.com/wofi_creative/afts/file/80mwSruGUE4AAAAAAAAAAAAA-FZ4AQJr</a></p>
     */
    @NameInMap("url")
    public String url;

    // 使用提示
    /**
     * <strong>example:</strong>
     * <p>二维码保持清晰</p>
     */
    @NameInMap("usage_hint")
    public String usageHint;

    public static CreativeAssetRef build(java.util.Map<String, ?> map) throws Exception {
        CreativeAssetRef self = new CreativeAssetRef();
        return TeaModel.build(map, self);
    }

    public CreativeAssetRef setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreativeAssetRef setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public CreativeAssetRef setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreativeAssetRef setUsageHint(String usageHint) {
        this.usageHint = usageHint;
        return this;
    }
    public String getUsageHint() {
        return this.usageHint;
    }

}
