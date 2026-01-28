// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class SyncOpdsOssRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // ossPath
    @NameInMap("oss_path")
    @Validation(required = true)
    public String ossPath;

    // ossFilename
    @NameInMap("oss_filename")
    @Validation(required = true)
    public String ossFilename;

    // ossDsId
    @NameInMap("oss_ds_id")
    @Validation(required = true)
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
    @Validation(required = true)
    public String odpsDsName;

    // odpsProjectName
    @NameInMap("odps_project_name")
    @Validation(required = true)
    public String odpsProjectName;

    // odpsTableName
    @NameInMap("odps_table_name")
    @Validation(required = true)
    public String odpsTableName;

    // odpsGuidTableName
    @NameInMap("odps_guid_table_name")
    @Validation(required = true)
    public String odpsGuidTableName;

    // 分区条件
    @NameInMap("partition_condition")
    @Validation(required = true)
    public String partitionCondition;

    // 过滤条件
    @NameInMap("where")
    @Validation(required = true)
    public String where;

    // 字段列表
    @NameInMap("column_list")
    @Validation(required = true)
    public java.util.List<String> columnList;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 任务描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 项目空间id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // project_task_path
    @NameInMap("project_task_path")
    @Validation(required = true)
    public String projectTaskPath;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 参数
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    public static SyncOpdsOssRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncOpdsOssRequest self = new SyncOpdsOssRequest();
        return TeaModel.build(map, self);
    }

    public SyncOpdsOssRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncOpdsOssRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public SyncOpdsOssRequest setOssFilename(String ossFilename) {
        this.ossFilename = ossFilename;
        return this;
    }
    public String getOssFilename() {
        return this.ossFilename;
    }

    public SyncOpdsOssRequest setOssDsId(String ossDsId) {
        this.ossDsId = ossDsId;
        return this;
    }
    public String getOssDsId() {
        return this.ossDsId;
    }

    public SyncOpdsOssRequest setOssDsName(String ossDsName) {
        this.ossDsName = ossDsName;
        return this;
    }
    public String getOssDsName() {
        return this.ossDsName;
    }

    public SyncOpdsOssRequest setOdpsDsId(String odpsDsId) {
        this.odpsDsId = odpsDsId;
        return this;
    }
    public String getOdpsDsId() {
        return this.odpsDsId;
    }

    public SyncOpdsOssRequest setOdpsDsName(String odpsDsName) {
        this.odpsDsName = odpsDsName;
        return this;
    }
    public String getOdpsDsName() {
        return this.odpsDsName;
    }

    public SyncOpdsOssRequest setOdpsProjectName(String odpsProjectName) {
        this.odpsProjectName = odpsProjectName;
        return this;
    }
    public String getOdpsProjectName() {
        return this.odpsProjectName;
    }

    public SyncOpdsOssRequest setOdpsTableName(String odpsTableName) {
        this.odpsTableName = odpsTableName;
        return this;
    }
    public String getOdpsTableName() {
        return this.odpsTableName;
    }

    public SyncOpdsOssRequest setOdpsGuidTableName(String odpsGuidTableName) {
        this.odpsGuidTableName = odpsGuidTableName;
        return this;
    }
    public String getOdpsGuidTableName() {
        return this.odpsGuidTableName;
    }

    public SyncOpdsOssRequest setPartitionCondition(String partitionCondition) {
        this.partitionCondition = partitionCondition;
        return this;
    }
    public String getPartitionCondition() {
        return this.partitionCondition;
    }

    public SyncOpdsOssRequest setWhere(String where) {
        this.where = where;
        return this;
    }
    public String getWhere() {
        return this.where;
    }

    public SyncOpdsOssRequest setColumnList(java.util.List<String> columnList) {
        this.columnList = columnList;
        return this;
    }
    public java.util.List<String> getColumnList() {
        return this.columnList;
    }

    public SyncOpdsOssRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SyncOpdsOssRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public SyncOpdsOssRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SyncOpdsOssRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SyncOpdsOssRequest setProjectTaskPath(String projectTaskPath) {
        this.projectTaskPath = projectTaskPath;
        return this;
    }
    public String getProjectTaskPath() {
        return this.projectTaskPath;
    }

    public SyncOpdsOssRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncOpdsOssRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
