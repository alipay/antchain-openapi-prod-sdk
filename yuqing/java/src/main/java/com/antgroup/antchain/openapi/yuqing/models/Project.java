// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    // 项目名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 作者名称
    @NameInMap("author_name_list")
    public java.util.List<String> authorNameList;

    // 关键词
    @NameInMap("pos_keyword_list")
    @Validation(required = true)
    public java.util.List<String> posKeywordList;

    // 标题包含词列表
    @NameInMap("pos_keyword_list_in_title")
    public java.util.List<String> posKeywordListInTitle;

    // 排除关键词标签列表
    @NameInMap("exclude_keyword_tag_ids")
    public String excludeKeywordTagIds;

    // 修改人uid
    @NameInMap("uid_modified")
    public String uidModified;

    // 提级用户名，如@xxx
    @NameInMap("at_author_name_list")
    public java.util.List<String> atAuthorNameList;

    // 排除词
    @NameInMap("exclude_keyword_list")
    public java.util.List<String> excludeKeywordList;

    // 项目的分析页面id，关联hbase中的自定义页面表
    @NameInMap("analyse_cp_id")
    public Long analyseCpId;

    // 关键词标签列表
    @NameInMap("keyword_tag_ids")
    public java.util.List<String> keywordTagIds;

    // 搭配词
    @NameInMap("ass_keyword_list")
    public java.util.List<String> assKeywordList;

    // 项目ID
    @NameInMap("id")
    public Long id;

    // 默认搜索模板id
    @NameInMap("default_filter_id")
    public Long defaultFilterId;

    // 创建人名称
    @NameInMap("uname_create")
    public String unameCreate;

    // 父项目id
    @NameInMap("parent_id")
    public Long parentId;

    // 创建时间
    @NameInMap("gmt_create")
    public Long gmtCreate;

    // 修改人名称
    @NameInMap("uname_modified")
    public String unameModified;

    // 修改时间
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // 项目分组id
    @NameInMap("project_group_id")
    public Long projectGroupId;

    // 父文章id
    @NameInMap("parent_doc_id")
    public Long parentDocId;

    // 文章id列表
    @NameInMap("doc_id_list")
    public java.util.List<String> docIdList;

    // 话题词列表
    @NameInMap("topic_list")
    public java.util.List<String> topicList;

    // 创建人UID
    @NameInMap("uid_create")
    public String uidCreate;

    public static Project build(java.util.Map<String, ?> map) throws Exception {
        Project self = new Project();
        return TeaModel.build(map, self);
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Project setAuthorNameList(java.util.List<String> authorNameList) {
        this.authorNameList = authorNameList;
        return this;
    }
    public java.util.List<String> getAuthorNameList() {
        return this.authorNameList;
    }

    public Project setPosKeywordList(java.util.List<String> posKeywordList) {
        this.posKeywordList = posKeywordList;
        return this;
    }
    public java.util.List<String> getPosKeywordList() {
        return this.posKeywordList;
    }

    public Project setPosKeywordListInTitle(java.util.List<String> posKeywordListInTitle) {
        this.posKeywordListInTitle = posKeywordListInTitle;
        return this;
    }
    public java.util.List<String> getPosKeywordListInTitle() {
        return this.posKeywordListInTitle;
    }

    public Project setExcludeKeywordTagIds(String excludeKeywordTagIds) {
        this.excludeKeywordTagIds = excludeKeywordTagIds;
        return this;
    }
    public String getExcludeKeywordTagIds() {
        return this.excludeKeywordTagIds;
    }

    public Project setUidModified(String uidModified) {
        this.uidModified = uidModified;
        return this;
    }
    public String getUidModified() {
        return this.uidModified;
    }

    public Project setAtAuthorNameList(java.util.List<String> atAuthorNameList) {
        this.atAuthorNameList = atAuthorNameList;
        return this;
    }
    public java.util.List<String> getAtAuthorNameList() {
        return this.atAuthorNameList;
    }

    public Project setExcludeKeywordList(java.util.List<String> excludeKeywordList) {
        this.excludeKeywordList = excludeKeywordList;
        return this;
    }
    public java.util.List<String> getExcludeKeywordList() {
        return this.excludeKeywordList;
    }

    public Project setAnalyseCpId(Long analyseCpId) {
        this.analyseCpId = analyseCpId;
        return this;
    }
    public Long getAnalyseCpId() {
        return this.analyseCpId;
    }

    public Project setKeywordTagIds(java.util.List<String> keywordTagIds) {
        this.keywordTagIds = keywordTagIds;
        return this;
    }
    public java.util.List<String> getKeywordTagIds() {
        return this.keywordTagIds;
    }

    public Project setAssKeywordList(java.util.List<String> assKeywordList) {
        this.assKeywordList = assKeywordList;
        return this;
    }
    public java.util.List<String> getAssKeywordList() {
        return this.assKeywordList;
    }

    public Project setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Project setDefaultFilterId(Long defaultFilterId) {
        this.defaultFilterId = defaultFilterId;
        return this;
    }
    public Long getDefaultFilterId() {
        return this.defaultFilterId;
    }

    public Project setUnameCreate(String unameCreate) {
        this.unameCreate = unameCreate;
        return this;
    }
    public String getUnameCreate() {
        return this.unameCreate;
    }

    public Project setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public Project setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public Project setUnameModified(String unameModified) {
        this.unameModified = unameModified;
        return this;
    }
    public String getUnameModified() {
        return this.unameModified;
    }

    public Project setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public Project setProjectGroupId(Long projectGroupId) {
        this.projectGroupId = projectGroupId;
        return this;
    }
    public Long getProjectGroupId() {
        return this.projectGroupId;
    }

    public Project setParentDocId(Long parentDocId) {
        this.parentDocId = parentDocId;
        return this;
    }
    public Long getParentDocId() {
        return this.parentDocId;
    }

    public Project setDocIdList(java.util.List<String> docIdList) {
        this.docIdList = docIdList;
        return this;
    }
    public java.util.List<String> getDocIdList() {
        return this.docIdList;
    }

    public Project setTopicList(java.util.List<String> topicList) {
        this.topicList = topicList;
        return this;
    }
    public java.util.List<String> getTopicList() {
        return this.topicList;
    }

    public Project setUidCreate(String uidCreate) {
        this.uidCreate = uidCreate;
        return this;
    }
    public String getUidCreate() {
        return this.uidCreate;
    }

}
