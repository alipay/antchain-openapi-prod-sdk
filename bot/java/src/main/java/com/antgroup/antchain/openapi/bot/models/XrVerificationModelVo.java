// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class XrVerificationModelVo extends TeaModel {
    // 核销资源生成的实例，xr设备对应设备did
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 生成的实例名称，xr设备就的对应的具体设备sn
    @NameInMap("instance_name")
    @Validation(required = true)
    public String instanceName;

    // 线下场有效期
    @NameInMap("valid_time")
    @Validation(required = true)
    public String validTime;

    // 服务状态：INIT初始化、SERVICING服务中、PAUSED已暂停、EXPIRED停用
    @NameInMap("sevice_status")
    @Validation(required = true)
    public String seviceStatus;

    // 设备状态：INIT 初始化、ONLINE 在线、OFFLINE 离线、FAULT 故障、ACTIVATED 激活
    @NameInMap("device_status")
    @Validation(required = true)
    public String deviceStatus;

    // 唯一ID，对应线下场code
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 对应线下场名称
    @NameInMap("resource_name")
    @Validation(required = true)
    public String resourceName;

    public static XrVerificationModelVo build(java.util.Map<String, ?> map) throws Exception {
        XrVerificationModelVo self = new XrVerificationModelVo();
        return TeaModel.build(map, self);
    }

    public XrVerificationModelVo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public XrVerificationModelVo setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public XrVerificationModelVo setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public XrVerificationModelVo setSeviceStatus(String seviceStatus) {
        this.seviceStatus = seviceStatus;
        return this;
    }
    public String getSeviceStatus() {
        return this.seviceStatus;
    }

    public XrVerificationModelVo setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public XrVerificationModelVo setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public XrVerificationModelVo setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

}
