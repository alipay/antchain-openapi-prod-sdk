// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedLoadBalancer extends TeaModel {
    // 联邦负载均衡实例名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 地址类型，比如公网、内网
    @NameInMap("addr_type")
    @Validation(required = true)
    public String addrType;

    // 联邦负载均衡实例的状态，由多个local 负载均衡实例的状态汇聚计算而来
    @NameInMap("state")
    public String state;

    // 创建时间
    @NameInMap("create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // 关联的应用服务情况
    @NameInMap("container_services_info")
    public java.util.List<FedLoadBalancerContainerServiceRel> containerServicesInfo;

    // local lb实例信息
    @NameInMap("local_loadbalancer_instances")
    public java.util.List<LocalLoadBalancer> localLoadbalancerInstances;

    public static FedLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
        FedLoadBalancer self = new FedLoadBalancer();
        return TeaModel.build(map, self);
    }

    public FedLoadBalancer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FedLoadBalancer setAddrType(String addrType) {
        this.addrType = addrType;
        return this;
    }
    public String getAddrType() {
        return this.addrType;
    }

    public FedLoadBalancer setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public FedLoadBalancer setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public FedLoadBalancer setContainerServicesInfo(java.util.List<FedLoadBalancerContainerServiceRel> containerServicesInfo) {
        this.containerServicesInfo = containerServicesInfo;
        return this;
    }
    public java.util.List<FedLoadBalancerContainerServiceRel> getContainerServicesInfo() {
        return this.containerServicesInfo;
    }

    public FedLoadBalancer setLocalLoadbalancerInstances(java.util.List<LocalLoadBalancer> localLoadbalancerInstances) {
        this.localLoadbalancerInstances = localLoadbalancerInstances;
        return this;
    }
    public java.util.List<LocalLoadBalancer> getLocalLoadbalancerInstances() {
        return this.localLoadbalancerInstances;
    }

}
