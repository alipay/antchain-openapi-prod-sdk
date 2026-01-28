// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ImportDataphinFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // orderId
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // userId
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // fileKey
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    // headerList
    @NameInMap("header_list")
    @Validation(required = true)
    public java.util.List<String> headerList;

    // targetList
    @NameInMap("target_list")
    @Validation(required = true)
    public java.util.List<String> targetList;

    // tableProject
    @NameInMap("table_project")
    @Validation(required = true)
    public String tableProject;

    // tableName
    @NameInMap("table_name")
    @Validation(required = true)
    public String tableName;

    // partition
    @NameInMap("partition")
    @Validation(required = true)
    public String partition;

    // OcDataphinProjectEnum枚举
    @NameInMap("project")
    @Validation(required = true)
    public String project;

    public static ImportDataphinFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDataphinFileRequest self = new ImportDataphinFileRequest();
        return TeaModel.build(map, self);
    }

    public ImportDataphinFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportDataphinFileRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ImportDataphinFileRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ImportDataphinFileRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ImportDataphinFileRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public ImportDataphinFileRequest setHeaderList(java.util.List<String> headerList) {
        this.headerList = headerList;
        return this;
    }
    public java.util.List<String> getHeaderList() {
        return this.headerList;
    }

    public ImportDataphinFileRequest setTargetList(java.util.List<String> targetList) {
        this.targetList = targetList;
        return this;
    }
    public java.util.List<String> getTargetList() {
        return this.targetList;
    }

    public ImportDataphinFileRequest setTableProject(String tableProject) {
        this.tableProject = tableProject;
        return this;
    }
    public String getTableProject() {
        return this.tableProject;
    }

    public ImportDataphinFileRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ImportDataphinFileRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public ImportDataphinFileRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
