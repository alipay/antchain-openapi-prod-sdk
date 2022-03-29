// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueueLimitRulesPageDTO extends TeaModel {
    // 总页数
    @NameInMap("page_count")
    @Validation(required = true)
    public Long pageCount;

    // 当前页
    @NameInMap("page_current")
    @Validation(required = true)
    public Long pageCurrent;

    // 每页条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 总记录数
    @NameInMap("row_count")
    @Validation(required = true)
    public Long rowCount;

    // 队列规则信息
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<QueueLimitRulesDTO> records;

    public static QueueLimitRulesPageDTO build(java.util.Map<String, ?> map) throws Exception {
        QueueLimitRulesPageDTO self = new QueueLimitRulesPageDTO();
        return TeaModel.build(map, self);
    }

    public QueueLimitRulesPageDTO setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public QueueLimitRulesPageDTO setPageCurrent(Long pageCurrent) {
        this.pageCurrent = pageCurrent;
        return this;
    }
    public Long getPageCurrent() {
        return this.pageCurrent;
    }

    public QueueLimitRulesPageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueueLimitRulesPageDTO setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public QueueLimitRulesPageDTO setRecords(java.util.List<QueueLimitRulesDTO> records) {
        this.records = records;
        return this;
    }
    public java.util.List<QueueLimitRulesDTO> getRecords() {
        return this.records;
    }

}
