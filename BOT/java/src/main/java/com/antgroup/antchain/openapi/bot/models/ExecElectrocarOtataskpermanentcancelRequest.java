// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecElectrocarOtataskpermanentcancelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备定位信息
    @NameInMap("device_locator")
    @Validation(required = true)
    public DeviceLocator deviceLocator;

    // 取消来源：APP_USER - 用户选择不再提示该版本 / VENDOR - 厂家后台取消 / ADMIN - 管理员取消
    @NameInMap("cancel_source")
    @Validation(required = true)
    public String cancelSource;

    // 取消原因
    @NameInMap("cancel_reason")
    public String cancelReason;

    // 待永久取消的固件任务列表
    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<IotxOtaTaskPermanentCancelItem> items;

    public static ExecElectrocarOtataskpermanentcancelRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecElectrocarOtataskpermanentcancelRequest self = new ExecElectrocarOtataskpermanentcancelRequest();
        return TeaModel.build(map, self);
    }

    public ExecElectrocarOtataskpermanentcancelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecElectrocarOtataskpermanentcancelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecElectrocarOtataskpermanentcancelRequest setDeviceLocator(DeviceLocator deviceLocator) {
        this.deviceLocator = deviceLocator;
        return this;
    }
    public DeviceLocator getDeviceLocator() {
        return this.deviceLocator;
    }

    public ExecElectrocarOtataskpermanentcancelRequest setCancelSource(String cancelSource) {
        this.cancelSource = cancelSource;
        return this;
    }
    public String getCancelSource() {
        return this.cancelSource;
    }

    public ExecElectrocarOtataskpermanentcancelRequest setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }
    public String getCancelReason() {
        return this.cancelReason;
    }

    public ExecElectrocarOtataskpermanentcancelRequest setItems(java.util.List<IotxOtaTaskPermanentCancelItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<IotxOtaTaskPermanentCancelItem> getItems() {
        return this.items;
    }

}
