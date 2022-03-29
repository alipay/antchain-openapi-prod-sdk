// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumerTimeSpanDTO extends TeaModel {
    //  当前 Group 消费该 Topic 的最新的时间
    @NameInMap("consume_timestamp")
    @Validation(required = true)
    public Long consumeTimestamp;

    // 需查询的消费端 Group ID 所对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 整个 Topic 目前存储的最早的消息的时间
    @NameInMap("max_timestamp")
    @Validation(required = true)
    public Long maxTimestamp;

    //  整个 Topic 目前存储的最新的消息的时间
    @NameInMap("min_timestamp")
    @Validation(required = true)
    public Long minTimestamp;

    // 需查询的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static ConsumerTimeSpanDTO build(java.util.Map<String, ?> map) throws Exception {
        ConsumerTimeSpanDTO self = new ConsumerTimeSpanDTO();
        return TeaModel.build(map, self);
    }

    public ConsumerTimeSpanDTO setConsumeTimestamp(Long consumeTimestamp) {
        this.consumeTimestamp = consumeTimestamp;
        return this;
    }
    public Long getConsumeTimestamp() {
        return this.consumeTimestamp;
    }

    public ConsumerTimeSpanDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConsumerTimeSpanDTO setMaxTimestamp(Long maxTimestamp) {
        this.maxTimestamp = maxTimestamp;
        return this;
    }
    public Long getMaxTimestamp() {
        return this.maxTimestamp;
    }

    public ConsumerTimeSpanDTO setMinTimestamp(Long minTimestamp) {
        this.minTimestamp = minTimestamp;
        return this;
    }
    public Long getMinTimestamp() {
        return this.minTimestamp;
    }

    public ConsumerTimeSpanDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
