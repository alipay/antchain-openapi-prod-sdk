// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ServiceSubscriber extends TeaModel {
    // 实例标识
    @NameInMap("instance_id")
    public String instanceId;

    // 服务标识
    @NameInMap("data_id")
    public String dataId;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 服务提供方客户端IP
    @NameInMap("host_ip")
    public String hostIp;

    // 逻辑机房
    @NameInMap("zone")
    public String zone;

    public static ServiceSubscriber build(java.util.Map<String, ?> map) throws Exception {
        ServiceSubscriber self = new ServiceSubscriber();
        return TeaModel.build(map, self);
    }

    public ServiceSubscriber setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ServiceSubscriber setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ServiceSubscriber setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ServiceSubscriber setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public ServiceSubscriber setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
