// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ApplicationPageDescDTO extends TeaModel {
    // 总页数
    @NameInMap("page_count")
    @Validation(required = true)
    public Long pageCount;

    // 当前页
    @NameInMap("page_current")
    @Validation(required = true)
    public Long pageCurrent;

    // 页面显示数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 页面记录
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<ApplicationDTO> records;

    // 总记录数
    @NameInMap("row_count")
    @Validation(required = true)
    public Long rowCount;

    public static ApplicationPageDescDTO build(java.util.Map<String, ?> map) throws Exception {
        ApplicationPageDescDTO self = new ApplicationPageDescDTO();
        return TeaModel.build(map, self);
    }

    public ApplicationPageDescDTO setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ApplicationPageDescDTO setPageCurrent(Long pageCurrent) {
        this.pageCurrent = pageCurrent;
        return this;
    }
    public Long getPageCurrent() {
        return this.pageCurrent;
    }

    public ApplicationPageDescDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ApplicationPageDescDTO setRecords(java.util.List<ApplicationDTO> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ApplicationDTO> getRecords() {
        return this.records;
    }

    public ApplicationPageDescDTO setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

}
