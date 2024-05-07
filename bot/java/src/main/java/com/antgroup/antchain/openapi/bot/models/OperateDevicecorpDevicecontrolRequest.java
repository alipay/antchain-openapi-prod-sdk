// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateDevicecorpDevicecontrolRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备列表
    @NameInMap("device_infos")
    @Validation(required = true)
    public java.util.List<DeviceOperateInfo> deviceInfos;

    // 设备管控操作；OPEN：设备开启；CLOSE：设备关闭；RESET：设备重置。
    @NameInMap("device_operation")
    @Validation(required = true)
    public String deviceOperation;

    public static OperateDevicecorpDevicecontrolRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateDevicecorpDevicecontrolRequest self = new OperateDevicecorpDevicecontrolRequest();
        return TeaModel.build(map, self);
    }

    public OperateDevicecorpDevicecontrolRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateDevicecorpDevicecontrolRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateDevicecorpDevicecontrolRequest setDeviceInfos(java.util.List<DeviceOperateInfo> deviceInfos) {
        this.deviceInfos = deviceInfos;
        return this;
    }
    public java.util.List<DeviceOperateInfo> getDeviceInfos() {
        return this.deviceInfos;
    }

    public OperateDevicecorpDevicecontrolRequest setDeviceOperation(String deviceOperation) {
        this.deviceOperation = deviceOperation;
        return this;
    }
    public String getDeviceOperation() {
        return this.deviceOperation;
    }

}
