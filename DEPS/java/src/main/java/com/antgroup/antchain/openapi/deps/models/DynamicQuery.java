// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DynamicQuery extends TeaModel {
    // 分页规则-currentPage
    @NameInMap("current_page")
    public Long currentPage;

    // 字段过滤
    @NameInMap("filter")
    public String filter;

    // 分页规则-pageSize
    @NameInMap("page_size")
    public Long pageSize;

    // 具体的查询条件字符串
    @NameInMap("query")
    public String query;

    // 查询结果的排序规则
    @NameInMap("sort")
    public String sort;

    public static DynamicQuery build(java.util.Map<String, ?> map) throws Exception {
        DynamicQuery self = new DynamicQuery();
        return TeaModel.build(map, self);
    }

    public DynamicQuery setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DynamicQuery setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DynamicQuery setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DynamicQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DynamicQuery setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
