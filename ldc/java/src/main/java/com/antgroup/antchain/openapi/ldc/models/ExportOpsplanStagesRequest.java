// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExportOpsplanStagesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 容器服务列表
    @NameInMap("container_service")
    public ContainerServiceOperation containerService;

    // Pod分组策略。
    @NameInMap("group_strategy")
    public String groupStrategy;

    // 工作空间组名称
    @NameInMap("workspace_group_name")
    public String workspaceGroupName;

    // 命名空间
    @NameInMap("namespace")
    public String namespace;

    // 目前支持：REBOOT | REPLACE | DEPLOY | SCALEINOUT，其余默认DEPLOY
    @NameInMap("operation")
    public String operation;

    // 最小分组数
    @NameInMap("group_amount")
    public Long groupAmount;

    // 每个分组的最大涉及变更pod个数
    @NameInMap("max_group_capacity")
    public Long maxGroupCapacity;

    // 是否开启beta分组，目前仅在扩缩容场景下使用，默认false
    @NameInMap("need_beta")
    public Boolean needBeta;

    public static ExportOpsplanStagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportOpsplanStagesRequest self = new ExportOpsplanStagesRequest();
        return TeaModel.build(map, self);
    }

    public ExportOpsplanStagesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportOpsplanStagesRequest setContainerService(ContainerServiceOperation containerService) {
        this.containerService = containerService;
        return this;
    }
    public ContainerServiceOperation getContainerService() {
        return this.containerService;
    }

    public ExportOpsplanStagesRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public ExportOpsplanStagesRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public ExportOpsplanStagesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ExportOpsplanStagesRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ExportOpsplanStagesRequest setGroupAmount(Long groupAmount) {
        this.groupAmount = groupAmount;
        return this;
    }
    public Long getGroupAmount() {
        return this.groupAmount;
    }

    public ExportOpsplanStagesRequest setMaxGroupCapacity(Long maxGroupCapacity) {
        this.maxGroupCapacity = maxGroupCapacity;
        return this;
    }
    public Long getMaxGroupCapacity() {
        return this.maxGroupCapacity;
    }

    public ExportOpsplanStagesRequest setNeedBeta(Boolean needBeta) {
        this.needBeta = needBeta;
        return this;
    }
    public Boolean getNeedBeta() {
        return this.needBeta;
    }

}
