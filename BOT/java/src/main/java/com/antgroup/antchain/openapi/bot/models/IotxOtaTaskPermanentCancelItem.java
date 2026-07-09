// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotxOtaTaskPermanentCancelItem extends TeaModel {
    // OTA 执行通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE
    /**
     * <strong>example:</strong>
     * <p>TUYA_4G</p>
     */
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // OTA 批次 ID
    /**
     * <strong>example:</strong>
     * <p>HudGu1xGv6n69AD3bWt8020200</p>
     */
    @NameInMap("job_id")
    @Validation(required = true)
    public String jobId;

    // OTA 任务 ID
    /**
     * <strong>example:</strong>
     * <p>11117c96d904415fa1570736703d3f0c</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 固件包 ID
    /**
     * <strong>example:</strong>
     * <p>c5755816b95e4bc9b67c49a6a03eefc8</p>
     */
    @NameInMap("firmware_id")
    @Validation(required = true)
    public String firmwareId;

    // OTA 模块名，用于日志和取消标记补充
    /**
     * <strong>example:</strong>
     * <p>BLE</p>
     */
    @NameInMap("module_name")
    @Validation(required = true)
    public String moduleName;

    public static IotxOtaTaskPermanentCancelItem build(java.util.Map<String, ?> map) throws Exception {
        IotxOtaTaskPermanentCancelItem self = new IotxOtaTaskPermanentCancelItem();
        return TeaModel.build(map, self);
    }

    public IotxOtaTaskPermanentCancelItem setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public IotxOtaTaskPermanentCancelItem setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public IotxOtaTaskPermanentCancelItem setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public IotxOtaTaskPermanentCancelItem setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public IotxOtaTaskPermanentCancelItem setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
