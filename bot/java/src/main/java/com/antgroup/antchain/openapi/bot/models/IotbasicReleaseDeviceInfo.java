// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicReleaseDeviceInfo extends TeaModel {
    // 应用名称
    @NameInMap("apk_name")
    @Validation(required = true)
    public String apkName;

    // 应用版本号
    @NameInMap("apk_version")
    @Validation(required = true)
    public String apkVersion;

    // 工单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 工单名称
    @NameInMap("order_name")
    @Validation(required = true)
    public String orderName;

    // 任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 设备升级任务唯一id
    @NameInMap("order_detail_id")
    @Validation(required = true)
    public String orderDetailId;

    // 设备sn
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 设备id
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 设备升级状态
    // 待确认：CONFIRM
    // 待推送：QUEUED
    // 已推送：NOTIFIED
    // 升级中：IN_PROGRESS
    // 升级成功：SUCCEEDED
    // 升级失败：FAILED
    // 已取消：CANCELED
    // 升级超时：TIMEOUT
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 发布时间
    @NameInMap("release_time")
    public String releaseTime;

    // 升级完成时间
    @NameInMap("upgrade_time")
    public String upgradeTime;

    public static IotbasicReleaseDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicReleaseDeviceInfo self = new IotbasicReleaseDeviceInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicReleaseDeviceInfo setApkName(String apkName) {
        this.apkName = apkName;
        return this;
    }
    public String getApkName() {
        return this.apkName;
    }

    public IotbasicReleaseDeviceInfo setApkVersion(String apkVersion) {
        this.apkVersion = apkVersion;
        return this;
    }
    public String getApkVersion() {
        return this.apkVersion;
    }

    public IotbasicReleaseDeviceInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IotbasicReleaseDeviceInfo setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public IotbasicReleaseDeviceInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public IotbasicReleaseDeviceInfo setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
        return this;
    }
    public String getOrderDetailId() {
        return this.orderDetailId;
    }

    public IotbasicReleaseDeviceInfo setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public IotbasicReleaseDeviceInfo setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public IotbasicReleaseDeviceInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IotbasicReleaseDeviceInfo setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public IotbasicReleaseDeviceInfo setUpgradeTime(String upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

}
