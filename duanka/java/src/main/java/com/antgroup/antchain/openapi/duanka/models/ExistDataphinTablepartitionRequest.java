// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ExistDataphinTablepartitionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // operator操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // project项目空间
    @NameInMap("project")
    @Validation(required = true)
    public String project;

    // tableName
    @NameInMap("table_name")
    @Validation(required = true)
    public String tableName;

    // 分区
    @NameInMap("partition")
    @Validation(required = true)
    public String partition;

    public static ExistDataphinTablepartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistDataphinTablepartitionRequest self = new ExistDataphinTablepartitionRequest();
        return TeaModel.build(map, self);
    }

    public ExistDataphinTablepartitionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistDataphinTablepartitionRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ExistDataphinTablepartitionRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ExistDataphinTablepartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ExistDataphinTablepartitionRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

}
