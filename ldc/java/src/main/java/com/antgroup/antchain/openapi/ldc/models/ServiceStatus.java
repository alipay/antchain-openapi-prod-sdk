// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ServiceStatus extends TeaModel {
    // 负载均衡地址
    @NameInMap("load_balancer_ip")
    public String loadBalancerIp;

    public static ServiceStatus build(java.util.Map<String, ?> map) throws Exception {
        ServiceStatus self = new ServiceStatus();
        return TeaModel.build(map, self);
    }

    public ServiceStatus setLoadBalancerIp(String loadBalancerIp) {
        this.loadBalancerIp = loadBalancerIp;
        return this;
    }
    public String getLoadBalancerIp() {
        return this.loadBalancerIp;
    }

}
