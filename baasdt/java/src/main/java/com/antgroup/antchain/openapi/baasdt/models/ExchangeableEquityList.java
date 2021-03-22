// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExchangeableEquityList extends TeaModel {
    // 页面上数据在总数据中的结束位置（第几个数据）
    @NameInMap("end_row")
    @Validation(required = true)
    public Long endRow;

    // 权益信息列表
    @NameInMap("equity_list")
    @Validation(required = true)
    public java.util.List<EquityDetail> equityList;

    // 第一页页码
    @NameInMap("first_page")
    @Validation(required = true)
    public Long firstPage;

    // 是否有下一页
    @NameInMap("has_next_page")
    @Validation(required = true)
    public Boolean hasNextPage;

    // 是否有前一页
    @NameInMap("has_previous_page")
    @Validation(required = true)
    public Boolean hasPreviousPage;

    // 是否第一页
    @NameInMap("is_first_page")
    @Validation(required = true)
    public Boolean isFirstPage;

    // 是否最后一页
    @NameInMap("is_last_page")
    @Validation(required = true)
    public Boolean isLastPage;

    // 最后一页页码
    @NameInMap("last_page")
    @Validation(required = true)
    public Long lastPage;

    // 下一页页码
    @NameInMap("next_page")
    @Validation(required = true)
    public Long nextPage;

    // 排序规则
    @NameInMap("order_by")
    @Validation(required = true)
    public String orderBy;

    // 可兑换的权益总页数
    @NameInMap("pages")
    @Validation(required = true)
    public Long pages;

    // 当前页码
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 前一页页码
    @NameInMap("pre_page")
    @Validation(required = true)
    public Long prePage;

    // 页面中实际数量
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    // 页面上数据在总数据中的开始位置（第几个数据）
    @NameInMap("start_row")
    @Validation(required = true)
    public Long startRow;

    // 可兑换的权益总数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static ExchangeableEquityList build(java.util.Map<String, ?> map) throws Exception {
        ExchangeableEquityList self = new ExchangeableEquityList();
        return TeaModel.build(map, self);
    }

    public ExchangeableEquityList setEndRow(Long endRow) {
        this.endRow = endRow;
        return this;
    }
    public Long getEndRow() {
        return this.endRow;
    }

    public ExchangeableEquityList setEquityList(java.util.List<EquityDetail> equityList) {
        this.equityList = equityList;
        return this;
    }
    public java.util.List<EquityDetail> getEquityList() {
        return this.equityList;
    }

    public ExchangeableEquityList setFirstPage(Long firstPage) {
        this.firstPage = firstPage;
        return this;
    }
    public Long getFirstPage() {
        return this.firstPage;
    }

    public ExchangeableEquityList setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
        return this;
    }
    public Boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public ExchangeableEquityList setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
        return this;
    }
    public Boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    public ExchangeableEquityList setIsFirstPage(Boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
        return this;
    }
    public Boolean getIsFirstPage() {
        return this.isFirstPage;
    }

    public ExchangeableEquityList setIsLastPage(Boolean isLastPage) {
        this.isLastPage = isLastPage;
        return this;
    }
    public Boolean getIsLastPage() {
        return this.isLastPage;
    }

    public ExchangeableEquityList setLastPage(Long lastPage) {
        this.lastPage = lastPage;
        return this;
    }
    public Long getLastPage() {
        return this.lastPage;
    }

    public ExchangeableEquityList setNextPage(Long nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Long getNextPage() {
        return this.nextPage;
    }

    public ExchangeableEquityList setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ExchangeableEquityList setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public ExchangeableEquityList setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ExchangeableEquityList setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ExchangeableEquityList setPrePage(Long prePage) {
        this.prePage = prePage;
        return this;
    }
    public Long getPrePage() {
        return this.prePage;
    }

    public ExchangeableEquityList setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ExchangeableEquityList setStartRow(Long startRow) {
        this.startRow = startRow;
        return this;
    }
    public Long getStartRow() {
        return this.startRow;
    }

    public ExchangeableEquityList setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
