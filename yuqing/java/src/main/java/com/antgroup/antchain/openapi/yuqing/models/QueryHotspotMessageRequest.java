// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class QueryHotspotMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 标题包含XX
    @NameInMap("title_including_words_idx")
    public String titleIncludingWordsIdx;

    // 正向关键词（短语匹配）
    @NameInMap("pos_keywords")
    public String posKeywords;

    // 标题完全相等的检索条件，与attributes.display_title字段对应
    @NameInMap("whole_keywords")
    public String wholeKeywords;

    // 排序方式： 正序(+)、倒序(-)
    @NameInMap("sort_by_direction")
    public String sortByDirection;

    // 省份
    @NameInMap("provinces")
    public String provinces;

    // 爬取时间的最小值（含）
    @NameInMap("crawler_time_start_filter")
    public Long crawlerTimeStartFilter;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // [媒体子类型
    @NameInMap("media_sub_type")
    public java.util.List<String> mediaSubType;

    // 是否不指定关键词进行查询：\n 默认false，表示需要指定关键词来查询
    @NameInMap("query_without_keyword")
    public Boolean queryWithoutKeyword;

    // 指定的id列表
    @NameInMap("doc_ids")
    public java.util.List<String> docIds;

    // 城市
    @NameInMap("cities")
    public java.util.List<String> cities;

    // 爬取时间的最大值（不含）
    @NameInMap("crawler_time_end_filter")
    public Long crawlerTimeEndFilter;

    // 是否要进行关键词高亮显示
    @NameInMap("enable_keyword_highlight")
    public Boolean enableKeywordHighlight;

    // d当前页
    @NameInMap("page_now")
    @Validation(required = true)
    public Long pageNow;

    // 是否当前在榜 true表示在榜，false或null表示不限
    @NameInMap("file_id")
    public Boolean fileId;

    // 排序字段
    @NameInMap("sort_by")
    public String sortBy;

    // 是否当前在榜
    @NameInMap("active")
    public Boolean active;

    public static QueryHotspotMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotspotMessageRequest self = new QueryHotspotMessageRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotspotMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryHotspotMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryHotspotMessageRequest setTitleIncludingWordsIdx(String titleIncludingWordsIdx) {
        this.titleIncludingWordsIdx = titleIncludingWordsIdx;
        return this;
    }
    public String getTitleIncludingWordsIdx() {
        return this.titleIncludingWordsIdx;
    }

    public QueryHotspotMessageRequest setPosKeywords(String posKeywords) {
        this.posKeywords = posKeywords;
        return this;
    }
    public String getPosKeywords() {
        return this.posKeywords;
    }

    public QueryHotspotMessageRequest setWholeKeywords(String wholeKeywords) {
        this.wholeKeywords = wholeKeywords;
        return this;
    }
    public String getWholeKeywords() {
        return this.wholeKeywords;
    }

    public QueryHotspotMessageRequest setSortByDirection(String sortByDirection) {
        this.sortByDirection = sortByDirection;
        return this;
    }
    public String getSortByDirection() {
        return this.sortByDirection;
    }

    public QueryHotspotMessageRequest setProvinces(String provinces) {
        this.provinces = provinces;
        return this;
    }
    public String getProvinces() {
        return this.provinces;
    }

    public QueryHotspotMessageRequest setCrawlerTimeStartFilter(Long crawlerTimeStartFilter) {
        this.crawlerTimeStartFilter = crawlerTimeStartFilter;
        return this;
    }
    public Long getCrawlerTimeStartFilter() {
        return this.crawlerTimeStartFilter;
    }

    public QueryHotspotMessageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryHotspotMessageRequest setMediaSubType(java.util.List<String> mediaSubType) {
        this.mediaSubType = mediaSubType;
        return this;
    }
    public java.util.List<String> getMediaSubType() {
        return this.mediaSubType;
    }

    public QueryHotspotMessageRequest setQueryWithoutKeyword(Boolean queryWithoutKeyword) {
        this.queryWithoutKeyword = queryWithoutKeyword;
        return this;
    }
    public Boolean getQueryWithoutKeyword() {
        return this.queryWithoutKeyword;
    }

    public QueryHotspotMessageRequest setDocIds(java.util.List<String> docIds) {
        this.docIds = docIds;
        return this;
    }
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    public QueryHotspotMessageRequest setCities(java.util.List<String> cities) {
        this.cities = cities;
        return this;
    }
    public java.util.List<String> getCities() {
        return this.cities;
    }

    public QueryHotspotMessageRequest setCrawlerTimeEndFilter(Long crawlerTimeEndFilter) {
        this.crawlerTimeEndFilter = crawlerTimeEndFilter;
        return this;
    }
    public Long getCrawlerTimeEndFilter() {
        return this.crawlerTimeEndFilter;
    }

    public QueryHotspotMessageRequest setEnableKeywordHighlight(Boolean enableKeywordHighlight) {
        this.enableKeywordHighlight = enableKeywordHighlight;
        return this;
    }
    public Boolean getEnableKeywordHighlight() {
        return this.enableKeywordHighlight;
    }

    public QueryHotspotMessageRequest setPageNow(Long pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Long getPageNow() {
        return this.pageNow;
    }

    public QueryHotspotMessageRequest setFileId(Boolean fileId) {
        this.fileId = fileId;
        return this;
    }
    public Boolean getFileId() {
        return this.fileId;
    }

    public QueryHotspotMessageRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public QueryHotspotMessageRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

}
