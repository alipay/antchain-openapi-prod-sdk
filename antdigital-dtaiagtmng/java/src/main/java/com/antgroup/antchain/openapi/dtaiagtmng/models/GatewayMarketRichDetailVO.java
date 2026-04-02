// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagtmng.models;

import com.aliyun.tea.*;

public class GatewayMarketRichDetailVO extends TeaModel {
    // 市场条目 ID
    /**
     * <strong>example:</strong>
     * <p>市场条目 ID</p>
     */
    @NameInMap("id")
    public Long id;

    // 资产类型（skill / package / agent / workflow / tool / card / mcp）
    /**
     * <strong>example:</strong>
     * <p>资产类型（skill / package / agent / workflow / tool / card / mcp）</p>
     */
    @NameInMap("type")
    public String type;

    // 名称
    /**
     * <strong>example:</strong>
     * <p>名称</p>
     */
    @NameInMap("name")
    public String name;

    // 描述
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    // ref_id
    /**
     * <strong>example:</strong>
     * <p>ref_id</p>
     */
    @NameInMap("ref_id")
    public Long refId;

    // tags
    /**
     * <strong>example:</strong>
     * <p>tags</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    // labels
    /**
     * <strong>example:</strong>
     * <p>labels</p>
     */
    @NameInMap("labels")
    public java.util.List<String> labels;

    // creator
    /**
     * <strong>example:</strong>
     * <p>creator</p>
     */
    @NameInMap("creator")
    public String creator;

    // download_count
    /**
     * <strong>example:</strong>
     * <p>download_count</p>
     */
    @NameInMap("download_count")
    public Long downloadCount;

    // view_count
    /**
     * <strong>example:</strong>
     * <p>view_count</p>
     */
    @NameInMap("view_count")
    public Long viewCount;

    // subscription_count
    /**
     * <strong>example:</strong>
     * <p>subscription_count</p>
     */
    @NameInMap("subscription_count")
    public Long subscriptionCount;

    // recommend_flag
    /**
     * <strong>example:</strong>
     * <p>recommend_flag</p>
     */
    @NameInMap("recommend_flag")
    public Boolean recommendFlag;

    // status
    /**
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("status")
    public String status;

    // subscription_status
    /**
     * <strong>example:</strong>
     * <p>subscription_status</p>
     */
    @NameInMap("subscription_status")
    public String subscriptionStatus;

    // channels
    /**
     * <strong>example:</strong>
     * <p>channels</p>
     */
    @NameInMap("channels")
    public String channels;

    // downloadable
    /**
     * <strong>example:</strong>
     * <p>downloadable</p>
     */
    @NameInMap("downloadable")
    public Boolean downloadable;

    // gmt_create
    /**
     * <strong>example:</strong>
     * <p>gmt_create</p>
     */
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    /**
     * <strong>example:</strong>
     * <p>gmt_modified</p>
     */
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // version
    /**
     * <strong>example:</strong>
     * <p>version</p>
     */
    @NameInMap("version")
    public String version;

    // source
    /**
     * <strong>example:</strong>
     * <p>source</p>
     */
    @NameInMap("source")
    public String source;

    // meta
    /**
     * <strong>example:</strong>
     * <p>meta</p>
     */
    @NameInMap("meta")
    public String meta;

    // ext
    /**
     * <strong>example:</strong>
     * <p>ext</p>
     */
    @NameInMap("ext")
    public String ext;

    // modifier
    /**
     * <strong>example:</strong>
     * <p>modifier</p>
     */
    @NameInMap("modifier")
    public String modifier;

    // download_url
    /**
     * <strong>example:</strong>
     * <p>download_url</p>
     */
    @NameInMap("download_url")
    public String downloadUrl;

    // ext_parsed
    /**
     * <strong>example:</strong>
     * <p>ext_parsed</p>
     */
    @NameInMap("ext_parsed")
    public String extParsed;

    public static GatewayMarketRichDetailVO build(java.util.Map<String, ?> map) throws Exception {
        GatewayMarketRichDetailVO self = new GatewayMarketRichDetailVO();
        return TeaModel.build(map, self);
    }

    public GatewayMarketRichDetailVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GatewayMarketRichDetailVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GatewayMarketRichDetailVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GatewayMarketRichDetailVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GatewayMarketRichDetailVO setRefId(Long refId) {
        this.refId = refId;
        return this;
    }
    public Long getRefId() {
        return this.refId;
    }

    public GatewayMarketRichDetailVO setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public GatewayMarketRichDetailVO setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public GatewayMarketRichDetailVO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GatewayMarketRichDetailVO setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    public Long getDownloadCount() {
        return this.downloadCount;
    }

    public GatewayMarketRichDetailVO setViewCount(Long viewCount) {
        this.viewCount = viewCount;
        return this;
    }
    public Long getViewCount() {
        return this.viewCount;
    }

    public GatewayMarketRichDetailVO setSubscriptionCount(Long subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
        return this;
    }
    public Long getSubscriptionCount() {
        return this.subscriptionCount;
    }

    public GatewayMarketRichDetailVO setRecommendFlag(Boolean recommendFlag) {
        this.recommendFlag = recommendFlag;
        return this;
    }
    public Boolean getRecommendFlag() {
        return this.recommendFlag;
    }

    public GatewayMarketRichDetailVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GatewayMarketRichDetailVO setSubscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
        return this;
    }
    public String getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    public GatewayMarketRichDetailVO setChannels(String channels) {
        this.channels = channels;
        return this;
    }
    public String getChannels() {
        return this.channels;
    }

    public GatewayMarketRichDetailVO setDownloadable(Boolean downloadable) {
        this.downloadable = downloadable;
        return this;
    }
    public Boolean getDownloadable() {
        return this.downloadable;
    }

    public GatewayMarketRichDetailVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GatewayMarketRichDetailVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GatewayMarketRichDetailVO setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GatewayMarketRichDetailVO setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GatewayMarketRichDetailVO setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public GatewayMarketRichDetailVO setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public GatewayMarketRichDetailVO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public GatewayMarketRichDetailVO setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GatewayMarketRichDetailVO setExtParsed(String extParsed) {
        this.extParsed = extParsed;
        return this;
    }
    public String getExtParsed() {
        return this.extParsed;
    }

}
