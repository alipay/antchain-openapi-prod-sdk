// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySchemaAdminmetadataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // SOFAMQ实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // schema名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间
    @NameInMap("namespace")
    public String namespace;

    // 租户
    @NameInMap("schema_tenant")
    public String schemaTenant;

    public static QuerySchemaAdminmetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySchemaAdminmetadataRequest self = new QuerySchemaAdminmetadataRequest();
        return TeaModel.build(map, self);
    }

    public QuerySchemaAdminmetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySchemaAdminmetadataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySchemaAdminmetadataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySchemaAdminmetadataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QuerySchemaAdminmetadataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QuerySchemaAdminmetadataRequest setSchemaTenant(String schemaTenant) {
        this.schemaTenant = schemaTenant;
        return this;
    }
    public String getSchemaTenant() {
        return this.schemaTenant;
    }

}
