// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class CategoryLocalVO extends TeaModel {
    // id
    @NameInMap("id")
    public Long id;

    // siteId
    @NameInMap("site_id")
    public Long siteId;

    // title
    @NameInMap("title")
    public String title;

    // type
    @NameInMap("type")
    public Long type;

    // sort
    @NameInMap("sort")
    public Long sort;

    // level
    @NameInMap("level")
    public Long level;

    // parent_id
    @NameInMap("parent_id")
    public String parentId;

    // sourceType
    @NameInMap("source_type")
    public Long sourceType;

    // show_type
    @NameInMap("show_type")
    public Long showType;

    // ext_id
    @NameInMap("ext_id")
    public String extId;

    // shield
    @NameInMap("shie_id")
    public Long shieId;

    // status
    @NameInMap("status")
    public Long status;

    // deleted
    @NameInMap("deleted")
    public Long deleted;

    // tree
    @NameInMap("tree")
    public String tree;

    // green
    @NameInMap("green")
    public Long green;

    // site_code
    @NameInMap("site_code")
    public String siteCode;

    // created_time
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // modified_time
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    // isCatalogue
    @NameInMap("is_catalogue")
    public Boolean isCatalogue;

    public static CategoryLocalVO build(java.util.Map<String, ?> map) throws Exception {
        CategoryLocalVO self = new CategoryLocalVO();
        return TeaModel.build(map, self);
    }

    public CategoryLocalVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CategoryLocalVO setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CategoryLocalVO setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CategoryLocalVO setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public CategoryLocalVO setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

    public CategoryLocalVO setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public CategoryLocalVO setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CategoryLocalVO setSourceType(Long sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Long getSourceType() {
        return this.sourceType;
    }

    public CategoryLocalVO setShowType(Long showType) {
        this.showType = showType;
        return this;
    }
    public Long getShowType() {
        return this.showType;
    }

    public CategoryLocalVO setExtId(String extId) {
        this.extId = extId;
        return this;
    }
    public String getExtId() {
        return this.extId;
    }

    public CategoryLocalVO setShieId(Long shieId) {
        this.shieId = shieId;
        return this;
    }
    public Long getShieId() {
        return this.shieId;
    }

    public CategoryLocalVO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CategoryLocalVO setDeleted(Long deleted) {
        this.deleted = deleted;
        return this;
    }
    public Long getDeleted() {
        return this.deleted;
    }

    public CategoryLocalVO setTree(String tree) {
        this.tree = tree;
        return this;
    }
    public String getTree() {
        return this.tree;
    }

    public CategoryLocalVO setGreen(Long green) {
        this.green = green;
        return this;
    }
    public Long getGreen() {
        return this.green;
    }

    public CategoryLocalVO setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public CategoryLocalVO setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CategoryLocalVO setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public CategoryLocalVO setIsCatalogue(Boolean isCatalogue) {
        this.isCatalogue = isCatalogue;
        return this;
    }
    public Boolean getIsCatalogue() {
        return this.isCatalogue;
    }

}
