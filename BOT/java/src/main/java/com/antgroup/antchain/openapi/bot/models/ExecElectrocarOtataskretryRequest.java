// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarOtataskretryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备定位信息
    @NameInMap("device_locator")
    @Validation(required = true)
    public DeviceLocator deviceLocator;

    // OTA 执行通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // OTA 批次 ID；4G 通道重试时需要透传 Hub
    @NameInMap("job_id")
    @Validation(required = true)
    public String jobId;

    // OTA 任务 ID；4G 通道为 Hub taskId，本地通道为本地任务主键字符串
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // BLE 分包大小，单位 B
    @NameInMap("trans_size")
    @Validation(required = true)
    public Long transSize;

    public static ExecElectrocarOtataskretryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarOtataskretryRequest self = new ExecElectrocarOtataskretryRequest();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarOtataskretryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecElectrocarOtataskretryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecElectrocarOtataskretryRequest setDeviceLocator(DeviceLocator deviceLocator) {
        this.deviceLocator = deviceLocator;
        return this;
    }
    public DeviceLocator getDeviceLocator() {
        return this.deviceLocator;
    }

    public ExecElectrocarOtataskretryRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ExecElectrocarOtataskretryRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ExecElectrocarOtataskretryRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExecElectrocarOtataskretryRequest setTransSize(Long transSize) {
        this.transSize = transSize;
        return this;
    }
    public Long getTransSize() {
        return this.transSize;
    }

}
