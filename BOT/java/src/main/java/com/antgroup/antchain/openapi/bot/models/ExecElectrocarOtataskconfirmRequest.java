// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarOtataskconfirmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备定位信息
    @NameInMap("device_locator")
    @Validation(required = true)
    public DeviceLocator deviceLocator;

    // OTA 执行通道
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // OTA 任务 ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // BLE 分包大小
    @NameInMap("trans_size")
    public Long transSize;

    public static ExecElectrocarOtataskconfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarOtataskconfirmRequest self = new ExecElectrocarOtataskconfirmRequest();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarOtataskconfirmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecElectrocarOtataskconfirmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecElectrocarOtataskconfirmRequest setDeviceLocator(DeviceLocator deviceLocator) {
        this.deviceLocator = deviceLocator;
        return this;
    }
    public DeviceLocator getDeviceLocator() {
        return this.deviceLocator;
    }

    public ExecElectrocarOtataskconfirmRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ExecElectrocarOtataskconfirmRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExecElectrocarOtataskconfirmRequest setTransSize(Long transSize) {
        this.transSize = transSize;
        return this;
    }
    public Long getTransSize() {
        return this.transSize;
    }

}
