// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class TaskDetailResult extends TeaModel {
    // 总数量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total_count")
    public Long totalCount;

    // 成功数量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("success_count")
    public Long successCount;

    // 失败数量
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("fail_count")
    public Long failCount;

    // 处理中数量
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("processing_count")
    public Long processingCount;

    // 当状态为无效时，显示具体的错误信息
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("error_info")
    public String errorInfo;

    public static TaskDetailResult build(java.util.Map<String, ?> map) throws Exception {
        TaskDetailResult self = new TaskDetailResult();
        return TeaModel.build(map, self);
    }

    public TaskDetailResult setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public TaskDetailResult setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public TaskDetailResult setFailCount(Long failCount) {
        this.failCount = failCount;
        return this;
    }
    public Long getFailCount() {
        return this.failCount;
    }

    public TaskDetailResult setProcessingCount(Long processingCount) {
        this.processingCount = processingCount;
        return this;
    }
    public Long getProcessingCount() {
        return this.processingCount;
    }

    public TaskDetailResult setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
    public String getErrorInfo() {
        return this.errorInfo;
    }

}
