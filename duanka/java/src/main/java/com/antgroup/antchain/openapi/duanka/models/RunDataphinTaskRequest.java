// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class RunDataphinTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // tenantId
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // projectId
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // params,json map
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // taskId
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static RunDataphinTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RunDataphinTaskRequest self = new RunDataphinTaskRequest();
        return TeaModel.build(map, self);
    }

    public RunDataphinTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunDataphinTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunDataphinTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RunDataphinTaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RunDataphinTaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RunDataphinTaskRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public RunDataphinTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
