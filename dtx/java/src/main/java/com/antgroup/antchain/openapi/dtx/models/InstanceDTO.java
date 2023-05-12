// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class InstanceDTO extends TeaModel {
    // instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 工作空间
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static InstanceDTO build(java.util.Map<String, ?> map) throws Exception {
        InstanceDTO self = new InstanceDTO();
        return TeaModel.build(map, self);
    }

    public InstanceDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceDTO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public InstanceDTO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
