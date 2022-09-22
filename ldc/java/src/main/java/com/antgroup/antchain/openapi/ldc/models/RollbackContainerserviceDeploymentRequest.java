// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RollbackContainerserviceDeploymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属工作空间组名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 容器服务名字
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 所属命名空间名称
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 回滚的版本
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    // 部署单ID
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 操作人账号
    @NameInMap("operator")
    public String operator;

    // 分组数，默认为3
    @NameInMap("group_count")
    public Long groupCount;

    // 回滚时的分组策略，取值为： QUICK：快速分组； EACH_ONE：每台一组； UNIT：按逻辑单元分组； CELL：按部署单元分组； 默认为CELL
    @NameInMap("group_strategy")
    public String groupStrategy;

    // 回滚原因
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    public static RollbackContainerserviceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackContainerserviceDeploymentRequest self = new RollbackContainerserviceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public RollbackContainerserviceDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackContainerserviceDeploymentRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public RollbackContainerserviceDeploymentRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public RollbackContainerserviceDeploymentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RollbackContainerserviceDeploymentRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public RollbackContainerserviceDeploymentRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RollbackContainerserviceDeploymentRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RollbackContainerserviceDeploymentRequest setGroupCount(Long groupCount) {
        this.groupCount = groupCount;
        return this;
    }
    public Long getGroupCount() {
        return this.groupCount;
    }

    public RollbackContainerserviceDeploymentRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public RollbackContainerserviceDeploymentRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
