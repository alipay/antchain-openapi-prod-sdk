// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AuthAppInfoQueryVO extends TeaModel {
    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public AuthAppInfoVO query;

    // 自定义查询条件
    @NameInMap("query_condition")
    public String queryCondition;

    // 是否支持模糊查询
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    public static AuthAppInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        AuthAppInfoQueryVO self = new AuthAppInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public AuthAppInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public AuthAppInfoQueryVO setQuery(AuthAppInfoVO query) {
        this.query = query;
        return this;
    }
    public AuthAppInfoVO getQuery() {
        return this.query;
    }

    public AuthAppInfoQueryVO setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public AuthAppInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

}
