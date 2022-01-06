// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ScheduleTask extends TeaModel {
    // 系统名称
    @NameInMap("app_name")
    public String appName;

    // cron 表达式
    @NameInMap("cronexp")
    public String cronexp;

    // 任务拆分个数
    @NameInMap("divide_count")
    public Integer divideCount;

    // 任务id
    @NameInMap("id")
    public String id;

    // 任务加载上限
    @NameInMap("max_load")
    public Integer maxLoad;

    // 任务名称
    @NameInMap("name")
    public String name;

    // 调度任务优先级
    @NameInMap("priority")
    public String priority;

    // 关联的策略名称
    @NameInMap("strategy_name")
    public String strategyName;

    // 调度任务关联的机房信息
    @NameInMap("task_idcs")
    public java.util.List<TaskIdc> taskIdcs;

    // 调度任务类型
    @NameInMap("task_type")
    public String taskType;

    public static ScheduleTask build(java.util.Map<String, ?> map) throws Exception {
        ScheduleTask self = new ScheduleTask();
        return TeaModel.build(map, self);
    }

    public ScheduleTask setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ScheduleTask setCronexp(String cronexp) {
        this.cronexp = cronexp;
        return this;
    }
    public String getCronexp() {
        return this.cronexp;
    }

    public ScheduleTask setDivideCount(Integer divideCount) {
        this.divideCount = divideCount;
        return this;
    }
    public Integer getDivideCount() {
        return this.divideCount;
    }

    public ScheduleTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ScheduleTask setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
        return this;
    }
    public Integer getMaxLoad() {
        return this.maxLoad;
    }

    public ScheduleTask setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ScheduleTask setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ScheduleTask setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public ScheduleTask setTaskIdcs(java.util.List<TaskIdc> taskIdcs) {
        this.taskIdcs = taskIdcs;
        return this;
    }
    public java.util.List<TaskIdc> getTaskIdcs() {
        return this.taskIdcs;
    }

    public ScheduleTask setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
