// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Task extends TeaModel {
    // context
    @NameInMap("context")
    public String context;

    // execution_times
    @NameInMap("execution_times")
    public Long executionTimes;

    // id
    @NameInMap("id")
    public String id;

    // resource_id
    @NameInMap("resource_id")
    public String resourceId;

    // resource_type
    @NameInMap("resource_type")
    public String resourceType;

    // status
    @NameInMap("status")
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
    public String workspaceId;

    // request
    @NameInMap("request")
    public TaskRequest request;

    public static Task build(java.util.Map<String, ?> map) throws Exception {
        Task self = new Task();
        return TeaModel.build(map, self);
    }

    public Task setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public Task setExecutionTimes(Long executionTimes) {
        this.executionTimes = executionTimes;
        return this;
    }
    public Long getExecutionTimes() {
        return this.executionTimes;
    }

    public Task setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Task setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public Task setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public Task setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Task setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public Task setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public Task setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public Task setRequest(TaskRequest request) {
        this.request = request;
        return this;
    }
    public TaskRequest getRequest() {
        return this.request;
    }

}
