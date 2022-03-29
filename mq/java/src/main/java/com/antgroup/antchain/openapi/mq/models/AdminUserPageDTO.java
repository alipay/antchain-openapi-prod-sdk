// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class AdminUserPageDTO extends TeaModel {
    // admin user page
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<AdminUserDTO> content;

    // 页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总条数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    public static AdminUserPageDTO build(java.util.Map<String, ?> map) throws Exception {
        AdminUserPageDTO self = new AdminUserPageDTO();
        return TeaModel.build(map, self);
    }

    public AdminUserPageDTO setContent(java.util.List<AdminUserDTO> content) {
        this.content = content;
        return this;
    }
    public java.util.List<AdminUserDTO> getContent() {
        return this.content;
    }

    public AdminUserPageDTO setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public AdminUserPageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AdminUserPageDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
