// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicReleaseOrderInfo extends TeaModel {
    // 应用名称
    /**
     * <strong>example:</strong>
     * <p>应用名称</p>
     */
    @NameInMap("apk_name")
    @Validation(required = true)
    public String apkName;

    // 应用版本号
    /**
     * <strong>example:</strong>
     * <p>apkVersion</p>
     */
    @NameInMap("apk_version")
    @Validation(required = true)
    public String apkVersion;

    // 工单id
    /**
     * <strong>example:</strong>
     * <p>orderId</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 工单名称
    /**
     * <strong>example:</strong>
     * <p>orderName</p>
     */
    @NameInMap("order_name")
    @Validation(required = true)
    public String orderName;

    // 发布批次状态
    // 升级中：IN_PROGRESS
    // 取消中：CANCELING
    // 部分成功：PARTIAL_SUCCESS
    // 部分失败：PARTIAL_FAILED
    // 部分取消：PARTIAL_CANCELED
    // 全部成功：ALL_SUCCESS
    // 全部失败：ALL_FAILED
    // 全部取消：ALL_CANCELED
    /**
     * <strong>example:</strong>
     * <p>IN_PROGRESS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 发布时间
    /**
     * <strong>example:</strong>
     * <p>2024-06-06 11:11:11</p>
     */
    @NameInMap("release_time")
    @Validation(required = true)
    public String releaseTime;

    // 设备升级总数
    @NameInMap("release_total")
    @Validation(required = true)
    public Long releaseTotal;

    // 设备升级完成数
    @NameInMap("release_finished")
    @Validation(required = true)
    public Long releaseFinished;

    // 工单状态变更时间
    /**
     * <strong>example:</strong>
     * <p>2024-06-06 11:11:11</p>
     */
    @NameInMap("status_change_time")
    @Validation(required = true)
    public String statusChangeTime;

    public static IotbasicReleaseOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicReleaseOrderInfo self = new IotbasicReleaseOrderInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicReleaseOrderInfo setApkName(String apkName) {
        this.apkName = apkName;
        return this;
    }
    public String getApkName() {
        return this.apkName;
    }

    public IotbasicReleaseOrderInfo setApkVersion(String apkVersion) {
        this.apkVersion = apkVersion;
        return this;
    }
    public String getApkVersion() {
        return this.apkVersion;
    }

    public IotbasicReleaseOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IotbasicReleaseOrderInfo setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public IotbasicReleaseOrderInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IotbasicReleaseOrderInfo setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public IotbasicReleaseOrderInfo setReleaseTotal(Long releaseTotal) {
        this.releaseTotal = releaseTotal;
        return this;
    }
    public Long getReleaseTotal() {
        return this.releaseTotal;
    }

    public IotbasicReleaseOrderInfo setReleaseFinished(Long releaseFinished) {
        this.releaseFinished = releaseFinished;
        return this;
    }
    public Long getReleaseFinished() {
        return this.releaseFinished;
    }

    public IotbasicReleaseOrderInfo setStatusChangeTime(String statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
        return this;
    }
    public String getStatusChangeTime() {
        return this.statusChangeTime;
    }

}
