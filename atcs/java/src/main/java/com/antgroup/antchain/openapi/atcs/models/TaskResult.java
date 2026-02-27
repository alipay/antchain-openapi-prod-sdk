// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.atcs.models;

import com.aliyun.tea.*;

public class TaskResult extends TeaModel {
    // 任务标识
    /**
     * <strong>example:</strong>
     * <p>20260204XXXX</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 任务状态，PENDING/待处理，PROGRESS/进行中，COMPLETED/已完成，FAILED/失败，CANCELED/已取消
    /**
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("task_status")
    @Validation(required = true)
    public String taskStatus;

    // 任务提交时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("task_submit_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String taskSubmitTime;

    // 交易hash，链上查询使用
    /**
     * <strong>example:</strong>
     * <p>0x31b214c9b1ca12609befdd98f7ad6aa47a2d17444825117f56bbf8aa9ab34bb1</p>
     */
    @NameInMap("tx_hash")
    public String txHash;

    public static TaskResult build(java.util.Map<String, ?> map) throws Exception {
        TaskResult self = new TaskResult();
        return TeaModel.build(map, self);
    }

    public TaskResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TaskResult setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public TaskResult setTaskSubmitTime(String taskSubmitTime) {
        this.taskSubmitTime = taskSubmitTime;
        return this;
    }
    public String getTaskSubmitTime() {
        return this.taskSubmitTime;
    }

    public TaskResult setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
