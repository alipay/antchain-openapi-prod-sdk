// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DatabaseSchema extends TeaModel {
    // 数据库方言
    @NameInMap("dialect")
    @Validation(required = true)
    public String dialect;

    // 数据库schema名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 拓扑名称
    @NameInMap("topo_code")
    @Validation(required = true)
    public String topoCode;

    // schema数据库变更
    @NameInMap("sql_migrations")
    @Validation(required = true)
    public java.util.List<SQLMigration> sqlMigrations;

    public static DatabaseSchema build(java.util.Map<String, ?> map) throws Exception {
        DatabaseSchema self = new DatabaseSchema();
        return TeaModel.build(map, self);
    }

    public DatabaseSchema setDialect(String dialect) {
        this.dialect = dialect;
        return this;
    }
    public String getDialect() {
        return this.dialect;
    }

    public DatabaseSchema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DatabaseSchema setTopoCode(String topoCode) {
        this.topoCode = topoCode;
        return this;
    }
    public String getTopoCode() {
        return this.topoCode;
    }

    public DatabaseSchema setSqlMigrations(java.util.List<SQLMigration> sqlMigrations) {
        this.sqlMigrations = sqlMigrations;
        return this;
    }
    public java.util.List<SQLMigration> getSqlMigrations() {
        return this.sqlMigrations;
    }

}
