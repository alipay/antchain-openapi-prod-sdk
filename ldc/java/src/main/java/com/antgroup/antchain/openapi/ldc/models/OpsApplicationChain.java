// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsApplicationChain extends TeaModel {
    // 此运维应用链中包含的应用组列表
    @NameInMap("groups")
    public java.util.List<OpsApplicationGroup> groups;

    public static OpsApplicationChain build(java.util.Map<String, ?> map) throws Exception {
        OpsApplicationChain self = new OpsApplicationChain();
        return TeaModel.build(map, self);
    }

    public OpsApplicationChain setGroups(java.util.List<OpsApplicationGroup> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<OpsApplicationGroup> getGroups() {
        return this.groups;
    }

}
