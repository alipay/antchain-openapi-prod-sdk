// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class InstancePageDTO extends TeaModel {
    // topic page
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<InstanceDTO> content;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总条数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static InstancePageDTO build(java.util.Map<String, ?> map) throws Exception {
        InstancePageDTO self = new InstancePageDTO();
        return TeaModel.build(map, self);
    }

    public InstancePageDTO setContent(java.util.List<InstanceDTO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<InstanceDTO> getContent() {
        return this.content;
    }

    public InstancePageDTO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public InstancePageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public InstancePageDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
