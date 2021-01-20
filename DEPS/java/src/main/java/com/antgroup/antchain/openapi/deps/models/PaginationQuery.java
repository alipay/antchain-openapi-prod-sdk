// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class PaginationQuery extends TeaModel {
    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 模糊搜索
    @NameInMap("fuzzy_name")
    public String fuzzyName;

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

    public PaginationQuery setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PaginationQuery setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
        return this;
    }
    public String getFuzzyName() {
        return this.fuzzyName;
    }

}
