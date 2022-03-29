// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class InstanceDTO extends TeaModel {
    // 集群名
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 实例状态。取值说明如下： 0、部署中 1、已欠费
    @NameInMap("instance_status")
    @Validation(required = true)
    public Long instanceStatus;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // workspace名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 数据库id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static InstanceDTO build(java.util.Map<String, ?> map) throws Exception {
        InstanceDTO self = new InstanceDTO();
        return TeaModel.build(map, self);
    }

    public InstanceDTO setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public InstanceDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public InstanceDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public InstanceDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceDTO setInstanceStatus(Long instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public Long getInstanceStatus() {
        return this.instanceStatus;
    }

    public InstanceDTO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public InstanceDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public InstanceDTO setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public InstanceDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
