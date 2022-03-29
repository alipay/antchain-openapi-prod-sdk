// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSchemaAdmindetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // SOFAMQ的实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 值校验
    @NameInMap("field_validate_rule")
    public String fieldValidateRule;

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

    // 序列化方式
    @NameInMap("serialization")
    @Validation(required = true)
    public String serialization;

    // 类型
    @NameInMap("schema_type")
    @Validation(required = true)
    public String schemaType;

    public static CreateSchemaAdmindetailRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemaAdmindetailRequest self = new CreateSchemaAdmindetailRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchemaAdmindetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSchemaAdmindetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSchemaAdmindetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSchemaAdmindetailRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateSchemaAdmindetailRequest setFieldValidateRule(String fieldValidateRule) {
        this.fieldValidateRule = fieldValidateRule;
        return this;
    }
    public String getFieldValidateRule() {
        return this.fieldValidateRule;
    }

    public CreateSchemaAdmindetailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSchemaAdmindetailRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateSchemaAdmindetailRequest setSchemaTenant(String schemaTenant) {
        this.schemaTenant = schemaTenant;
        return this;
    }
    public String getSchemaTenant() {
        return this.schemaTenant;
    }

    public CreateSchemaAdmindetailRequest setSerialization(String serialization) {
        this.serialization = serialization;
        return this;
    }
    public String getSerialization() {
        return this.serialization;
    }

    public CreateSchemaAdmindetailRequest setSchemaType(String schemaType) {
        this.schemaType = schemaType;
        return this;
    }
    public String getSchemaType() {
        return this.schemaType;
    }

}
