// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class TaskCount extends TeaModel {
    // 总数量
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 成功数量
    @NameInMap("success_count")
    @Validation(required = true)
    public Long successCount;

    // 处理中的数量
    @NameInMap("processing_count")
    @Validation(required = true)
    public Long processingCount;

    // 失败数量
    @NameInMap("failure_count")
    @Validation(required = true)
    public Long failureCount;

    public static TaskCount build(java.util.Map<String, ?> map) throws Exception {
        TaskCount self = new TaskCount();
        return TeaModel.build(map, self);
    }

    public TaskCount setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public TaskCount setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public TaskCount setProcessingCount(Long processingCount) {
        this.processingCount = processingCount;
        return this;
    }
    public Long getProcessingCount() {
        return this.processingCount;
    }

    public TaskCount setFailureCount(Long failureCount) {
        this.failureCount = failureCount;
        return this;
    }
    public Long getFailureCount() {
        return this.failureCount;
    }

}
