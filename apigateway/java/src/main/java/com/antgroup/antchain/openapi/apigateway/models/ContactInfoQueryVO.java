// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ContactInfoQueryVO extends TeaModel {
    // 分页信息
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public ContactInfoVO query;

    // 是否模糊搜索
    @NameInMap("fuzzy_search")
    public Boolean fuzzySearch;

    public static ContactInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        ContactInfoQueryVO self = new ContactInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public ContactInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ContactInfoQueryVO setQuery(ContactInfoVO query) {
        this.query = query;
        return this;
    }
    public ContactInfoVO getQuery() {
        return this.query;
    }

    public ContactInfoQueryVO setFuzzySearch(Boolean fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
        return this;
    }
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

}
