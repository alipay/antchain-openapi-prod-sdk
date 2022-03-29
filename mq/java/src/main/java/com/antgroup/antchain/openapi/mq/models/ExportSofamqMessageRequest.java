// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ExportSofamqMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // sofamq的instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 消息的唯一ID
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 消息的Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 消息所属的ZONE
    @NameInMap("cell")
    public String cell;

    public static ExportSofamqMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSofamqMessageRequest self = new ExportSofamqMessageRequest();
        return TeaModel.build(map, self);
    }

    public ExportSofamqMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportSofamqMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExportSofamqMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportSofamqMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ExportSofamqMessageRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ExportSofamqMessageRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

}
