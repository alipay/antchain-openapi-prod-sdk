// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarOtataskcancelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备定位信息
    @NameInMap("device_locator")
    @Validation(required = true)
    public DeviceLocator deviceLocator;

    // OTA 执行通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE。
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // OTA 批次 ID；4G 通道为 Hub jobId，本地通道为本地批次主键字符串。
    @NameInMap("job_id")
    @Validation(required = true)
    public String jobId;

    // 固件包 ID；4G 通道取消时用于透传 Hub，本地通道用于进一步限定目标任务。
    @NameInMap("firmware_id")
    @Validation(required = true)
    public String firmwareId;

    // 取消原因，不传时本地通道默认记录为用户取消
    @NameInMap("cancel_reason")
    public String cancelReason;

    public static ExecElectrocarOtataskcancelRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarOtataskcancelRequest self = new ExecElectrocarOtataskcancelRequest();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarOtataskcancelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecElectrocarOtataskcancelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecElectrocarOtataskcancelRequest setDeviceLocator(DeviceLocator deviceLocator) {
        this.deviceLocator = deviceLocator;
        return this;
    }
    public DeviceLocator getDeviceLocator() {
        return this.deviceLocator;
    }

    public ExecElectrocarOtataskcancelRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ExecElectrocarOtataskcancelRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ExecElectrocarOtataskcancelRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public ExecElectrocarOtataskcancelRequest setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }
    public String getCancelReason() {
        return this.cancelReason;
    }

}
