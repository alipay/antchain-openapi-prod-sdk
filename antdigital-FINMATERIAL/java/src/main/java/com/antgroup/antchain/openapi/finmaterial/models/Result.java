// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class Result extends TeaModel {
    // WebResults 实际返回的网页结果数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("result_count")
    @Validation(required = true)
    public Long resultCount;

    // 网页搜索结果列表，对应请求中的 search_type=web
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("web_results")
    @Validation(required = true)
    public java.util.List<WebItem> webResults;

    // 本次搜索的上下文信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("search_context")
    @Validation(required = true)
    public SearchContext searchContext;

    // 行业数据检索结果列表。仅在 filter_enable_industry_data_search=true 且命中时返回，支持多个结果，一般仅 1 个；开关关闭时不调用垂类接口且省略此字段。
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("industry_data")
    public java.util.List<IndustryDataItem> industryData;

    public static Result build(java.util.Map<String, ?> map) throws Exception {
        Result self = new Result();
        return TeaModel.build(map, self);
    }

    public Result setResultCount(Long resultCount) {
        this.resultCount = resultCount;
        return this;
    }
    public Long getResultCount() {
        return this.resultCount;
    }

    public Result setWebResults(java.util.List<WebItem> webResults) {
        this.webResults = webResults;
        return this;
    }
    public java.util.List<WebItem> getWebResults() {
        return this.webResults;
    }

    public Result setSearchContext(SearchContext searchContext) {
        this.searchContext = searchContext;
        return this;
    }
    public SearchContext getSearchContext() {
        return this.searchContext;
    }

    public Result setIndustryData(java.util.List<IndustryDataItem> industryData) {
        this.industryData = industryData;
        return this;
    }
    public java.util.List<IndustryDataItem> getIndustryData() {
        return this.industryData;
    }

}
