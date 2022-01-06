// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ServicePublisher extends TeaModel {
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

    // 服务提供方客户端发布的IP
    @NameInMap("service_ip")
    public String serviceIp;

    // 服务提供方客户端发布的端口
    @NameInMap("service_port")
    public Integer servicePort;

    // 请求权重，范围：0-100
    @NameInMap("weight")
    public Integer weight;

    // 逻辑机房
    @NameInMap("zone")
    public String zone;

    public static ServicePublisher build(java.util.Map<String, ?> map) throws Exception {
        ServicePublisher self = new ServicePublisher();
        return TeaModel.build(map, self);
    }

    public ServicePublisher setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ServicePublisher setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ServicePublisher setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ServicePublisher setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public ServicePublisher setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public ServicePublisher setServicePort(Integer servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public Integer getServicePort() {
        return this.servicePort;
    }

    public ServicePublisher setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public ServicePublisher setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
