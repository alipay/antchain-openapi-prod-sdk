// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Listener extends TeaModel {
    // 后端端口。
    @NameInMap("backend_server_port")
    public Long backendServerPort;

    // 前端端口。
    @NameInMap("listener_port")
    public Long listenerPort;

    // 负载均衡实例id。
    @NameInMap("load_balancer_id")
    public String loadBalancerId;

    // 监听器协议。HTTP/HTTPS/TCP
    @NameInMap("protocol")
    public String protocol;

    // 资源池id。
    @NameInMap("resource_pool_id")
    public String resourcePoolId;

    public static Listener build(java.util.Map<String, ?> map) throws Exception {
        Listener self = new Listener();
        return TeaModel.build(map, self);
    }

    public Listener setBackendServerPort(Long backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Long getBackendServerPort() {
        return this.backendServerPort;
    }

    public Listener setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public Listener setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public Listener setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public Listener setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }
    public String getResourcePoolId() {
        return this.resourcePoolId;
    }

}
