// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class WorkspaceDeltaInfo extends TeaModel {
    // 租户名
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 环境名
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static WorkspaceDeltaInfo build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceDeltaInfo self = new WorkspaceDeltaInfo();
        return TeaModel.build(map, self);
    }

    public WorkspaceDeltaInfo setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public WorkspaceDeltaInfo setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
