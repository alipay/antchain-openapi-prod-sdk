// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class PublishDataphinTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // desc
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // tenantId
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // projectId
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // taskId
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static PublishDataphinTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishDataphinTaskRequest self = new PublishDataphinTaskRequest();
        return TeaModel.build(map, self);
    }

    public PublishDataphinTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishDataphinTaskRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public PublishDataphinTaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PublishDataphinTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PublishDataphinTaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PublishDataphinTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
