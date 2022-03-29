// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSchemaAdminmetadataRequest extends TeaModel {
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

    // 页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // schema的租户信息
    @NameInMap("schema_tenant")
    public String schemaTenant;

    // schema的命名空间
    @NameInMap("schema_namespace")
    public String schemaNamespace;

    public static ListSchemaAdminmetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchemaAdminmetadataRequest self = new ListSchemaAdminmetadataRequest();
        return TeaModel.build(map, self);
    }

    public ListSchemaAdminmetadataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSchemaAdminmetadataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListSchemaAdminmetadataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSchemaAdminmetadataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSchemaAdminmetadataRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListSchemaAdminmetadataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSchemaAdminmetadataRequest setSchemaTenant(String schemaTenant) {
        this.schemaTenant = schemaTenant;
        return this;
    }
    public String getSchemaTenant() {
        return this.schemaTenant;
    }

    public ListSchemaAdminmetadataRequest setSchemaNamespace(String schemaNamespace) {
        this.schemaNamespace = schemaNamespace;
        return this;
    }
    public String getSchemaNamespace() {
        return this.schemaNamespace;
    }

}
