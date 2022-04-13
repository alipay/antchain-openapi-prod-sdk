// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppSimpleInfo extends TeaModel {
    // 应用id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 应用分组名字
    @NameInMap("app_instance_group_name")
    @Validation(required = true)
    public String appInstanceGroupName;

    // 应用名字
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 执行者
    @NameInMap("executor")
    @Validation(required = true)
    public String executor;

    // 结束时间
    @NameInMap("finish_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String finishTime;

    // 分组个数
    @NameInMap("group_num")
    @Validation(required = true)
    public Long groupNum;

    // 分组策略
    @NameInMap("group_strategy")
    @Validation(required = true)
    public String groupStrategy;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 命名空间
    @NameInMap("namespace")
    public String namespace;

    // 操作类型
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    // 发布版本号
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    // 回滚revision
    @NameInMap("rollback_revision")
    public String rollbackRevision;

    // 是否可单独执行
    @NameInMap("standalone_executable")
    @Validation(required = true)
    public Boolean standaloneExecutable;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 应用状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // Pod 数量
    @NameInMap("pod_count")
    public Long podCount;

    // 回滚原因
    @NameInMap("rollback_reason")
    public String rollbackReason;

    // 依赖的应用服务名
    @NameInMap("depend_container_service_names")
    public java.util.List<String> dependContainerServiceNames;

    // 错误信息
    @NameInMap("message")
    public String message;

    // 发布模板名称
    @NameInMap("deployment_template_name")
    public String deploymentTemplateName;

    public static AppSimpleInfo build(java.util.Map<String, ?> map) throws Exception {
        AppSimpleInfo self = new AppSimpleInfo();
        return TeaModel.build(map, self);
    }

    public AppSimpleInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppSimpleInfo setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public AppSimpleInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppSimpleInfo setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public AppSimpleInfo setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public AppSimpleInfo setGroupNum(Long groupNum) {
        this.groupNum = groupNum;
        return this;
    }
    public Long getGroupNum() {
        return this.groupNum;
    }

    public AppSimpleInfo setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public AppSimpleInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppSimpleInfo setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AppSimpleInfo setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public AppSimpleInfo setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public AppSimpleInfo setRollbackRevision(String rollbackRevision) {
        this.rollbackRevision = rollbackRevision;
        return this;
    }
    public String getRollbackRevision() {
        return this.rollbackRevision;
    }

    public AppSimpleInfo setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public AppSimpleInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AppSimpleInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AppSimpleInfo setPodCount(Long podCount) {
        this.podCount = podCount;
        return this;
    }
    public Long getPodCount() {
        return this.podCount;
    }

    public AppSimpleInfo setRollbackReason(String rollbackReason) {
        this.rollbackReason = rollbackReason;
        return this;
    }
    public String getRollbackReason() {
        return this.rollbackReason;
    }

    public AppSimpleInfo setDependContainerServiceNames(java.util.List<String> dependContainerServiceNames) {
        this.dependContainerServiceNames = dependContainerServiceNames;
        return this;
    }
    public java.util.List<String> getDependContainerServiceNames() {
        return this.dependContainerServiceNames;
    }

    public AppSimpleInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppSimpleInfo setDeploymentTemplateName(String deploymentTemplateName) {
        this.deploymentTemplateName = deploymentTemplateName;
        return this;
    }
    public String getDeploymentTemplateName() {
        return this.deploymentTemplateName;
    }

}
