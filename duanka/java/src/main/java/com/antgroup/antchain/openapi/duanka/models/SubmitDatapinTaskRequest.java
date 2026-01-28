// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class SubmitDatapinTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 任务描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // projectId
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // projectTaskPath
    @NameInMap("project_task_path")
    @Validation(required = true)
    public String projectTaskPath;

    // tenantId
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // params
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // ossDsId
    @NameInMap("oss_ds_id")
    public String ossDsId;

    // ossDsName
    @NameInMap("oss_ds_name")
    @Validation(required = true)
    public String ossDsName;

    // odpsDsId
    @NameInMap("odps_ds_id")
    @Validation(required = true)
    public String odpsDsId;

    // odpsDsName
    @NameInMap("odps_ds_name")
    public String odpsDsName;

    // odpsProjectName
    @NameInMap("odps_project_name")
    @Validation(required = true)
    public String odpsProjectName;

    // odpsTableName
    @NameInMap("odps_table_name")
    public String odpsTableName;

    // odpsGuidTableName
    @NameInMap("odps_guid_table_name")
    @Validation(required = true)
    public String odpsGuidTableName;

    // partitionCondition
    @NameInMap("partition_condition")
    public String partitionCondition;

    // where
    @NameInMap("where")
    public String where;

    // columnList
    @NameInMap("column_list")
    public java.util.List<String> columnList;

    // ossPath
    @NameInMap("oss_path")
    @Validation(required = true)
    public String ossPath;

    // ossFilename
    @NameInMap("oss_filename")
    @Validation(required = true)
    public String ossFilename;

    public static SubmitDatapinTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDatapinTaskRequest self = new SubmitDatapinTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDatapinTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitDatapinTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitDatapinTaskRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public SubmitDatapinTaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SubmitDatapinTaskRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitDatapinTaskRequest setProjectTaskPath(String projectTaskPath) {
        this.projectTaskPath = projectTaskPath;
        return this;
    }
    public String getProjectTaskPath() {
        return this.projectTaskPath;
    }

    public SubmitDatapinTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitDatapinTaskRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitDatapinTaskRequest setOssDsId(String ossDsId) {
        this.ossDsId = ossDsId;
        return this;
    }
    public String getOssDsId() {
        return this.ossDsId;
    }

    public SubmitDatapinTaskRequest setOssDsName(String ossDsName) {
        this.ossDsName = ossDsName;
        return this;
    }
    public String getOssDsName() {
        return this.ossDsName;
    }

    public SubmitDatapinTaskRequest setOdpsDsId(String odpsDsId) {
        this.odpsDsId = odpsDsId;
        return this;
    }
    public String getOdpsDsId() {
        return this.odpsDsId;
    }

    public SubmitDatapinTaskRequest setOdpsDsName(String odpsDsName) {
        this.odpsDsName = odpsDsName;
        return this;
    }
    public String getOdpsDsName() {
        return this.odpsDsName;
    }

    public SubmitDatapinTaskRequest setOdpsProjectName(String odpsProjectName) {
        this.odpsProjectName = odpsProjectName;
        return this;
    }
    public String getOdpsProjectName() {
        return this.odpsProjectName;
    }

    public SubmitDatapinTaskRequest setOdpsTableName(String odpsTableName) {
        this.odpsTableName = odpsTableName;
        return this;
    }
    public String getOdpsTableName() {
        return this.odpsTableName;
    }

    public SubmitDatapinTaskRequest setOdpsGuidTableName(String odpsGuidTableName) {
        this.odpsGuidTableName = odpsGuidTableName;
        return this;
    }
    public String getOdpsGuidTableName() {
        return this.odpsGuidTableName;
    }

    public SubmitDatapinTaskRequest setPartitionCondition(String partitionCondition) {
        this.partitionCondition = partitionCondition;
        return this;
    }
    public String getPartitionCondition() {
        return this.partitionCondition;
    }

    public SubmitDatapinTaskRequest setWhere(String where) {
        this.where = where;
        return this;
    }
    public String getWhere() {
        return this.where;
    }

    public SubmitDatapinTaskRequest setColumnList(java.util.List<String> columnList) {
        this.columnList = columnList;
        return this;
    }
    public java.util.List<String> getColumnList() {
        return this.columnList;
    }

    public SubmitDatapinTaskRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public SubmitDatapinTaskRequest setOssFilename(String ossFilename) {
        this.ossFilename = ossFilename;
        return this;
    }
    public String getOssFilename() {
        return this.ossFilename;
    }

}
