// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BGReleaseExecutionProgress extends TeaModel {
    // unit_id
    @NameInMap("unit_id")
    @Validation(required = true)
    public String unitId;

    // unit_type
    @NameInMap("unit_type")
    @Validation(required = true)
    public String unitType;

    // resource_type
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // traffic_execution_progress_of_service
    @NameInMap("traffic_execution_progress_of_service")
    @Validation(required = true)
    public java.util.List<SlbExecutionProgress> trafficExecutionProgressOfService;

    // service_execution_progress_group
    @NameInMap("service_execution_progress_group")
    @Validation(required = true)
    public java.util.List<TaskExecutionProgress> serviceExecutionProgressGroup;

    // rollback_service_execution_progress_group
    @NameInMap("rollback_service_execution_progress_group")
    @Validation(required = true)
    public java.util.List<TaskExecutionProgress> rollbackServiceExecutionProgressGroup;

    // base_progress
    @NameInMap("base_progress")
    @Validation(required = true)
    public ResourceGroupExecutionProgress baseProgress;

    public static BGReleaseExecutionProgress build(java.util.Map<String, ?> map) throws Exception {
        BGReleaseExecutionProgress self = new BGReleaseExecutionProgress();
        return TeaModel.build(map, self);
    }

    public BGReleaseExecutionProgress setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

    public BGReleaseExecutionProgress setUnitType(String unitType) {
        this.unitType = unitType;
        return this;
    }
    public String getUnitType() {
        return this.unitType;
    }

    public BGReleaseExecutionProgress setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public BGReleaseExecutionProgress setTrafficExecutionProgressOfService(java.util.List<SlbExecutionProgress> trafficExecutionProgressOfService) {
        this.trafficExecutionProgressOfService = trafficExecutionProgressOfService;
        return this;
    }
    public java.util.List<SlbExecutionProgress> getTrafficExecutionProgressOfService() {
        return this.trafficExecutionProgressOfService;
    }

    public BGReleaseExecutionProgress setServiceExecutionProgressGroup(java.util.List<TaskExecutionProgress> serviceExecutionProgressGroup) {
        this.serviceExecutionProgressGroup = serviceExecutionProgressGroup;
        return this;
    }
    public java.util.List<TaskExecutionProgress> getServiceExecutionProgressGroup() {
        return this.serviceExecutionProgressGroup;
    }

    public BGReleaseExecutionProgress setRollbackServiceExecutionProgressGroup(java.util.List<TaskExecutionProgress> rollbackServiceExecutionProgressGroup) {
        this.rollbackServiceExecutionProgressGroup = rollbackServiceExecutionProgressGroup;
        return this;
    }
    public java.util.List<TaskExecutionProgress> getRollbackServiceExecutionProgressGroup() {
        return this.rollbackServiceExecutionProgressGroup;
    }

    public BGReleaseExecutionProgress setBaseProgress(ResourceGroupExecutionProgress baseProgress) {
        this.baseProgress = baseProgress;
        return this;
    }
    public ResourceGroupExecutionProgress getBaseProgress() {
        return this.baseProgress;
    }

}
