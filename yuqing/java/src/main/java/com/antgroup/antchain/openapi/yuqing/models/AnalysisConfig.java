// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class AnalysisConfig extends TeaModel {
    // 文章ID
    @NameInMap("doc_id")
    public String docId;

    // 文章URL
    @NameInMap("url")
    public String url;

    // 项目ID
    @NameInMap("project_id")
    public Long projectId;

    // 模板ID
    @NameInMap("filter_id")
    public Long filterId;

    // 关键词列表
    @NameInMap("pos_keyword_list")
    public java.util.List<String> posKeywordList;

    // 开始时间
    @NameInMap("publish_time_start")
    public Long publishTimeStart;

    // 结束时间
    @NameInMap("publish_time_end")
    public Long publishTimeEnd;

    // URL列表
    @NameInMap("url_list")
    public java.util.List<String> urlList;

    public static AnalysisConfig build(java.util.Map<String, ?> map) throws Exception {
        AnalysisConfig self = new AnalysisConfig();
        return TeaModel.build(map, self);
    }

    public AnalysisConfig setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public AnalysisConfig setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public AnalysisConfig setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AnalysisConfig setFilterId(Long filterId) {
        this.filterId = filterId;
        return this;
    }
    public Long getFilterId() {
        return this.filterId;
    }

    public AnalysisConfig setPosKeywordList(java.util.List<String> posKeywordList) {
        this.posKeywordList = posKeywordList;
        return this;
    }
    public java.util.List<String> getPosKeywordList() {
        return this.posKeywordList;
    }

    public AnalysisConfig setPublishTimeStart(Long publishTimeStart) {
        this.publishTimeStart = publishTimeStart;
        return this;
    }
    public Long getPublishTimeStart() {
        return this.publishTimeStart;
    }

    public AnalysisConfig setPublishTimeEnd(Long publishTimeEnd) {
        this.publishTimeEnd = publishTimeEnd;
        return this;
    }
    public Long getPublishTimeEnd() {
        return this.publishTimeEnd;
    }

    public AnalysisConfig setUrlList(java.util.List<String> urlList) {
        this.urlList = urlList;
        return this;
    }
    public java.util.List<String> getUrlList() {
        return this.urlList;
    }

}
