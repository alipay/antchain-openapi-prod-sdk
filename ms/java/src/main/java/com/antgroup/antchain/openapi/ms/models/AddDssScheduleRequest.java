// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDssScheduleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    @NameInMap("cronexp")
    @Validation(required = true)
    public String cronexp;

    @NameInMap("divide_count")
    @Validation(required = true)
    public Integer divideCount;

    @NameInMap("instance_id")
    public String instanceId;

    @NameInMap("max_load")
    @Validation(required = true)
    public Integer maxLoad;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("priority")
    @Validation(required = true)
    public String priority;

    @NameInMap("strategy_name")
    @Validation(required = true)
    public String strategyName;

    @NameInMap("task_idcs")
    @Validation(required = true)
    public String taskIdcs;

    @NameInMap("task_state")
    @Validation(required = true)
    public String taskState;

    @NameInMap("task_type")
    @Validation(required = true)
    public String taskType;

    public static AddDssScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDssScheduleRequest self = new AddDssScheduleRequest();
        return TeaModel.build(map, self);
    }

    public AddDssScheduleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDssScheduleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDssScheduleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddDssScheduleRequest setCronexp(String cronexp) {
        this.cronexp = cronexp;
        return this;
    }
    public String getCronexp() {
        return this.cronexp;
    }

    public AddDssScheduleRequest setDivideCount(Integer divideCount) {
        this.divideCount = divideCount;
        return this;
    }
    public Integer getDivideCount() {
        return this.divideCount;
    }

    public AddDssScheduleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDssScheduleRequest setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
        return this;
    }
    public Integer getMaxLoad() {
        return this.maxLoad;
    }

    public AddDssScheduleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddDssScheduleRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public AddDssScheduleRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public AddDssScheduleRequest setTaskIdcs(String taskIdcs) {
        this.taskIdcs = taskIdcs;
        return this;
    }
    public String getTaskIdcs() {
        return this.taskIdcs;
    }

    public AddDssScheduleRequest setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public AddDssScheduleRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
