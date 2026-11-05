// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class WebItem extends TeaModel {
    // 搜索结果唯一标识
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 内容唯一标识，用于内容去重与引用
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("content_id")
    @Validation(required = true)
    public String contentId;

    // 结果排序位置，从 1 开始
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sort_id")
    @Validation(required = true)
    public Long sortId;

    // 结果标题
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 来源站点名称
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("site_name")
    public String siteName;

    // 与 Query 相关的已有摘要，适合模型上下文。include_summary=true 且有可用摘要时返回；false 时省略，不触发在线摘要生成。
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("summary")
    public String summary;

    // 清洗后的正文；include_content=true 且当前 mode 有可用正文时返回。standard 默认返回可用正文；fast 预设不返回，pro 预设按需返回。include_content=false 时省略，不改变检索、排序。
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("content")
    public String content;

    // 网页发布时间，ISO 8601 格式
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("publish_time")
    public String publishTime;

    // 作者或发布机构
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("author")
    public String author;

    // 来源站点图标链接
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("logo_url")
    public String logoUrl;

    // 仅在实际返回 Content 时返回正文格式，当前为 text；include_content=false 或无正文时省略。
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("content_formats")
    public String contentFormats;

    // 可信等级，取值低/中/高
    /**
     * <strong>example:</strong>
     * <p>中</p>
     */
    @NameInMap("trusty_level")
    @Validation(required = true)
    public String trustyLevel;

    // 网页或 PDF 的原文链接，均必返。
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    public static WebItem build(java.util.Map<String, ?> map) throws Exception {
        WebItem self = new WebItem();
        return TeaModel.build(map, self);
    }

    public WebItem setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WebItem setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public WebItem setSortId(Long sortId) {
        this.sortId = sortId;
        return this;
    }
    public Long getSortId() {
        return this.sortId;
    }

    public WebItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public WebItem setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public WebItem setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public WebItem setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public WebItem setPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public String getPublishTime() {
        return this.publishTime;
    }

    public WebItem setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public WebItem setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public WebItem setContentFormats(String contentFormats) {
        this.contentFormats = contentFormats;
        return this;
    }
    public String getContentFormats() {
        return this.contentFormats;
    }

    public WebItem setTrustyLevel(String trustyLevel) {
        this.trustyLevel = trustyLevel;
        return this;
    }
    public String getTrustyLevel() {
        return this.trustyLevel;
    }

    public WebItem setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
