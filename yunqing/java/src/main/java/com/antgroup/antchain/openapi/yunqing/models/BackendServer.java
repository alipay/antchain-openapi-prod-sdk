// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class BackendServer extends TeaModel {
    // 容器id。
    @NameInMap("container_id")
    public String containerId;

    // 容器所在的资源池id。
    @NameInMap("container_resource_pool_id")
    public String containerResourcePoolId;

    // 资源池id。
    @NameInMap("lb_resource_pool_id")
    public String lbResourcePoolId;

    // 负载均衡实例id。
    @NameInMap("load_balancer_id")
    public String loadBalancerId;

    // 权重。
    @NameInMap("weight")
    public Long weight;

    public static BackendServer build(java.util.Map<String, ?> map) throws Exception {
        BackendServer self = new BackendServer();
        return TeaModel.build(map, self);
    }

    public BackendServer setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public BackendServer setContainerResourcePoolId(String containerResourcePoolId) {
        this.containerResourcePoolId = containerResourcePoolId;
        return this;
    }
    public String getContainerResourcePoolId() {
        return this.containerResourcePoolId;
    }

    public BackendServer setLbResourcePoolId(String lbResourcePoolId) {
        this.lbResourcePoolId = lbResourcePoolId;
        return this;
    }
    public String getLbResourcePoolId() {
        return this.lbResourcePoolId;
    }

    public BackendServer setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public BackendServer setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
