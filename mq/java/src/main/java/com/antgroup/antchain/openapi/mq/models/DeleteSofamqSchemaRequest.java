// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteSofamqSchemaRequest extends TeaModel {
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

    // 消息主题
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static DeleteSofamqSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSofamqSchemaRequest self = new DeleteSofamqSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSofamqSchemaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSofamqSchemaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSofamqSchemaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSofamqSchemaRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public DeleteSofamqSchemaRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
