// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueuePageDescDTO extends TeaModel {
    // 总页数
    @NameInMap("page_count")
    @Validation(required = true)
    public Long pageCount;

    // 当前页面
    @NameInMap("page_current")
    @Validation(required = true)
    public Long pageCurrent;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 队列详情信息
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<QueueDescDTO> records;

    // 总记录数
    @NameInMap("row_count")
    @Validation(required = true)
    public Long rowCount;

    public static QueuePageDescDTO build(java.util.Map<String, ?> map) throws Exception {
        QueuePageDescDTO self = new QueuePageDescDTO();
        return TeaModel.build(map, self);
    }

    public QueuePageDescDTO setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public QueuePageDescDTO setPageCurrent(Long pageCurrent) {
        this.pageCurrent = pageCurrent;
        return this;
    }
    public Long getPageCurrent() {
        return this.pageCurrent;
    }

    public QueuePageDescDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueuePageDescDTO setRecords(java.util.List<QueueDescDTO> records) {
        this.records = records;
        return this;
    }
    public java.util.List<QueueDescDTO> getRecords() {
        return this.records;
    }

    public QueuePageDescDTO setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

}
