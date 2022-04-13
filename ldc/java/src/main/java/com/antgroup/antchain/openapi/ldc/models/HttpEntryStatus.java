// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HttpEntryStatus extends TeaModel {
    // 此entry分配到的spanner后端端口（l7 listener 端口）
    @NameInMap("backend_port")
    public Long backendPort;

    // 此entry对应service分配到的节点端口
    @NameInMap("node_port")
    public Long nodePort;

    public static HttpEntryStatus build(java.util.Map<String, ?> map) throws Exception {
        HttpEntryStatus self = new HttpEntryStatus();
        return TeaModel.build(map, self);
    }

    public HttpEntryStatus setBackendPort(Long backendPort) {
        this.backendPort = backendPort;
        return this;
    }
    public Long getBackendPort() {
        return this.backendPort;
    }

    public HttpEntryStatus setNodePort(Long nodePort) {
        this.nodePort = nodePort;
        return this;
    }
    public Long getNodePort() {
        return this.nodePort;
    }

}
