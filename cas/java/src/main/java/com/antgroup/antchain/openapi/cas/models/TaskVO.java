// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class TaskVO extends TeaModel {
    // context
    @NameInMap("context")
    @Validation(required = true)
    public String context;

    // execution_times
    @NameInMap("execution_times")
    public Long executionTimes;

    // id
    @NameInMap("id")
    public String id;

    // request
    @NameInMap("request")
    public TaskRequest request;

    // resource_id
    @NameInMap("resource_id")
    public String resourceId;

    // resource_type
    @NameInMap("resource_type")
    public String resourceType;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // resource
    @NameInMap("resource")
    @Validation(required = true)
    public Resource resource;

    public static TaskVO build(java.util.Map<String, ?> map) throws Exception {
        TaskVO self = new TaskVO();
        return TeaModel.build(map, self);
    }

    public TaskVO setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public TaskVO setExecutionTimes(Long executionTimes) {
        this.executionTimes = executionTimes;
        return this;
    }
    public Long getExecutionTimes() {
        return this.executionTimes;
    }

    public TaskVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TaskVO setRequest(TaskRequest request) {
        this.request = request;
        return this;
    }
    public TaskRequest getRequest() {
        return this.request;
    }

    public TaskVO setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public TaskVO setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TaskVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TaskVO setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public TaskVO setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public TaskVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public TaskVO setResource(Resource resource) {
        this.resource = resource;
        return this;
    }
    public Resource getResource() {
        return this.resource;
    }

}
