// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class NamespaceDO extends TeaModel {
    // gmt_create
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // instance type
    @NameInMap("instance_type")
    public String instanceType;

    // namespace name
    @NameInMap("namespace_name")
    @Validation(required = true)
    public String namespaceName;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    // workspace group
    @NameInMap("workspace_group")
    public String workspaceGroup;

    // ldcMode
    @NameInMap("ldc_mode")
    @Validation(required = true)
    public Long ldcMode;

    public static NamespaceDO build(java.util.Map<String, ?> map) throws Exception {
        NamespaceDO self = new NamespaceDO();
        return TeaModel.build(map, self);
    }

    public NamespaceDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public NamespaceDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public NamespaceDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public NamespaceDO setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public NamespaceDO setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public NamespaceDO setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public NamespaceDO setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public NamespaceDO setLdcMode(Long ldcMode) {
        this.ldcMode = ldcMode;
        return this;
    }
    public Long getLdcMode() {
        return this.ldcMode;
    }

}
