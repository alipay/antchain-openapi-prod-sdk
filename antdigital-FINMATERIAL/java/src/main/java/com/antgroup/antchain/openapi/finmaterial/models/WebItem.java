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

    // 网页原文链接；PDF 等无原文链接的结果可能不返回该字段。filter.need_url 为预留参数，当前不生效
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("url")
    public String url;

    // 与 Query 相关的网页摘要，适合模型上下文
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("summary")
    @Validation(required = true)
    public String summary;

    // 清洗后的网页正文，按 mode 返回；auto 默认返回可用正文，fast 预设不返回，pro 预设按需返回
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

    // 随 Content 返回正文实际格式，当前为 text；未返回 Content 时省略
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("content_formats")
    public String contentFormats;

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

    public WebItem setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
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

}
