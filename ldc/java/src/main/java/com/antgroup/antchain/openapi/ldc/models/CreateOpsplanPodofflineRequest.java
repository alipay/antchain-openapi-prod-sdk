// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateOpsplanPodofflineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 是否自动执行
    @NameInMap("auto_execute")
    public Boolean autoExecute;

    // 运维单扩展信息，jsonStr格式
    @NameInMap("context")
    public String context;

    // 容器服务间依赖顺序。 e.g 先发 A，B， 再发C， D {"groups": [{container_services: [{"name": A}, {"name": B}]}, {"container_services": [{"name": C}, {"name": D}]}]}
    @NameInMap("dependency")
    public OpsContainerServiceChain dependency;

    // 在具体分组策略下，每个执行单元（部署单元，机房等）内部的分组个数。
    @NameInMap("group_amount")
    @Validation(required = true)
    public Long groupAmount;

    // 用户可自定义分组发布的顺序，结合具体的分组策略并通过指定具体分组维度对应的名称生效。 e.g, 当分组策略为机房时，可以指定先发机房A，再发机房B ["A", "B"]
    @NameInMap("group_orders")
    public java.util.List<String> groupOrders;

    // 分组策略（维度）：
    // - 按部署单元（CELL），按部署单元依次缩容；
    // - 按机房（ZONE），按机房依次缩容；
    // - 按逻辑单元（UNIT），按逻辑单元缩容；
    // - 共分一组（ALL），所有容器一起缩容，仍遵循分组个数控制；
    @NameInMap("group_strategy")
    @Validation(required = true)
    public String groupStrategy;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 是否需要beta卡点
    @NameInMap("need_beta")
    @Validation(required = true)
    public Boolean needBeta;

    // 限定操作的部署单元
    @NameInMap("restricted_cells")
    public java.util.List<String> restrictedCells;

    // 限定操作的机房
    @NameInMap("restricted_zones")
    public java.util.List<String> restrictedZones;

    // 选定的容器服务列表
    @NameInMap("selected_container_services")
    @Validation(required = true)
    public OpsContainerServiceGroup selectedContainerServices;

    // 缩容指定pod的标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static CreateOpsplanPodofflineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpsplanPodofflineRequest self = new CreateOpsplanPodofflineRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpsplanPodofflineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOpsplanPodofflineRequest setAutoExecute(Boolean autoExecute) {
        this.autoExecute = autoExecute;
        return this;
    }
    public Boolean getAutoExecute() {
        return this.autoExecute;
    }

    public CreateOpsplanPodofflineRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public CreateOpsplanPodofflineRequest setDependency(OpsContainerServiceChain dependency) {
        this.dependency = dependency;
        return this;
    }
    public OpsContainerServiceChain getDependency() {
        return this.dependency;
    }

    public CreateOpsplanPodofflineRequest setGroupAmount(Long groupAmount) {
        this.groupAmount = groupAmount;
        return this;
    }
    public Long getGroupAmount() {
        return this.groupAmount;
    }

    public CreateOpsplanPodofflineRequest setGroupOrders(java.util.List<String> groupOrders) {
        this.groupOrders = groupOrders;
        return this;
    }
    public java.util.List<String> getGroupOrders() {
        return this.groupOrders;
    }

    public CreateOpsplanPodofflineRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public CreateOpsplanPodofflineRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateOpsplanPodofflineRequest setNeedBeta(Boolean needBeta) {
        this.needBeta = needBeta;
        return this;
    }
    public Boolean getNeedBeta() {
        return this.needBeta;
    }

    public CreateOpsplanPodofflineRequest setRestrictedCells(java.util.List<String> restrictedCells) {
        this.restrictedCells = restrictedCells;
        return this;
    }
    public java.util.List<String> getRestrictedCells() {
        return this.restrictedCells;
    }

    public CreateOpsplanPodofflineRequest setRestrictedZones(java.util.List<String> restrictedZones) {
        this.restrictedZones = restrictedZones;
        return this;
    }
    public java.util.List<String> getRestrictedZones() {
        return this.restrictedZones;
    }

    public CreateOpsplanPodofflineRequest setSelectedContainerServices(OpsContainerServiceGroup selectedContainerServices) {
        this.selectedContainerServices = selectedContainerServices;
        return this;
    }
    public OpsContainerServiceGroup getSelectedContainerServices() {
        return this.selectedContainerServices;
    }

    public CreateOpsplanPodofflineRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateOpsplanPodofflineRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
