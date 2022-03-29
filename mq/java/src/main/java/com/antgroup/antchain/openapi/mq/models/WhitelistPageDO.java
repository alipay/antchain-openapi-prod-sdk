// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class WhitelistPageDO extends TeaModel {
    // content
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<WhitelistDO> content;

    // page_num
    @NameInMap("page_num")
    public Long pageNum;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total
    @NameInMap("total")
    public Long total;

    public static WhitelistPageDO build(java.util.Map<String, ?> map) throws Exception {
        WhitelistPageDO self = new WhitelistPageDO();
        return TeaModel.build(map, self);
    }

    public WhitelistPageDO setContent(java.util.List<WhitelistDO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<WhitelistDO> getContent() {
        return this.content;
    }

    public WhitelistPageDO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public WhitelistPageDO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public WhitelistPageDO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
