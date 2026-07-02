// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备不可操作列表
    @NameInMap("device_disable_list")
    @Validation(required = true)
    public java.util.List<DeviceDisableData> deviceDisableList;

    // 不允许操作类型
    // DISABLE_CHAGE：不允许变更租户
    // DISABLE_EDIT：不允许编辑设备
    // DISABLE_DEL：不允许删除设备
    @NameInMap("disable_operate_type")
    @Validation(required = true)
    public String disableOperateType;

    // 操作状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 不允许操作提示，操作状态为true时必须有值
    @NameInMap("message")
    public String message;

    public static OperateIotbasicDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicDeviceRequest self = new OperateIotbasicDeviceRequest();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateIotbasicDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateIotbasicDeviceRequest setDeviceDisableList(java.util.List<DeviceDisableData> deviceDisableList) {
        this.deviceDisableList = deviceDisableList;
        return this;
    }
    public java.util.List<DeviceDisableData> getDeviceDisableList() {
        return this.deviceDisableList;
    }

    public OperateIotbasicDeviceRequest setDisableOperateType(String disableOperateType) {
        this.disableOperateType = disableOperateType;
        return this;
    }
    public String getDisableOperateType() {
        return this.disableOperateType;
    }

    public OperateIotbasicDeviceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OperateIotbasicDeviceRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
