// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConnectorJobPartitionStatusPageResult extends TeaModel {
    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 数据总数
    @NameInMap("total_size")
    public Long totalSize;

    // 分区状态
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<ColumnsValue> content;

    public static ConnectorJobPartitionStatusPageResult build(java.util.Map<String, ?> map) throws Exception {
        ConnectorJobPartitionStatusPageResult self = new ConnectorJobPartitionStatusPageResult();
        return TeaModel.build(map, self);
    }

    public ConnectorJobPartitionStatusPageResult setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ConnectorJobPartitionStatusPageResult setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ConnectorJobPartitionStatusPageResult setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ConnectorJobPartitionStatusPageResult setContent(java.util.List<ColumnsValue> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ColumnsValue> getContent() {
        return this.content;
    }

}
