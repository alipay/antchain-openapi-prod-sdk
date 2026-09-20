// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class FetchResult extends TeaModel {
    // 本次 Fetch 结果唯一标识
    /**
     * <strong>example:</strong>
     * <p>fetch_req_b24edf30205c491b97ef1500a405b961</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 内容唯一标识，用于内容去重与引用
    /**
     * <strong>example:</strong>
     * <p>compensatory_e81c1f5749545c5f7d247b3a100ffe62</p>
     */
    @NameInMap("content_id")
    @Validation(required = true)
    public String contentId;

    // 原始网页链接
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 网页标题
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("title")
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

    // 网页声明的内容描述；来源于页面公开元信息，不是模型生成摘要
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("description")
    public String description;

    // 清洗后的网页主要正文
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("content")
    public String content;

    // 内容发布时间，ISO 8601 格式
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

    // 来源站点 Logo 链接
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("logo_url")
    public String logoUrl;

    // 正文实际输出格式：text 或 markdown
    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("content_formats")
    public String contentFormats;

    public static FetchResult build(java.util.Map<String, ?> map) throws Exception {
        FetchResult self = new FetchResult();
        return TeaModel.build(map, self);
    }

    public FetchResult setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public FetchResult setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public FetchResult setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public FetchResult setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public FetchResult setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public FetchResult setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FetchResult setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public FetchResult setPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public String getPublishTime() {
        return this.publishTime;
    }

    public FetchResult setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public FetchResult setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public FetchResult setContentFormats(String contentFormats) {
        this.contentFormats = contentFormats;
        return this;
    }
    public String getContentFormats() {
        return this.contentFormats;
    }

}
