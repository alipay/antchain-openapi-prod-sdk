// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ClusterIpService extends TeaModel {
    // 对应ClusterIP service名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // ClusterIP service暴露的端口列表。
    @NameInMap("ports")
    public java.util.List<ServicePortMapping> ports;

    public static ClusterIpService build(java.util.Map<String, ?> map) throws Exception {
        ClusterIpService self = new ClusterIpService();
        return TeaModel.build(map, self);
    }

    public ClusterIpService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClusterIpService setPorts(java.util.List<ServicePortMapping> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<ServicePortMapping> getPorts() {
        return this.ports;
    }

}
