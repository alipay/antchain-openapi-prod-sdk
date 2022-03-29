// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSchemaAdminmetadataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // SOFAMQ实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 应用名称
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 兼容性策略
    @NameInMap("compatibility")
    @Validation(required = true)
    public String compatibility;

    // 描述
    // 
    @NameInMap("description")
    @Validation(required = true)
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

    public static CreateSchemaAdminmetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemaAdminmetadataRequest self = new CreateSchemaAdminmetadataRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchemaAdminmetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSchemaAdminmetadataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSchemaAdminmetadataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSchemaAdminmetadataRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateSchemaAdminmetadataRequest setCompatibility(String compatibility) {
        this.compatibility = compatibility;
        return this;
    }
    public String getCompatibility() {
        return this.compatibility;
    }

    public CreateSchemaAdminmetadataRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSchemaAdminmetadataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSchemaAdminmetadataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateSchemaAdminmetadataRequest setSchemaTenant(String schemaTenant) {
        this.schemaTenant = schemaTenant;
        return this;
    }
    public String getSchemaTenant() {
        return this.schemaTenant;
    }

}
