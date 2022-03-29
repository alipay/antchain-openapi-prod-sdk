// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqSchemaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 创建Schema时的instanceId
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // SOFAMQ的Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // Topic的Schema内容
    @NameInMap("schema_content")
    @Validation(required = true)
    public String schemaContent;

    // Schema的描述信息
    @NameInMap("schema_comment")
    @Validation(required = true)
    public String schemaComment;

    // Schema的兼容性策略
    @NameInMap("schema_compatibility")
    @Validation(required = true)
    public String schemaCompatibility;

    // schema的序列化方式
    @NameInMap("schema_serialization")
    @Validation(required = true)
    public String schemaSerialization;

    public static CreateSofamqSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqSchemaRequest self = new CreateSofamqSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqSchemaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqSchemaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqSchemaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqSchemaRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public CreateSofamqSchemaRequest setSchemaContent(String schemaContent) {
        this.schemaContent = schemaContent;
        return this;
    }
    public String getSchemaContent() {
        return this.schemaContent;
    }

    public CreateSofamqSchemaRequest setSchemaComment(String schemaComment) {
        this.schemaComment = schemaComment;
        return this;
    }
    public String getSchemaComment() {
        return this.schemaComment;
    }

    public CreateSofamqSchemaRequest setSchemaCompatibility(String schemaCompatibility) {
        this.schemaCompatibility = schemaCompatibility;
        return this;
    }
    public String getSchemaCompatibility() {
        return this.schemaCompatibility;
    }

    public CreateSofamqSchemaRequest setSchemaSerialization(String schemaSerialization) {
        this.schemaSerialization = schemaSerialization;
        return this;
    }
    public String getSchemaSerialization() {
        return this.schemaSerialization;
    }

}
