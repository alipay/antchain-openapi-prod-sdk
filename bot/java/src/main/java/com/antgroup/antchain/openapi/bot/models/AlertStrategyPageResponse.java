// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AlertStrategyPageResponse extends TeaModel {
    // 页数
    // 
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 页码
    // 
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总记录数
    // 
    @NameInMap("total_size")
    @Validation(required = true)
    public Long totalSize;

    // 总页数
    // 
    @NameInMap("total_pages")
    @Validation(required = true)
    public Long totalPages;

    // 数据
    @NameInMap("page_data")
    @Validation(required = true)
    public java.util.List<AlertStrategy> pageData;

    public static AlertStrategyPageResponse build(java.util.Map<String, ?> map) throws Exception {
        AlertStrategyPageResponse self = new AlertStrategyPageResponse();
        return TeaModel.build(map, self);
    }

    public AlertStrategyPageResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public AlertStrategyPageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AlertStrategyPageResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public AlertStrategyPageResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public AlertStrategyPageResponse setPageData(java.util.List<AlertStrategy> pageData) {
        this.pageData = pageData;
        return this;
    }
    public java.util.List<AlertStrategy> getPageData() {
        return this.pageData;
    }

}
