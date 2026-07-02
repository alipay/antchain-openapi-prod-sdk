// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceRegisterReqModel extends TeaModel {
    // 保留
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("auth_level")
    public Long authLevel;

    // 设备属性字符串，
    // 阿里云设备类型，填入三元组
    /**
     * <strong>example:</strong>
     * <p>&quot;设备属性&quot;</p>
     */
    @NameInMap("device_attribute")
    public String deviceAttribute;

    // 物模型ID，参考其他文档
    /**
     * <strong>example:</strong>
     * <p>&quot;模型ID&quot;</p>
     */
    @NameInMap("device_model_id")
    public String deviceModelId;

    // 可传入自定义信息
    /**
     * <strong>example:</strong>
     * <p>&quot;自定义字段&quot;</p>
     */
    @NameInMap("other_info")
    public String otherInfo;

    // 业务自定义，可以传入该实体的w3c服务节点
    /**
     * <strong>example:</strong>
     * <p>&quot;服务端点&quot;</p>
     */
    @NameInMap("service_endpoint")
    public String serviceEndpoint;

    // 保留，默认
    //     STATUS_REGISTERED(3)
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("status")
    public String status;

    public static DeviceRegisterReqModel build(java.util.Map<String, ?> map) throws Exception {
        DeviceRegisterReqModel self = new DeviceRegisterReqModel();
        return TeaModel.build(map, self);
    }

    public DeviceRegisterReqModel setAuthLevel(Long authLevel) {
        this.authLevel = authLevel;
        return this;
    }
    public Long getAuthLevel() {
        return this.authLevel;
    }

    public DeviceRegisterReqModel setDeviceAttribute(String deviceAttribute) {
        this.deviceAttribute = deviceAttribute;
        return this;
    }
    public String getDeviceAttribute() {
        return this.deviceAttribute;
    }

    public DeviceRegisterReqModel setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    public DeviceRegisterReqModel setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
        return this;
    }
    public String getOtherInfo() {
        return this.otherInfo;
    }

    public DeviceRegisterReqModel setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    public DeviceRegisterReqModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
