// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MsgTypePageDO extends TeaModel {
    // msgtypes
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<MsgTypeDO> content;

    // page_num
    @NameInMap("page_num")
    public Long pageNum;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total
    @NameInMap("total")
    public Long total;

    public static MsgTypePageDO build(java.util.Map<String, ?> map) throws Exception {
        MsgTypePageDO self = new MsgTypePageDO();
        return TeaModel.build(map, self);
    }

    public MsgTypePageDO setContent(java.util.List<MsgTypeDO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<MsgTypeDO> getContent() {
        return this.content;
    }

    public MsgTypePageDO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public MsgTypePageDO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public MsgTypePageDO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
