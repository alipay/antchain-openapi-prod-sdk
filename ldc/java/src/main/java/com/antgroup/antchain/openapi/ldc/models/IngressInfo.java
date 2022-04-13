// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class IngressInfo extends TeaModel {
    // 元信息
    @NameInMap("meta")
    @Validation(required = true)
    public ContainerServiceObjectMeta meta;

    // 所属统一接入实例名称
    @NameInMap("unified_access_instance_name")
    public String unifiedAccessInstanceName;

    public static IngressInfo build(java.util.Map<String, ?> map) throws Exception {
        IngressInfo self = new IngressInfo();
        return TeaModel.build(map, self);
    }

    public IngressInfo setMeta(ContainerServiceObjectMeta meta) {
        this.meta = meta;
        return this;
    }
    public ContainerServiceObjectMeta getMeta() {
        return this.meta;
    }

    public IngressInfo setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
        this.unifiedAccessInstanceName = unifiedAccessInstanceName;
        return this;
    }
    public String getUnifiedAccessInstanceName() {
        return this.unifiedAccessInstanceName;
    }

}
