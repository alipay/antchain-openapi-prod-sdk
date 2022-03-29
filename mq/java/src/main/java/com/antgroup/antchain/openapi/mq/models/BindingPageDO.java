// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class BindingPageDO extends TeaModel {
    // binds
    @NameInMap("content")
    public java.util.List<BindingDO> content;

    // page num
    @NameInMap("page_num")
    public Long pageNum;

    // page size
    @NameInMap("page_size")
    public Long pageSize;

    // total
    @NameInMap("total")
    public Long total;

    public static BindingPageDO build(java.util.Map<String, ?> map) throws Exception {
        BindingPageDO self = new BindingPageDO();
        return TeaModel.build(map, self);
    }

    public BindingPageDO setContent(java.util.List<BindingDO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<BindingDO> getContent() {
        return this.content;
    }

    public BindingPageDO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BindingPageDO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public BindingPageDO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
