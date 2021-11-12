// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Env extends TeaModel {
    // cellGroup的列表
    @NameInMap("cell_groups")
    @Validation(required = true)
    public java.util.List<CellGroup> cellGroups;

    // 云信息
    @NameInMap("cloud")
    @Validation(required = true)
    public Cloud cloud;

    // 关联的ake集群id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 环境名
    @NameInMap("display_name")
    public String displayName;

    // 环境的id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // （已废弃）环境唯一标识。
    @NameInMap("id")
    public String id;

    // 是否ldc环境
    @NameInMap("ldc")
    @Validation(required = true)
    public Boolean ldc;

    // 环境名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // （已废弃）环境底座iaas技术栈。
    @NameInMap("stack")
    public String stack;

    // 租户信息
    @NameInMap("tenant")
    public Tenant tenant;

    // 工作空间列表
    @NameInMap("workspaces")
    @Validation(required = true)
    public java.util.List<Workspace> workspaces;

    // （已废弃）兼容逻辑老的workspace逻辑，非监控产品勿依赖。
    @NameInMap("workspace_id")
    public String workspaceId;

    // 环境类型
    @NameInMap("env_type")
    @Validation(required = true)
    public String envType;

    public static Env build(java.util.Map<String, ?> map) throws Exception {
        Env self = new Env();
        return TeaModel.build(map, self);
    }

    public Env setCellGroups(java.util.List<CellGroup> cellGroups) {
        this.cellGroups = cellGroups;
        return this;
    }
    public java.util.List<CellGroup> getCellGroups() {
        return this.cellGroups;
    }

    public Env setCloud(Cloud cloud) {
        this.cloud = cloud;
        return this;
    }
    public Cloud getCloud() {
        return this.cloud;
    }

    public Env setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public Env setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Env setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public Env setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Env setLdc(Boolean ldc) {
        this.ldc = ldc;
        return this;
    }
    public Boolean getLdc() {
        return this.ldc;
    }

    public Env setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Env setStack(String stack) {
        this.stack = stack;
        return this;
    }
    public String getStack() {
        return this.stack;
    }

    public Env setTenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public Tenant getTenant() {
        return this.tenant;
    }

    public Env setWorkspaces(java.util.List<Workspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<Workspace> getWorkspaces() {
        return this.workspaces;
    }

    public Env setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public Env setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

}
