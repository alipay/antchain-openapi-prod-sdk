// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MessageGetDTO extends TeaModel {
    // 消息体
    @NameInMap("body")
    @Validation(required = true)
    public String body;

    // 消息体 CRC 校验值
    @NameInMap("body_crc")
    @Validation(required = true)
    public Long bodyCrc;

    // 生成该消息的客户端实例
    @NameInMap("born_host")
    @Validation(required = true)
    public String bornHost;

    //  生成时间戳
    @NameInMap("born_timestamp")
    @Validation(required = true)
    public Long bornTimestamp;

    //  实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 消息 ID，即 Message ID
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 消息属性列表
    @NameInMap("property_list")
    @Validation(required = true)
    public java.util.List<MessagePropertyDTO> propertyList;

    //  消息重试消费的次数
    @NameInMap("reconsume_times")
    @Validation(required = true)
    public Long reconsumeTimes;

    // 存储该消息的服务器实例
    @NameInMap("store_host")
    @Validation(required = true)
    public String storeHost;

    // 消息大小
    @NameInMap("store_size")
    @Validation(required = true)
    public Long storeSize;

    // 被服务端存储的时间戳
    @NameInMap("store_timestamp")
    @Validation(required = true)
    public Long storeTimestamp;

    //  消息的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 消息的SchemaID
    @NameInMap("schema_id")
    @Validation(required = true)
    public String schemaId;

    public static MessageGetDTO build(java.util.Map<String, ?> map) throws Exception {
        MessageGetDTO self = new MessageGetDTO();
        return TeaModel.build(map, self);
    }

    public MessageGetDTO setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public MessageGetDTO setBodyCrc(Long bodyCrc) {
        this.bodyCrc = bodyCrc;
        return this;
    }
    public Long getBodyCrc() {
        return this.bodyCrc;
    }

    public MessageGetDTO setBornHost(String bornHost) {
        this.bornHost = bornHost;
        return this;
    }
    public String getBornHost() {
        return this.bornHost;
    }

    public MessageGetDTO setBornTimestamp(Long bornTimestamp) {
        this.bornTimestamp = bornTimestamp;
        return this;
    }
    public Long getBornTimestamp() {
        return this.bornTimestamp;
    }

    public MessageGetDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MessageGetDTO setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public MessageGetDTO setPropertyList(java.util.List<MessagePropertyDTO> propertyList) {
        this.propertyList = propertyList;
        return this;
    }
    public java.util.List<MessagePropertyDTO> getPropertyList() {
        return this.propertyList;
    }

    public MessageGetDTO setReconsumeTimes(Long reconsumeTimes) {
        this.reconsumeTimes = reconsumeTimes;
        return this;
    }
    public Long getReconsumeTimes() {
        return this.reconsumeTimes;
    }

    public MessageGetDTO setStoreHost(String storeHost) {
        this.storeHost = storeHost;
        return this;
    }
    public String getStoreHost() {
        return this.storeHost;
    }

    public MessageGetDTO setStoreSize(Long storeSize) {
        this.storeSize = storeSize;
        return this;
    }
    public Long getStoreSize() {
        return this.storeSize;
    }

    public MessageGetDTO setStoreTimestamp(Long storeTimestamp) {
        this.storeTimestamp = storeTimestamp;
        return this;
    }
    public Long getStoreTimestamp() {
        return this.storeTimestamp;
    }

    public MessageGetDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public MessageGetDTO setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

}
