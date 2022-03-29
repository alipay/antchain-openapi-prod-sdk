// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GroupPageDTO extends TeaModel {
    // Group 信息
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<GroupDTO> content;

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

    public static GroupPageDTO build(java.util.Map<String, ?> map) throws Exception {
        GroupPageDTO self = new GroupPageDTO();
        return TeaModel.build(map, self);
    }

    public GroupPageDTO setContent(java.util.List<GroupDTO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<GroupDTO> getContent() {
        return this.content;
    }

    public GroupPageDTO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public GroupPageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GroupPageDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
