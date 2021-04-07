// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportDatabaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // database iaas ids
    @NameInMap("database_ids")
    @Validation(required = true)
    public java.util.List<String> databaseIds;

    // database 类型，默认为 DATABASE 类型
    @NameInMap("type")
    public String type;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static ImportDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDatabaseRequest self = new ImportDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ImportDatabaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportDatabaseRequest setDatabaseIds(java.util.List<String> databaseIds) {
        this.databaseIds = databaseIds;
        return this;
    }
    public java.util.List<String> getDatabaseIds() {
        return this.databaseIds;
    }

    public ImportDatabaseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ImportDatabaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
