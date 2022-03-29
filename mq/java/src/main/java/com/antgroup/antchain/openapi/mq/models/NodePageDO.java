// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class NodePageDO extends TeaModel {
    // nodes
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<NodeDO> content;

    // page
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // page size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // total
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static NodePageDO build(java.util.Map<String, ?> map) throws Exception {
        NodePageDO self = new NodePageDO();
        return TeaModel.build(map, self);
    }

    public NodePageDO setContent(java.util.List<NodeDO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<NodeDO> getContent() {
        return this.content;
    }

    public NodePageDO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public NodePageDO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public NodePageDO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
