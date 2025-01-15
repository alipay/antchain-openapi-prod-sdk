// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryDocChildResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内部id
    @NameInMap("id")
    public Long id;

    // 内容库id
    @NameInMap("site_id")
    public Long siteId;

    // 站点
    @NameInMap("site")
    public String site;

    // 语言code
    @NameInMap("language")
    public String language;

    // 名称
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

    // children
    @NameInMap("children")
    public java.util.List<CategoryVO> children;

    public static QueryDocChildResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDocChildResponse self = new QueryDocChildResponse();
        return TeaModel.build(map, self);
    }

    public QueryDocChildResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDocChildResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDocChildResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDocChildResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryDocChildResponse setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public QueryDocChildResponse setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public QueryDocChildResponse setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public QueryDocChildResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryDocChildResponse setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public QueryDocChildResponse setShowType(Long showType) {
        this.showType = showType;
        return this;
    }
    public Long getShowType() {
        return this.showType;
    }

    public QueryDocChildResponse setSort(Long sort) {
        this.sort = sort;
        return this;
    }
    public Long getSort() {
        return this.sort;
    }

    public QueryDocChildResponse setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public QueryDocChildResponse setExtId(String extId) {
        this.extId = extId;
        return this;
    }
    public String getExtId() {
        return this.extId;
    }

    public QueryDocChildResponse setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public QueryDocChildResponse setSourceType(Long sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Long getSourceType() {
        return this.sourceType;
    }

    public QueryDocChildResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public QueryDocChildResponse setCatalogueType(Long catalogueType) {
        this.catalogueType = catalogueType;
        return this;
    }
    public Long getCatalogueType() {
        return this.catalogueType;
    }

    public QueryDocChildResponse setChildren(java.util.List<CategoryVO> children) {
        this.children = children;
        return this;
    }
    public java.util.List<CategoryVO> getChildren() {
        return this.children;
    }

}
