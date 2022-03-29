// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MsgQueryPageDO extends TeaModel {
    // data
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<MsgQueryBatchDO> content;

    // page_num
    @NameInMap("page_num")
    public Long pageNum;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total
    @NameInMap("total")
    public Long total;

    public static MsgQueryPageDO build(java.util.Map<String, ?> map) throws Exception {
        MsgQueryPageDO self = new MsgQueryPageDO();
        return TeaModel.build(map, self);
    }

    public MsgQueryPageDO setContent(java.util.List<MsgQueryBatchDO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<MsgQueryBatchDO> getContent() {
        return this.content;
    }

    public MsgQueryPageDO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public MsgQueryPageDO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public MsgQueryPageDO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
