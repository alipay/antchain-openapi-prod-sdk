// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HttpsEntryStatus extends TeaModel {
    // 统一接入实例https entry分配到的spanner 后端端口
    @NameInMap("backend_port")
    public Long backendPort;

    // 统一接入实例对应的service分配到的节点端口
    @NameInMap("node_port")
    public Long nodePort;

    public static HttpsEntryStatus build(java.util.Map<String, ?> map) throws Exception {
        HttpsEntryStatus self = new HttpsEntryStatus();
        return TeaModel.build(map, self);
    }

    public HttpsEntryStatus setBackendPort(Long backendPort) {
        this.backendPort = backendPort;
        return this;
    }
    public Long getBackendPort() {
        return this.backendPort;
    }

    public HttpsEntryStatus setNodePort(Long nodePort) {
        this.nodePort = nodePort;
        return this;
    }
    public Long getNodePort() {
        return this.nodePort;
    }

}
