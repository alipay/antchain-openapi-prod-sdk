// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsContainerServiceGroup extends TeaModel {
    // 运维容器服务列表
    @NameInMap("container_services")
    @Validation(required = true)
    public java.util.List<OpsContainerService> containerServices;

    public static OpsContainerServiceGroup build(java.util.Map<String, ?> map) throws Exception {
        OpsContainerServiceGroup self = new OpsContainerServiceGroup();
        return TeaModel.build(map, self);
    }

    public OpsContainerServiceGroup setContainerServices(java.util.List<OpsContainerService> containerServices) {
        this.containerServices = containerServices;
        return this;
    }
    public java.util.List<OpsContainerService> getContainerServices() {
        return this.containerServices;
    }

}
