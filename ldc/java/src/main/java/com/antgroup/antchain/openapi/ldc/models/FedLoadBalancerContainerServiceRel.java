// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedLoadBalancerContainerServiceRel extends TeaModel {
    // 应用服务名字
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 应用服务命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 联邦负载均衡实例当前已被占用的端口
    @NameInMap("occupied_ports")
    @Validation(required = true)
    public java.util.List<Long> occupiedPorts;

    public static FedLoadBalancerContainerServiceRel build(java.util.Map<String, ?> map) throws Exception {
        FedLoadBalancerContainerServiceRel self = new FedLoadBalancerContainerServiceRel();
        return TeaModel.build(map, self);
    }

    public FedLoadBalancerContainerServiceRel setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public FedLoadBalancerContainerServiceRel setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public FedLoadBalancerContainerServiceRel setOccupiedPorts(java.util.List<Long> occupiedPorts) {
        this.occupiedPorts = occupiedPorts;
        return this;
    }
    public java.util.List<Long> getOccupiedPorts() {
        return this.occupiedPorts;
    }

}
