// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppDeployProgress extends TeaModel {
    // 应用发布所需要组件列表
    @NameInMap("component_list")
    @Validation(required = true)
    public java.util.List<String> componentList;

    // 应用发布分组列表
    @NameInMap("execute_groups")
    @Validation(required = true)
    public java.util.List<AppDeployGroup> executeGroups;

    // 结束时间
    @NameInMap("finish_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String finishTime;

    // service id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 当前应用是否是一个回滚的应用
    @NameInMap("is_roll_back")
    @Validation(required = true)
    public Boolean isRollBack;

    // 发布进度pod状态统计数据
    @NameInMap("pod_state_summary")
    @Validation(required = true)
    public AppDeployPodStateSummary podStateSummary;

    // 后置任务列表
    @NameInMap("post_tasks")
    @Validation(required = true)
    public java.util.List<AppDeployTask> postTasks;

    // 前置任务列表
    @NameInMap("pre_tasks")
    @Validation(required = true)
    public java.util.List<AppDeployTask> preTasks;

    // 当前服务关联的一个回滚服务的id，如果该值不为空则表示当前服务被回滚过
    @NameInMap("roll_back_service_id")
    public String rollBackServiceId;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 当前发布状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 容器服务命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 错误信息
    @NameInMap("message")
    public String message;

    // task id
    @NameInMap("task_id")
    public String taskId;

    // 操作code
    @NameInMap("action_code")
    public String actionCode;

    public static AppDeployProgress build(java.util.Map<String, ?> map) throws Exception {
        AppDeployProgress self = new AppDeployProgress();
        return TeaModel.build(map, self);
    }

    public AppDeployProgress setComponentList(java.util.List<String> componentList) {
        this.componentList = componentList;
        return this;
    }
    public java.util.List<String> getComponentList() {
        return this.componentList;
    }

    public AppDeployProgress setExecuteGroups(java.util.List<AppDeployGroup> executeGroups) {
        this.executeGroups = executeGroups;
        return this;
    }
    public java.util.List<AppDeployGroup> getExecuteGroups() {
        return this.executeGroups;
    }

    public AppDeployProgress setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public AppDeployProgress setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppDeployProgress setIsRollBack(Boolean isRollBack) {
        this.isRollBack = isRollBack;
        return this;
    }
    public Boolean getIsRollBack() {
        return this.isRollBack;
    }

    public AppDeployProgress setPodStateSummary(AppDeployPodStateSummary podStateSummary) {
        this.podStateSummary = podStateSummary;
        return this;
    }
    public AppDeployPodStateSummary getPodStateSummary() {
        return this.podStateSummary;
    }

    public AppDeployProgress setPostTasks(java.util.List<AppDeployTask> postTasks) {
        this.postTasks = postTasks;
        return this;
    }
    public java.util.List<AppDeployTask> getPostTasks() {
        return this.postTasks;
    }

    public AppDeployProgress setPreTasks(java.util.List<AppDeployTask> preTasks) {
        this.preTasks = preTasks;
        return this;
    }
    public java.util.List<AppDeployTask> getPreTasks() {
        return this.preTasks;
    }

    public AppDeployProgress setRollBackServiceId(String rollBackServiceId) {
        this.rollBackServiceId = rollBackServiceId;
        return this;
    }
    public String getRollBackServiceId() {
        return this.rollBackServiceId;
    }

    public AppDeployProgress setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AppDeployProgress setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AppDeployProgress setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AppDeployProgress setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppDeployProgress setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AppDeployProgress setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

}
