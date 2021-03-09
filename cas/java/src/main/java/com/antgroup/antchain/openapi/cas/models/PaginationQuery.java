// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class PaginationQuery extends TeaModel {
    // 当前页数
    @NameInMap("current_page")
    public Long currentPage;

    // isLocaleEnabled
    @NameInMap("is_locale_enabled")
    public Boolean isLocaleEnabled;

    // local
    @NameInMap("local")
    public String local;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // paging
    @NameInMap("paging")
    public Boolean paging;

    // 查询类型
    @NameInMap("query_type")
    public String queryType;

    // search
    @NameInMap("search")
    public Boolean search;

    // 排序关键字列表
    @NameInMap("orders")
    public java.util.List<String> orders;

    public static PaginationQuery build(java.util.Map<String, ?> map) throws Exception {
        PaginationQuery self = new PaginationQuery();
        return TeaModel.build(map, self);
    }

    public PaginationQuery setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PaginationQuery setIsLocaleEnabled(Boolean isLocaleEnabled) {
        this.isLocaleEnabled = isLocaleEnabled;
        return this;
    }
    public Boolean getIsLocaleEnabled() {
        return this.isLocaleEnabled;
    }

    public PaginationQuery setLocal(String local) {
        this.local = local;
        return this;
    }
    public String getLocal() {
        return this.local;
    }

    public PaginationQuery setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PaginationQuery setPaging(Boolean paging) {
        this.paging = paging;
        return this;
    }
    public Boolean getPaging() {
        return this.paging;
    }

    public PaginationQuery setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public PaginationQuery setSearch(Boolean search) {
        this.search = search;
        return this;
    }
    public Boolean getSearch() {
        return this.search;
    }

    public PaginationQuery setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

}
