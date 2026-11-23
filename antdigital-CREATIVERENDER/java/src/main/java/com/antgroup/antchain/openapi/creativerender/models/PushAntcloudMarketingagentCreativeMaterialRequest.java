// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class PushAntcloudMarketingagentCreativeMaterialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // string
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 产品类型
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 素材用途
    @NameInMap("material_usage")
    @Validation(required = true)
    public String materialUsage;

    // 素材形式（单个素材还是素材包）
    @NameInMap("material_form")
    @Validation(required = true)
    public String materialForm;

    // 素材文件格式
    @NameInMap("material_type")
    @Validation(required = true)
    public String materialType;

    // 素材空间类型（平台空间、企业空间、个人空间），不同空间下权限不一样
    @NameInMap("space_type")
    @Validation(required = true)
    public String spaceType;

    // 后续要做 AI 解析就要传,单文件音视频时长
    @NameInMap("duration_seconds")
    public String durationSeconds;

    // 素材名， 不传用文件名
    @NameInMap("name")
    public String name;

    // 使用场景编码
    @NameInMap("scene")
    public String scene;

    // 行业编码
    @NameInMap("industry")
    public String industry;

    // 多个投放平台编码用英文逗号分隔
    @NameInMap("publish_platforms")
    public String publishPlatforms;

    // 生图模板复用时回填的提示词；仅 GENERATION_TEMPLATE 使用
    @NameInMap("prompt")
    public String prompt;

    // 单文件视频缩略图 AFTS fileId
    @NameInMap("thumbnail_fileid")
    public String thumbnailFileid;

    // 封面文件下标，从 0 开始；素材包默认 0
    @NameInMap("cover_index")
    public Long coverIndex;

    // 视频缩略图的受管 OSS 路径
    @NameInMap("thumbnail_oss_path")
    public String thumbnailOssPath;

    // 逐文件媒体信息，传 JSON 数组字符串；素材包的时长和缩略图从这里取
    @NameInMap("metadata")
    public String metadata;

    // 从生成结果保存时必传
    @NameInMap("source_message_id")
    public String sourceMessageId;

    // 1，选第二个生成结果；默认 0
    @NameInMap("source_result_index")
    public Long sourceResultIndex;

    // 来源消息保存时必传；普通上传选填
    @NameInMap("template_data")
    public MaterialTemplateData templateData;

    // 模版json
    @NameInMap("item_templates_json")
    public String itemTemplatesJson;

    public static PushAntcloudMarketingagentCreativeMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAntcloudMarketingagentCreativeMaterialRequest self = new PushAntcloudMarketingagentCreativeMaterialRequest();
        return TeaModel.build(map, self);
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setMaterialUsage(String materialUsage) {
        this.materialUsage = materialUsage;
        return this;
    }
    public String getMaterialUsage() {
        return this.materialUsage;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setMaterialForm(String materialForm) {
        this.materialForm = materialForm;
        return this;
    }
    public String getMaterialForm() {
        return this.materialForm;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setDurationSeconds(String durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public String getDurationSeconds() {
        return this.durationSeconds;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setPublishPlatforms(String publishPlatforms) {
        this.publishPlatforms = publishPlatforms;
        return this;
    }
    public String getPublishPlatforms() {
        return this.publishPlatforms;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setThumbnailFileid(String thumbnailFileid) {
        this.thumbnailFileid = thumbnailFileid;
        return this;
    }
    public String getThumbnailFileid() {
        return this.thumbnailFileid;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setCoverIndex(Long coverIndex) {
        this.coverIndex = coverIndex;
        return this;
    }
    public Long getCoverIndex() {
        return this.coverIndex;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setThumbnailOssPath(String thumbnailOssPath) {
        this.thumbnailOssPath = thumbnailOssPath;
        return this;
    }
    public String getThumbnailOssPath() {
        return this.thumbnailOssPath;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setSourceMessageId(String sourceMessageId) {
        this.sourceMessageId = sourceMessageId;
        return this;
    }
    public String getSourceMessageId() {
        return this.sourceMessageId;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setSourceResultIndex(Long sourceResultIndex) {
        this.sourceResultIndex = sourceResultIndex;
        return this;
    }
    public Long getSourceResultIndex() {
        return this.sourceResultIndex;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setTemplateData(MaterialTemplateData templateData) {
        this.templateData = templateData;
        return this;
    }
    public MaterialTemplateData getTemplateData() {
        return this.templateData;
    }

    public PushAntcloudMarketingagentCreativeMaterialRequest setItemTemplatesJson(String itemTemplatesJson) {
        this.itemTemplatesJson = itemTemplatesJson;
        return this;
    }
    public String getItemTemplatesJson() {
        return this.itemTemplatesJson;
    }

}
