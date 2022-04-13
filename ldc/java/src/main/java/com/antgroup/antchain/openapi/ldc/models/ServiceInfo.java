// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ServiceInfo extends TeaModel {
    // 元信息
    @NameInMap("meta")
    @Validation(required = true)
    public ContainerServiceObjectMeta meta;

    // Service 类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 负载均衡服务的网络类型（internet | intranet | office | multidomain）
    @NameInMap("load_balancer_address_type")
    public String loadBalancerAddressType;

    // Service 状态
    @NameInMap("status")
    public ServiceStatus status;

    // service端口映射列表
    @NameInMap("ports")
    public java.util.List<ServicePort> ports;

    public static ServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        ServiceInfo self = new ServiceInfo();
        return TeaModel.build(map, self);
    }

    public ServiceInfo setMeta(ContainerServiceObjectMeta meta) {
        this.meta = meta;
        return this;
    }
    public ContainerServiceObjectMeta getMeta() {
        return this.meta;
    }

    public ServiceInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ServiceInfo setLoadBalancerAddressType(String loadBalancerAddressType) {
        this.loadBalancerAddressType = loadBalancerAddressType;
        return this;
    }
    public String getLoadBalancerAddressType() {
        return this.loadBalancerAddressType;
    }

    public ServiceInfo setStatus(ServiceStatus status) {
        this.status = status;
        return this;
    }
    public ServiceStatus getStatus() {
        return this.status;
    }

    public ServiceInfo setPorts(java.util.List<ServicePort> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<ServicePort> getPorts() {
        return this.ports;
    }

}
