// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UnifiedAccessInstanceContainerServiceInfo extends TeaModel {
    // 应用服务名称
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    public static UnifiedAccessInstanceContainerServiceInfo build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAccessInstanceContainerServiceInfo self = new UnifiedAccessInstanceContainerServiceInfo();
        return TeaModel.build(map, self);
    }

    public UnifiedAccessInstanceContainerServiceInfo setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public UnifiedAccessInstanceContainerServiceInfo setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
