// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TaskDetail extends TeaModel {
    // 批次id
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("batch_id")
    public String batchId;

    // tuid
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("tuid")
    public String tuid;

    // device_name
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("device_name")
    public String deviceName;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("status")
    public String status;

    // 调用时间
    /**
     * <strong>example:</strong>
     * <p>1765794345159</p>
     */
    @NameInMap("invoke_time")
    public Long invokeTime;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    // 重试次数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("retry_count")
    public Long retryCount;

    public static TaskDetail build(java.util.Map<String, ?> map) throws Exception {
        TaskDetail self = new TaskDetail();
        return TeaModel.build(map, self);
    }

    public TaskDetail setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public TaskDetail setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public TaskDetail setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public TaskDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TaskDetail setInvokeTime(Long invokeTime) {
        this.invokeTime = invokeTime;
        return this;
    }
    public Long getInvokeTime() {
        return this.invokeTime;
    }

    public TaskDetail setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TaskDetail setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Long getRetryCount() {
        return this.retryCount;
    }

}
