// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryDataphinTableinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // projectSpaceName
    @NameInMap("project_space_name")
    @Validation(required = true)
    public String projectSpaceName;

    // tableName
    @NameInMap("table_name")
    @Validation(required = true)
    public String tableName;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static QueryDataphinTableinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataphinTableinfoRequest self = new QueryDataphinTableinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataphinTableinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataphinTableinfoRequest setProjectSpaceName(String projectSpaceName) {
        this.projectSpaceName = projectSpaceName;
        return this;
    }
    public String getProjectSpaceName() {
        return this.projectSpaceName;
    }

    public QueryDataphinTableinfoRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public QueryDataphinTableinfoRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
