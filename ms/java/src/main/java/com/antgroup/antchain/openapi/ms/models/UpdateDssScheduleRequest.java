// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateDssScheduleRequest extends TeaModel {
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

    @NameInMap("id")
    public String id;

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

    public static UpdateDssScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDssScheduleRequest self = new UpdateDssScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDssScheduleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDssScheduleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDssScheduleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateDssScheduleRequest setCronexp(String cronexp) {
        this.cronexp = cronexp;
        return this;
    }
    public String getCronexp() {
        return this.cronexp;
    }

    public UpdateDssScheduleRequest setDivideCount(Integer divideCount) {
        this.divideCount = divideCount;
        return this;
    }
    public Integer getDivideCount() {
        return this.divideCount;
    }

    public UpdateDssScheduleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDssScheduleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDssScheduleRequest setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
        return this;
    }
    public Integer getMaxLoad() {
        return this.maxLoad;
    }

    public UpdateDssScheduleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDssScheduleRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public UpdateDssScheduleRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public UpdateDssScheduleRequest setTaskIdcs(String taskIdcs) {
        this.taskIdcs = taskIdcs;
        return this;
    }
    public String getTaskIdcs() {
        return this.taskIdcs;
    }

    public UpdateDssScheduleRequest setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public UpdateDssScheduleRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
