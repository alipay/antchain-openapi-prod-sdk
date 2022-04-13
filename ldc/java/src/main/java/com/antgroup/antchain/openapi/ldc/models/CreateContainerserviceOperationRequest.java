// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateContainerserviceOperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 容器服务列表。	
    @NameInMap("container_services")
    @Validation(required = true)
    public ContainerServiceOperationList containerServices;

    // 分组策略：ALL_ONE、EACH_ONE、CELL，默认EACH_ONE
    @NameInMap("group_strategy")
    public String groupStrategy;

    // 是否自动执行，默认false
    @NameInMap("is_auto_execute")
    public Boolean isAutoExecute;

    // 是否需要beta卡点，默认 true
    @NameInMap("is_need_beta")
    public Boolean isNeedBeta;

    // 所属命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 运维类型：重启等
    @NameInMap("ops_mode")
    @Validation(required = true)
    public String opsMode;

    // 默认值：CLOUD_NATIVE_OPERATION
    @NameInMap("ops_type")
    public String opsType;

    // 运维单名称
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 在具体分组策略下，每个执行单元（部署单元，机房等）内部的分组个数。
    @NameInMap("group_amount")
    public Long groupAmount;

    // 审批人账号id，暂时不支持
    @NameInMap("assignee_ids")
    public java.util.List<String> assigneeIds;

    // 操作人账号，lks1.23.0才支持
    @NameInMap("operator")
    public String operator;

    // [huanyu场景使用]huanyu变更单id
    @NameInMap("huanyu_exec_no")
    public String huanyuExecNo;

    // 每个批次最大涉及变更的pod个数
    @NameInMap("max_group_capacity")
    public Long maxGroupCapacity;

    // 每个部署单元单批次变更pod数量百分比，仅当group_strategey为ALL_CELL_PERCENTAGE时生效
    @NameInMap("max_cell_pod_percentage")
    public Long maxCellPodPercentage;

    public static CreateContainerserviceOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerserviceOperationRequest self = new CreateContainerserviceOperationRequest();
        return TeaModel.build(map, self);
    }

    public CreateContainerserviceOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContainerserviceOperationRequest setContainerServices(ContainerServiceOperationList containerServices) {
        this.containerServices = containerServices;
        return this;
    }
    public ContainerServiceOperationList getContainerServices() {
        return this.containerServices;
    }

    public CreateContainerserviceOperationRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public CreateContainerserviceOperationRequest setIsAutoExecute(Boolean isAutoExecute) {
        this.isAutoExecute = isAutoExecute;
        return this;
    }
    public Boolean getIsAutoExecute() {
        return this.isAutoExecute;
    }

    public CreateContainerserviceOperationRequest setIsNeedBeta(Boolean isNeedBeta) {
        this.isNeedBeta = isNeedBeta;
        return this;
    }
    public Boolean getIsNeedBeta() {
        return this.isNeedBeta;
    }

    public CreateContainerserviceOperationRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateContainerserviceOperationRequest setOpsMode(String opsMode) {
        this.opsMode = opsMode;
        return this;
    }
    public String getOpsMode() {
        return this.opsMode;
    }

    public CreateContainerserviceOperationRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public CreateContainerserviceOperationRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateContainerserviceOperationRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateContainerserviceOperationRequest setGroupAmount(Long groupAmount) {
        this.groupAmount = groupAmount;
        return this;
    }
    public Long getGroupAmount() {
        return this.groupAmount;
    }

    public CreateContainerserviceOperationRequest setAssigneeIds(java.util.List<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
        return this;
    }
    public java.util.List<String> getAssigneeIds() {
        return this.assigneeIds;
    }

    public CreateContainerserviceOperationRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateContainerserviceOperationRequest setHuanyuExecNo(String huanyuExecNo) {
        this.huanyuExecNo = huanyuExecNo;
        return this;
    }
    public String getHuanyuExecNo() {
        return this.huanyuExecNo;
    }

    public CreateContainerserviceOperationRequest setMaxGroupCapacity(Long maxGroupCapacity) {
        this.maxGroupCapacity = maxGroupCapacity;
        return this;
    }
    public Long getMaxGroupCapacity() {
        return this.maxGroupCapacity;
    }

    public CreateContainerserviceOperationRequest setMaxCellPodPercentage(Long maxCellPodPercentage) {
        this.maxCellPodPercentage = maxCellPodPercentage;
        return this;
    }
    public Long getMaxCellPodPercentage() {
        return this.maxCellPodPercentage;
    }

}
