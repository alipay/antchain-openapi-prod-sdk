// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumeQueueOffset extends TeaModel {
    // topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // queue所在broker的名字
    @NameInMap("broker_name")
    @Validation(required = true)
    public String brokerName;

    // queue id
    @NameInMap("queue_id")
    @Validation(required = true)
    public Long queueId;

    // 消费位点
    @NameInMap("broker_offset")
    @Validation(required = true)
    public Long brokerOffset;

    // 消费端offset
    @NameInMap("consumer_offset")
    @Validation(required = true)
    public Long consumerOffset;

    // 最后时间（时间戳）
    // 
    @NameInMap("last_timestamp")
    @Validation(required = true)
    public Long lastTimestamp;

    // 消费端地址
    @NameInMap("client_addr")
    @Validation(required = true)
    public String clientAddr;

    // 消费者客户端id
    // 
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 消息堆积数
    // 
    @NameInMap("accumulate")
    @Validation(required = true)
    public Long accumulate;

    // queue位点和消费端位点差
    @NameInMap("difference")
    @Validation(required = true)
    public Long difference;

    public static ConsumeQueueOffset build(java.util.Map<String, ?> map) throws Exception {
        ConsumeQueueOffset self = new ConsumeQueueOffset();
        return TeaModel.build(map, self);
    }

    public ConsumeQueueOffset setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ConsumeQueueOffset setBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }
    public String getBrokerName() {
        return this.brokerName;
    }

    public ConsumeQueueOffset setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

    public ConsumeQueueOffset setBrokerOffset(Long brokerOffset) {
        this.brokerOffset = brokerOffset;
        return this;
    }
    public Long getBrokerOffset() {
        return this.brokerOffset;
    }

    public ConsumeQueueOffset setConsumerOffset(Long consumerOffset) {
        this.consumerOffset = consumerOffset;
        return this;
    }
    public Long getConsumerOffset() {
        return this.consumerOffset;
    }

    public ConsumeQueueOffset setLastTimestamp(Long lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }
    public Long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public ConsumeQueueOffset setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }
    public String getClientAddr() {
        return this.clientAddr;
    }

    public ConsumeQueueOffset setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ConsumeQueueOffset setAccumulate(Long accumulate) {
        this.accumulate = accumulate;
        return this;
    }
    public Long getAccumulate() {
        return this.accumulate;
    }

    public ConsumeQueueOffset setDifference(Long difference) {
        this.difference = difference;
        return this;
    }
    public Long getDifference() {
        return this.difference;
    }

}
