// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteSchemaAdminmetadataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // SOFAMQ的实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

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

    public static DeleteSchemaAdminmetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemaAdminmetadataRequest self = new DeleteSchemaAdminmetadataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSchemaAdminmetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSchemaAdminmetadataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSchemaAdminmetadataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSchemaAdminmetadataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteSchemaAdminmetadataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteSchemaAdminmetadataRequest setSchemaTenant(String schemaTenant) {
        this.schemaTenant = schemaTenant;
        return this;
    }
    public String getSchemaTenant() {
        return this.schemaTenant;
    }

}
