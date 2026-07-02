// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BatchJobDetail extends TeaModel {
    // 批次Id
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("batch_id")
    public String batchId;

    // 批次名称
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("batch_name")
    public String batchName;

    // 批次状态
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("status")
    public String status;

    // 租户Id
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("tenant_id")
    public Long tenantId;

    // 触发模式
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("trigger_mode")
    public String triggerMode;

    // 定时执行时间戳
    /**
     * <strong>example:</strong>
     * <p>1765794345159</p>
     */
    @NameInMap("scheduled_time")
    public Long scheduledTime;

    // 实际开始时间戳
    /**
     * <strong>example:</strong>
     * <p>1765794345159</p>
     */
    @NameInMap("actual_start_time")
    public Long actualStartTime;

    // 实际结束时间戳
    /**
     * <strong>example:</strong>
     * <p>1765794345159</p>
     */
    @NameInMap("actual_end_time")
    public Long actualEndTime;

    // 总设备数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_count")
    public Long totalCount;

    // 成功数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("success_count")
    public Long successCount;

    // 失败数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("failed_count")
    public Long failedCount;

    // 操作人
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("operator")
    public String operator;

    public static BatchJobDetail build(java.util.Map<String, ?> map) throws Exception {
        BatchJobDetail self = new BatchJobDetail();
        return TeaModel.build(map, self);
    }

    public BatchJobDetail setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public BatchJobDetail setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }
    public String getBatchName() {
        return this.batchName;
    }

    public BatchJobDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BatchJobDetail setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public BatchJobDetail setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public BatchJobDetail setScheduledTime(Long scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }
    public Long getScheduledTime() {
        return this.scheduledTime;
    }

    public BatchJobDetail setActualStartTime(Long actualStartTime) {
        this.actualStartTime = actualStartTime;
        return this;
    }
    public Long getActualStartTime() {
        return this.actualStartTime;
    }

    public BatchJobDetail setActualEndTime(Long actualEndTime) {
        this.actualEndTime = actualEndTime;
        return this;
    }
    public Long getActualEndTime() {
        return this.actualEndTime;
    }

    public BatchJobDetail setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public BatchJobDetail setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

    public BatchJobDetail setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public BatchJobDetail setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
