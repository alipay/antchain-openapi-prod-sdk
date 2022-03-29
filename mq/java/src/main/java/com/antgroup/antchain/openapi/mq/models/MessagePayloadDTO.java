// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MessagePayloadDTO extends TeaModel {
    // 消息对应的Schema的唯一ID
    @NameInMap("schema_id")
    @Validation(required = true)
    public String schemaId;

    // 消息体内容的展现
    @NameInMap("payload")
    @Validation(required = true)
    public String payload;

    public static MessagePayloadDTO build(java.util.Map<String, ?> map) throws Exception {
        MessagePayloadDTO self = new MessagePayloadDTO();
        return TeaModel.build(map, self);
    }

    public MessagePayloadDTO setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public MessagePayloadDTO setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

}
