// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 数据库账户
    @NameInMap("database_accounts")
    public java.util.List<DatabaseAccount> databaseAccounts;

    // db schema
    @NameInMap("database_schema")
    public DatabaseSchema databaseSchema;

    // db 引擎，默认为在 MYSQL
    @NameInMap("engine")
    public String engine;

    // 引擎版本，默认为 MYSQL6
    @NameInMap("engine_version")
    public String engineVersion;

    // 创建的实例数量。默认为 1 台
    @NameInMap("instance_count")
    public Long instanceCount;

    // database 名称
    @NameInMap("name")
    public String name;

    // db 规格。
    @NameInMap("spec_id")
    @Validation(required = true)
    public String specId;

    // db 存储空间大小
    @NameInMap("storage_size")
    @Validation(required = true)
    public Long storageSize;

    // database 类型，默认为 DATABASE 类型
    @NameInMap("type")
    public String type;

    // VPC类型的实例，需要指定虚拟交换机ID。
    @NameInMap("v_switch_id")
    public String vSwitchId;

    // database 所在工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // app service ids
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // app ids
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDatabaseRequest setDatabaseAccounts(java.util.List<DatabaseAccount> databaseAccounts) {
        this.databaseAccounts = databaseAccounts;
        return this;
    }
    public java.util.List<DatabaseAccount> getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    public CreateDatabaseRequest setDatabaseSchema(DatabaseSchema databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }
    public DatabaseSchema getDatabaseSchema() {
        return this.databaseSchema;
    }

    public CreateDatabaseRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDatabaseRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDatabaseRequest setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public CreateDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatabaseRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public CreateDatabaseRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public CreateDatabaseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDatabaseRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDatabaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateDatabaseRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public CreateDatabaseRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

}
