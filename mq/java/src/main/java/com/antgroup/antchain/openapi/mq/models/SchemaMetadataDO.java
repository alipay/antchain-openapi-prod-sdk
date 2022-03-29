// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SchemaMetadataDO extends TeaModel {
    // app名称
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 兼容性
    @NameInMap("compatibility")
    @Validation(required = true)
    public String compatibility;

    // 坐标依赖
    @NameInMap("coordinate")
    @Validation(required = true)
    public String coordinate;

    // 描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 同步站点
    @NameInMap("sync_sites")
    @Validation(required = true)
    public String syncSites;

    // 租户
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // Schema指定的序列化方式
    @NameInMap("serialization")
    @Validation(required = true)
    public String serialization;

    public static SchemaMetadataDO build(java.util.Map<String, ?> map) throws Exception {
        SchemaMetadataDO self = new SchemaMetadataDO();
        return TeaModel.build(map, self);
    }

    public SchemaMetadataDO setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public SchemaMetadataDO setCompatibility(String compatibility) {
        this.compatibility = compatibility;
        return this;
    }
    public String getCompatibility() {
        return this.compatibility;
    }

    public SchemaMetadataDO setCoordinate(String coordinate) {
        this.coordinate = coordinate;
        return this;
    }
    public String getCoordinate() {
        return this.coordinate;
    }

    public SchemaMetadataDO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SchemaMetadataDO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SchemaMetadataDO setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SchemaMetadataDO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SchemaMetadataDO setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SchemaMetadataDO setSyncSites(String syncSites) {
        this.syncSites = syncSites;
        return this;
    }
    public String getSyncSites() {
        return this.syncSites;
    }

    public SchemaMetadataDO setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public SchemaMetadataDO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public SchemaMetadataDO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public SchemaMetadataDO setSerialization(String serialization) {
        this.serialization = serialization;
        return this;
    }
    public String getSerialization() {
        return this.serialization;
    }

}
