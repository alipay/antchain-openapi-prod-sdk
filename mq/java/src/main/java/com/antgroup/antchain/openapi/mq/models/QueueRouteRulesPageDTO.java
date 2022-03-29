// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueueRouteRulesPageDTO extends TeaModel {
    // 规则信息
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<QueueRouteRulesDTO> records;

    // 页面大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 当前页
    @NameInMap("page_current")
    @Validation(required = true)
    public Long pageCurrent;

    // 总页数
    @NameInMap("page_count")
    @Validation(required = true)
    public Long pageCount;

    // 总记录数
    @NameInMap("row_count")
    @Validation(required = true)
    public Long rowCount;

    public static QueueRouteRulesPageDTO build(java.util.Map<String, ?> map) throws Exception {
        QueueRouteRulesPageDTO self = new QueueRouteRulesPageDTO();
        return TeaModel.build(map, self);
    }

    public QueueRouteRulesPageDTO setRecords(java.util.List<QueueRouteRulesDTO> records) {
        this.records = records;
        return this;
    }
    public java.util.List<QueueRouteRulesDTO> getRecords() {
        return this.records;
    }

    public QueueRouteRulesPageDTO setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueueRouteRulesPageDTO setPageCurrent(Long pageCurrent) {
        this.pageCurrent = pageCurrent;
        return this;
    }
    public Long getPageCurrent() {
        return this.pageCurrent;
    }

    public QueueRouteRulesPageDTO setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public QueueRouteRulesPageDTO setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

}
