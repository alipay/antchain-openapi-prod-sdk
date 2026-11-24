// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class OpenApiKbInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    // 映射kbName
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 映射kbDescription
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("description")
    public String description;

    // 枚举:OFFICIAL,CUSTOM
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("enable")
    @Validation(required = true)
    public Boolean enable;

    // 映射docCount
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("content_count")
    @Validation(required = true)
    public Long contentCount;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("paragraph_count")
    @Validation(required = true)
    public Long paragraphCount;

    // 沿现有关联查询聚合；不新增版本账本
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("associated_product_keys")
    @Validation(required = true)
    public java.util.List<String> associatedProductKeys;

    public static OpenApiKbInfo build(java.util.Map<String, ?> map) throws Exception {
        OpenApiKbInfo self = new OpenApiKbInfo();
        return TeaModel.build(map, self);
    }

    public OpenApiKbInfo setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public OpenApiKbInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiKbInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpenApiKbInfo setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public OpenApiKbInfo setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public OpenApiKbInfo setContentCount(Long contentCount) {
        this.contentCount = contentCount;
        return this;
    }
    public Long getContentCount() {
        return this.contentCount;
    }

    public OpenApiKbInfo setParagraphCount(Long paragraphCount) {
        this.paragraphCount = paragraphCount;
        return this;
    }
    public Long getParagraphCount() {
        return this.paragraphCount;
    }

    public OpenApiKbInfo setAssociatedProductKeys(java.util.List<String> associatedProductKeys) {
        this.associatedProductKeys = associatedProductKeys;
        return this;
    }
    public java.util.List<String> getAssociatedProductKeys() {
        return this.associatedProductKeys;
    }

}
