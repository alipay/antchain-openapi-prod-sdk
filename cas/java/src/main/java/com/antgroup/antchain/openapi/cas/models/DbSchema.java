// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DbSchema extends TeaModel {
    // charSet
    @NameInMap("char_set")
    public String charSet;

    // database
    @NameInMap("database")
    public Database database;

    // description
    @NameInMap("description")
    public String description;

    // grants
    @NameInMap("grants")
    @Validation(required = true)
    public java.util.List<DbSchemaGrant> grants;

    // iaas_type
    @NameInMap("iaas_type")
    public String iaasType;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    public static DbSchema build(java.util.Map<String, ?> map) throws Exception {
        DbSchema self = new DbSchema();
        return TeaModel.build(map, self);
    }

    public DbSchema setCharSet(String charSet) {
        this.charSet = charSet;
        return this;
    }
    public String getCharSet() {
        return this.charSet;
    }

    public DbSchema setDatabase(Database database) {
        this.database = database;
        return this;
    }
    public Database getDatabase() {
        return this.database;
    }

    public DbSchema setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DbSchema setGrants(java.util.List<DbSchemaGrant> grants) {
        this.grants = grants;
        return this;
    }
    public java.util.List<DbSchemaGrant> getGrants() {
        return this.grants;
    }

    public DbSchema setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public DbSchema setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DbSchema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DbSchema setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DbSchema setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public DbSchema setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
