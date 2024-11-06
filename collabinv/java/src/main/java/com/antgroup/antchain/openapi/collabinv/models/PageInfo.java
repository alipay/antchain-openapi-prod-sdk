// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class PageInfo extends TeaModel {
    // 总数量
    @NameInMap("total")
    public Long total;

    // 当前页
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 页容量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static PageInfo build(java.util.Map<String, ?> map) throws Exception {
        PageInfo self = new PageInfo();
        return TeaModel.build(map, self);
    }

    public PageInfo setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PageInfo setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public PageInfo setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
