// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ServicePort extends TeaModel {
    // 此端口映射名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // service端口映射在k8s层面的协议名，包括"TCP", "UDP", and "SCTP".
    @NameInMap("protocol")
    public String protocol;

    // service端口映射前端端口
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // service分配到的节点端口
    @NameInMap("node_port")
    public Long nodePort;

    // 后端端口，这里仅支持整数类型
    @NameInMap("target_port")
    public Long targetPort;

    public static ServicePort build(java.util.Map<String, ?> map) throws Exception {
        ServicePort self = new ServicePort();
        return TeaModel.build(map, self);
    }

    public ServicePort setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ServicePort setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ServicePort setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public ServicePort setNodePort(Long nodePort) {
        this.nodePort = nodePort;
        return this;
    }
    public Long getNodePort() {
        return this.nodePort;
    }

    public ServicePort setTargetPort(Long targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public Long getTargetPort() {
        return this.targetPort;
    }

}
