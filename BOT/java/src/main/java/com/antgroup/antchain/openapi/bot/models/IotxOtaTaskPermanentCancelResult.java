// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotxOtaTaskPermanentCancelResult extends TeaModel {
    // 通道
    /**
     * <strong>example:</strong>
     * <p>EKYT_BLE</p>
     */
    @NameInMap("channel")
    public String channel;

    // OTA批次id
    /**
     * <strong>example:</strong>
     * <p>7d715afe5a374179892078a9a11f16ab</p>
     */
    @NameInMap("job_id")
    public String jobId;

    // OTA任务ID
    /**
     * <strong>example:</strong>
     * <p>11117c96d904415fa1570736703d3f0c</p>
     */
    @NameInMap("task_id")
    public String taskId;

    // OTA固件包ID
    /**
     * <strong>example:</strong>
     * <p>25c3f69752244678a84f663e4d48a56a</p>
     */
    @NameInMap("firmware_id")
    @Validation(required = true)
    public String firmwareId;

    // 是否成功
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    // 失败错误码
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>错误信息</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    public static IotxOtaTaskPermanentCancelResult build(java.util.Map<String, ?> map) throws Exception {
        IotxOtaTaskPermanentCancelResult self = new IotxOtaTaskPermanentCancelResult();
        return TeaModel.build(map, self);
    }

    public IotxOtaTaskPermanentCancelResult setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public IotxOtaTaskPermanentCancelResult setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public IotxOtaTaskPermanentCancelResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public IotxOtaTaskPermanentCancelResult setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public IotxOtaTaskPermanentCancelResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IotxOtaTaskPermanentCancelResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public IotxOtaTaskPermanentCancelResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
