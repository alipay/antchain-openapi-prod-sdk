// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsContainerServiceChain extends TeaModel {
    // 运维容器分组列表
    @NameInMap("groups")
    @Validation(required = true)
    public java.util.List<OpsContainerServiceGroup> groups;

    public static OpsContainerServiceChain build(java.util.Map<String, ?> map) throws Exception {
        OpsContainerServiceChain self = new OpsContainerServiceChain();
        return TeaModel.build(map, self);
    }

    public OpsContainerServiceChain setGroups(java.util.List<OpsContainerServiceGroup> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<OpsContainerServiceGroup> getGroups() {
        return this.groups;
    }

}
