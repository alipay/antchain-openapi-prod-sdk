// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqSchemaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // sofamq的instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // schema的唯一id
    @NameInMap("schema_id")
    @Validation(required = true)
    public String schemaId;

    // schema的描述信息
    @NameInMap("description")
    public String description;

    // 消息主题
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static UpdateSofamqSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqSchemaRequest self = new UpdateSofamqSchemaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqSchemaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqSchemaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqSchemaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSofamqSchemaRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public UpdateSofamqSchemaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSofamqSchemaRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
