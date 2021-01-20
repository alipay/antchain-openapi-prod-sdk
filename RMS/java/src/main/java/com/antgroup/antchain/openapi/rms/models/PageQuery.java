// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PageQuery extends TeaModel {
    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // page_index
    @NameInMap("page_index")
    public Long pageIndex;

    // cur_index
    @NameInMap("cur_index")
    public Long curIndex;

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

    public PageQuery setCurIndex(Long curIndex) {
        this.curIndex = curIndex;
        return this;
    }
    public Long getCurIndex() {
        return this.curIndex;
    }

}
