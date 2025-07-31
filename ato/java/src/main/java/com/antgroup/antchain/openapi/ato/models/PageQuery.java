// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PageQuery extends TeaModel {
    // 页大小
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 当前页
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    public static PageQuery build(java.util.Map<String, ?> map) throws Exception {
        PageQuery self = new PageQuery();
        return TeaModel.build(map, self);
    }

    public PageQuery setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PageQuery setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

}
