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

    // 正文格式。当前支持 text；markdown 为预留值，暂不支持
    @NameInMap("content_format")
    public String contentFormat;

    // 仅搜索指定网站。例如gov.cn表示只返回该域名下的内容；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
    @NameInMap("filter_include_domains")
    public String filterIncludeDomains;

    // 排除指定网站；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
    @NameInMap("filter_exclude_domains")
    public String filterExcludeDomains;

    // 预留。计划用于按发布时间筛选，当前不生效
    @NameInMap("filter_time_range")
    public String filterTimeRange;

    // 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
    @NameInMap("filter_need_url")
    public Boolean filterNeedUrl;

    // 预留。计划支持 news 等网页搜索领域，当前不生效
    @NameInMap("filter_industry")
    public String filterIndustry;

    // 是否返回 IndustryData
    @NameInMap("filter_enable_industry_data_search")
    public Boolean filterEnableIndustryDataSearch;

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

    public QueryAntsearchSearchRequest setFilterIncludeDomains(String filterIncludeDomains) {
        this.filterIncludeDomains = filterIncludeDomains;
        return this;
    }
    public String getFilterIncludeDomains() {
        return this.filterIncludeDomains;
    }

    public QueryAntsearchSearchRequest setFilterExcludeDomains(String filterExcludeDomains) {
        this.filterExcludeDomains = filterExcludeDomains;
        return this;
    }
    public String getFilterExcludeDomains() {
        return this.filterExcludeDomains;
    }

    public QueryAntsearchSearchRequest setFilterTimeRange(String filterTimeRange) {
        this.filterTimeRange = filterTimeRange;
        return this;
    }
    public String getFilterTimeRange() {
        return this.filterTimeRange;
    }

    public QueryAntsearchSearchRequest setFilterNeedUrl(Boolean filterNeedUrl) {
        this.filterNeedUrl = filterNeedUrl;
        return this;
    }
    public Boolean getFilterNeedUrl() {
        return this.filterNeedUrl;
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

}
