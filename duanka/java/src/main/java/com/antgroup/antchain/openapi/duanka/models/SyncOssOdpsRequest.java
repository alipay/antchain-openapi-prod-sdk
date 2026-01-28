// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class SyncOssOdpsRequest extends TeaModel {
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

    // 来源列表
    @NameInMap("source_list")
    public java.util.List<String> sourceList;

    // oss ds id
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

    // odps_ds_name
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

    // partitionCondition
    @NameInMap("partition_condition")
    @Validation(required = true)
    public String partitionCondition;

    // where
    @NameInMap("where")
    public String where;

    // columnList
    @NameInMap("column_list")
    @Validation(required = true)
    public java.util.List<String> columnList;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 描述
    @NameInMap("desc")
    public String desc;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // projectId项目id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // projectTaskPath 项目任务地址
    @NameInMap("project_task_path")
    @Validation(required = true)
    public String projectTaskPath;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 参数
    @NameInMap("params")
    public String params;

    public static SyncOssOdpsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncOssOdpsRequest self = new SyncOssOdpsRequest();
        return TeaModel.build(map, self);
    }

    public SyncOssOdpsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncOssOdpsRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public SyncOssOdpsRequest setOssFilename(String ossFilename) {
        this.ossFilename = ossFilename;
        return this;
    }
    public String getOssFilename() {
        return this.ossFilename;
    }

    public SyncOssOdpsRequest setSourceList(java.util.List<String> sourceList) {
        this.sourceList = sourceList;
        return this;
    }
    public java.util.List<String> getSourceList() {
        return this.sourceList;
    }

    public SyncOssOdpsRequest setOssDsId(String ossDsId) {
        this.ossDsId = ossDsId;
        return this;
    }
    public String getOssDsId() {
        return this.ossDsId;
    }

    public SyncOssOdpsRequest setOssDsName(String ossDsName) {
        this.ossDsName = ossDsName;
        return this;
    }
    public String getOssDsName() {
        return this.ossDsName;
    }

    public SyncOssOdpsRequest setOdpsDsId(String odpsDsId) {
        this.odpsDsId = odpsDsId;
        return this;
    }
    public String getOdpsDsId() {
        return this.odpsDsId;
    }

    public SyncOssOdpsRequest setOdpsDsName(String odpsDsName) {
        this.odpsDsName = odpsDsName;
        return this;
    }
    public String getOdpsDsName() {
        return this.odpsDsName;
    }

    public SyncOssOdpsRequest setOdpsProjectName(String odpsProjectName) {
        this.odpsProjectName = odpsProjectName;
        return this;
    }
    public String getOdpsProjectName() {
        return this.odpsProjectName;
    }

    public SyncOssOdpsRequest setOdpsTableName(String odpsTableName) {
        this.odpsTableName = odpsTableName;
        return this;
    }
    public String getOdpsTableName() {
        return this.odpsTableName;
    }

    public SyncOssOdpsRequest setOdpsGuidTableName(String odpsGuidTableName) {
        this.odpsGuidTableName = odpsGuidTableName;
        return this;
    }
    public String getOdpsGuidTableName() {
        return this.odpsGuidTableName;
    }

    public SyncOssOdpsRequest setPartitionCondition(String partitionCondition) {
        this.partitionCondition = partitionCondition;
        return this;
    }
    public String getPartitionCondition() {
        return this.partitionCondition;
    }

    public SyncOssOdpsRequest setWhere(String where) {
        this.where = where;
        return this;
    }
    public String getWhere() {
        return this.where;
    }

    public SyncOssOdpsRequest setColumnList(java.util.List<String> columnList) {
        this.columnList = columnList;
        return this;
    }
    public java.util.List<String> getColumnList() {
        return this.columnList;
    }

    public SyncOssOdpsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SyncOssOdpsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public SyncOssOdpsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SyncOssOdpsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SyncOssOdpsRequest setProjectTaskPath(String projectTaskPath) {
        this.projectTaskPath = projectTaskPath;
        return this;
    }
    public String getProjectTaskPath() {
        return this.projectTaskPath;
    }

    public SyncOssOdpsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncOssOdpsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
