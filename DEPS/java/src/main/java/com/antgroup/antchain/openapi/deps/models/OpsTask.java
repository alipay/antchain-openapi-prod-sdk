// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsTask extends TeaModel {
    // parent_group_id
    @NameInMap("parent_group_id")
    public String parentGroupId;

    // service_id
    @NameInMap("service_id")
    public String serviceId;

    // arrangement_id
    @NameInMap("arrangement_id")
    public String arrangementId;

    // action_handler_code
    @NameInMap("action_handler_code")
    public String actionHandlerCode;

    // max_retry_attempts
    @NameInMap("max_retry_attempts")
    public Long maxRetryAttempts;

    // context
    @NameInMap("context")
    public java.util.List<Pair> context;

    // process_definition_id
    @NameInMap("process_definition_id")
    public String processDefinitionId;

    // parent_id
    @NameInMap("parent_id")
    public String parentId;

    // parent_entity_type
    @NameInMap("parent_entity_type")
    public String parentEntityType;

    // state
    @NameInMap("state")
    public String state;

    // started_time
    @NameInMap("started_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String startedTime;

    // finished_time
    @NameInMap("finished_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String finishedTime;

    // standalone_executable
    @NameInMap("standalone_executable")
    public Boolean standaloneExecutable;

    // id
    @NameInMap("id")
    public String id;

    public static OpsTask build(java.util.Map<String, ?> map) throws Exception {
        OpsTask self = new OpsTask();
        return TeaModel.build(map, self);
    }

    public OpsTask setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }
    public String getParentGroupId() {
        return this.parentGroupId;
    }

    public OpsTask setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public OpsTask setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public OpsTask setActionHandlerCode(String actionHandlerCode) {
        this.actionHandlerCode = actionHandlerCode;
        return this;
    }
    public String getActionHandlerCode() {
        return this.actionHandlerCode;
    }

    public OpsTask setMaxRetryAttempts(Long maxRetryAttempts) {
        this.maxRetryAttempts = maxRetryAttempts;
        return this;
    }
    public Long getMaxRetryAttempts() {
        return this.maxRetryAttempts;
    }

    public OpsTask setContext(java.util.List<Pair> context) {
        this.context = context;
        return this;
    }
    public java.util.List<Pair> getContext() {
        return this.context;
    }

    public OpsTask setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public OpsTask setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public OpsTask setParentEntityType(String parentEntityType) {
        this.parentEntityType = parentEntityType;
        return this;
    }
    public String getParentEntityType() {
        return this.parentEntityType;
    }

    public OpsTask setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public OpsTask setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public OpsTask setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public OpsTask setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public OpsTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
