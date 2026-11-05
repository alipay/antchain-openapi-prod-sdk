// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class QueryAntsearchSearchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 搜索内容，不能为空；建议不超过 200 个字符
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // AI 上下文档位，协议预设 fast、auto、pro，用于控制检索深度、内容密度和 Token 规模；当前仅支持 auto，传入其他值将返回参数错误
    @NameInMap("mode")
    public String mode;

    // 搜索类型，当前仅支持 web；后续可扩展 image
    @NameInMap("search_type")
    public String searchType;

    // 网页结果最大返回数量，取值范围 1～30；不包含 IndustryData
    @NameInMap("count")
    public Long count;

    // 正文格式，当前支持 text；markdown 为预留值，暂不支持。仅在实际返回 Content 时生效；include_content=false 时不影响输出。
    @NameInMap("content_format")
    public String contentFormat;

    // 仅返回指定域名及其子域名的结果；最多 5 个，填写域名，不接受协议和路径。多个域名之间使用英文逗号(,)隔开。与排除名单重叠时，排除优先。
    @NameInMap("filter_include_sites")
    public String filterIncludeSites;

    // 排除指定域名及其子域名的结果；最多 5 个，填写域名，不接受协议和路径。与包含名单重叠时，排除优先，不因重叠拒绝请求。多个域名之间使用英文逗号(,)隔开。
    @NameInMap("filter_exclude_sites")
    public String filterExcludeSites;

    // 按发布时间筛选：d 最近一天、w 最近一周、m 最近一月、y 最近一年；不传则不限制。开启后过滤发布时间缺失或无法解析的结果。
    @NameInMap("filter_time_range")
    public String filterTimeRange;

    // 预留。计划支持 news 等网页搜索领域，当前不生效
    @NameInMap("filter_industry")
    public String filterIndustry;

    // 是否查询行业垂类数据接口。false 时不调用垂类接口，也不返回 Result.IndustryData；true 时按查询需要执行，命中才返回。不会关闭普通网页、新闻网页或 PDF 搜索。
    @NameInMap("filter_enable_industry_data_search")
    public Boolean filterEnableIndustryDataSearch;

    // 是否返回当前 mode 下已有的可用正文；false 时省略 Content 和 ContentFormats，不影响内部检索、排序，也不强制生成正文。
    @NameInMap("include_content")
    public Boolean includeContent;

    // 是否返回已有摘要；false 时省略 Summary。仅控制输出，不触发在线摘要生成。
    @NameInMap("include_summary")
    public Boolean includeSummary;

    public static QueryAntsearchSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsearchSearchRequest self = new QueryAntsearchSearchRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsearchSearchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsearchSearchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsearchSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryAntsearchSearchRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public QueryAntsearchSearchRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public QueryAntsearchSearchRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryAntsearchSearchRequest setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
        return this;
    }
    public String getContentFormat() {
        return this.contentFormat;
    }

    public QueryAntsearchSearchRequest setFilterIncludeSites(String filterIncludeSites) {
        this.filterIncludeSites = filterIncludeSites;
        return this;
    }
    public String getFilterIncludeSites() {
        return this.filterIncludeSites;
    }

    public QueryAntsearchSearchRequest setFilterExcludeSites(String filterExcludeSites) {
        this.filterExcludeSites = filterExcludeSites;
        return this;
    }
    public String getFilterExcludeSites() {
        return this.filterExcludeSites;
    }

    public QueryAntsearchSearchRequest setFilterTimeRange(String filterTimeRange) {
        this.filterTimeRange = filterTimeRange;
        return this;
    }
    public String getFilterTimeRange() {
        return this.filterTimeRange;
    }

    public QueryAntsearchSearchRequest setFilterIndustry(String filterIndustry) {
        this.filterIndustry = filterIndustry;
        return this;
    }
    public String getFilterIndustry() {
        return this.filterIndustry;
    }

    public QueryAntsearchSearchRequest setFilterEnableIndustryDataSearch(Boolean filterEnableIndustryDataSearch) {
        this.filterEnableIndustryDataSearch = filterEnableIndustryDataSearch;
        return this;
    }
    public Boolean getFilterEnableIndustryDataSearch() {
        return this.filterEnableIndustryDataSearch;
    }

    public QueryAntsearchSearchRequest setIncludeContent(Boolean includeContent) {
        this.includeContent = includeContent;
        return this;
    }
    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    public QueryAntsearchSearchRequest setIncludeSummary(Boolean includeSummary) {
        this.includeSummary = includeSummary;
        return this;
    }
    public Boolean getIncludeSummary() {
        return this.includeSummary;
    }

}
