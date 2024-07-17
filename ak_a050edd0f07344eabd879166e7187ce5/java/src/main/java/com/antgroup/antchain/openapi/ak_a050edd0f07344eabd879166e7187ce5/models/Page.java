// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class Page extends TeaModel {
    // 页码
    @NameInMap("curreny_page")
    @Validation(required = true)
    public Long currenyPage;

    // 每页数据个数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总页数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static Page build(java.util.Map<String, ?> map) throws Exception {
        Page self = new Page();
        return TeaModel.build(map, self);
    }

    public Page setCurrenyPage(Long currenyPage) {
        this.currenyPage = currenyPage;
        return this;
    }
    public Long getCurrenyPage() {
        return this.currenyPage;
    }

    public Page setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public Page setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
