// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TracePageDTO extends TeaModel {
    // Trace 信息
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<TraceDTO> content;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总条数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static TracePageDTO build(java.util.Map<String, ?> map) throws Exception {
        TracePageDTO self = new TracePageDTO();
        return TeaModel.build(map, self);
    }

    public TracePageDTO setContent(java.util.List<TraceDTO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<TraceDTO> getContent() {
        return this.content;
    }

    public TracePageDTO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public TracePageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public TracePageDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
