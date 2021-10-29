// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baas_midway.models;

import com.aliyun.tea.*;

public class NodeInfo extends TeaModel {
    // 公网IP
    @NameInMap("public_ip")
    @Validation(required = true)
    public String publicIp;

    // 内网IP
    @NameInMap("private_ip")
    @Validation(required = true)
    public String privateIp;

    // 连接端口
    @NameInMap("client_port")
    @Validation(required = true)
    public String clientPort;

    // 共识端口
    @NameInMap("p2p_port")
    @Validation(required = true)
    public String p2pPort;

    public static NodeInfo build(java.util.Map<String, ?> map) throws Exception {
        NodeInfo self = new NodeInfo();
        return TeaModel.build(map, self);
    }

    public NodeInfo setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public NodeInfo setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public NodeInfo setClientPort(String clientPort) {
        this.clientPort = clientPort;
        return this;
    }
    public String getClientPort() {
        return this.clientPort;
    }

    public NodeInfo setP2pPort(String p2pPort) {
        this.p2pPort = p2pPort;
        return this;
    }
    public String getP2pPort() {
        return this.p2pPort;
    }

}
