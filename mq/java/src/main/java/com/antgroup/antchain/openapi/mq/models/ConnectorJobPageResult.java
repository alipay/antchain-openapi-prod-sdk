// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConnectorJobPageResult extends TeaModel {
    // 任务信息列表
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<ConnectorJobInfo> content;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页的数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 数据总数
    @NameInMap("total_size")
    @Validation(required = true)
    public Long totalSize;

    public static ConnectorJobPageResult build(java.util.Map<String, ?> map) throws Exception {
        ConnectorJobPageResult self = new ConnectorJobPageResult();
        return TeaModel.build(map, self);
    }

    public ConnectorJobPageResult setContent(java.util.List<ConnectorJobInfo> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ConnectorJobInfo> getContent() {
        return this.content;
    }

    public ConnectorJobPageResult setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ConnectorJobPageResult setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ConnectorJobPageResult setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
