// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class CreativeVideoAssetRef extends TeaModel {
    // prompt 中 @{名称,entityId} 对应的实体 ID；同一实体可跨图片、音频、视频复用。
    /**
     * <strong>example:</strong>
     * <p>e-44b6e1086a08</p>
     */
    @NameInMap("entity_id")
    @Validation(required = true)
    public String entityId;

    // 素材类型：IMAGE、AUDIO、VIDEO。
    /**
     * <strong>example:</strong>
     * <p>VIDEO</p>
     */
    @NameInMap("material_type")
    @Validation(required = true)
    public String materialType;

    // 素材来源：MATERIAL（素材库）、AFTS（本地上传）、URL（外部可访问地址）。OpenAPI 支持 URL，与 input_elements 一致；后端需解析/转存后再交算法。
    /**
     * <strong>example:</strong>
     * <p>URL</p>
     */
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 由 source_type 决定：MATERIAL 传 materialId；AFTS 传 /creative/file/upload 返回的 fileId；URL 传外部可访问的绝对 http/https URL。
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/ref.mp4">https://example.com/ref.mp4</a></p>
     */
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 前端展示名称，不作为生成校验依据。
    /**
     * <strong>example:</strong>
     * <p>小王</p>
     */
    @NameInMap("name")
    public String name;

    // 文件大小快照，单位字节；AFTS 来源必填，由前端传入。
    /**
     * <strong>example:</strong>
     * <p>1048576</p>
     */
    @NameInMap("size_bytes")
    public Long sizeBytes;

    // 音视频时长快照，单位秒；AFTS 音频、视频必填。
    /**
     * <strong>example:</strong>
     * <p>5.06</p>
     */
    @NameInMap("duration_seconds")
    public Long durationSeconds;

    // 视频缩略图 AFTS 文件 ID，可由 /creative/file/upload 返回的 fileId 提供。
    /**
     * <strong>example:</strong>
     * <p>thumb-file-id</p>
     */
    @NameInMap("thumbnail_file_id")
    public String thumbnailFileId;

    public static CreativeVideoAssetRef build(java.util.Map<String, ?> map) throws Exception {
        CreativeVideoAssetRef self = new CreativeVideoAssetRef();
        return TeaModel.build(map, self);
    }

    public CreativeVideoAssetRef setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreativeVideoAssetRef setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public CreativeVideoAssetRef setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreativeVideoAssetRef setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreativeVideoAssetRef setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreativeVideoAssetRef setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }
    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    public CreativeVideoAssetRef setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public CreativeVideoAssetRef setThumbnailFileId(String thumbnailFileId) {
        this.thumbnailFileId = thumbnailFileId;
        return this;
    }
    public String getThumbnailFileId() {
        return this.thumbnailFileId;
    }

}
