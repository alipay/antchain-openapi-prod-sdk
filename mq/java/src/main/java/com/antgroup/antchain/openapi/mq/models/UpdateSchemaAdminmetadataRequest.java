// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSchemaAdminmetadataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // SOFAMQ实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 应用名
    @NameInMap("app")
    public String app;

    // 兼容性
    @NameInMap("compatibility")
    public String compatibility;

    // 依赖坐标
    @NameInMap("coordinate")
    public String coordinate;

    // 描述
    @NameInMap("description")
    public String description;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间
    @NameInMap("namespace")
    public String namespace;

    // 租户
    @NameInMap("schema_tenant")
    public String schemaTenant;

    // 状态
    @NameInMap("state")
    public String state;

    // 同步站点
    @NameInMap("sync_sites")
    public String syncSites;

    public static UpdateSchemaAdminmetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaAdminmetadataRequest self = new UpdateSchemaAdminmetadataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaAdminmetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSchemaAdminmetadataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSchemaAdminmetadataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSchemaAdminmetadataRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateSchemaAdminmetadataRequest setCompatibility(String compatibility) {
        this.compatibility = compatibility;
        return this;
    }
    public String getCompatibility() {
        return this.compatibility;
    }

    public UpdateSchemaAdminmetadataRequest setCoordinate(String coordinate) {
        this.coordinate = coordinate;
        return this;
    }
    public String getCoordinate() {
        return this.coordinate;
    }

    public UpdateSchemaAdminmetadataRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSchemaAdminmetadataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSchemaAdminmetadataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateSchemaAdminmetadataRequest setSchemaTenant(String schemaTenant) {
        this.schemaTenant = schemaTenant;
        return this;
    }
    public String getSchemaTenant() {
        return this.schemaTenant;
    }

    public UpdateSchemaAdminmetadataRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateSchemaAdminmetadataRequest setSyncSites(String syncSites) {
        this.syncSites = syncSites;
        return this;
    }
    public String getSyncSites() {
        return this.syncSites;
    }

}
