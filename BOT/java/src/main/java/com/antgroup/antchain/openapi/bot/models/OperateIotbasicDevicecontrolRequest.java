// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicDevicecontrolRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did 集合
    @NameInMap("device_did_list")
    public String deviceDidList;

    // 设备did 集合
    @NameInMap("device_operate_infos")
    public java.util.List<DeviceOperateInfo> deviceOperateInfos;

    // 设备操作类型
    @NameInMap("device_operation")
    @Validation(required = true)
    public String deviceOperation;

    // 所属账号名称
    @NameInMap("user_id")
    public String userId;

    public static OperateIotbasicDevicecontrolRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicDevicecontrolRequest self = new OperateIotbasicDevicecontrolRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicDevicecontrolRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicDevicecontrolRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicDevicecontrolRequest setDeviceDidList(String deviceDidList) {
        this.deviceDidList = deviceDidList;
        return this;
    }
    public String getDeviceDidList() {
        return this.deviceDidList;
    }

    public OperateIotbasicDevicecontrolRequest setDeviceOperateInfos(java.util.List<DeviceOperateInfo> deviceOperateInfos) {
        this.deviceOperateInfos = deviceOperateInfos;
        return this;
    }
    public java.util.List<DeviceOperateInfo> getDeviceOperateInfos() {
        return this.deviceOperateInfos;
    }

    public OperateIotbasicDevicecontrolRequest setDeviceOperation(String deviceOperation) {
        this.deviceOperation = deviceOperation;
        return this;
    }
    public String getDeviceOperation() {
        return this.deviceOperation;
    }

    public OperateIotbasicDevicecontrolRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
