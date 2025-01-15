// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class CategoryVO extends TeaModel {
    // 内部id
    @NameInMap("id")
    public Long id;

    // 内容库id
    @NameInMap("site_id")
    public Long siteId;

    // 站点
    @NameInMap("site")
    public String site;

    // language
    @NameInMap("language")
    public String language;

    // title
    @NameInMap("title")
    public String title;

    // 类型
    @NameInMap("type")
    public Long type;

    // 展示类型 1为左侧展示2为列表展示
    @NameInMap("show_type")
    public Long showType;

    // 排序
    @NameInMap("sort")
    public Long sort;

    // 目录层级
    @NameInMap("level")
    public Long level;

    // 外标id
    @NameInMap("ext_id")
    public String extId;

    // 父id
    @NameInMap("parent_id")
    public String parentId;

    // 来源类型
    @NameInMap("source_type")
    public Long sourceType;

    // 版本
    @NameInMap("version")
    public String version;

    // 语雀目录有无数据判定
    @NameInMap("catalogue_type")
    public Long catalogueType;

    public static CategoryVO build(java.util.Map<String, ?> map) throws Exception {
        CategoryVO self = new CategoryVO();
        return TeaModel.build(map, self);
    }

    public CategoryVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CategoryVO setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CategoryVO setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public CategoryVO setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CategoryVO setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CategoryVO setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public CategoryVO setShowType(Long showType) {
        this.showType = showType;
        return this;
    }
    public Long getShowType() {
        return this.showType;
    }

    public CategoryVO setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

    public CategoryVO setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public CategoryVO setExtId(String extId) {
        this.extId = extId;
        return this;
    }
    public String getExtId() {
        return this.extId;
    }

    public CategoryVO setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CategoryVO setSourceType(Long sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Long getSourceType() {
        return this.sourceType;
    }

    public CategoryVO setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CategoryVO setCatalogueType(Long catalogueType) {
        this.catalogueType = catalogueType;
        return this;
    }
    public Long getCatalogueType() {
        return this.catalogueType;
    }

}
