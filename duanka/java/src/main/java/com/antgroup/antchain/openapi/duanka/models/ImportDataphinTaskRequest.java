// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ImportDataphinTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // projectTaskPath项目任务地址
    @NameInMap("project_task_path")
    @Validation(required = true)
    public String projectTaskPath;

    // tenantId租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // dt=20240226
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // sql
    @NameInMap("sql")
    @Validation(required = true)
    public String sql;

    public static ImportDataphinTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDataphinTaskRequest self = new ImportDataphinTaskRequest();
        return TeaModel.build(map, self);
    }

    public ImportDataphinTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportDataphinTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportDataphinTaskRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ImportDataphinTaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ImportDataphinTaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ImportDataphinTaskRequest setProjectTaskPath(String projectTaskPath) {
        this.projectTaskPath = projectTaskPath;
        return this;
    }
    public String getProjectTaskPath() {
        return this.projectTaskPath;
    }

    public ImportDataphinTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ImportDataphinTaskRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ImportDataphinTaskRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
