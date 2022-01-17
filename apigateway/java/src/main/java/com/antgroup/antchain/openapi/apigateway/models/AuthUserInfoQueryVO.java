// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AuthUserInfoQueryVO extends TeaModel {
    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // OperatorVO
    @NameInMap("query")
    public AuthUserInfoVO query;

    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    public static AuthUserInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        AuthUserInfoQueryVO self = new AuthUserInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public AuthUserInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public AuthUserInfoQueryVO setQuery(AuthUserInfoVO query) {
        this.query = query;
        return this;
    }
    public AuthUserInfoVO getQuery() {
        return this.query;
    }

    public AuthUserInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

}
